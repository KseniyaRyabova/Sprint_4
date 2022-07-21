public class Account {

    private String name;

    public Account(String name) {
            this.name = name;
    }

    public boolean checkNameToEmboss() {
        try {
            return name.length() > 2 && 19 >= name.length() && !name.startsWith(" ") && !name.endsWith(" ")
                    && name.contains(" ");
        } catch (NullPointerException ex) {
            return false;
        }

    }

}