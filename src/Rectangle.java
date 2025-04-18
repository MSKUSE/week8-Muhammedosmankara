public class Rectangle extends Shape {
    private int sideA = 0, sideB = 0;

    public Rectangle() {
    }


    public Rectangle(int sideA, int sideB) {
        this.sideA = sideA;
        this.sideB = sideB;
    }


    public int getSideB() {
        return sideB;
    }

    public void setSideB(int sideB) {
        this.sideB = sideB;
    }

    public int getSideA() {
        return sideA;
    }

    public void setSideA(int sideA) {
        this.sideA = sideA;
    }

    @Override
    public void describe() {
        super.describe();
        System.out.println("Side A : "+  sideA + " Side B : " +  sideB);
    }

    @Override
    public boolean equals(Object obj){
        Rectangle rectangle =(Rectangle);
        if (this.sideA==this.sideB && getSideA()==getsideB());
}