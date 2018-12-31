package studyss;

public class MailFillForm {
    private final String sendTo;
    private final String topicOfTheLetter;
    private final String bodyOfTheLetter;

    public MailFillForm(String sendTo, String topicOfTheLetter, String bodyOfTheLetter) {
        this.sendTo = sendTo;
        this.topicOfTheLetter = topicOfTheLetter;
        this.bodyOfTheLetter = bodyOfTheLetter;
    }

    public String getSendTo() {
        return sendTo;
    }

    public String getTopicOfTheLetter() {
        return topicOfTheLetter;
    }

    public String getBodyOfTheLetter() {
        return bodyOfTheLetter;
    }
}
