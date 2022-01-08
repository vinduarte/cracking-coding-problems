package amazon;

import java.util.ArrayList;
import java.util.List;

/*
LeetCode https://leetcode.com/problems/reverse-words-in-a-string/
*/
public class AMZ008_ReverseWordsInASentence {
    public String reverseWords(String s) {
        List<StringBuilder> words = new ArrayList<>();
        StringBuilder sb = new StringBuilder();
        int i = 0;
        boolean lastWasEmpty = false;

        for (; s.charAt(i) == ' '; i++)
            ;

        for (; i < s.length(); i++) {
            if (s.charAt(i) != ' ') {
                sb.append(s.charAt(i));
                lastWasEmpty = false;
            } else {
                if (!lastWasEmpty) {
                    words.add(sb);
                    lastWasEmpty = true;
                    sb = new StringBuilder();
                }
            }
        }

        if (!lastWasEmpty)
            words.add(sb);

        sb = new StringBuilder();
        for (i = words.size() - 1; i >= 0; i--) {
            sb.append(words.get(i));
            sb.append(' ');
        }
        sb.setLength(sb.length() - 1);

        return sb.toString();
    }
}
