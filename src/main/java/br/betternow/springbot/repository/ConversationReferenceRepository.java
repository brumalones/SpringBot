package br.betternow.springbot.repository;

import br.betternow.springbot.model.ConversationReference;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ConversationReferenceRepository extends JpaRepository<ConversationReference, String> {
}
