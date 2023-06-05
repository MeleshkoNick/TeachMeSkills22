public class Ex3 {
    public static void main(String[] args) {
int [] numbers = new int[]{1, 6, 35, 0, 99};
int [] numbers1 = new int []{4, 56, -17, 87};

int sum = 0;
int sum1 = 0;

for(int i : numbers) {
    sum += i;
}
        for(int i : numbers1) {
            sum1 += i;
        }
        double average = sum / numbers.length;
        double average1 = sum1 / numbers1.length;

        if (average > average1) {
            System.out.println("First bigger: " + average);
        } else if (average < average1) {
            System.out.println("Second bigger: " + average1);
        }
        else {
            System.out.println("Equal");
        }
    }
}
