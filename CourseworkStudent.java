public class CourseworkStudent extends Student {
    private double courseworkMark;
    private double examMark;

    public CourseworkStudent(String name, String regNumber, double courseworkMark, double examMark) {
        super(name, regNumber);
        this.courseworkMark = courseworkMark;
        this.examMark = examMark;
    }

    @Override
    public double calculateFinalScore() {
        return (courseworkMark * 0.40) + (examMark * 0.60);
    }

    @Override
    public void displayDetails() {
        System.out.println("Student Type : Coursework Student");
        System.out.println("Name         : " + getName());
        System.out.println("Reg Number   : " + getRegNumber());
        System.out.printf("Final Score  : %.2f%%\n", calculateFinalScore());
        System.out.println("----------------------------------------");
    }
}
