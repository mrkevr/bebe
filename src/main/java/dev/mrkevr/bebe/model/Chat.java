package dev.mrkevr.bebe.model;

import lombok.AccessLevel;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.FieldDefaults;

import java.util.List;

@EqualsAndHashCode(callSuper = true)
@FieldDefaults(level = AccessLevel.PRIVATE)
@Data
public class Chat extends Document {

    String profileId;
    List<Message> messages;

    public Chat(String profileId, List<Message> messages) {
        super();
        this.profileId = profileId;
        this.messages = messages;
    }
}
