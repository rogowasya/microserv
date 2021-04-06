package ru.iteco.ou.edukids.model.entity;

import org.junit.jupiter.api.Test;
import org.springframework.util.Assert;
import ru.iteco.ou.edukids.model.entity.localdb.TaskType;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

/**
 * Created by FilatovNA(rogowasya@gmail.com) on 06.03.19.
 */

class EntityBaseTest extends Assert {

    @Test
    void entityBaseId(){
        TaskType taskType = new TaskType();
        taskType.setId(1L);
        taskType.setTypeName("test type");

        assertEquals(taskType.getId(), new Long(1));
        assertNotNull(taskType.getTypeName());
    }
}
