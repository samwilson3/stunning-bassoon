import java.util.ArrayList;

public class AddressBook {
    ArrayList book;

    public AddressBook() {
        this.book = new ArrayList();
    }

    public void addBuddy(BuddyInfo buddy){
        this.book.add(buddy);
    }

    public void removeBuddy(BuddyInfo buddy){
        this.book.remove(buddy);
    }

    public static void main(String[] args) {
        System.out.println("Address Book");
    }

}


