public class Fibonachi {
    public static void main(String[] args) {
        int x = 0;
        int y = 1;
        int z = 0;
        System.out.print(x + " " + y + " ");
        for (int i = 0; i < 9; i++) {
            z = x + y;
            x=y;
            y=z;
            System.out.print(z + " ");
        }
    }
}
