package sda.projkonc.restaurant_api.model;

import jakarta.persistence.*;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "ADDRESSES")
@Getter
@Setter
public class AddressModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "NAME", length = 128)
    private String name;
    @Column(name = "STREET", nullable = false, length = 128)
    private String street;
    @Column(name = "BUILDING_NUMBER", nullable = false, length = 128)
    private String buildingNumber;
    @Column(name = "APARTMENT_NUMBER", length = 128)
    private String apartmentNumber;
    @Column(name = "CITY", nullable = false, length = 128)
    private String city;
    @Column(name = "POSTAL_CODE", nullable = false, length = 128)
    private String postalCode;
    @Column(name = "COUNTRY", nullable = false, length = 128)
    private String country;
}
