import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        try{
            String input = br.readLine();
            String[] tokens = input.split(" ");
            double num1 = Double.parseDouble(tokens[0]);
            String operator = tokens[1];
            double num2 = Double.parseDouble(tokens[2]);
            double result;
            if(operator.equals("+")){
                result = num1 + num2;
            } else if(operator.equals("-")){
                result = num1 - num2;
            } else if(operator.equals("*")){
                result = num1 * num2;
            } else if(operator.equals("/")){
                result = num1 / num2;
            } else if(operator.equals("%")){
                result = num1 % num2;
            } else {
                System.out.println("Error");
            }
        } catch (IOException e) {
            System.out.println("error");
        } catch (IllegalArgumentException e) {
            System.out.println("input Error");
        }
    }
}