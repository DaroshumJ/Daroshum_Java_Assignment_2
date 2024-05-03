/* Chapter 7 Ex7.10
 * Use a one-dimensional array to solve the following problem: 
 * A company pays its salespeople on a commission basis. The salespeople 
 * receive $200 per week plus 9% of their gross sales for that week. 
 * For example, a salesperson who grosses $5,000 in sales in a week receives 
 * $200 plus 9% of $5,000, or a total of $650. Write an application 
 * (using an array of counters) that determines how many of the salespeople 
 * earned salaries in each of the following ranges (assume that each 
 * salesperson’s salary is truncated to an integer amount):

$200–299

$300–399

$400–499

$500–599

$600–699

$700–799

$800–899

$900–999

$1,000 and over

Summarize the results in tabular format.
 */

 import java.util.Scanner;

public class ex710 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Array to store counts for each salary range
        int[] salaryRanges = new int[9];

        // Prompt for sales amounts until -1 is entered
        System.out.println("Enter the gross sales for each salesperson (-1 to finish):");
        while (true) {
            System.out.print("Gross sales amount (or -1 to finish): $");
            double grossSales = input.nextDouble();

            if (grossSales == -1) {
                break;
            }

            // Calculate salary for the salesperson
            double salary = 200 + (0.09 * grossSales);

            // Determine the salary range and increment the corresponding count
            if (salary >= 1000) {
                salaryRanges[8]++;
            } else {
                int index = (int) (salary / 100) - 2;
                salaryRanges[index]++;
            }
        }

        // Display the results in tabular format
        System.out.println("\nSalary Range        Number of Salespeople");
        System.out.println("----------------------------------------");
        for (int i = 0; i < salaryRanges.length; i++) {
            if (i == salaryRanges.length - 1) {
                System.out.printf("$%d and over        %d%n", (i + 2) * 100, salaryRanges[i]);
            } else {
                System.out.printf("$%d-%d               %d%n", (i + 2) * 100, (i + 3) * 100 - 1, salaryRanges[i]);
            }
        }

        input.close();
    }
}
