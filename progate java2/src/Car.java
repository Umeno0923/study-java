class Car {
    private String name;
    private String color;
    private int distance = 0;
    private int fuel = 100;

    Car(String name, String color) {
        this.name = name;
        this.color = color;
    }

    public void printData() {
        System.out.println("名前：" + this.name);
        System.out.println("色：" + this.color);
        System.out.println("走行距離：" + distance + "km");
        System.out.println("ガソリン量：" + fuel + "L");
    }

    public void run(int carDistance) {
        System.out.println(carDistance + "km走ります");

        if (this.fuel < carDistance) {
            System.out.println("ガソリンが足りません");
        } else {
            this.fuel = this.fuel - carDistance;
            this.distance = this.distance + carDistance;
        }

        System.out.println("走行距離：" + distance + "km");
        System.out.println("ガソリン量：" + this.fuel + "L");
    }

    public void charge(int carCharge) {
        System.out.println(carCharge + "L給油します");

        if (carCharge < 0) {
            System.out.println("給油できません");
        } else if (this.fuel + carCharge > 100) {
            System.out.println("満タンまで給油します");
            this.fuel = 100;
        } else {
            this.fuel = this.fuel + carCharge;
        }

        System.out.println("ガソリン量：" + this.fuel + "L");
    }
}