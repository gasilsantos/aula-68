public class GetName {
    
  public static void main(String[] args) {
    
    String names[] = {"jose", "joão", "Pedro", "Paulo", "Maria"};

    String name = "jose";

    boolean found = false;

    for (int i = 0; i < names.length; i++){
        if(names[i] == name){
            found = true;
        }
    }

    if(found){
        System.out.println("Seja bem vindo" + name);

    }else{
        System.out.println("Vaza daqui seu merda!");
    }

  }
}
