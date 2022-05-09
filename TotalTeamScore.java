package yaremko.yaromyr.footballapp.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
@Table
public class TotalTeamScore extends IdHolder {

    @Column
    private Integer games;

    @Column
    private Integer win;

    @Column
    private Integer draw;

    @Column
    private Integer defeat;

    @Column
    private Integer totalGoals;

    @Column
    private Integer missedGoals;

    @Column
    private Integer totalScore;

    @ManyToOne
    private Championship championship;

    @ManyToOne
    private Team team;
}
