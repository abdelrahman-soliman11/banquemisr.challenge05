package banquemisr.challenge05.task_management.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name = "USER_TYPE")
public class UserType {
    @Id
    @Column(name = "TYPE_ID")
    Long typeId;

    @Column(name = "TYPE_DESC")
    String typeDescription;
}
