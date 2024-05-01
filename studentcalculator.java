import java.util.Scanner;
class studentcalculator {
    public static void main(String[] args) {
        int sum=0,averagepercentage;
        String grade;
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter math marks?");
        int maths=sc.nextInt();
        System.out.println("Enter english marks?");
        int english=sc.nextInt();
        System.out.println("Enter physics marks?");
        int physics=sc.nextInt();
        System.out.println("Enter chemistry marks?");
        int chemistry=sc.nextInt();
        System.out.println("Enter PPS marks?");
        int PPS=sc.nextInt();
        sum=maths+english+physics+chemistry+PPS;
        averagepercentage=sum/5;
        System.out.println("Total sum of marks is "+sum);
        System.out.println("The average percentage is "+averagepercentage);
        if(averagepercentage<=100 && averagepercentage>90){
            System.out.println("The grade is O");
        }
        if(averagepercentage<=90 && averagepercentage>80){
            System.out.println("The grade is A");
        }
        if(averagepercentage<=80 && averagepercentage>70){
            System.out.println("The grade is B");
        }
        if(averagepercentage<=70 && averagepercentage>60){
            System.out.println("The grade is C");
        }
        if(averagepercentage<=60 && averagepercentage>50){
            System.out.println("The grade is D");
        }
        if(averagepercentage<=50 && averagepercentage>40){
            System.out.println("The grade is E");
        }
        if(averagepercentage<=40 && averagepercentage>0){
            System.out.println("The grade is F");
        }
        
        
    }
}