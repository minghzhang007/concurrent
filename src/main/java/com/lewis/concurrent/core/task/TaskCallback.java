package com.lewis.concurrent.core.task;

/**
 * Created by Administrator on 2016/11/10.
 * 任务回调的接口
 */
public interface TaskCallback<T> {

    T doCallback() throws Exception;

}
