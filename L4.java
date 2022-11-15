import java.util.*;
public class L4{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int year = 0;
        int d01 = 0;

        System.out.println("Enter year and first day of the year: ");
        year = scanner.nextInt();
        d01 = scanner.nextInt();

        int daysTilMay = 31 + (isLeap(year)?29:28) +31 +30;
        int daysTilAug = daysTilMay + 31 +30 +31;




    }
        static boolean isLeap(int year){
            return (year % 400 == 0)||(year % 100!= 0) && (year % 4 ==0);
        }

        static void displayCalendar(int dayinWeek, int year, String month, int daysInMonth){
        System.out.printf("\nCalendar for%s %d\n",month,year);
        System.out.println("┌─────┬─────┬─────┬─────┬─────┬─────┬─────┐");
        System.out.println("│ Sun │ Mon │ Tue │ Wed │ Thu │ Fri │ Sat |");
        System.out.println("├─────┼─────┼─────┼─────┼─────┼─────┼─────┤");
        System.out.print(("│     ").repeat(dayinWeek));

        for(int i =1; i<= daysInMonth; i++){
            System.out.printf("│ %s  ", (i < 10) ? "0" + i : i);
            dayinWeek++;

            if (dayinWeek % 7 == 0) {
                System.out.print("│\n├─────┼─────┼─────┼─────┼─────┼─────┼─────┤\n");
                dayinWeek = 0;
            }
        }

            System.out.print(("│     ").repeat(7 - dayinWeek) + "│\n└─────┴─────┴─────┴─────┴─────┴─────┴─────┘\n");
        }
}