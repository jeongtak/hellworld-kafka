package hellworldkafka.domain;

import hellworldkafka.domain.*;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

//<<< PoEAA / Repository
@RepositoryRestResource(collectionResourceRel = "receives", path = "receives")
public interface ReceiveRepository
    extends PagingAndSortingRepository<Receive, Long> {}
