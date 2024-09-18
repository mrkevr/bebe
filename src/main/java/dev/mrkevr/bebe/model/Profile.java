package dev.mrkevr.bebe.model;

import lombok.*;
import lombok.experimental.FieldDefaults;
import org.springframework.data.annotation.Id;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
public class Profile {
    String id;
    String username;
    String firstName;
    String lastName;
    Gender gender;
    String bio;
    String imageUrl;
    String personalityType;
}
