import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> list=new ArrayList<>();
        list.add(5);
        list.add(15);
        list.add(10);
        list.add(5);
        list.add(20);
        list.add(25);
        //list.stream().forEach(i ->System.out.println(i));
        //list.stream().distinct().forEach(i -> System.out.println(i));
        //System.out.println(list.stream().anyMatch(i->i==5));
        //list.stream().filter(n->n>10).forEach(n->System.out.println(n));
        list.stream().sorted().forEach(i->System.out.println(i));
    }
}
