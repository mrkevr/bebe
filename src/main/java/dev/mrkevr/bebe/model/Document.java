package dev.mrkevr.bebe.model;

import dev.mrkevr.bebe.util.DocumentUtils;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;

@Getter
@Setter
public class Document {

    private String id;
    private LocalDateTime created;

    public Document() {
        id = DocumentUtils.generateDocumentId();
        created = LocalDateTime.now();
    }
}
