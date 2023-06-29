package apptive.fruitable.login.repository;

import apptive.fruitable.login.entity.Member;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface MemberRepository extends JpaRepository<Member, Long> {
    Optional<Member> findById(Long id);

    boolean existsByName(String name);
}
