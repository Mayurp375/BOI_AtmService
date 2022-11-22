package AtmMachin;

import java.util.Scanner;

interface AtMmachin {
    void widrol();

    void ballanceCheck();

    void deposit();
}

class boiATM implements AtMmachin {
    private int password = 1234;
    private int ballance = 1100;

    public int getPassword() {
        return password;
    }

    public void setPassword(int password) {
        this.password = password;
    }

    @Override
    public void widrol() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter pin");
        int pass = scanner.nextInt();

        if (pass == getPassword()) {
            System.out.println("enter amount to windrow");
            int windrow = scanner.nextInt();
            if (windrow >= ballance) {
                System.out.println("Insufficient Balance");
            } else {
                System.out.println("your windrow amount is:" + " " + (windrow) + " "
                        + "take your money and your current balance is :" + (ballance - windrow));

            }
        } else {
            System.out.println("password invalid");
        }

    }

    @Override
    public void ballanceCheck() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter pin");
        int pass = scanner.nextInt();

        if (pass == getPassword()) {
            System.out.println("you balance is " + " " + ballance);
        } else {
            System.out.println("password invalid");
        }
    }

    @Override
    public void deposit() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter pin");
        int pass = scanner.nextInt();

        if (pass == getPassword()) {
            System.out.println("enter to deposit money");
            int add = scanner.nextInt();
            System.out.println("you balance is " + " " + (add + ballance));
        } else {
            System.out.println("password invalid");
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome to BOI atm service " +
                "choose any of the service" +
                "1.widrol,2.balanceCheck ,3.deposit");
        int hint = scanner.nextInt();
        boiATM boiATM = new boiATM();
        switch (hint) {
            case (1):
                boiATM.widrol();
                break;
            case (2):
                boiATM.ballanceCheck();
                break;

            case (3):
                boiATM.deposit();
                break;
        }
    }
}