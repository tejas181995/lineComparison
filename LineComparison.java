import java.util.Scanner;

class LineComparison {
    public static void main(String []args) {
        System.out.println("Welcome to line Comparison problem");
        Scanner sc = new Scanner(System.in);
        float x1, y1, x2, y2;
        System.out.println("enter 1st point line : ");
        x1 = sc.nextFloat();
        y1 = sc.nextFloat();
        System.out.println("enter 2nd point line : ");
        x2 = sc.nextFloat();
        y2 = sc.nextFloat();
        double dist = Math.sqrt((x2 - x1) * (x2 - x1) + (y2 - y1) * (y2 - y1));
        System.out.println("length of line is: "  + dist);
    }
}
