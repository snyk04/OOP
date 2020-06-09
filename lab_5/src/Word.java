public class Word extends MemberOfSentence {

    private Letter[] letters;

    public Word(String word) {

        StringBuilder redactedWord = new StringBuilder("");
        String punctuation = ",.?!";
        char firstLetter;

        if (punctuation.contains(String.valueOf(word.charAt(0)))) {
            firstLetter = word.charAt(1);
            redactedWord.append(word.charAt(0));
            redactedWord.append(" ");
        } else {
            firstLetter = word.charAt(0);
        }
        redactedWord.append(firstLetter);

        for (int i = 1; i < word.length(); i++) {
            if (!String.valueOf(word.charAt(i)).equalsIgnoreCase(String.valueOf(firstLetter))) {
                redactedWord.append(word.charAt(i));
            }
        }

        this.letters = new Letter[redactedWord.length()];
        for (int i = 0; i < redactedWord.length(); i++) {
            letters[i] = new Letter(redactedWord.charAt(i));
        }
    }

    public Letter[] getLetters() {
        return letters;
    }

    public void setLetters(Letter[] letters) {
        this.letters = letters;
    }
}
