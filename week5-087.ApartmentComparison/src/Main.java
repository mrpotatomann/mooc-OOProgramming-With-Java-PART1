
public class Main {

    public static void main(String[] args) {
        // write testcode here
        Apartment studioManhattan = new Apartment(1, 16, 5500);
        Apartment twoRoomsBrooklyn = new Apartment(2, 38, 4200);
        Apartment fourAndKitchenBronx = new Apartment(3, 78, 2500);
        
        System.out.println(studioManhattan.larger(twoRoomsBrooklyn));
        System.out.println(studioManhattan.larger(fourAndKitchenBronx));
        System.out.println(twoRoomsBrooklyn.larger(fourAndKitchenBronx));
        System.out.println(fourAndKitchenBronx.larger(twoRoomsBrooklyn));
        
        System.out.println(studioManhattan.priceDifference(twoRoomsBrooklyn));
        System.out.println(studioManhattan.priceDifference(fourAndKitchenBronx));
        
        
        System.out.println(studioManhattan.moreExpensiveThan(twoRoomsBrooklyn));
        System.out.println(studioManhattan.moreExpensiveThan(fourAndKitchenBronx));
        System.out.println(twoRoomsBrooklyn.moreExpensiveThan(fourAndKitchenBronx));
        System.out.println(fourAndKitchenBronx.moreExpensiveThan(twoRoomsBrooklyn));

    }
}