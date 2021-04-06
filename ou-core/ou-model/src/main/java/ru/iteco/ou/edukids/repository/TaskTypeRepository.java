package ru.iteco.ou.edukids.repository;

import org.springframework.data.repository.CrudRepository;
import ru.iteco.ou.edukids.model.entity.localdb.TaskType;

/**
 * Created by FilatovNA(rogowasya@gmail.com) on 06.03.19.
 */

public interface TaskTypeRepository extends CrudRepository<TaskType, Long> { }
