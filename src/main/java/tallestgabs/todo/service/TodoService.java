package tallestgabs.todo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;
import tallestgabs.todo.entity.Todo;
import tallestgabs.todo.repository.TodoRepository;

import java.util.List;


@Service
public class TodoService {
    private TodoRepository todoRepository;

    public TodoService(TodoRepository todoRepository) {
        this.todoRepository = todoRepository;
    }

    public List<Todo> create(Todo todo) {
        todoRepository.save(todo);
        return list();

    }
    public List<Todo> list() {
        Sort sort = Sort.by("prioridade").descending().and(Sort.by("nome").ascending());
        return todoRepository.findAll(sort);
    }
    public List<Todo> update(Todo newTodo) {
        todoRepository.save(newTodo);
        return list();

    }
    public List<Todo> delete(Long id) {
        todoRepository.deleteById(id);
        return list();
    }


}
