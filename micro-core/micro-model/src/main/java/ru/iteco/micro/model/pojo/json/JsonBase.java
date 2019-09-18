package ru.iteco.micro.model.pojo.json;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import lombok.extern.log4j.Log4j2;

import java.io.IOException;

/**
 * Created by FilatovNA(rogowasya@gmail.com) on 25.02.19.
 */

//@Log4j2(topic = "json")
public abstract class JsonBase {

    /**
     * This object to JSON
     * @return JSON in String
     */
    public String toJson(){
        String result = "";
        try {
            ObjectMapper mapper = new ObjectMapper();
            result = mapper.writeValueAsString(this);
        } catch (JsonProcessingException e) {
//            log.error("Error converting this object to JSON:", e);
        }
        return result;
    }
//comment for git
//one more coomment
    /**
     * JSON from String to Object
     * @return Object
     */
    public static <T extends JsonBase> T fromJson(T obj, String json){

        try {
            ObjectMapper mapper = new ObjectMapper();
            obj = (T) mapper.readValue(json, obj.getClass());
        } catch (Exception e) {
            e.printStackTrace();
//            log.error("Error converting this object to JSON:", e);
        }
        return obj;
    }
}
