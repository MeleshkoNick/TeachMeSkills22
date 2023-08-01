package Employee;

class Worker implements Employee {
    @Override
    public void printPosition() {
        System.out.println("Worker");
    }
}