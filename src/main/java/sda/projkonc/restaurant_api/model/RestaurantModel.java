package sda.projkonc.restaurant_api.model;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.Set;

@Entity
@Getter
@Setter
@Table(name = "RESTAURANTS")
public class RestaurantModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "NAME")
    private String name;

    @ManyToOne
    @JsonBackReference
    @JoinColumn(name = "owner_id", referencedColumnName = "id")
    private OwnerModel owner;

    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    @JsonManagedReference
    private Set<TableModel> tables;

    @OneToOne(fetch = FetchType.LAZY)
    private AddressModel address;
}
