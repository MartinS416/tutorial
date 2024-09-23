public class BuddyInfo {
    //test change made on github
    public BuddyInfo(String name, String address, String phone) {
        this.name = name;
        this.address = address;
        this.phone = phone;
    }
    //change made on branch
    //changes made on branch
    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }

    public String getPhone() {
        return phone;
    }

    private String name;
    private String address;
    private String phone;

    public static void main(String[] args) {
        BuddyInfo buddy = new BuddyInfo("Homer", "123 Street Name", "647-416-523");
        System.out.println("Hello " + buddy.getName());
    }

}
