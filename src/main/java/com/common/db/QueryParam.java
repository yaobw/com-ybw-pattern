package com.common.db;

import java.util.HashMap;
import java.util.Map;

/**
 * @description:
 * @author: yaobw
 * @date: 2020/5/25 11:15 下午
 */
public class QueryParam<T> {

    public Map<String, String> queryKeyValue = new HashMap<String, String>();

    public T queryEntity;

}
