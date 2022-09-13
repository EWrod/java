public class Student extends Person{
    private String school;
    private String number;

    public String getSchool() {
        return school;
    }
    public void setSchool(String school) {
        this.school = school;
    }
    public String getNumber() {
        return number;
    }
    public void setNumber(String number) {
        this.number = number;
    }

    public void work(){
        System.out.println(getNationality()+"国籍学生"+getName()+"的工作是学习");
    }

    public  Student(){
    }
    public Student(String school, String number) {
        super("小明","男",19,"中国");
        this.school = school;
        this.number = number;
    }
}
