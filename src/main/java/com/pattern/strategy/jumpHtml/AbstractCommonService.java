package com.pattern.strategy.jumpHtml;

import com.common.db.QueryParam;
import com.common.response.Result;

import java.util.List;

/**
 * @description:
 * @author: yaobw
 * @date: 2020/5/25 11:21 下午
 */
public abstract class AbstractCommonService {

    protected abstract Result<?> query(List<? extends QueryParam> param);
}
