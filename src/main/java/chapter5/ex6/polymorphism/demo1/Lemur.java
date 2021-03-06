package chapter5.ex6.polymorphism.demo1;

public class Lemur extends Primate implements HasTail {
    public int age = 10;
    public boolean isTailStriped() {
        return false;
    }

    public static void main(String[] args) {
        Lemur lemur = new Lemur();
        System.out.println(lemur.age);

        HasTail tail = lemur;
        System.out.println(tail.isTailStriped());
        Primate primate = lemur;
        System.out.println(primate.hasHair());
    }
}
