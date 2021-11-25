package br.betternow.chatbot.dough.repository.solicita.ec;

import br.betternow.chatbot.dough.model.ConversationReference;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ConversationReferenceRepository extends JpaRepository<ConversationReference, String> {
}
