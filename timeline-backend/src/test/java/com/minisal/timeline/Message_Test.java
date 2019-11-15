package com.minisal.timeline;



import org.junit.jupiter.api.Test;
import static org.junit.Assert.*;


public class Message_Test {
    private Message instance = new Message();

    @Test
    public void testSetAndGetId() {
        Integer id  = 1;
        instance.setId(id);
        assertEquals(id, instance.getId());
    }

    @Test
    public void testSetAndGetContent() {
        String content = "用户破亿";
        instance.setContent(content);
        assertEquals(content, instance.getContent());
    }

    @Test
    public void testSetAndGetAddTime() {
        String addTime = "2019-11-11 00:00:00";
        instance.setAddTime(addTime);
        assertEquals(addTime, instance.getAddTime());
    }

    @Test
    public void testSetAndGetUser() {
        String user = "QQ";
        instance.setUser(user);
        assertEquals(user, instance.getUser());
    }
}
