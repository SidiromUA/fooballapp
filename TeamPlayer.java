package yaremko.yaromyr.footballapp.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
@Entity
@Table
public class TeamPlayer extends IdHolder {

    @Column
    private String name;

    @Column
    private String surname;

    @Column
    private LocalDateTime dateOfBirth;

    @Column
    private RolePlayer rolePlayer;

    @Column
    private boolean isFirst11;

    @Column
    private int number;

    @ManyToMany
    private List<Team> teams = new ArrayList<>();

    @OneToMany
    private List<Goal> goals = new ArrayList<>();

    @OneToOne
    private MatchPlayerRoles matchPlayerRoles;

}
