public class PunctuationMark extends MemberOfSentence {

    private char content;

    public PunctuationMark(char content) {
        this.content = content;
    }

    public char getContent() {
        return content;
    }

    public void setContent(char content) {
        this.content = content;
    }
}
