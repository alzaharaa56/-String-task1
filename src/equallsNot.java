public class equallsNot {
    public static void main(String[] args) {
        System.out.println(equalIsNot("This is not"));
        System.out.println(equalIsNot("This is notnot"));
    }

    public static boolean equalIsNot(String text) {
        int isCount = 0;
        int notCount = 0;

        for (int i = 0; i <= text.length() - 2; i++) {
            if (text.substring(i, i + 2).equals("is")) {
                isCount++;
            }
        }
        for (int i = 0; i <= text.length() - 3; i++) {
            if (text.substring(i, i + 3).equals("not")) {
                notCount++;
            }
        }

        return isCount == notCount;
    }

}
