import { RiTodoFill } from "react-icons/ri";
import styles from "./Todo.module.css";

function Todo({ todo, deleteTodo, index }) {
  // console.log(todo);
  // console.log(deleteTodo);
  // console.log(index);
  return (
    <div className={styles.todo} onDoubleClick={() => deleteTodo(index)}>
      <RiTodoFill className={styles.todoIcon} />
      <div className={styles.todoText}>{todo}</div>
    </div>
  );
}

export default Todo;
