import java.util.Scanner;

class Line{
    float x1, y1, x2, y2;
    public Line(float x1, float y1, float x2, float y2){
        this.x1 = x1;
        this.y1 = y1;
        this.x2 = x2;
        this.y2 = y2;
    }
    public double length(){
        return Math.sqrt((x2 - x1) * (x2 -x1) + (y2 - y1) *  (y2 - y1));
    }
    
    public boolean equals(Line l2){
        return this.length() == l2.length();
    }

    public double CompareTo(Line l2){
        return  (this.length() - l2.length());

    }

}

class LineComparison {
    public static void main(String[] args) {
        float x1, y1, x2, y2;
        Scanner sc = new Scanner(System.in);
        System.out.println("enter 1st point of line 1: ");
        x1 = sc.nextFloat();
        y1 = sc.nextFloat();
        System.out.println("enter 2nd point of line 1: ");
        x2 = sc.nextFloat();
        y2 = sc.nextFloat();
        Line l1 = new Line(x1, y1, x2, y2);

        System.out.println("enter 1st point of line 2: ");
        x1 = sc.nextFloat();
        y1 = sc.nextFloat();
        System.out.println("enter 2nd point of line 2: ");
        x2 = sc.nextFloat();
        y2 = sc.nextFloat();
        Line l2 = new Line(x1, y1, x2, y2);

        if(l1.CompareTo(l2) > 0){
            System.out.println("line 1 is greater than line 2");
        }else if(l1.CompareTo(l2) < 0){
            System.out.println("line 1 is lessthan line 2");
        }else{
            System.out.println("both lines are equal");
        }


    }
}
