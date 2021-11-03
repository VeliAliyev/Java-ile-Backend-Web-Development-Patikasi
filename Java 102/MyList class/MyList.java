import java.util.Arrays;

public class MyList<T> {

    Object[] array;

    MyList(){
         this.array =  new Object[10];
    }

    MyList(int capacity){
        this.array = new Object[capacity];
    }

    int size(){
        int counter = 0;
        for (Object o : this.array) {
            if (o != null) {
                counter++;
            }
        }
        return counter;
    }

    int getCapacity(){ return this.array.length;}

    void add(T data){
        if(this.size() == this.getCapacity()){
            int capacity = this.getCapacity();
            Object[] temp = this.array.clone();
            this.array = new Object[capacity*2];
            System.arraycopy(temp, 0, this.array, 0, temp.length);
            this.array[capacity] = data;
        }
        else{
            int size = this.size();
            this.array[size] = data;
        }
    }

    T get(int index){
        if(index >= this.getCapacity())
            return null;
        else {
            return (T)this.array[index];
        }
    }

    boolean remove(int index){
        if(index >= this.getCapacity())
            return false;
        for(int i = index; i < this.getCapacity()-1; i++){
            this.array[i] = this.array[i+1];
        }
        this.array[this.getCapacity()-1] = null;
        return true;
    }

    boolean set(int index, T data){
        if(index >= this.getCapacity())
            return false;
        this.array[index] = data;
        return true;
    }
    public String toString(){

        String str = "[";
        for(int i = 0; i < this.size(); i++){
            str += this.array[i];
            if(i!=this.size()-1)
                str += ",";
        }
        str +="]";
    return str;
    }

     int indexOf(T data){
        int index = -1;

        for(int i = 0; i < this.size(); i++){
            if(this.array[i].equals(data)){
                index = i;
                break;
            }
        }
        return index;
    }

    int lastIndexOf(T data){
        int index = -1;

        for(int i = this.size()-1; i > 0; i--){
            if(this.array[i].equals(data)){
                index = i;
                break;
            }
        }
        return index;
    }

    boolean isEmpty(){

        for(int i = 0; i < this.size(); i++){
            if(this.array[i] != null){
                return false;
            }
        }
        return true;
    }

    T[] toArray(){
        Object arr = this.array.clone();
        return (T[]) arr;
    }

    void clear(){
        for(int i = 0; i < this.getCapacity(); i++){
            this.array[i] = null;
        }
    }

    MyList<T> subList(int start,int finish){
        MyList<T> myList = new MyList<>();

        for(int i = start; i <= finish; i++){
            myList.add(this.get(i));
        }

        return myList;
    }
    boolean contains(T data){
        if(indexOf(data) == -1) return false;
        else return true;
    }
}
