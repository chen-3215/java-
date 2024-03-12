public class Fruits {
    private double apple_price ;
    private double strawberry_price;
    private double mango_price;
    private int apple_num;
    private int strawberry_num;
    private int mango_num;
    private double strawberry_discount;
    private double total_price;

    // 构造函数
    public Fruits(int apple_num, int strawberry_num) {
        this.apple_price = 8;
        this.strawberry_price = 13;
        this.apple_num = apple_num;
        this.strawberry_num = strawberry_num;
        this.total_price = 0;
    }

    public Fruits(int apple_num, int strawberry_num, int mango_num) {
        this.apple_price = 8;
        this.strawberry_price = 13;
        this.mango_price = 20 ;
        this.apple_num = apple_num;
        this.strawberry_num = strawberry_num;
        this.mango_num = mango_num;
        this.strawberry_discount = 1;
        this.total_price = 0;
    }

    public double getApple_price() {
        return apple_price;
    }

    public void setApple_price(double apple_price) {
        this.apple_price = apple_price;
    }

    public double getStrawberry_price() {
        return strawberry_price;
    }

    public void setStrawberry_price(double strawberry_price) {
        this.strawberry_price = strawberry_price;
    }

    public int getApple_num() {
        return apple_num;
    }

    public void setApple_num(int apple_num) {
        this.apple_num = apple_num;
    }

    public int getStrawberry_num() {
        return strawberry_num;
    }

    public void setStrawberry_num(int strawberry_num) {
        this.strawberry_num = strawberry_num;
    }

    public double getMango_price() {
        return mango_price;
    }

    public void setMango_price(double mango_price) {
        this.mango_price = mango_price;
    }

    public int getMango_num() {
        return mango_num;
    }

    public void setMango_num(int mango_num) {
        this.mango_num = mango_num;
    }

    public double getTotal_price() {
        return total_price;
    }

    public double getStrawberry_discount() {
        return strawberry_discount;
    }

    public void setStrawberry_discount(double strawberry_discount) {
        this.strawberry_discount = strawberry_discount;
    }

    /* 题目一计算总价格*/
    public void  countTotal_price_1(){
        this.total_price=apple_price * apple_num + strawberry_price * strawberry_num ;
    }

    /*题目二计算总价格*/
    public void  countTotal_price_2(){
        this.total_price=apple_price * apple_num + strawberry_price * strawberry_num + mango_price * mango_num;
    }

    /*题目三计算总价格*/
    public void  countTotal_price_3(){
        this.total_price=apple_price * apple_num + strawberry_price * strawberry_num * strawberry_discount+ mango_price * mango_num;
    }

    /*题目四计算总价格*/
    public void  countTotal_price_4(){
        this.total_price=apple_price * apple_num + strawberry_price * strawberry_num * strawberry_discount + mango_price * mango_num;
        if (total_price>=100){
            this.total_price=total_price-10;
        }
    }
}
