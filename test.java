import java.util.*;

public class test{
public static void main(String args[]) {
    
    Vector test = new Vector();
    
    for (int i = 0; i < 100; i++)
        test.addElement(i);
    
    myList l = new myList(test);

    MyIterator i = new MyIterator(l);

    System.out.println("List size = " + l.myVec.size() + " Iterator size = " + i.list.myVec.size());

    for (int k = 0; k < 50; k++){
        System.out.print((int)i.next() + " ");
    }
    i.setIndex(10);
    i.remove();
    i.setIndex(0);
    System.out.println();

    for (int k = 0; k < 50; k++){
        System.out.print((int)i.next() + " ");
    }
    System.out.println("List size = " + l.myVec.size() + " Iterator size = " + i.list.myVec.size());
    System.out.println();
}
}