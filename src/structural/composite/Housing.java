package structural.composite;

import java.util.ArrayList;

// composite class
public class Housing implements IStructure {
    private ArrayList<IStructure> structures;
    private String address;

    public Housing(String adress) {
        this.structures = new ArrayList<IStructure>();
        this.address = adress;
    }

    public int addStructure(IStructure component) {
        this.structures.add(component);
        return this.structures.size() - 1;
    }

    public IStructure getStructure(int componentNumber) {
        return this.structures.get(componentNumber);
    }

    @Override
    public void location() {
        System.out.println("You are currently in " + this.getName() + ". Is has ");
        for(IStructure struct : this.structures) {
            System.out.println(struct.getName());
        }
    }

    @Override
    public String getName() {
        return this.address;
    }

    @Override
    public void enter() {
        System.out.println("Enter " + this.getName());
    }

    @Override
    public void exit() {
        System.out.println("Exit from " + this.getName());
    }
}
