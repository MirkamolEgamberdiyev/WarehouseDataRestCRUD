package uz.fido.warehousedatarest.projection;

import org.springframework.data.rest.core.config.Projection;
import uz.fido.warehousedatarest.entity.Input;

import java.sql.Timestamp;

@Projection(types = Input.class)
public interface CustomInput {
    Integer getId();

    Timestamp getDate();

    String getFactureNumber();

    String getCode();
}
