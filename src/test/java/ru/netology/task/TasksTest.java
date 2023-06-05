package ru.netology.task;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import ru.netology.tasks.SimpleTask;

public class TasksTest {
    @Test
    public void shouldSimpleTaskQuery() {
        SimpleTask simpleTask = new SimpleTask(5, "Позвонить родителям");

        boolean expected = false;
        boolean actual = simpleTask.matches("Позвонить родителям");

        Assertions.assertEquals(expected, actual);


    }

    @Test
    public void shouldSimpleTaskNoQuery() {

    }

    @Test
    public void shouldEpicQuery() {

    }

    @Test
    public void shouldEpicNoQuery() {

    }

    @Test
    public void shouldMeetingQuery() {


    }

    @Test
    public void shouldMeetingNoQuery() {

    }
}
