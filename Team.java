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
public class Team extends IdHolder {

    @Column
    private String name;
//  Збірна чи клуб
    @Column
    private TeamType teamType;

    @ManyToOne
    private Stadium stadium;
//  Команда може грати в різних турнірах: внутрішній чемпіонат, кубок, єврокубки
    @ManyToMany(mappedBy = "teams")
    private List<Championship> championships = new ArrayList<>();
//  Гравці
    @ManyToMany(mappedBy = "teams")
    private List<TeamPlayer> teamPlayers = new ArrayList<>();

    @OneToMany(mappedBy = "homeTeam")
    private List<Game> homeGames = new ArrayList<>();

    @OneToMany(mappedBy = "guestTeam")
    private List<Game> guestGames = new ArrayList<>();
//  Персонал клубу (тренери, скаути, менеджери тощо) крім гравців

    @OneToMany
    private List<Goal> goals = new ArrayList<>();

    @OneToMany(mappedBy = "team")
    private List<TeamMember> teamMembers = new ArrayList<>();

}
