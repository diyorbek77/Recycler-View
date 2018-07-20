package uz.project.dream.recyclerview.model;

/**
 * Created by Abdufattokh on 7/20/2018.
 */

public class Items {

    private String name;
    private String img;
    private String age;

    public Items(String name, String age, String img) {
        this.name = name;
        this.age = age;
        this.img = img;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getImg() {
        return img;
    }

    public void setImg(String img) {
        this.img = img;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }
}
