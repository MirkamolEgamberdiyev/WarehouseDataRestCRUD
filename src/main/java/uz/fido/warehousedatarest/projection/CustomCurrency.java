package uz.fido.warehousedatarest.projection;

import org.springframework.data.rest.core.config.Projection;
import uz.fido.warehousedatarest.entity.Currency;

@Projection(types = Currency.class)
public interface CustomCurrency {
    Integer getId();

    String getName();

    boolean getActive();
}
