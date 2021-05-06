import java.util.*;

public class myList{
    
    Vector myVec;

    myList(){

    }
    
    myList(myList m){
        myVec = m.myVec;
    }

    myList(Vector v){
        myVec = new Vector(v);
    }
}