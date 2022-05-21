package example.reactspring.reactspringserver.common.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import example.reactspring.reactspringserver.common.entity.ShiftEntity;

@Repository
public interface ShiftRepository extends JpaRepository<ShiftEntity, Long> {
}