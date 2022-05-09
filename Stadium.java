package yaremko.yaromyr.footballapp.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

@Getter @Setter
@Entity
@Table
public class Stadium extends IdHolder {

    @Column
    private String name;

    @Column
    private String description;

    @OneToMany(mappedBy = "stadium")
    private List<Team> owners = new ArrayList<>();
}
