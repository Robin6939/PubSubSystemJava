public class Message {
    private final User author;
    private final Topic publishedTo;
    private final String messageContent;


    public User getAuthor() {
        return author;
    }

    public Topic getPublishedTo() {
        return publishedTo;
    }

    public String getMessageContent() {
        return messageContent;
    }

    Message(User author, Topic publishedTo, String messageContent) {
        this.author = author;
        this.publishedTo = publishedTo;
        this.messageContent = messageContent;
    }


}
