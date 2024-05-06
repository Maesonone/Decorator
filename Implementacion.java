public class Implementacion{
    public static void main(String[] args) {
         // Pedimos un café básico
         BebidaInterface cafe = new Cafe();
         System.out.println("Descripción: " + cafe.getDescription());
         System.out.println("Costo: $" + cafe.getCost());
 
         // Añadimos leche al café
         cafe = new ConLeche(cafe);
         System.out.println("Descripción: " + cafe.getDescription());
         System.out.println("Costo: $" + cafe.getCost());
 
         // Añadimos azúcar al café con leche
         cafe = new ConAzucar(cafe);
         System.out.println("Descripción: " + cafe.getDescription());
         System.out.println("Costo: $" + cafe.getCost());
    }
}