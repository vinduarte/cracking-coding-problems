package book.chapter01;

public class OneAway_1_5 {

   private static boolean oneAway(String s1, String s2) {
      int lenDiff = s1.length() - s2.length();

      if (lenDiff < -1 || lenDiff > 1) {
         return false;
      }
      if (lenDiff == 0) {
         return checkMaxOneCharOfDiff(s1, s2);
      }
      if (lenDiff == 1) {
         return checkMaxOneJumpOfDiff(s2, s1);
      } else {
         return checkMaxOneJumpOfDiff(s1, s2);
      }
   }

   private static boolean checkMaxOneCharOfDiff(String s1, String s2) {
      boolean foundDiff = false;
      for (int i = 0; i < s1.length(); i++) {
         if (s1.charAt(i) != s2.charAt(i)) {
            if (foundDiff) {
               return false;
            }
            foundDiff = true;
         }
      }
      return true;
   }

   private static boolean checkMaxOneJumpOfDiff(String smaller, String bigger) {
      boolean jumped = false;
      for (int i = 0, j = 0; j < smaller.length(); i++, j++) {
         if (smaller.charAt(i) != bigger.charAt(j)) {
            if (jumped) {
               return false;
            }
            jumped = true;
            i--;
         }
      }
      return true;
   }

   public static void main(String[] args) {
      System.out.println(oneAway("pale", "ple"));
      System.out.println(oneAway("ple", "pale"));
      System.out.println(oneAway("pales", "pale"));
      System.out.println(oneAway("pale", "pales"));
      System.out.println(oneAway("pale", "pale"));
      System.out.println(oneAway("pale", "bale"));
      
      System.out.println(oneAway("pale", "bake"));
      System.out.println(oneAway("pale", "bakeaaaaaa"));
      
   }
}
