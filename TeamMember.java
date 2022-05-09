package yaremko.yaromyr.footballapp.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;

@Entity
@Getter
@Setter
@Table
public class TeamMember extends IdHolder{

    @Column
    private TypeTeamMember typeTeamMember;

    @Column
    private String name;

    @Column
    private String surname;

    @Column
    private LocalDateTime dateOfBirth;

    @ManyToOne
    private Team team;
}
