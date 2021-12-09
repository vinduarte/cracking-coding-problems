package book.chapter01;

public class StringCompress_1_6 {

   private static String compress(String source) {
      int count = 1;
      char previous = source.charAt(0);
      StringBuilder sb = new StringBuilder();

      for (int i = 1; i < source.length(); i++) {
         if (source.charAt(i) == previous) {
            count++;
         } else {
            sb.append(count);
            sb.append(previous);
            previous = source.charAt(i);
            count = 1;
         }
      }

      sb.append(count);
      sb.append(previous);

      return sb.length() < source.length()
              ? sb.toString() : source;
   }

   public static void main(String[] args) {
      System.out.println(compress("aaccccccaaa"));
      System.out.println(compress("aaccbaaccccaaa"));
      System.out.println(compress("abcde"));
   }
}
