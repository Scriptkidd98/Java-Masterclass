public class GenericMethod {
    public <M> M display(M val) {
        return val;
    }
    public static void main(String[] args) {
        GenericMethod obj = new GenericMethod();

        System.out.println(obj.display("Test"));
        System.out.println(obj.display(100));
    }
}
