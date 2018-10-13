package business.entities;

import lombok.*;

import java.io.Serializable;
import java.math.BigDecimal;

@Getter
@Setter
@EqualsAndHashCode(of = "id")
@NoArgsConstructor
@AllArgsConstructor
public class Result implements Serializable {

    private Integer id;

    private Integer position;

    private BigDecimal gapToLeader;

    private Integer pitStops;

    private Boolean didFinish;

    //TODO: dodac info o torze
}
