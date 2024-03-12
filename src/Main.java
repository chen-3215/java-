public class Main {
    public static void main(String[] args) {
        Fruits Afruits = new Fruits(5,4);
        Afruits.countTotal_price_1();
        System.out.println("A购买水果的总价格:"+Afruits.getTotal_price());

        Fruits Bfruits = new Fruits(5,4,9);
        Bfruits.countTotal_price_2();
        System.out.println("B购买水果的总价格:"+Bfruits.getTotal_price());

        Fruits Cfruits = new Fruits(10,10,10);
        Cfruits.setStrawberry_discount(0.8);
        Cfruits.countTotal_price_3();
        System.out.println("C购买水果的总价格:"+Cfruits.getTotal_price());

        Fruits Dfruits = new Fruits(10,10,10);
        Dfruits.countTotal_price_4();
        System.out.println("D购买水果的总价格:"+Dfruits.getTotal_price());
    }
}