import java.util.Scanner;
public class ArmstrongNumber {
public static void main(String[] args) {
Scanner scanner = new Scanner(System.in);
System.out.print("Enter a number: ");
int num = scanner.nextInt();
scanner.close();
if (isArmstrong(num)) {
System.out.println(num + " is an Armstrong number.");
} else {
System.out.println(num + " is not an Armstrong number.");
}
}
static boolean isArmstrong(int num) {
int originalNum = num, sum = 0, count = 0;
// Counting digits
int temp = num;
while (temp != 0) {
count++;
temp /= 10;
}
// Calculating sum of digits raised to power count
temp = num;
while (temp != 0) {
int digit = temp % 10;
int power = 1;
for (int i = 0; i < count; i++) {
power *= digit; // Raising to power manually
}
sum += power;
temp /= 10;
}
return sum == originalNum;
}
}