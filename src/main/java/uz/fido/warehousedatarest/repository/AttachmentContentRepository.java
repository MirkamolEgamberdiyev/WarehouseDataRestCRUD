package uz.fido.warehousedatarest.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import uz.fido.warehousedatarest.entity.AttachmentContent;
import uz.fido.warehousedatarest.projection.CustomAttachmentContent;

@RepositoryRestResource(path = "attachmentContent", collectionResourceRel = "list", excerptProjection = CustomAttachmentContent.class )
public interface AttachmentContentRepository extends JpaRepository<AttachmentContent, Integer> {
}