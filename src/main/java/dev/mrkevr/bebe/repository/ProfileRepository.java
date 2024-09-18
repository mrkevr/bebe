package dev.mrkevr.bebe.repository;

import dev.mrkevr.bebe.model.Profile;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface ProfileRepository extends MongoRepository<Profile, String> {
}
