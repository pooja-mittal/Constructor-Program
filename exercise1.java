public class Island {
    String i = "hai";
    public static void main(String[] args) {
        Island i2 = new Island();
        Island i3 = new Island();
        Island i4 = new Island();
        i2.i = "hello";
        i3.i = "good";
        i4.i = "evening";
        System.out.print(i2.i + "-");
        System.out.print(i3.i + "-");
        System.out.print(i4.i + "-");
        System.out.println();
        i2 = null;
        i3 = null;
        i4 = null;
        System.out.print(i2 + "-");
        System.out.print(i3 + "-");
        System.out.print(i4);
    }
}