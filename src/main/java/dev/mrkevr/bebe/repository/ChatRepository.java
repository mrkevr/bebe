package dev.mrkevr.bebe.repository;

import dev.mrkevr.bebe.model.Chat;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface ChatRepository extends MongoRepository<Chat, String> {
}
