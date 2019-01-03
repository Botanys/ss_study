package studyss.Model;

public class MailFillForm {
    public final String sendTo;
    public final String topicOfTheLetter;
    public final String bodyOfTheLetter;

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
