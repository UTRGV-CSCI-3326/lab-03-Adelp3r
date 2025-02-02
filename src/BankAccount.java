public class BankAccount {

    public static void main(String[] args){
        double bobBank = 2175.37;
        bobBank -= 302.50;
        bobBank += 50.03;
        bobBank = bobBank/2.0 + 20.00;
        bobBank--;
        bobBank *= 2;
        bobBank++;

        System.out.println("Bob's new balance: " + bobBank);
    }

}