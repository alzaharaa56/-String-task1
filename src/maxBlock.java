public class maxBlock {

    public static void main(String[] args) {

        System.out.println(maxBlock("hoopla"));
    }


    public static int maxBlock(String str) {
        int x = str.length();
        int count = 0;
        int tmpcount = 1;

        if (x == 0)
            return 0;
        for (int i = 0; i < x; i++) {
            if (i < x - 1 && str.charAt(i) == str.charAt(i + 1))
                tmpcount++;
            else
                tmpcount = 1;
            if (tmpcount > count)
                count = tmpcount;

        }

        return count;


    }
}
