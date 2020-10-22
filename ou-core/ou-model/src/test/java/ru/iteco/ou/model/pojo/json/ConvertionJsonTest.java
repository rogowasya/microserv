package ru.iteco.ou.model.pojo.json;

import lombok.Getter;
import lombok.Setter;
import org.junit.jupiter.api.Test;
import org.springframework.util.Assert;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * Created by FilatovNA(rogowasya@gmail.com) on 25.02.19.
 */

public class ConvertionJsonTest extends Assert {

    @Test
    public void objToJson(){
       TestJson json = new TestJson();
       json.id = 2;
       json.name = "test";

        System.out.println(json.toJson());
    }

    @Test
    public void jsonToPojo(){
        String jsonStr = "{\"id\":2,\"name\":\"test\"}";
        TestJson json = TestJson.fromJson(new TestJson(), jsonStr);

        assertEquals(json.id, new Integer(2));
        assertEquals(json.name,"test");
    }
}
