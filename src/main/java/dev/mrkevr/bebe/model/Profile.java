package dev.mrkevr.bebe.model;

import lombok.*;
import lombok.experimental.FieldDefaults;

@EqualsAndHashCode(callSuper = true)
@Data
@FieldDefaults(level = AccessLevel.PRIVATE)
public class Profile extends Document {
    String username;
    String firstName;
    String lastName;
    Gender gender;
    String bio;
    String imageUrl;
    String personalityType;

    public Profile(
            String username,
            String firstName,
            String lastName,
            Gender gender,
            String bio,
            String imageUrl,
            String personalityType) {

        super();
        this.username = username;
        this.firstName = firstName;
        this.lastName = lastName;
        this.gender = gender;
        this.bio = bio;
        this.imageUrl = imageUrl;
        this.personalityType = personalityType;
    }
}
