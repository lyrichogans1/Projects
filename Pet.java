/*
*Lyric Hogans
*CS2
*Febuary 2025
* 
*/
  public class Pet {
    
    private String name;

    
    public Pet() {
        this.name = "Kilo";
    }

    public void setName(String newName) {
        this.name = newName;
    }

    public String getName() {
        return this.name;
    }

    public String toString() {
        String info = "Pet information:";
        info = info + "\nName: " + this.name;
        return info;
    }

    public static void main(String[] args) {
        Pet pet1 = new Pet();        
        System.out.println(pet1);
        
        Pet pet2 = new Pet(); 
        pet2.setName("Shadow");
        System.out.println(pet2);
   }
}    