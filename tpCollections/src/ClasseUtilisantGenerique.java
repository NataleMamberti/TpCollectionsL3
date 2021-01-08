public class ClasseUtilisantGenerique<E> {

    private E first;
    private E second;

    ClasseUtilisantGenerique(E object1, E object2){
        first = object1;
        second = object2;
    }

    public E getFirst(){
        return first;
    }

    public E getSecond(){
        return second;
    }

    public void setFirst(E first){
        this.first = first;
    }
    public void setSecond(E second){
        this.second = second;
    }

    public void print(){
        System.out.println(first);
        System.out.println(second);
    }

    @Override
    public String toString() {
        return first +
                ": " + second;
    }
}
