package dev.mrkevr.bebe.mapper;

import dev.mrkevr.bebe.dto.ProfileRegistrationRequest;
import dev.mrkevr.bebe.model.Profile;
import org.springframework.stereotype.Component;

@Component
public final class ProfileMapper {

    public Profile toProfile(ProfileRegistrationRequest request) {
        return new Profile(
                request.username(),
                request.firstName(),
                request.lastName(),
                request.gender(),
                request.bio(),
                request.imageUrl(),
                request.personalityType()
        );
    }

}
