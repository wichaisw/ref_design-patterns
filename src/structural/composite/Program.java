package structural.composite;

public class Program {
    public static void main(String[] args) {
        Housing building = new Housing("123 Street");
        Housing floor1 = new Housing("123 Street - First Floor");
        int firstFloor = building.addStructure(floor1); // return index of the Housing

        Room washroom1m = new Room("1F Men's Washroom");
        Room washroom1w = new Room("1F Women's Washroom");
        Room common1 = new Room("1F Common Area");

        int firstMensWr = floor1.addStructure(washroom1m);
        int firstWomanWr = floor1.addStructure(washroom1w);
        int fistCommon = floor1.addStructure(common1);

        building.enter(); // Enter the building

        Housing currentFloor = (Housing) building.getStructure(firstFloor);
        currentFloor.enter(); // Walk into the first floor

        Room currentRoom = (Room) currentFloor.getStructure(firstMensWr);
        currentRoom.enter(); // Walk into the men's room

        currentRoom = (Room) currentFloor.getStructure(fistCommon);
        currentRoom.enter(); // Walk into the common area




    }
}
