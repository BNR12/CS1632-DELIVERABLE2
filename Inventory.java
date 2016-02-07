/**
 * Created by brittanyregrut on 2/7/16.
 */
public class Inventory {
    boolean coffee;
    boolean cream;
    boolean sugar;

    //Default constructor
    public Inventory() {
        coffee = false;
        cream = false;
        sugar = false;
    }

    //Update coffee
    public void updateCoffee(boolean c){
        this.coffee = c;
    }

    //Update cream
    public void updateCream(boolean c){
        this.cream = c;
    }

    //Update sugar
    public void updateSugar(boolean s){
        this.sugar = s;
    }

    //Display inventory
    public void displayInventory(){
        if (this.coffee){
            System.out.println("You have a cup of delicious coffee.");
        }
        else{
            System.out.println("YOU HAVE NO COFFEE!");
        }

        if (this.cream){
            System.out.println("You have some fresh cream.");
        }
        else{
            System.out.println("YOU HAVE NO CREAM!");
        }

        if (this.sugar){
            System.out.println("You have some tasty sugar.");
        }
        else{
            System.out.println("YOU HAVE NO SUGAR!");
        }
        System.out.println("");
    }

    //Drink command
    //Returns false to quit the play loop in the driver
    public boolean drink(){
        this.displayInventory();
        if (this.coffee && this.cream && this.sugar){
            System.out.println("You drink the beverage and are ready to study!");
            System.out.println("You win!");
        }
        else if (!this.coffee && !this.cream && !this.sugar){
            System.out.println("You drink the air, as you have no coffee, sugar, or cream.");
            System.out.println("The air is invigorating, but not invigorating enough.  You cannot study.");
            System.out.println("You lose!");
        }
        else if (this.coffee && !this.cream){
            System.out.println("Without cream, you get an ulcer and cannot study.");
            System.out.println("You lose!");
        }
        else if (!this.coffee && this.cream && !this.sugar){
            System.out.println("You drink the cream, but without caffeine, you cannot study.");
            System.out.println("You lose!");
        }
        else if (!this.coffee && !this.cream){
            System.out.println("You eat the sugar, but without caffeine, you cannot study.");
            System.out.println("You lose!");
        }
        else if (this.coffee){
            System.out.println("Without sugar, the coffee is too bitter.  You cannot study.");
            System.out.println("You lose!");
        }
        else{
            System.out.println("You drink the sweetened cream, but without caffeine, you cannot study.");
            System.out.println("You lose!");
        }

        return false;
    }
}
