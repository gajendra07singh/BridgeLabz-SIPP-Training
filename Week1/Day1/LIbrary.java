import java.time.LocalDate;

class Member {
    String name;
    int id;
    LocalDate membershipStart;
    LocalDate membershipEnd;

    // Constructor
    Member(String name, int id, LocalDate membershipStart, LocalDate membershipEnd) {
        this.name = name;
        this.id = id;
        this.membershipStart = membershipStart;
        this.membershipEnd = membershipEnd;
    }

    // Display method
    void display() {
        System.out.println("Name: " + name);
        System.out.println("ID: " + id);
        System.out.println("Membership: " + membershipStart + " to " + membershipEnd);
    }

    // Check validity
    void check(LocalDate currentDate) {
        if (currentDate.isAfter(membershipEnd)) {
            System.out.println("Membership expired.");
        } else {
            System.out.println("Membership is valid.");
        }
    }
}
