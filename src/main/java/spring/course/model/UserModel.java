package spring.course.model;

// New class to use in code.
public class UserModel {

    private String firstname;
    private String lastname;
    private Integer membershipId;

    public UserModel(String firstname, String lastname, Integer membershipId) {
        this.firstname = firstname;
        this.lastname = lastname;
        this.membershipId = membershipId;
    }

    //Empty constructor
    public UserModel() {
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public Integer getMembershipId() {
        return membershipId;
    }

    public void setMembershipId(Integer membershipId) {
        this.membershipId = membershipId;
    }
}
