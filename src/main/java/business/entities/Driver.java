package business.entities;

import lombok.*;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Getter
@Setter
@EqualsAndHashCode(of = "id")
@NoArgsConstructor
@AllArgsConstructor
public class Driver implements Serializable {

    private Integer id;

    private String firstName;

    private String secondName;

    private String nationality;

    private String team;

    private Date dateOfBirth;

    private Boolean wasWorldChampion;

    private List<Result> results = new ArrayList<>();
}



