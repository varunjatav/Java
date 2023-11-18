class WordToStrings {
    public static void main(String[] args) {
        String s = " " + "Hello India and Indians";
        String w = "Indians";
        int p;
        int c;
        int index;
        boolean flag = true;
        for (int i = 0; i < s.length(); i++) {
            c=0;
            if (s.charAt(i) == ' ') {
                p = i + 1;
                index = p;
                int j = 0;

                if (s.charAt(p) == w.charAt(0)) {
                    while (j < w.length() && index < s.length()) {
                        if (s.charAt(index) == w.charAt(j)) {
                            if (s.charAt(index) == ' ' && w.charAt(j) != ' '
                                    || w.charAt(j) == ' ' && s.charAt(index) != ' ') {
                                flag = false;
                                break;
                            }
                            if (flag == true) {
                                System.out.print(s.charAt(index));
                            }

                        }
                        index++;
                        j++;
                    }

                }

            } else if( s.charAt(i) != ' ') {
                c++;
            }
            System.out.println(c);
        }

    }
}