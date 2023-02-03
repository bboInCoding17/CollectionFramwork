package member1;

public class Member3 {
    private String name;
    private String id;
    private String pw;

    public Member3(){

    }

    public Member3(String name, String id, String pw){
        this.name = name;
        this.id = id;
        this.pw = pw;

    }

    public  String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getPw() {
        return pw;
    }

    public void setPw(String pw) {
        this.pw = pw;
    }

    @Override
    public String toString() {
        return "Member1{" +
                "name='" + name + '\'' +
                ", id='" + id + '\'' +
                ", pw='" + pw + '\'' +
                '}';
    }
}
