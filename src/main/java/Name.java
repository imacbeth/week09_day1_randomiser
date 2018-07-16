import java.util.ArrayList;
import java.util.Collections;

public class Name {

    private ArrayList<String> names;

    public Name(){
        names = new ArrayList<String>();
        names.add("Helen");
        names.add("David");
        names.add("Will");
        names.add("Iona");
        names.add("Daniel");
        names.add("James");
        names.add("Magda");
        names.add("Edward");
    }

    public void shuffleNames(){
        Collections.shuffle(names);
    }

    public String randomName(){
        shuffleNames();
        return names.get(0);
    }

    public ArrayList<String> randomPair(){
        ArrayList<String> twoNames = new ArrayList<>();
        shuffleNames();
        twoNames.add(names.get(0));
        twoNames.add(names.get(1));
        return twoNames;
    }

    public ArrayList<String> randomThree(){
        ArrayList<String> threeNames = new ArrayList<>();
        shuffleNames();
        threeNames.add(names.get(0));
        threeNames.add(names.get(1));
        threeNames.add(names.get(2));
        return threeNames;
    }

    public ArrayList<String> randomFour(){
        ArrayList<String> fourNames = new ArrayList<>();
        shuffleNames();
        fourNames.add(names.get(0));
        fourNames.add(names.get(1));
        fourNames.add(names.get(2));
        return fourNames;
    }

    public ArrayList<String> getNames() {
        return names;
    }
}
