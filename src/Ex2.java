public class Ex2 {
    public static void main(String[] args) {
        chess();
    }
    public static void chess() {
        String[][] table = new String[8][8];
        for (int row = 0; row < table.length; row++) {
            for (int col = 0; col < table[row].length; col++) {
                if ((row + col) % 2 == 0) {
                    table[row][col] = "W";
                } else {
                    table[row][col] = "B";
                }
            }
        }
        for (String[] letter : table) {
            for (String inner : letter) {
                System.out.print(inner + "\t");
            }
            System.out.println();
        }
    }
}
