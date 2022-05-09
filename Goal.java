package yaremko.yaromyr.footballapp.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
@Table
public class Goal extends IdHolder{
    @ManyToOne
    private Game game;

    @ManyToOne
    private Team team;

    @ManyToOne
    private TeamPlayer teamPlayer;
}
