public class Main {

    public static void main(String[] args) {

        // Создаём текст типа StringBuilder,
        // Делим текст на слова и добавляем их в отдельный массив типа String,
        // Очищаем текст.
        StringBuilder text = new StringBuilder("Словесный, приплюснутый, виувиувиу, слово, Swiss, worldwide, word.");
        String[] words = text.toString().split(" ");
        text.delete(0, text.length());

        // Удаляем все вхождения первой буквы слова во всем слове (независимо от регистра)
        for (String word: words) {
            text.append(word.charAt(0));
            for (int i = 0; i < word.length(); i++) {
                String firstLetter = String.valueOf(word.charAt(0));
                if (!String.valueOf(word.charAt(i)).equalsIgnoreCase(firstLetter)) {
                    text.append(word.charAt(i));
                }
            }
            text.append(" ");
        }
        System.out.println(text);
    }
}
