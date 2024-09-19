package dev.mrkevr.bebe.service;

import dev.mrkevr.bebe.dto.MessageRequest;
import dev.mrkevr.bebe.model.Chat;
import dev.mrkevr.bebe.model.Message;
import dev.mrkevr.bebe.repository.ChatRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.time.LocalDateTime;
import java.util.ArrayList;

@Service
@RequiredArgsConstructor
public class ChatService {

    private final ChatRepository chatRepository;

    public Chat createChat(String profileId) {
        return chatRepository.save(new Chat(profileId, new ArrayList<>()));
    }

    public Chat postMessage(String chatId, MessageRequest messageRequest) {
        Chat chat = this.getChatById(chatId);

        if(!messageRequest.profileId().equals(chat.getProfileId())) {
            throw new ResponseStatusException(HttpStatus.BAD_REQUEST, "Profile ids do not match");
        }

        Message message = new Message(messageRequest.profileId(), messageRequest.text(), LocalDateTime.now());
        chat.getMessages().add(message);
        return chatRepository.save(chat);
    }

    public Chat getChatById(String chatId) {
        return chatRepository.findById(chatId)
                .orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "Chat not found with that id "));
    }


}
