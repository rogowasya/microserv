package ru.iteco.ou.edukids.repository;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.TestPropertySource;
import ru.iteco.ou.edukids.model.entity.localdb.TaskType;
import ru.iteco.ou.edukids.repository.TaskTypeRepository;

import javax.annotation.Resource;

import static org.junit.jupiter.api.Assertions.assertNotNull;

/**
 * Created by FilatovNA(rogowasya@gmail.com) on 06.03.19.
 */

@SpringBootTest
@TestPropertySource(locations="classpath:ou.pg.local.test.yaml")
public class TaskTypeRepositoryTest {
    @Resource
    private TaskTypeRepository taskTypeRepository;

    @Test
    void insertTaskType(){
        TaskType taskType = new TaskType();
        taskType.setTypeName("test type");
        TaskType save = taskTypeRepository.save(taskType);
        assertNotNull(save.getId());
    }
}
