package com.imooc.gradle.todo.repository;

import com.imooc.gradle.todo.model.TodoItem;
import org.junit.Assert;
import org.junit.Test;

/**
 * Created by jbwang0106 on 2017/5/27.
 */
public class TestTodoItems {

    @Test
    public void testGradle() {
        TodoItem item = new TodoItem("imooc");
        Assert.assertNotNull(item.getName());
       // Assert.assertNull(item.getName());
    }
}
