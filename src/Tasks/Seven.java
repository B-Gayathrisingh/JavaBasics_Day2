package Tasks;

import java.text.DecimalFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Seven {

	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        LocalDate currentDate = LocalDate.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");
        String formattedDate = currentDate.format(formatter);
        System.out.print("Enter amount: ");
        double amount = sc.nextDouble();
        DecimalFormat currencyFormatter = new DecimalFormat("₹#,##0.00");
        String formattedAmount = currencyFormatter.format(amount);
        System.out.println("Current Date: " + formattedDate);
        System.out.println("Formatted Amount: " + formattedAmount);
        sc.close();
    }
}
