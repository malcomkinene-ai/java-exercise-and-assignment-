public abstract class Student implements Displayable {
    private String name;
    private String regNumber;

    public Student(String name, String regNumber) {
        this.name = name;
        this.regNumber = regNumber;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getRegNumber() {
        return regNumber;
    }

    public void setRegNumber(String regNumber) {
        this.regNumber = regNumber;
    }

    public abstract double calculateFinalScore();
}
