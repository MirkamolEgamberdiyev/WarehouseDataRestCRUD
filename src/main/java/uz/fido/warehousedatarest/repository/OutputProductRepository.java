package uz.fido.warehousedatarest.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import uz.fido.warehousedatarest.entity.OutputProduct;
import uz.fido.warehousedatarest.projection.CustomOutputProduct;

@RepositoryRestResource(path = "outputProduct", collectionResourceRel = "list", excerptProjection = CustomOutputProduct.class)
public interface OutputProductRepository extends JpaRepository<OutputProduct, Integer> {
}