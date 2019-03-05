package software.kloud.sc;

import java.util.Optional;

public interface SilverRepository<T extends SilverCommunication> {
    Optional<T> findBySilverIdentifier(String identifier);
}
