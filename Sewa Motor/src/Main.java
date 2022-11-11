public class Main {
    public static void main(String[] args) {
        Motor m=new Motor();
        Penyewa penyewa = new Penyewa();
        Motor motor = new Motor();
        //Motor_manual manual = new Motor_manual();
        //Motor_matic matic = new Motor_matic();
        Rental_motor rentalmotor = new Rental_motor();


        penyewa.output();
        motor.output();
        rentalmotor.output();

    }
}