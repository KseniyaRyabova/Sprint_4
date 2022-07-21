public class Praktikum {
    public static void main(String[] args) {
        String name = "Анна Ахматова";
        Account account = new Account(name);
        boolean stateAccount = account.checkNameToEmboss();
        System.out.println(stateAccount);

    }
}
