import java.util.Scanner;


class Account {
    double calculateCharges(double amount) {
        System.out.println("Generic account charge calculation.");
        return 0;
    }
}


class SavingsAccount extends Account {
    @Override
    double calculateCharges(double amount) {
        double charge = amount * 0.02; // 2% charge
        System.out.println("Rule: 2% transaction fee (Savings Account)");
        return charge;
    }
}


class CurrentAccount extends Account {
    @Override
    double calculateCharges(double amount) {
        double charge = amount * 0.05 + 50; // 5% + fixed ₹50
        System.out.println("Rule: 5% fee + ₹50 fixed charge (Current Account)");
        return charge;
    }
}


class BusinessAccount extends Account {
    @Override
    double calculateCharges(double amount) {
        double charge;
        if (amount <= 10000)
            charge = amount * 0.04;
        else
            charge = amount * 0.06;

        System.out.println("Rule: 4% up to ₹10,000 else 6% (Business Account)");
        return charge;
    }
}


class BankDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter transaction amount: ");
        double amount = sc.nextDouble();

        // Runtime polymorphism
        Account[] accounts = {
            new SavingsAccount(),
            new CurrentAccount(),
            new BusinessAccount()
        };

        System.out.println("\n=== Transaction Charges ===");

        for (Account acc : accounts) {
            System.out.println("\nAccount Type: " +
                    acc.getClass().getSimpleName());
            System.out.println("Transaction Amount: ₹" + amount);

            double charges = acc.calculateCharges(amount);
            System.out.println("Calculated Charges: ₹" + charges);
        }

        sc.close();
    }
}
