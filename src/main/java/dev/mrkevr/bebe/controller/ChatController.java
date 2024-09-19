package dev.mrkevr.bebe.controller;

import dev.mrkevr.bebe.dto.ChatCreationRequest;
import dev.mrkevr.bebe.dto.MessageRequest;
import dev.mrkevr.bebe.model.Chat;
import dev.mrkevr.bebe.model.Profile;
import dev.mrkevr.bebe.service.ChatService;
import dev.mrkevr.bebe.service.ProfileService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/chats")
public class ChatController {

    private final ChatService chatService;
    private final ProfileService profileService;

    @PostMapping
    public ResponseEntity<Chat> createChat(@RequestBody ChatCreationRequest chatCreationRequest) {

        Profile profile = profileService.getById(chatCreationRequest.profileId());
        Chat chat = chatService.createChat(profile.getId());
        return ResponseEntity.ok(chat);
    }

    @GetMapping("/{chatId}")
    public ResponseEntity<Chat> getChat(@PathVariable String chatId){

        Chat chat = chatService.getChatById(chatId);
        return ResponseEntity.ok(chat);
    }

    @PostMapping("/{chatId}")
    public ResponseEntity<Chat> postMessage(
            @PathVariable String chatId,
            @RequestBody MessageRequest messageRequest) {

        Chat chat = chatService.postMessage(chatId, messageRequest);
        return ResponseEntity.ok(chat);
    }

}
