public class Dolgozo implements Comparable{
    
    private String name, address;
    private int age, experience;
    private String school;

    public Dolgozo(String name, String address, int age, int experience, String school) {
        this.name = name;
        this.address = address;
        this.age = age;
        this.experience = experience;
        this.school = school;
    }
    
    public int compareTo(Object o){
        return name.compareTo(((Dolgozo)o).name);
    }
    
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getExperience() {
        return experience;
    }

    public void setExperience(int experience) {
        this.experience = experience;
    }

    public String getSchool() {
        return school;
    }

    public void setSchool(String school) {
        this.school = school;
    }

    @Override
    public String toString() {
        return "Nev: " + name + ", Cime: " + address + ", Kor: " + age + ", Tapasztalat: " + experience + 
                ", Iskolai vegzettseg: " + school + "\n";
    }
    
     
}
