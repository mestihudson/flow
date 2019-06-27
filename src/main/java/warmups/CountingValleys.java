package warmups;


import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;


public class CountingValleys {
  // Complete the countingValleys function below.
  public int count(final int n, final String s) {
    final String [] parts = s.split("");
    int counterUp = 0;
    int counterDown = 0;
    int current = 0;
    int previous = 0;
    for(int index = 0, length = parts.length; index < length; index++) {
      current += parts[index].equals("D") ? -1 : 1;
      if (current == -1 || current == 1) {
        previous = current;
      }
      if (index > 0) {
        if (current == 0) {
          if (previous > 0) {
            counterUp++;
          }
          if (previous < 0) {
            counterDown++;
          }
          previous = 0;
        }
      }
    }
    return counterDown;
  }

  private static final Scanner scanner = new Scanner(System.in);

  public static void main(String[] args) throws IOException {
    final BufferedWriter bufferedWriter = new BufferedWriter(
      new FileWriter(System.getenv("OUTPUT_PATH"))
    );

    final int n = scanner.nextInt();
    scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

    final String s = scanner.nextLine();

    final int result = new CountingValleys().count(n, s);

    bufferedWriter.write(String.valueOf(result));
    bufferedWriter.newLine();

    bufferedWriter.close();

    scanner.close();
  }
}
