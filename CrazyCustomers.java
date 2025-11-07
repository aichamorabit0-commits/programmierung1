import java.util.Scanner;

public class CrazyCustomers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("wie viele Muffins sind verfügbar?");
        int muffins=scanner.nextInt();
        int Student=1;
        int Std1=3;
        int Std2=5;
        if(muffins>Std1){
            System.out.println("studierende"+Student+":"+Std1+"muffins");
            else{ System.out.println("nicht genug muffins vorhanden");muffins-=Std1;Student++;}
    
            





