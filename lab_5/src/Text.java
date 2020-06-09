public class Text {

    private Paragraph[] paragraphs;

    public Text(String text) {

        if (!text.equals("")) {

            String[] splitText = text.split("\n");
            int amounfOfParagraphs = splitText.length;
            paragraphs = new Paragraph[amounfOfParagraphs];

            for (int i = 0; i < amounfOfParagraphs; i++) {
                paragraphs[i] = new Paragraph(splitText[i]);
            }
        }
    }

    public Paragraph[] getParagraphs() {
        return paragraphs;
    }

    public void setParagraphs(Paragraph[] paragraphs) {
        this.paragraphs = paragraphs;
    }

    public StringBuilder getStringText() {

        StringBuilder text = new StringBuilder("");

        for (Paragraph paragraph: this.paragraphs) {
            for (Sentence sentence: paragraph.getSentences()) {
                for (MemberOfSentence memberOfSentence: sentence.getMembersOfSentence()) {

                    if (memberOfSentence instanceof Word) {
                        for (Letter letter: ((Word) memberOfSentence).getLetters()) {
                            text.append(letter.getContent());
                        }
                    } else if (memberOfSentence instanceof PunctuationMark) {
                        text.append(((PunctuationMark) memberOfSentence).getContent());
                        text.append(" ");
                    }
                }
            }
            text.append("\n");
        }
        return text;
    }
}
