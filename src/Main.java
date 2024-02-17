public class Main {
    public static void main(String[] args) {
        BankAccount account = new BankAccount(15000);

        try {
            while (true) {
                account.withDraw(6000);
            }
        } catch (LimitException e) {
            System.out.println(e.getMessage() + ", остаток на счету: " + e.getRemainingAmount());
        }

        account.getInfo();
    }
}
