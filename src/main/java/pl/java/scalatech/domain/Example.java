package pl.java.scalatech.domain;

import java.util.HashMap;
import java.util.Map;

import javax.persistence.CollectionTable;
import javax.persistence.Column;
import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.JoinColumn;
import javax.persistence.MapKeyColumn;
import javax.persistence.MapKeyEnumerated;

import lombok.Data;

//@Entity
@Data
public class Example extends PKEntity{
    
    
   /* @ElementCollection
    @MapKeyColumn(name="name")
    @Column(name="value")
    @CollectionTable(name="example_attributes", joinColumns=@JoinColumn(name="example_id"))
    Map<String, String> attributes = new HashMap<>(); // maps from attribute name to value
*/    
    @ElementCollection
    @CollectionTable(name = "example_weight", joinColumns = @JoinColumn(name = "id"))
    @MapKeyColumn(name = "weight_type")
    @MapKeyEnumerated(EnumType.STRING)
    @Column(name = "desc")
    private Map<Weight, String> ims = new HashMap<Weight, String>();

}