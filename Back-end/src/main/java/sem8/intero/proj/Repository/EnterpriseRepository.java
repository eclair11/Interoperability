package sem8.intero.proj.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import sem8.intero.proj.model.Enterprise;

public interface EnterpriseRepository extends JpaRepository<Enterprise, Long> {

}