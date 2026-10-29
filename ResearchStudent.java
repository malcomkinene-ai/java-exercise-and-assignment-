public class ResearchStudent extends Student {
    private double proposalScore;
    private double thesisScore;

    public ResearchStudent(String name, String regNumber, double proposalScore, double thesisScore) {
        super(name, regNumber);
        this.proposalScore = proposalScore;
        this.thesisScore = thesisScore;
    }

    @Override
    public double calculateFinalScore() {
        return (proposalScore * 0.30) + (thesisScore * 0.70);
    }

    @Override
    public void displayDetails() {
        System.out.println("Student Type : Research Student");
        System.out.println("Name         : " + getName());
        System.out.println("Reg Number   : " + getRegNumber());
        System.out.printf("Final Score  : %.2f%%\n", calculateFinalScore());
        System.out.println("----------------------------------------");
    }
}
