import java.util.*; //where all the Java collections stuff is kept
public class Collections {
    /*Two main ways to group objects in Java = Collections and Maps
        Collections: Root interface with basic methods like add(), remove(), contains(), isEmpty(), addAll(), ...
            List: can contain duplicates and elements are ordered
                ArrayList = a collection accessed like an array, can be sorted
                LinkedList = an unsorted collection where objects can be added any number of times FIFO behavior
            Set: Doesn't allow duplicates
                    HashSet = hashing based
                    TreeSet = balanced BST based where an object can be added only once and the objects are presorted
            Queue: order elements in FIFO except exceptions like PriorityQueue
            Deque: typically supported LIFO but Elements can be inserted and removed at both ends. Allows both LIFO and FIFO
            Map: contains key value pairs, doesn't allow duplicates
                    HashMap =
                    TreeMap = */

    //Here I played with the code Brother Tuckett showed in the video

    public static void main(String[] arg) {
        System.out.println("------List------");
        List list = new ArrayList();
        list.add("Hello");
        list.add("world");
        list.add("Kelly");
        list.add("here");
        list.add("bye");
        list.add("bye");

        for (Object str : list) {
            System.out.println((String) str);
        }

        System.out.println("------Set------");
        Set set = new TreeSet();
        set.add("Hello");
        set.add("world");
        set.add("Kelly");
        set.add("here");
        set.add("bye");
        set.add("bye");

        for (Object str : set) {
            System.out.println((String) str);
        }

        System.out.println("------Queue------");
        //priority order = capitals first over lowercase, then alphabetical order
        Queue queue = new PriorityQueue();
        queue.add("Hello");
        queue.add("world");
        queue.add("Kelly");
        queue.add("here");
        queue.add("bye");
        queue.add("bye");

        //different approach using iterator to get through all of them
        Iterator iterator = queue.iterator();
        while (iterator.hasNext()) {
            System.out.println(queue.poll());
        }

        System.out.println("------Map------");
        //1,"bye" replaced 1,"Hello"
        Map map = new HashMap();
        map.put(1, "Hello");
        map.put(2, "world");
        map.put(3, "Kelly");
        map.put(4, "here");
        map.put(1, "bye");
        map.put(5, "bye");

        for (int i = 1; i < 6; i++) {
            String result = (String) map.get(i);
            System.out.println(result);
        }


        //Collections of Places to Eat
        System.out.println("----------Places to Eat----------");

        ArrayList<String> eat = new ArrayList<String>();
        eat.add("Cheesecake Factory");
        eat.add("Red Robin");
        eat.add("Cafe Rio");
        eat.add("Chili's");
        eat.add("Olive Garden");
        eat.add("Texas Road House");
        eat.add("Panda Express");
        eat.add("Papa John's");
        eat.add("Arby's");
        eat.add("McDonalds");
        eat.add("Tepanyaki");
        eat.add("KFC");
        eat.add("Applebees");
        eat.add("Chick-fil-A");


        System.out.println(eat);

        System.out.println("------Say NO to McDonalds------");

        eat.remove(9);

        System.out.println(eat);


        System.out.println("------Pretty List of Places to Eat------");

        List eatery = new ArrayList();
        eatery.add("Cheesecake Factory");
        eatery.add("Red Robin");
        eatery.add("Cafe Rio");
        eatery.add("Chili's");
        eatery.add("Olive Garden");
        eatery.add("Texas Road House");
        eatery.add("Panda Express");
        eatery.add("Papa John's");
        eatery.add("Arby's");
        eatery.add("McDonalds");
        eatery.add("Tepanyaki");
        eatery.add("KFC");
        eatery.add("Applebees");
        eatery.add("Chick-fil-A");

        for (Object str : eatery) {
            System.out.println((String) str);
        }

        System.out.println("------Places to Eat in Alphabetical Order------");
        //priority order = capitals first over lowercase, then alphabetical order
        Queue eatery2 = new PriorityQueue();
        eatery2.add("Cheesecake Factory");
        eatery2.add("Red Robin");
        eatery2.add("Cafe Rio");
        eatery2.add("Chili's");
        eatery2.add("Olive Garden");
        eatery2.add("Texas Road House");
        eatery2.add("Panda Express");
        eatery2.add("Papa John's");
        eatery2.add("Arby's");
        eatery2.add("McDonalds");
        eatery2.add("Tepanyaki");
        eatery2.add("KFC");
        eatery2.add("Applebees");
        eatery2.add("Chick-fil-A");

        Iterator iterator2 = eatery2.iterator();
        while (iterator2.hasNext()) {
            System.out.println(eatery2.poll());
        }

        System.out.println("------Replace McDonalds with Chick-fil-A------");

        Map eatery3 = new HashMap();
        eatery3.put(1,"Cheesecake Factory");
        eatery3.put(2,"Red Robin");
        eatery3.put(3,"Cafe Rio");
        eatery3.put(4,"Chili's");
        eatery3.put(5,"Olive Garden");
        eatery3.put(6,"Texas Road House");
        eatery3.put(7,"Panda Express");
        eatery3.put(8,"Papa John's");
        eatery3.put(9,"Arby's");
        eatery3.put(10,"McDonalds");
        eatery3.put(11,"Tepanyaki");
        eatery3.put(12,"KFC");
        eatery3.put(13,"Applebees");
        eatery3.put(10,"Chick-fil-A");

        for (int i = 1; i < 14; i++) {
            String result = (String) eatery3.get(i);
            System.out.println(result);
        }
    }

}


