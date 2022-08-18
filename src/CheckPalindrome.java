import java.util.Scanner;
import java.util.Stack;

public class CheckPalindrome {
    public static void main(String[] args) {
        System.out.print("Nhap vao chuoi ban muon kiem tra: ");
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        Stack stack = new Stack<>();
        for (int i = 0; i < input.length();i++){
            stack.push(input.charAt(i));
        }
        String reverseString = "";
        while (!stack.isEmpty()){
            reverseString = reverseString+stack.pop();
        }
        if (input.equals(reverseString)){
            System.out.println("Day la chuoi doi xung");
        }else {
            System.out.println("Day khong phai chuoi doi xung");
        }
    }
}
