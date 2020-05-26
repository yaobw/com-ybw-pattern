package com.pattern.strategy.jumpHtml;

import com.common.db.QueryParam;
import com.common.response.Result;

import java.util.List;

/**
 * @description:
 * @author: yaobw
 * @date: 2020/5/25 10:26 下午
 */
public class StrategyCity extends AbstractCommonService implements DifferentHtmlStrategy{


    @Override
    public Result strategyHtml(BrokerAuth auth) {
        System.out.println("城市查找");
        return null;
    }

    @Override
    protected Result<?> query(List<? extends QueryParam> param) {
        return null;
    }
}
