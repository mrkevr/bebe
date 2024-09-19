package dev.mrkevr.bebe.dto;

import dev.mrkevr.bebe.model.Gender;

public record ProfileCreationRequest(
        String username,
        String firstName,
        String lastName,
        Gender gender,
        String bio,
        String imageUrl,
        String personalityType) {
}
