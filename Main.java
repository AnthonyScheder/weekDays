import java.util.Arrays;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        //creates an array for all the week days
        String[] weekDays = {"Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"};
        //prints out these days of the week vertically
        System.out.println("The days of the week are: " + Arrays.toString(weekDays).replaceAll("^.|.$", "").replace(", ", "\n"));
        //creates a new temporary array for the days of the week without the weekend
        String[] weekDays2 = {"Monday", "Tuesday", "Wednesday", "Thursday", "Friday"};
        //sets our original array to this new one
        weekDays = weekDays2;
        //creates spacing for printing out the two different arrays
        System.out.println("");
        System.out.println("");
        //prints out the days of the week without the weekend and does it vertically
        System.out.println("The days of the week, without the weekend is: " + Arrays.toString(weekDays).replaceAll("^.|.$", "").replace(", ", "\n"));
    }
}