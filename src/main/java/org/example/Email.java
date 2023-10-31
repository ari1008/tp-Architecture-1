package org.example;

import java.util.Objects;

final class Email implements Notification {

    private static Email email;

    private final Logger logger;

    private final String domain;

    public static Email of(String domain, Logger logger) {
        if (email == null) {
            email = new Email(domain, logger);
        }
        return email;
    }

    public String getDomain() {
        return domain;
    }

    private Email(String domain, Logger logger) {
        this.domain = domain;
        this.logger = logger;
    }

    public void sendEmail(String email) {
        logger.of("Email sent to " + email + " from " + domain);
    }

    @Override
    public boolean equals(Object object) {
        if (this == object) return true;
        if (object == null || getClass() != object.getClass()) return false;
        Email email = (Email) object;
        return Objects.equals(logger, email.logger) && Objects.equals(domain, email.domain);
    }

    @Override
    public int hashCode() {
        return Objects.hash(logger, domain);
    }

    @Override
    public void send(String value) {
        logger.of("Email sent to " + value + " from " + domain);
    }
}
