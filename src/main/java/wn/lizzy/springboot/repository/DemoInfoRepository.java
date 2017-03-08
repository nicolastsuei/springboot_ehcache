package wn.lizzy.springboot.repository;

import wn.lizzy.springboot.entity.DemoInfo;
import org.springframework.data.repository.CrudRepository;

/**
 * 操作数据库.
 * DemoInfoRepository.java
 * @author cuilj  2017年3月8日--上午11:08:02
 *
 */
public interface DemoInfoRepository extends CrudRepository<DemoInfo,Long>{}
