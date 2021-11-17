package structural.composite;

// leaf class doesn't contain any component, so we don't add method to manage that.
public class Room implements IStructure {
    public String name;

    public Room(String name) {
        this.name = name;
    }

    @Override
    public void enter() {
        System.out.println("You have entered the " + this.name);
    }

    @Override
    public void exit() {
        System.out.println("You have left the " + this.name);
    }

    @Override
    public void location() {
        System.out.println("You are currently in the " + this.name);

    }

    @Override
    public String getName() {
        return this.name;
    }
}
