public class Tset3Array {
    public static void main(String[] args) {
        String[] names={"Fatemeh","Zahra","Mina","Hoora","sahar"};
        System.out.println("name size: " + names.length);
        //first
        System.out.println(names[0]);
        //index 2
        System.out.println(names[2]);
        names[2]="Zohreh";
        System.out.println("After change name[2] : "+ names[2]);
        //last
        System.out.println(names[names.length-1]);
        System.out.println(names[(names.length)/2]);
        System.out.println(names[5]);
    }


}
