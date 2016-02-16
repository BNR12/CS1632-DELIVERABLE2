import org.junit.Test;
import org.mockito.Mockito;

import static org.junit.Assert.*;


/**
 * Created by brittanyregrut on 2/4/16.
 */
public class CoffeeMakerQuestTest {

    //This test is checking that the updateCoffee() method in Inventory.java works properly.
    //It does so by initializing a new inventory object, updating the value of coffee to true
    //and getting the value of coffee, testing that it is true.
    @Test
    public void testUpdateCoffee(){
        Inventory i = new Inventory();
        i.updateCoffee(true);
        boolean coffee = i.getCoffee();
        assertTrue(coffee);
    }


    //This test is checking that the updateCream() method in Inventory.java works properly.
    //It does so by initializing a new inventory object, updating the value of cream to true
    //and getting the value of cream, testing that it is true.
    @Test
    public void testUpdateCream(){
        Inventory i = new Inventory();
        i.updateCream(true);
        boolean cream = i.getCream();
        assertTrue(cream);
    }


    //This test is checking that the updateSugar() method in Inventory.java works properly.
    //It does so by initializing a new inventory object, updating the value of sugar to true
    //and getting the value of sugar, testing that it is true.
    @Test
    public void testUpdateSugar(){
        Inventory i = new Inventory();
        i.updateSugar(true);
        boolean sugar = i.getSugar();
        assertTrue(sugar);
    }

    //This test is checking that the Inventory object is being initialized correctly by the
    //default constructor. It does so by initializing a new Inventory object, getting the
    //values of coffee, cream, and sugar, and testing that they are all false.
    @Test
    public void testInitializeInventory(){
        Inventory i = new Inventory();
        boolean coffee = i.getCoffee();
        boolean cream = i.getCream();
        boolean sugar = i.getSugar();
        boolean result = (coffee && cream && sugar);
        assertFalse(result);
    }

    //This test is checking that the default constructor is initializing a room object correctly.
    //It does so by creating a new room object using the default constructor and testing that
    //the value of coffee for the new object is false.
    @Test
    public void testDefaultRoom(){
        Room r = new Room();
        boolean result = r.getCoffee();
        assertFalse(result);
    }

    //This test is checking that when you call the look method from within an empty room,
    //nothing is found. It does so by creating a mock inventory to pass into the look method,
    //initializing a room that is known to be empty, and calling the look method from this room.
    @Test
    public void testLookEmptyRoom(){
        Inventory mockInventory = Mockito.mock(Inventory.class);
        Room temp = new Room(1);
        int result = temp.look(mockInventory);
        assertEquals(result, 0);
    }

    //This test is checking that when you call the look method from within the room containing
    //cream, something is found. It does so by creating a mock inventory to pass into
    //the look method, initializing the room that is known to contain cream (room 0), and
    //calling the look method from this room.
    @Test
    public void testLookCream(){
        Inventory mockInventory = Mockito.mock(Inventory.class);
        Room temp = new Room(0);
        int result = temp.look(mockInventory);
        assertEquals(result, 1);
    }

    //This test is checking that when you call the look method from within the room containing
    //coffee, something is found. It does so by creating a mock inventory to pass into
    //the look method, initializing the room that is known to contain coffee (room 2), and
    //calling the look method from this room.
    @Test
    public void testLookCoffee(){
        Inventory mockInventory = Mockito.mock(Inventory.class);
        Room temp = new Room(2);
        int result = temp.look(mockInventory);
        assertEquals(result, 1);
    }

    //This test is checking that when you call the look method from within the room containing
    //sugar, something is found. It does so by creating a mock inventory to pass into
    //the look method, initializing the room that is known to contain sugar (room 5), and
    //calling the look method from this room.
    @Test
    public void testLookSugar(){
        Inventory mockInventory = Mockito.mock(Inventory.class);
        Room temp = new Room(5);
        int result = temp.look(mockInventory);
        assertEquals(result, 1);
    }

    //This test is checking that when the drink method is called on an empty inventory, the
    //player will lose the game. It does so by initializing a new inventory, calling the
    //drink method, and testing that false has been returned, indicating that the player has
    //lost the game.
    @Test
    public void testDrinkNoIngredients(){
        Inventory test = new Inventory();
        boolean result = test.drink();
        assertFalse(result);
    }

    //This test is checking that when the drink method is called on an inventory containing
    //all three ingredients, the player will win the game. It does so by initializing a new
    //inventory, updating the inventory so that it contains coffee, cream, and sugar,
    //calling the drink method, and testing that true has been returned. This indicates that
    //the player has won the game.
    @Test
    public void testDrinkAllIngredients(){
        Inventory test = new Inventory();
        test.updateCream(true);
        test.updateSugar(true);
        test.updateCoffee(true);
        boolean result = test.drink();
        assertTrue(result);
    }

    //This test is checking that when the drink method is called on an inventory containing
    //only one ingredient, the player will lose the game. It does so by initializing a new
    //inventory, updating the inventory to contain only coffee (coffee was chosen arbitrarily),
    //calling the drink method, and testing that false has been returned. This indicates that
    //the player has lost the game.
    @Test
    public void testDrinkOneIngredient(){
        Inventory test = new Inventory();
        test.updateCoffee(true);
        boolean result = test.drink();
        assertFalse(result);
    }

    //This test is checking that when the drink method is called on an inventory containing
    //two ingredients, the player will lose the game. It does so by initializing a new
    //inventory, updating the inventory to contain only cream and sugar (cream and sugar were
    //chosen arbitrarily), calling the drink method, and testing that false has been returned.
    //This indicates that the player has lost the game.
    @Test
    public void testDrinkTwoIngredients(){
        Inventory test = new Inventory();
        test.updateCream(true);
        test.updateSugar(true);
        boolean result = test.drink();
        assertFalse(result);
    }


}
