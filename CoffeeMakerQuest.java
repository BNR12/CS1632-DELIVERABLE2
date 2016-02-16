/**
 * Created by brittanyregrut on 2/4/16.
 */

import java.util.Scanner;

public class CoffeeMakerQuest {
        public static void main(String[] args){
            int room = 0; //Number of the room that the player is in (0 through 5)
            boolean play = true; //true until the game has been either won or lost
            Scanner user = new Scanner(System.in); //scanner for user input

            //initialize inventory
            Inventory inventory = new Inventory();

            //initialize 1st room
            Room current = new Room(room);


            while(play){
                current.displayRoom();
                String temp = user.nextLine();

                if (temp.equals("n") || temp.equals("N")){
                    //move north
                    if (room == 5){
                        System.out.println("You are already in the northmost room!");
                        System.out.println("");
                    }
                    else{
                        room++;
                        current = new Room(room);
                    }
                }
                else if (temp.equals("s") || temp.equals("S")){
                    //move south
                    if (room == 0){
                        System.out.println("You are already in the southmost room!");
                        System.out.println("");
                    }
                    else {
                        room--;
                        current = new Room(room);
                    }
                }
                else if (temp.equals("l") || temp.equals("L")){
                    //look for ingredients
                    current.look(inventory);
                }
                else if (temp.equals("i") || temp.equals("I")){
                    //display inventory
                    inventory.displayInventory();
                }
                else if (temp.equals("d") || temp.equals("D")){
                    //drink
                    inventory.drink();
                    play = false;
                }
                else if (temp.equals("h") || temp.equals("H")){
                    //display help menu
                    help();
                }
                else{
                    System.out.println("What?");
                    System.out.println("");
                }

            }
            user.close();
        }

    //Displays the help menu
    private static void help(){
        System.out.println("'n' or 'N': move to the room to the North (if possible)");
        System.out.println("'s' or 'S': move to the room to the South (if possible)");
        System.out.println("'l' or 'L': look in the current room");
        System.out.println("'i' or 'I': view your inventory");
        System.out.println("'d' or 'D': drink the coffee (only when you have all 3 ingredients)");
        System.out.println("'h' or 'H': display this help menu");
        System.out.println("");
    }
}

