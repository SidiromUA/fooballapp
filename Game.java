package yaremko.yaromyr.footballapp.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;
import java.util.List;

@Getter
@Setter
@Entity
@Table
public class Game extends IdHolder {

    @Column
    private LocalDateTime dateTimeOfGame;

    @Column
    private Integer homeTeamAmountGoals;

    @Column
    private Integer guestTeamAmountGoals;

    @OneToMany
    private List<Goal> goals;

    @ManyToOne
    private Championship championship;

    @ManyToOne
    private Team homeTeam;

    @ManyToOne
    private Team guestTeam;

    @OneToMany
    private List<MatchPlayerRoles> matchPlayerRoles;

}
