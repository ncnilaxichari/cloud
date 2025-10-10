import java.util.Scanner;

public class armStrong {
public static void main(String[] args) {
Scanner sc = new Scanner(System.in);

System.out.print("Enter a number: ");
int num = sc.nextInt();

if (isArmstrong(num)) {
System.out.println(num + " is an Armstrong number.");
} else {
System.out.println(num + " is not an Armstrong number.");
}

sc.close();
}

public static boolean isArmstrong(int num) {
int originalNum = num;
int sum = 0;
int numDigits = String.valueOf(num).length();

while (num > 0) {
int digit = num % 10;
sum += Math.pow(digit, numDigits);
num /= 10;

}

return sum == originalNum;
}
}