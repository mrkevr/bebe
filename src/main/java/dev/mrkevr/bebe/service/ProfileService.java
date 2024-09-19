package dev.mrkevr.bebe.service;

import dev.mrkevr.bebe.dto.ProfileCreationRequest;
import dev.mrkevr.bebe.mapper.ProfileMapper;
import dev.mrkevr.bebe.model.Profile;
import dev.mrkevr.bebe.repository.ProfileRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

@Service
@RequiredArgsConstructor
public class ProfileService {

    private final ProfileRepository profileRepository;
    private final ProfileMapper profileMapper;

    public Profile getById(String id) {
        return profileRepository.findById(id)
                .orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "Profile not found with that id"));
    }

    public Profile getByUsername(String username) {
        return profileRepository.findByUsername(username)
                .orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "Profile not found with that username"));
    }

    public boolean existById(String id) {
        return profileRepository.existsById(id);
    }

    public Profile register(ProfileCreationRequest request) {
        Profile profile = profileMapper.toProfile(request);
        return profileRepository.save(profile);
    }
}
