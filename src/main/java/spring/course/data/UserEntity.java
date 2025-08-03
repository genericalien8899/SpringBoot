package spring.course.data;
import java.io.Serializable;

@Entity
public class UserEntity implements Serializable {
    public UserEntity() {

    private String firstname;
    private String lastname;
    private Integer membershipId;
    private String creationTime;

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

    public void setCreationTime(String creationTime) {
        this.creationTime = creationTime;
    }

    public String getCreationTime() {
        return creationTime;
    }
    }
}