package spring.course.data;
import java.io.Serializable;
import jakarta.persistence.*;

@Entity
public class UserEntity implements Serializable {
    @Id
    private String firstname;
    private String lastname;
    private Integer membershipId;
    private String creationTime;

    // Empty constructor
    public UserEntity() {
    }

    public UserEntity(String firstname, String lastname, Integer membershipId, String creationTime) {
        this.firstname = firstname;
        this.lastname = lastname;
        this.membershipId = membershipId;
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