package pl.java.scalatech.domain;

import lombok.Data;
import lombok.experimental.Builder;

@Data
@Builder
public class Ranking {

    private int rankingPoints;
    private Boxer boxer;
    private Organization orgranization;
    
}
