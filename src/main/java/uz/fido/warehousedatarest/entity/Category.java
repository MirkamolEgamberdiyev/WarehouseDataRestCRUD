package uz.fido.warehousedatarest.entity;


import jakarta.persistence.Entity;
import jakarta.persistence.ManyToOne;
import lombok.Data;
import lombok.EqualsAndHashCode;
import uz.fido.warehousedatarest.entity.template.AbsEntity;

@EqualsAndHashCode(callSuper = true)
@Entity
@Data
public class Category extends AbsEntity {
    @ManyToOne
    private Category parentCategory;
}
