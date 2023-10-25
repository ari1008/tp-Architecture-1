package org.example;

import java.util.Objects;

final class EmailSend {

    private static EmailSend emailSend;

    private final String domain;

    public static EmailSend of(String domain) {
        if (emailSend == null) {
            emailSend = new EmailSend(domain);
        }
        return emailSend;
    }

    public String getDomain() {
        return domain;
    }

    private EmailSend(String domain) {
        this.domain = domain;
    }

    public void sendEmail(String email) {
        System.out.println("Email sent to " + email + " from " + domain);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        EmailSend emailSend = (EmailSend) o;
        return Objects.equals(domain, emailSend.domain);
    }

    @Override
    public int hashCode() {
        return Objects.hash(domain);
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
