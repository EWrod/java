public class Person {
    private String name;
    private String sex;
    private int age;
    private String nationality;

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getSex() {
        return sex;
    }
    public void setSex(String sex) {
        this.sex = sex;
    }
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public String getNationality() {
        return nationality;
    }
    public void setNationality(String nationality) {
        this.nationality = nationality;
    }

    public void eat(){
        System.out.println(name+"吃了一顿饭");
    }
    public void sleep(){
        System.out.println(name+"睡了一觉");
    }
    public void work(){
        System.out.println(name+"正在工作");
    }

    public Person(){}
    public Person(String name, String sex, int age, String nationality) {
        this.name = name;
        this.sex = sex;
        this.age = age;
        this.nationality = nationality;
    }
}

