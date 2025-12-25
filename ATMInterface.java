import  java.util.Scanner;
 class BankAccount {
    private double balance;

    BankAccount (double balance){
        this.balance = balance;
    }
     void deposit (double amount ){
        if(amount > 0){
            balance += amount ;
            System.out.println("Amount deposited sucessfully.");
        } else{
            System.out.println("Invalid deposit amount.");
        }
    }
    void withdraw(double amount){
        if(amount > 0 && amount <= balance ){
            balance -= amount;
            System.out.println("Please collect your cash");
        }else {
            System.out.println("Insufficient balance or invalid amount.");
        }
    }
    double getBalance(){
        return balance;
    }
    }
  public  class ATMInterface {
        public static void main(String[] args) {
            Scanner sc = new Scanner (System.in);

            BankAccount account = new BankAccount (5000);
            while (true) {
                System.out.println("\n--- ATM MENU ---");
                System.out.println("1. Check Balance ");
                System.out.println("2. Deposit  ");
                System.out.println("3. Withdraw ");
                System.out.println("4. Exit ");

                System.out.print("Choose Option :");


        int choice = sc.nextInt();
            switch (choice){
                    case 1 :
                        System.out.println("Current Balance :" + account.getBalance());
                        break;
                    case 2 :
                        System.out.print("Enter deposit amount : ");
                        account.deposit(sc.nextDouble());
                        break;
                    case 3 :
                        System.out.print("Enter withdrawal amount :");
                        account.withdraw(sc.nextDouble());
                        break;
                    case 4 :
                        System.out.println("Thankyou for using ATM !");
                        System.exit(0);
                        System.out.println("Invalid Choice .");
     }                       
        }
    }
}

 