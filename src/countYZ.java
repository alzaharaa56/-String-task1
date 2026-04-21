public class countYZ {
    public static void main(String[] args) {
        System.out.println(countYZ("fezday"));

    }

    public static int countYZ(String text) {

        int wordCount = 0;
        String lowercaseText = text.toLowerCase();

        for (int i = 0; i < lowercaseText.length(); i++) {

            char currentLetter = lowercaseText.charAt(i);
            if (currentLetter == 'y' || currentLetter == 'z') {
                if (i == lowercaseText.length() - 1 || !Character.isLetter(lowercaseText.charAt(i + 1))) ;

                wordCount++;
            }

        }
return wordCount;

    }


}








