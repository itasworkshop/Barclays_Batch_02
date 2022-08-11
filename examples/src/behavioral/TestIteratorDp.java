package behavioral;

//Iterator Pattern --> accessing over aggregate object without exposing detail implementation

interface Iterator{

    public boolean hasNext();
    public Object next();
}

interface Container{

    public Iterator getIterator();
}

class MyCollection implements Container{

    public String names[] = {"Rajesh","Suraj","Tom"};


    @Override
    public Iterator getIterator() {
        return new MyCollectionIterator();
    }

    private class MyCollectionIterator implements Iterator{

        int i;

        @Override
        public boolean hasNext() {
            if(i < names.length){
                return true;
            }
            return false;
        }

        @Override
        public Object next() {
            if(this.hasNext()){
                return names[i++];
            }
            return null;
        }
    }
}

public class TestIteratorDp {

    public static void main(String[] args){
        MyCollection myCollection = new MyCollection();
        for( Iterator itr = myCollection.getIterator(); itr.hasNext();){
            String name = (String) itr.next();

            System.out.println(name);
        }
    }
}
