package dev.mrkevr.bebe.repository;

import dev.mrkevr.bebe.model.Profile;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.Optional;

public interface ProfileRepository extends MongoRepository<Profile, String> {

    Optional<Profile> findByUsername(String username);
}
