package uz.fido.warehousedatarest.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import uz.fido.warehousedatarest.entity.Client;
import uz.fido.warehousedatarest.projection.CustomClient;

@RepositoryRestResource(path = "client", collectionResourceRel = "list",excerptProjection = CustomClient.class)
public interface ClientRepository extends JpaRepository<Client, Integer> {
    boolean existsByName(String name);
}