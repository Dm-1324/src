class GenericClass<E,V>{
    E id;
    V pincode;

    public GenericClass(E id,V pincode){
        this.id = id;
        this.pincode = pincode;
    }
    public void printInfo(){
        System.out.println(id);
        System.out.println(pincode);
    }
}


public class LearnGenericClass {
    public static void main(String[] args) {
        GenericClass<String,Integer> gc1 = new GenericClass<>("ABED",201301);
        GenericClass<Integer,String> gc2 = new GenericClass<>(101,"ABC101");
        gc1.printInfo();
        gc2.printInfo();
    }
}
