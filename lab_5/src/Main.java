public class Main {

    public static void main(String[] args) {

        Text myText = new Text("Словесный, приплюснутый, виувиувиу, слово, аааабаааб. Абракадабра, дед.\nSwiss, worldwide, word.");
        StringBuilder text = new StringBuilder("");
        String punctuation = ",.?!";
        String firstLetter = "";

        // Удаляем все вхождения первой буквы слова во всем слове (независимо от регистра)
        for (Paragraph paragraph: myText.getParagraphs()) {
            for (Sentence sentence: paragraph.getSentences()) {
                for (MemberOfSentence memberOfSentence: sentence.getMembersOfSentence()) {

                    if (memberOfSentence instanceof Word) {
                        if (punctuation.contains(String.valueOf(((Word) memberOfSentence).getLetters()[0].getContent()))) {
                            firstLetter = String.valueOf(((Word) memberOfSentence).getLetters()[1].getContent());
                            text.append(((Word) memberOfSentence).getLetters()[0].getContent());
                            text.append(" ");
                        } else {
                            firstLetter = String.valueOf(((Word) memberOfSentence).getLetters()[0].getContent());
                        }
                        text.append(firstLetter);

                        for (int i = 0; i < ((Word) memberOfSentence).getLetters().length; i++) {
                            if ((!String.valueOf(((Word) memberOfSentence).getLetters()[i].getContent()).equalsIgnoreCase(firstLetter)) &
                                    (!punctuation.contains(String.valueOf(((Word) memberOfSentence).getLetters()[i].getContent())))) {
                                text.append(((Word) memberOfSentence).getLetters()[i].getContent());
                            }
                        }

                    } else if (memberOfSentence instanceof PunctuationMark) {
                        text.append(((PunctuationMark) memberOfSentence).getContent());
                        text.append(" ");
                    }
                }
            }
            text.append("\n");
        }
        System.out.println(text);
    }
}
