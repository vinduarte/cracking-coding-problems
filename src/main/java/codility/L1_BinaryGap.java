package codility;

public class L1_BinaryGap {

  // Tested in Codility
  public int solution(int N) {
    StringBuilder oppBinary = findOppositeBinary(N);
    int index = oppBinary.indexOf("1");

    if (index == -1) {
      return 0;
    }

    int gap = 0;
    int maxGap = -1;

    for (int i = index + 1; i < oppBinary.length(); i++) {
      if (oppBinary.charAt(i) == '0') {
        gap++;
      } else {
        if (maxGap < gap) {
          maxGap = gap;
        }
        gap = 0;
      }
    }

    return maxGap == -1 ? 0 : maxGap;
  }

  public StringBuilder findOppositeBinary(int n) {
    int bit;
    StringBuilder sb = new StringBuilder();

    while (n > 0) {
      bit = n % 2;
      sb.append(bit);
      n /= 2;
    }

    return sb;
  }
}
