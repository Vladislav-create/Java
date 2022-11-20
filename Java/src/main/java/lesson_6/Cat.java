package lesson_6;


public class Cat {
    private int id;
    private String name;
    private int age;
    private String color;
    private String address;
    private String medical_history;

    public Cat(int id, String name, int age, String color, String address, String medical_history) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.color = color;
        this.address = address;
        this.medical_history = medical_history;
    }

    @Override
    public boolean equals(Object obj) {
        Cat cat = (Cat) obj;
        return id == cat.id && name == cat.name && age == cat.age && color == cat.color && address == cat.address && medical_history == cat.medical_history;
    }

    @Override
    public int hashCode() {
        return id;
    }

    @Override
    public String toString(){
        return "id:" + id + "  имя: " + name + "\n" + "возраст: " + age + "лет" + "\n" + "окрас: " + color + "\n" + "адрес проживания: " + address + "\n" + "история болезни: " + medical_history + "\n";
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getMedical_history() {
        return medical_history;
    }

    public void setMedical_history(String medical_history) {
        this.medical_history = medical_history;
    }
}