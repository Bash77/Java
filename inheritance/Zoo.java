package inheritance;

public class Zoo {
    public static void main(String[] args) {
        Dog rocky = new Dog();
//        rocky.fetch();
//        rocky.makeSound();
//        Cat c = new Cat();
//         feed(rocky);
        Animal sasha = new Dog();
//        feed(sasha);
//        sasha.makeSound();
       sasha = new Cat();
       feed(sasha);
//       sasha.makeSound();
//       ((Cat) sasha).scratch();
    }
    public static void feed(Animal animal){
        if (animal instanceof  Dog){
            System.out.println("Here is your dog food");
        }else if (animal instanceof Cat){
            System.out.println("Here is your cat food");
        }
    }
}
