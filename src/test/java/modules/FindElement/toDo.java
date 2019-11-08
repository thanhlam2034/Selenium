package modules.FindElement;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.How;

import java.util.List;
import java.util.stream.Collectors;

import static supports.CommonFunction.*;

//public class ToDo {
//    private final String TASK_ITEM = "//*[@class='todo-list']//label[.='%s']";
//    private final String COMPLETE_TASK_ICON = TASK_ITEM +"/preceding-sibling::input";
//    private final String REMOVE_TASK_ICON = TASK_ITEM +"/following-sibling::button";
//    private final String UPDATE_TASK = TASK_ITEM +"/../../input[@class='edit']";
//    private final String TOGGLE_ALL_TASKS ="toggle-all";
//    private final String SHOW_ACTIVE_ALL_TASKS ="a[href='#/active']";
//    private final String SHOW_COMPLETED_ALL_TASKS ="a[href='#/completed']";
//    private final String CLEAR_COMPLETED_ALL_TASKS ="clear-completed";
//    private final String ALL_TASKS =".todo-list li";
//
//
//    public void navigateTo() {
//        visit("http://todomvc.com/examples/vanilla-es6");
//    }
//
//    public ToDo() {
//    }
//
//    public ToDo(String taskName) {
//        createTodo(taskName);
//    }
//
//    public void createTodo(String taskName) {
//        fill(How.CLASS_NAME,"new-todo", taskName + Keys.ENTER);
//    }
//
//    public void createTodos(String... tasks) {
//        for (String todoName : tasks) {
//            createTodo(todoName);
//        }
//    }
//
//    public int getTodosLeft() {
//        return Integer.parseInt(text(How.CSS,".todo-count > strong"));
//    }
//
//    public boolean todoExists(String taskName) {
//        return getTodos().stream().anyMatch(taskName::equals);
//    }
//
//    public int getTodoCount() {
//        return getTodoElements().size();
//    }
//
//    public List<String> getTodos() {
//        return getTodoElements()
//                .stream()
//                .map(WebElement::getText)
//                .collect(Collectors.toList());
//    }
//
//    public void renameTodo(String oldTaskName, String newTaskName) {
//        doubleClick(How.XPATH,String.format(TASK_ITEM,oldTaskName));
//        WebElement editing  = find(How.XPATH,String.format(UPDATE_TASK,oldTaskName));
////        executeJSScript("arguments[0].value = ''",editing);
//        editing.sendKeys(newTaskName + "\n");
//    }
//
//    public void removeTodo(String taskName) {
//        hover(How.XPATH,String.format(TASK_ITEM,taskName));
//        click(How.XPATH,String.format(REMOVE_TASK_ICON,taskName));
//    }
//
//    public void completeTodo(String taskName) {
//        click(How.XPATH,String.format(COMPLETE_TASK_ICON,taskName));
//    }
//
//    public void completeAllTodos() {
//        click(How.CLASS_NAME,TOGGLE_ALL_TASKS);
//    }
//
//    public void showActive() {
//        click(How.CSS,SHOW_ACTIVE_ALL_TASKS);
//    }
//
//    public void showCompleted() {
//        click(How.CSS, SHOW_COMPLETED_ALL_TASKS);
//    }
//
//    public void clearCompleted() {
//        click(How.CLASS_NAME,CLEAR_COMPLETED_ALL_TASKS);
//    }
//
//    private List<WebElement> getTodoElements() {
//        return all(How.CSS,ALL_TASKS);
//    }
//
//    private WebElement getTodoElementByName(String todoName) {
//        return getTodoElements()
//                .stream()
//                .filter(el -> todoName.equals(el.getText()))
//                .findFirst()
//                .orElseThrow(() -> new AssertionError("Test data missing!"));
//    }
//
//}
