package dev.mrkevr.bebe.config;

import dev.mrkevr.bebe.model.Chat;
import dev.mrkevr.bebe.model.Gender;
import dev.mrkevr.bebe.model.Message;
import dev.mrkevr.bebe.model.Profile;
import dev.mrkevr.bebe.repository.ChatRepository;
import dev.mrkevr.bebe.repository.ProfileRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.List;

@Configuration
public class ApplicationConfig {

    @Bean
    CommandLineRunner commandLineRunner(
            ProfileRepository profileRepository,
            ChatRepository chatRepository) {
        return args -> {

            profileRepository.deleteAll();

            Profile profile = new Profile(
                    "mrkevr",
                    "Mark",
                    "Ever",
                    Gender.MALE,
                    "bioman",
                    "imagurl",
                    "personalities");

            profileRepository.save(profile);


            chatRepository.save(new Chat(
                    profile.getId(),
                    List.of(
                            new Message(profile.getUsername(), "Hello world")
                    )
            ));

        };
    }


}
