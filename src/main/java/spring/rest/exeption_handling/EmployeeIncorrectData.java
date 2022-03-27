package spring.rest.exeption_handling;

public class EmployeeIncorrectData {
    private String info;

    public EmployeeIncorrectData() {
    }

    public String getInfo() {
        return info;
    }

    public void setInfo(String info) {
        this.info = info;
    }

    @Override
    public String toString() {
        return "EmployeeIncorrectData{" +
                "info='" + info + '\'' +
                '}';
    }
}
