public class Example {
    public static void main(String args[]){ 

    User kenny = new User("Kenny",33);
    User jenny = new User("Jenny", 37);
    
    //User ann = new User("Ann", 27);
    
    kenny.printUser();
    jenny.printUser();
    //ann.printUser();
    

        Student charles = new Student("Charles",28,10);
        charles.printStudent();
        

        //Student ann = new Student("Ann",47,7);

        Animal baby  = new Animal("Baby", "Cat");
        Animal baby2 = new Animal("Baby2", "Puppy");
        baby.printAnimal();
        baby.attacks(kenny);
        baby.attacks(charles);
        baby.attacks(jenny);
        baby2.printAnimal();
    }
}
  