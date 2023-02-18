public class GenericClass<T> {
    private T t;

    public void setValue(T t) {
        this.t = t;
    }
    public T getValue() {
        return t;
    }
    public static void main(String[] args) {
        GenericClass<Integer> obj1 = new GenericClass<Integer>();
        obj1.setValue(100);
        System.out.println(obj1.getValue());
    }
}
