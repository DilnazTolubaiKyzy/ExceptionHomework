import java.io.IOException;

public class Main {
    public static void main(String[] args) {
         Car car1 = new Car();
         try( Car car2 = new Car()){
         }catch (Exception r){
             System.out.println(r.getMessage());
         }
         try{
             car1.drive();
         }catch (Exception e){
             System.out.println(e.getMessage());
         }

    }
}