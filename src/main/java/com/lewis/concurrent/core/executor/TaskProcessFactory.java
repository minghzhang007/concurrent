package com.lewis.concurrent.core.executor;

/**
 * Created by zhangminghua on 2016/11/11.
 */
public interface TaskProcessFactory {

    TaskProcessor createTaskProcessor(String domain);
}
