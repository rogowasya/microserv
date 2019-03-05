package ru.iteco.micro.app.prototyp.entity.json;

import lombok.Getter;
import lombok.Setter;
import ru.iteco.micro.model.pojo.json.JsonBase;

/**
 * Created by FilatovNA(rogowasya@gmail.com) on 25.02.19.
 */

@Setter
@Getter
public class TestJson extends JsonBase {

    private String message;

    public TestJson(String message) {
        this.message = message;
    }

    public TestJson() { }

    @Override
    public String toString() {
        return "TestJson [message = " + message + "]";
    }
}
