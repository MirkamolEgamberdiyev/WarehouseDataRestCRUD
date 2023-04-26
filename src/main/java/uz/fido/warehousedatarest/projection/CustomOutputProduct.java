package uz.fido.warehousedatarest.projection;

import org.springframework.data.rest.core.config.Projection;
import uz.fido.warehousedatarest.entity.Output;
import uz.fido.warehousedatarest.entity.OutputProduct;
import uz.fido.warehousedatarest.entity.Product;

import java.util.Date;

@Projection(types = OutputProduct.class)
public interface CustomOutputProduct {
    Integer getId();

    Double getAmount();

    Double getPrice();

    Product getProduct();

    Output getOutput();
}
