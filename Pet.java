/*
*Lyric Hogans
*CS2
*Febuary 2025
* 
*/
  
public class Pet {
    
    private String name;
    private String type;
    private int age;

      public Pet() {
        this.name = "Kilo";
        this.type = "Dog";
        this.age = 3;
    }

      public Pet(String type, String name, int age) {
        this.type = type;
        this.name = name;
        this.age = age;
    }

      public void setName(String newName) {
        this.name = newName;
    }

      public void setType(String newType) {
        this.type = newType;
    }

      public void setAge(int newAge) {
        this.age = newAge;
    }

      public String getName() {
        return this.name;
    }

      public String getType() {
        return this.type;
    }

      public int getAge() {
        return this.age;
    }

      public String speak() {
        if (type.equalsIgnoreCase("dog")) {
            return "Woof";
        } else if (type.equalsIgnoreCase("cat")) {
            return "Meow";
        } else {
            return "Noise";
        }
    }

      public String toString() {
        String info = "Pet information:";
        info = info + "\nType: " + this.type;
        info = info + "\nName: " + this.name;
        info = info + "\nSound: " + speak();
        info = info + "\nAge: " + this.age;
        return info;
    }

      public static void main(String[] args) {
        Pet pet1 = new Pet();        
        System.out.println(pet1);
        
        Pet pet2 = new Pet("Dog", "Shadow", 4);
        System.out.println(pet2);
    }
}    