public class Main {
    public static void main(String[] args) {
        BuddyInfo guy = new BuddyInfo("Samuelle", "29 Carleton Ave.", "6135554756", "teal");

        System.out.println("Hello " + guy.getName() + "!");

        AddressBook addressBook = new AddressBook();
        addressBook.addBuddy(guy);
        addressBook.removeBuddy(guy);
    }
}

