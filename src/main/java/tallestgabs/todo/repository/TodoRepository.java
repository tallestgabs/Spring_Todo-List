package tallestgabs.todo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import tallestgabs.todo.entity.Todo;

public interface TodoRepository extends JpaRepository<Todo, Long> {
}
