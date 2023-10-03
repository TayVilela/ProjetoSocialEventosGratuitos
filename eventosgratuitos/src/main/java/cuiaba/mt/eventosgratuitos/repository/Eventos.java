package cuiaba.mt.eventosgratuitos.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import cuiaba.mt.eventosgratuitos.model.Evento;

public interface Eventos extends JpaRepository<Evento, Long>{

}
