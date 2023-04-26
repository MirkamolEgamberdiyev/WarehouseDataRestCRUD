package uz.fido.warehousedatarest.projection;

import org.springframework.data.rest.core.config.Projection;
import uz.fido.warehousedatarest.entity.Attachment;
import uz.fido.warehousedatarest.entity.Category;
import uz.fido.warehousedatarest.entity.Measurement;
import uz.fido.warehousedatarest.entity.Product;

@Projection(types = Product.class)
public interface CustomProduct {
    Integer getId();

    String getName();

    boolean getActive();

    String getCode();

    Category getCategory();

    Attachment getPhoto();

    Measurement getMeasurement();
}
