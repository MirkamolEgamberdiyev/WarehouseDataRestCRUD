package uz.fido.warehousedatarest.entity;


import jakarta.persistence.Entity;
import lombok.EqualsAndHashCode;
import uz.fido.warehousedatarest.entity.template.AbsEntity;

@EqualsAndHashCode(callSuper = true)
@Entity
public class Measurement extends AbsEntity {

}
