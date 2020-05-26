package com.pattern.strategy.jumpHtml;

import com.common.db.FormQuery;
import com.common.db.QueryParam;
import com.common.response.Result;
import com.google.common.collect.Lists;

import java.util.List;

/**
 * @description:
 * @author: yaobw
 * @date: 2020/5/25 10:26 下午
 */
public class StrategyProvince extends AbstractCommonService implements DifferentHtmlStrategy {

    private BrokerAuth auth;

    public StrategyProvince(BrokerAuth auth) {
        this.auth = auth;
    }

    public StrategyProvince() {
    }

    @Override
    public Result strategyHtml(BrokerAuth auth) {
        System.out.println("省份查找");
        Result result = query(Lists.newArrayList(new FormQuery().formBuilder("invite", auth.getBrokerId())));
        System.out.println(result.code);
        return null;
    }

    @Override
    protected Result<?> query(List<? extends QueryParam> param) {
        System.out.println("===查询");
        return new Result();
    }
}
