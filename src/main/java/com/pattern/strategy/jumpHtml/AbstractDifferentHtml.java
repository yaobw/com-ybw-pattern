package com.pattern.strategy.jumpHtml;

import com.common.response.Result;

/**
 * @description:
 * @author: yaobw
 * @date: 2020/5/25 7:59 下午
 */
public abstract class AbstractDifferentHtml implements DifferentHtmlStrategy {

    @Override
    public Result strategyHtml(BrokerAuth auth) {
        return auth.chooseStrategy(auth).strategyHtml(auth);
    }

}
