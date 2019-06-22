public class Animal {
    public int age;
    public int weight;
    public Animal(){
        age=10;
        weight=30;
    }
    public int getAge() {
        return age;
    }

    public int getWeight() {
        return weight;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public void run(){
        System.out.println("能跑");
    }
    public void eat(){
        System.out.println("能吃东西");
    }
}
