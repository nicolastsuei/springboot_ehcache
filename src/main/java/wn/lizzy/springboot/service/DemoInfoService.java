package wn.lizzy.springboot.service;

import javassist.NotFoundException;
import wn.lizzy.springboot.entity.DemoInfo;

/**
 * 服务接口
 * DemoInfoService.java
 * @author cuilj  2017年3月8日--上午11:10:37
 *
 */
public interface  DemoInfoService {
	 void delete(Long id);
	 DemoInfo update(DemoInfo updated) throws NotFoundException;
	 DemoInfo findById(Long id);
	 DemoInfo save(DemoInfo demoInfo);
}
