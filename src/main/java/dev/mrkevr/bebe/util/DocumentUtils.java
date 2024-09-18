package dev.mrkevr.bebe.util;

import org.apache.commons.lang3.RandomStringUtils;

public final class DocumentUtils {

    private DocumentUtils() {
    }

    public static String generateDocumentId() {
        return RandomStringUtils.randomAlphanumeric(10);
    }
}
