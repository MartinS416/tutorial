import java.util.ArrayList;
import java.util.Collection;

public class AddressBook {
    Collection<BuddyInfo> collection = new ArrayList<BuddyInfo>();

    public void addBuddy(BuddyInfo buddyInfo) {

        collection.add(buddyInfo);
    }

    public void removeBuddy(BuddyInfo buddyInfo) {
        collection.removeIf(buddyInfo1 -> buddyInfo1.equals(buddyInfo));
    }

    public static void main(String[] args){
        BuddyInfo buddy = new BuddyInfo("Tom", "Carleton", "613");
        AddressBook addressBook = new AddressBook();
        addressBook.addBuddy(buddy);
        addressBook.removeBuddy(buddy);
    }
}


