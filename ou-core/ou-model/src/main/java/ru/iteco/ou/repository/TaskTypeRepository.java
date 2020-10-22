package ru.iteco.ou.repository;

import org.springframework.data.repository.CrudRepository;
import ru.iteco.ou.model.entity.localdb.TaskType;

/**
 * Created by FilatovNA(rogowasya@gmail.com) on 06.03.19.
 */

public interface TaskTypeRepository extends CrudRepository<TaskType, Long> { }
