package assignment04;

import java.sql.Array;
import java.util.ArrayList;
import java.util.Scanner;

public class FruitBasket {
    public static int menuList(){
        int choice;
        Scanner input = new Scanner(System.in);
        System.out.println("0. EXIT");
        System.out.println("1.Add Mango");
        System.out.println("2. Add Orange");
        System.out.println("3. Add Apple");
        System.out.println("4. Display names of all fruits in basket");
        System.out.println("5. Display name, color, weight, taste of all " +
                "fresh fruits, in the basket");
        System.out.println("6. Display tastes of all stale (not fresh)" +
                " fruits in the basket.");
        System.out.println("7. Mark a fruit as stale");
        System.out.println("8. Mark all sour fruits stale");
        System.out.println("Enter your choice: ");
        choice = input.nextInt();
        return choice;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int basketSize;
        System.out.println("Enter the size of the basket: ");
        basketSize = input.nextInt();
        Fruit[] fruitsBasket = new Fruit[basketSize];
        int counter = 0;
       int choice;
       while((choice = menuList()) != 0){
           switch(choice){
               case 1:
                   //Add Mango
                   if(counter <= basketSize-1){
                       fruitsBasket[counter++] = new Mango("Yellow", 200, "Mango", true);
                   }else{
                       System.out.println("Basket is full");
                   }
                   break;
               case 2:
                   if(counter <= basketSize-1){
                       fruitsBasket[counter++] = new Orange("Orange", 150, "Orange", true);
                   }else{
                       System.out.println("Basket is full");
                   }
                   break;
               case 3:
                   if(counter <= basketSize-1){
                       fruitsBasket[counter++] = new Apple("Red", 180, "Apple", true);
                   }else{
                       System.out.println("Basket is full");
                   }
                   break;
               case 4:
                   System.out.println("******************************");
                   for(Fruit fruit : fruitsBasket){
                       if(fruit != null){
                           System.out.println(fruit.getName());
                       }
                   }
                   System.out.println("******************************");
                   break;
               case 5:
                   System.out.println("******************************");
                   for(Fruit fruit : fruitsBasket){
                       if(fruit != null){
                           System.out.println(fruit.toString());
                       }
                   }
                   System.out.println("******************************");
                   break;
               case 6:
                   System.out.println("******************************");
                   for(Fruit fruit : fruitsBasket){
                       if(fruit != null){
                           if(fruit.isFresh() == false){
                               System.out.println("Name : "+fruit.getName()+ ", taste: " +fruit.taste());
                           }
                       }
                   }
                   System.out.println("******************************");
                   break;
               case 7:
                   int index;
                   System.out.println("Enter index of fruit you wanna mark as stale: ");
                   index = input.nextInt();
                   if(index <= counter){
                       fruitsBasket[index].setFresh(false);
                   }else{
                       System.out.println("Invalid index");
                   }
                   break;
               case 8:
                   if(fruitsBasket != null){
                       for(Fruit fruit : fruitsBasket){
                           if(fruit != null){
                               if(fruit.taste().equals("sour")){
                                   fruit.setFresh(false);
                               }
                           }
                       }
                   }
                   break;
               default:
                   System.out.println("Invalid choice");
                   break;
           }
       }
    }
}
