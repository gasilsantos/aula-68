import java.util.Arrays;

public class GetName2 {

    public static void main(String[] args) {
        String names[] = {"joão", "jose" , "Pedro" , "Paulo" , "Maria" , "julia" , "Mariana"};

        String name = "mallory";

        if (Arrays.asList(names).contains(name)){
             System.out.println("Seja bem vindo á festa!");
        }else{
            System.out.println("já falei seu merda sai daqui!");

        }
    }
    
}
