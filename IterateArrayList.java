import java.util.*;

class IterateArrayList{

    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();

        list.add(20);
        list.add(30);
        list.add(40);

        System.out.println("For loop");
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
        System.out.println("advanced For loop");
        for(Integer element : list){
            System.out.println(element);
        }

        Iterator<Integer> it = list.iterator();

        System.out.println("iterator loop");
        while (it.hasNext()){
            System.out.println(it.next());
        }

    }


}
