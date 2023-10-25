package org.example;

final class EmailSend {

    private static EmailSend emailSend;

    public static EmailSend of() {
        if (emailSend == null) {
            return new EmailSend();
        }
        return emailSend;
    }

    private EmailSend() {
    }

    public void sendEmail(String email) {
        System.out.println("Email sent to " + email);
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    @Override
    public String toString() {
        return super.toString();
    }

}
