package dev.mrkevr.bebe.config;

import dev.mrkevr.bebe.model.Gender;
import dev.mrkevr.bebe.model.Profile;
import dev.mrkevr.bebe.repository.ProfileRepository;
import dev.mrkevr.bebe.util.DocumentUtils;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ApplicationConfig {

    @Bean
    CommandLineRunner commandLineRunner(ProfileRepository profileRepository) {
        return args -> {

//            Profile profile = Profile.builder()
//                    .id(DocumentUtils.generateDocumentId())
//                    .firstName("Jake")
//                    .lastName("Peralta")
//                    .gender(Gender.MALE)
//                    .bio("Lorem ipsum")
//                    .imageUrl("imageUrl.com")
//                    .personalityType("toits")
//                    .build();

            profileRepository.deleteById("whatevrss");

            profileRepository.findAll().forEach(System.out::println);
        };
    }


}
