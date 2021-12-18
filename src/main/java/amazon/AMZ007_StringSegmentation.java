package amazon;

public class AMZ007_StringSegmentation {
    public static boolean canSegmentString(String input, String[] dictionary) {
        int index;
        for (String str : dictionary) {
            index = input.indexOf(str);
            if (index == -1)
                continue;

            input = input.replaceFirst(str, "");

            if (input.isEmpty())
                return true;
        }
        return false;
    }

    public static void main(String [] args){
        String [] dictionary = {"apple", "apple", "pear", "pie"};
        System.out.println(canSegmentString("applepie", dictionary));
        System.out.println(canSegmentString("pieapple", dictionary));
        System.out.println(canSegmentString("applepieapple", dictionary));
        System.out.println(canSegmentString("applepieapplepear", dictionary));
        System.out.println(canSegmentString("applepieapplepearpearpie", dictionary));
        System.out.println(canSegmentString("applepeer", dictionary));
        System.out.println(canSegmentString("applepie1", dictionary));
        System.out.println(canSegmentString("a", dictionary));
        System.out.println(canSegmentString("", dictionary));
    }
}
