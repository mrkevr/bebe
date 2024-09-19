package dev.mrkevr.bebe.dto;

import dev.mrkevr.bebe.model.Gender;

public record ProfileRegistrationRequest(
        String username,
        String firstName,
        String lastName,
        Gender gender,
        String bio,
        String imageUrl,
        String personalityType) {
}
