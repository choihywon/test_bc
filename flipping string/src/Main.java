import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String input = br.readLine();
        StringBuilder reversedBuilder = new StringBuilder();
        for (int i = input.length() - 1; i >= 0; i--) {
            reversedBuilder.append(input.charAt(i));
        }
        String reversed = reversedBuilder.toString();

        StringBuilder sb = new StringBuilder();
        for (char c : input.toCharArray()) {
            if (Character.isUpperCase(c)) {
                sb.append(Character.toLowerCase(c));
            } else if (Character.isLowerCase(c)) {
                sb.append(Character.toUpperCase(c));
            } else {
                sb.append(c);
            }
        }
        String result = sb.toString();

        System.out.println(result);
    }
}
