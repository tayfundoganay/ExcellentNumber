import java.util.Scanner;

public class ExcellentNumber {
    public static void main(String[] args) {
        int number, sum=0;
        Scanner scanner = new Scanner(System.in);

        System.out.print("Bir Sayı Giriniz: ");
        number = scanner.nextInt();

        for(int i=1; i<number; i++){
            if(number % i ==0){
                sum +=i;
            }
        }
        if (number == sum){
            System.out.println(number + "Mükemmel Sayıdır!");
        }else {
            System.out.println(number + "Mükemmel Sayı Değildir!");
        }
    }
}
