package uz.fido.warehousedatarest.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToOne;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import uz.fido.warehousedatarest.entity.template.AbsEntity;


@EqualsAndHashCode(callSuper = true)
@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data
public class Product extends AbsEntity {

    private String code;

    @ManyToOne(optional = false)
    private Category category;

    @OneToOne
    Attachment photo;

    @ManyToOne(optional = false)
    private Measurement measurement;
}
