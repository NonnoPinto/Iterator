
public class MyIterator extends myList{

    public myList list;
    int index;
  
    MyIterator(myList m){
        this.list = m;
        list = new myList(m);
        index = 0;
    }
    
    public Object next(){
        if (index >= this.list.myVec.size())
            throw new IndexOutOfBoundsException("Coglione");

        return list.myVec.elementAt(index++);
    }

    public void remove(){
        list.myVec.removeElementAt(index);
    }

    public void setIndex(int i){
        index = i;
    }
}