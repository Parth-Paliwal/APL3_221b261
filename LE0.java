class abc {
    int age;
    String name;
    
    void setName(String name) {
        this.name = name;
    }
    
    void setAge(int age) {
        this.age = age;
    }
    
    String getName() {
        return name;
    }
    
    int getAge() {
        return age;
    }
}

public class Main {
    public static void main(String[] args) {
        abc p = new abc();
        p.setName("Parth");
        p.setAge(10);
        System.out.println(p.getName());
        System.out.println(p.getAge());
    }
}