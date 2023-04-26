package uz.fido.warehousedatarest.projection;

import org.springframework.data.rest.core.config.Projection;
import uz.fido.warehousedatarest.entity.Input;
import uz.fido.warehousedatarest.entity.InputProduct;
import uz.fido.warehousedatarest.entity.Product;

import java.util.Date;

@Projection(types = InputProduct.class)
public interface CustomInputProduct {
    Integer getId();

    Double getAmount();

    Double getPrice();

    Date getExpireDate();

    Product getProduct();

    Input getInput();
}
