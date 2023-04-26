package uz.fido.warehousedatarest.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import java.sql.Timestamp;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data
public class Input {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private Timestamp date;
    private String factureNumber;
    @Column(unique = true, nullable = false)
    private String code;

    @ManyToOne
    private Warehouse warehouse;

    @ManyToOne
    private Currency currency;

    @ManyToOne
    private Supplier supplier;
}
