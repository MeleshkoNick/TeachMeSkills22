public class Ex2 {
    public static void main(String[] args) {
        chess();
    }
    public static void chess() {
        char[][] table = new char[8][8];
        char[] symbols= new char[] {'W', 'B'};
        for (int row = 0, symbol = 0; row < table.length; row++) {
            for (int col = 0; col < table[row].length; col++) {
                table[row][col] = symbols[symbol];
                symbol = (symbol == 0) ? ++symbol : --symbol;
            }
        }
        for (char[] letter : table) {
            for (char inner : letter) {
                System.out.print(inner + "\t");
            }
            System.out.println();
        }
    }
}
