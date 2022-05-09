package yaremko.yaromyr.footballapp.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
@Table
public class MatchPlayerRoles extends IdHolder{
    @Column
    private RolePlayer rolePlayer;
    @OneToOne
    private TeamPlayer teamPlayer;
    @ManyToOne
    private Game game;

}
