import java.util.ArrayList;
import java.util.Collection;

public class AddressBook {
    Collection<BuddyInfo> addressBook = new ArrayList<BuddyInfo>();

    public void addBuddy(String name, String address, String phone) {
        BuddyInfo buddyInfo = new BuddyInfo(name, address, phone);
        addressBook.add(buddyInfo);
    }

    public void removeBuddy(String name) {
        addressBook.removeIf(buddyInfo -> buddyInfo.getName().equals(name));
    }

    public static void main(String[] args){
        System.out.println("Address Book");
    }
}


