package Leetcode;

public class Prob557_reverse_words_in_a_string_iii {
    public static void main(String[] args) {
        var t = new Prob557_reverse_words_in_a_string_iii();
        t.reverseWords("Let's take LeetCode contest");
    }

    public String reverseWords(String s) {
        char[] charlist = s.toCharArray();
        int l = 0;

        for (int j = 0; j < charlist.length; j++) {
            if (charlist[j] == ' ') {
                reverseString(charlist, l, j - 1);
                l = j + 1;
            }
        }
        reverseString(charlist, l, charlist.length - 1);

        return new String(charlist);
    }

    private void reverseString(char[] s, int start, int end) {

        int len = end - start;
        if (len < 1)
            return;
        char temp;
        for (int i = 0; i <= len / 2; i++) {
            temp = s[start + len - i];
            s[start + len - i] = s[start + i];
            s[start + i] = temp;
        }
    }
}
