/*Write a Java program to create a class called "Dog" with a name and breed attribute.
Create two instances of the "Dog" class, set their attributes using the constructor and
        modify the attributes using the setter methods and print the updated values */
public class Dog {
    String name;
    String breed;
    public void setName(String name){
        this.name=name;
    }

    public String getName() {
        return name;
    }
    public String getBreed(){
        return breed;
    }

    public void setBreed(String breed){
        this.breed=breed;
    }
        public static void main(String[] args) {
        Dog d1=new Dog();
        d1.setName("tiger");
        d1.setBreed("german sheprered");
        Dog d2=new Dog();
        d2.setName("john");
        d2.setBreed("bulldog");
            System.out.println("dog 1 name "+ d1.getName());
            System.out.println("dog 1 breed"+ d1.getBreed());
            System.out.println("dog 2 name "+ d2.getName());
            System.out.println("dog 2 breed"+ d2.getBreed());


        }

}
