package com.common.db;

/**
 * @description:
 * @author: yaobw
 * @date: 2020/5/25 11:24 下午
 */
public class FormQuery extends QueryParam {

    public QueryParam<FormQuery> formBuilder(String key, String value){
        super.queryKeyValue.put(key, value);
        return this;
    }
}
