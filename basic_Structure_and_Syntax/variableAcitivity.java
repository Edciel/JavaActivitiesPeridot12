package basic_Structure_and_Syntax;

public class variableAcitivity {
    public static void main(String[] args) {
     String Animalname = "pig";
    int animalage = 32;
    final int animalweight = 100;
    String animalbreed = "Yorkshire";
        System.out.println("Animal Name: " + Animalname);
        System.out.println("Animal Age: " + animalage);
        System.out.println("Animal Weight: " + animalweight);
        animalbreed = "Landrace";
        System.out.println("Animal Breed: " + animalbreed);
        animalage = 33; //reassigning the value of animalage
        System.out.println("Animal Age: " + animalage);
        float animalheight = 8.5f; //declaring and initializing a float
        System.out.println("Animal Height: " + animalheight);
        char animalsection = 'A';
         System.out.println("Animal Section: " + animalsection);
         boolean isDomestic = true;
          System.out.println("Is Domestic: " + isDomestic);
          
    }
}
