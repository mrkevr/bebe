package dev.mrkevr.bebe.repository;

import com.mongodb.lang.NonNullApi;
import dev.mrkevr.bebe.model.Profile;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.Optional;

public  interface ProfileRepository extends MongoRepository<Profile, String> {

    Optional<Profile> findByUsername(String username);

    boolean existsByUsername(String username);

    boolean existsById(String id);
}
