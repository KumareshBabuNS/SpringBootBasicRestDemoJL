package io.pivotal.demo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

public interface GreetingRepository extends JpaRepository<Greeting, Integer>
{
    List<Greeting> findByText(@Param("text") String text);
}
