package hellworldkafka.domain;

import hellworldkafka.domain.*;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

//<<< PoEAA / Repository
@RepositoryRestResource(
    collectionResourceRel = "receiveMessages",
    path = "receiveMessages"
)
public interface ReceiveMessageRepository
    extends PagingAndSortingRepository<ReceiveMessage, Long> {}
