package exam.q44;

/**
 * Created by chaialong on 8/11/2016.
 */
public class Fish {
    protected static String getColor(){
        return "Yellow";
    }

    public static void main(String[] args) {
        new Pufferfish().printDescription();
    }
}

class Pufferfish extends Fish {
    protected static String getColor(){
        return "Green";
    }
    public void printDescription(){
        System.out.println(super.getColor()+","+ this.getColor() + "," + getColor());
    }
}
