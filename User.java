public class User {
    //attributes: name and age
    public String name;
    private int age;

    //methods

    public User(String name,int age){
        this.name=name;
        setAge(age);
    }

    public void setAge(int age){
        if(age<100){
            this.age=age;

        }
        else{
            System.out.println("Error **** the age is not correct");

        }
    }




public void printUser(){
System.out.println("____ New User ____");
System.out.println("Name: " + this.name);
System.out.println("Age: " + this.age);
}
    }