public class Worker extends Person{
    private String unit;//单位
    private int workage;

    public String getUnit() {
        return unit;
    }
    public void setUnit(String unit) {
        this.unit = unit;
    }
    public int getWorkage() {
        return workage;
    }
    public void setWorkage(int workage) {
        this.workage = workage;
    }

    public void work(){
        System.out.println(getNationality()+"国籍"+getName()+"工人的工作是敲代码,工龄是"+getWorkage());
    }

    public Worker(String unit, int workage) {
        super("张三","男",25,"中国");
        this.unit = unit;
        this.workage = workage;
    }

}

