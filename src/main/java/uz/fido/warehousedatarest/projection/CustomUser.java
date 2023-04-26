package uz.fido.warehousedatarest.projection;

import org.springframework.data.rest.core.config.Projection;
import uz.fido.warehousedatarest.entity.User;
import uz.fido.warehousedatarest.entity.Warehouse;

import java.util.Set;

@Projection(types = User.class)
public interface CustomUser {
    Integer getId();

    String getFirstName();

    String getLastName();

    String getPhoneNumber();

    String getCode();

    String getPassword();

    boolean getActive();

    Set<Warehouse> getWarehouseList();
}
