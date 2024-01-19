public class Test3ArrayElemans {
    public static void main(String[] args) {
        String[] names={"Soheila","Zahra","Mina","Fatemeh","sahar"};
        ArrayEleman(names);
    }
    public static void ArrayEleman(String[] names)
    {
        for (int i=0;i< names.length;i++)
        {
            System.out.println(names[i]);
        }
    }
}
