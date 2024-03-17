package sda.projkonc.restaurant_api.model;

import com.fasterxml.jackson.annotation.JsonBackReference;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
@Table(name = "TABLES")
public class TableModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "NUMBER_OF_SEATS")
    private Integer seats;

    @Column(name = "RESERVED_BY")
    private String reservedUnder;

    @Column(name = "LOCALIZATION")
    private LocalizationModel type;

    @ManyToOne(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    @JsonBackReference
    @JoinColumn(name = "restaurant_id", referencedColumnName = "id")
    private RestaurantModel restaurant;
}
