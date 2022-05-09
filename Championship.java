package yaremko.yaromyr.footballapp.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
@Entity
@Table
public class Championship extends IdHolder {

    @Column
    private String name;

    @Column
    private ChampionshipType championshipType;

    @ManyToMany
    private List<Team> teams = new ArrayList<>();

    @OneToMany(mappedBy = "championship")
    private List<Game> games = new ArrayList<>();

    @OneToMany(mappedBy = "championship")
    private List<TotalTeamScore> totalTeamScore;

}
