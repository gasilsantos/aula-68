import java.util.Scanner;

public class Menu {
    
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in); 

        System.err.println("Menu de opçoes:\n1 - para contratar serviço\n2 - para falar com a atendente\n3 - para reclamções\n4 - para sair");

        int op = scanner.nextInt();

        switch(op) {
            case 1:
                System.out.println("Seja muito bem vindo! Sua visita é um prazer");
                break;
            case 2:
                System.out.println("Algum problema");
                break;
            case 3:
                System.out.println("Infelizmente todos os canais estão ocupados");
                break;
            default:
                System.out.println("Opçao inválida");
                break;        

        }

        scanner.close();

    }
}
