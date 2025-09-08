package spring.course.data;
import java.io.Serializable;
import jakarta.persistence.*;

@Entity
public class UserEntity implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) // Add this annotation
    private Long id;
    private String firstName;
    private String lastName;
    private Integer membershipId;
    private String creationTime;

    // Empty constructor
    public UserEntity() {
    }

    public UserEntity(String firstName, String lastName, Integer membershipId, String creationTime) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.membershipId = membershipId;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
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