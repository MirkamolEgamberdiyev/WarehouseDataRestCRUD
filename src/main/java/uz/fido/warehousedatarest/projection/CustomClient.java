package uz.fido.warehousedatarest.projection;

import org.springframework.data.rest.core.config.Projection;
import uz.fido.warehousedatarest.entity.Client;

@Projection(types = Client.class)
public interface CustomClient {
    Integer getId();

    String getName();

    boolean getActive();

    String getPhoneNumber();
}
