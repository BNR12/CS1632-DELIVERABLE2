/**
 * Created by brittanyregrut on 2/7/16.
 */
public class Room {

    boolean coffee;
    boolean cream;
    boolean sugar;
    String adj;
    String furn;
    String north;
    String south;
    boolean[] cre = {true, false, false, false, false, false};
    boolean[] cof = {false, false, true, false, false, false};
    boolean[] sug = {false, false, false, false, false, true};
    String[] adjs = {"Small", "Funny", "Refinanced", "Dumb", "Bloodthirsty", "Rough"};
    String[] furns = {"Quaint sofa", "Sad record player", "Tight pizza", "Flat energy drink", "Beautiful bag of money", "Perfect air hockey table"};
    String[] northDoors = {"Magenta", "Beige", "Dead", "Vivacious", "Purple", null};
    String[] southDoors = {null, "Massive", "Smart", "Slim", "Sandy", "Minimalist"};

    //default constructor
    public Room(){
        coffee = false;
        cream = false;
        sugar = false;
        adj = null;
        furn = null;
        north = null;
        south = null;
    }

    //Constructor for a given number room
    public Room(int number) {
        coffee = cof[number];
        cream = cre[number];
        sugar = sug[number];
        adj = adjs[number];
        furn = furns[number];
        north = northDoors[number];
        south = southDoors[number];
    }

    //Return the value of coffee for a room
    public boolean getCoffee(){
        return this.coffee;
    }

    //Display room
    public void displayRoom(){
        System.out.println("You see a " + this.adj + " room.");
        System.out.println("It has a " + this.furn + ".");
        if (this.north != null){
            System.out.println("A " + this.north + " door leads North.");
        }
        if (this.south != null){
            System.out.println("A " + this.south + " door leads South.");
        }
        System.out.println("");
    }

    //Implements the look command. Returns 1 if an ingredient was found, 0 if nothing found
    public int look(Inventory i){
        if (this.cream){
            System.out.println("There might be something here...");
            System.out.println("You found some creamy cream!");
            System.out.println("");
            i.updateCream(true);
            return 1;
        }
        else if (this.coffee){
            System.out.println("There might be something here...");
            System.out.println("You found some caffeinated coffee!");
            System.out.println("");
            i.updateCoffee(true);
            return 1;
        }
        else if (this.sugar){
            System.out.println("There might be something here...");
            System.out.println("You found some sweet sugar!");
            System.out.println("");
            i.updateSugar(true);
            return 1;
        }
        System.out.println("You don't see anything out of the ordinary.");
        System.out.println("");
        return 0;
    }
}

