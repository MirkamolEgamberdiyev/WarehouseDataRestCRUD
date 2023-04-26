package uz.fido.warehousedatarest.projection;

import org.springframework.data.rest.core.config.Projection;
import uz.fido.warehousedatarest.entity.Output;

import java.sql.Timestamp;

@Projection(types = Output.class)
public interface CustomOutput {

    Integer getId();

    Timestamp getDate();

    String getFactureNumber();

    String getCode();
}
