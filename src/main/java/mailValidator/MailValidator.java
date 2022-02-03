package mailValidator;

public class MailValidator {

    private String mailAddress;

    public MailValidator(String mailAddress) {
        this.mailAddress = mailAddress;
    }

    public MailValidator() {

    }

    public String getMailAddress() {
        return mailAddress;
    }

    public void setMailAddress(String mailAddress) {
        this.mailAddress = mailAddress;
    }

    public boolean isValid() {
        String pattern = "^[a-zA-Z0-9.!#$%&'*+=?_|-]+@[a-zA-Z0-9](?:[a-zA-Z0-9-]{0,61}[a-zA-Z0-9])+\\.([a-zA-Z]){2,60}$";
        return getMailAddress().matches(pattern);
    }

}
