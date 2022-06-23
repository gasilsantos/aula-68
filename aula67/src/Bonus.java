import java.util.Scanner;

public class Bonus {

    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Informe o salário do empregado");
        double salary = scanner.nextFloat();

        double upgradeSalary = salary >= 15000 ? salary * 1.10 : salary * 1.05;

        System.out.println("Seu novo salário é:" + upgradeSalary);

        scanner.close();
    }


}
