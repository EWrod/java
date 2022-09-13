public class StudentCadre extends Student{
    private String post;

    public String getPost() {
        return post;
    }
    public void setPost(String post) {
        this.post = post;
    }

    public void meet(){
        System.out.println("正在开会");
    }
    public void work(){
        System.out.println("学生干部的工作是学习和开会");
    }
}
