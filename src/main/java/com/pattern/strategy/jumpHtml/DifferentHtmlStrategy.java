package com.pattern.strategy.jumpHtml;

import com.common.response.Result;

/**
 * @description:
 * @author: yaobw
 * @date: 2020/5/25 9:48 下午
 */
public interface DifferentHtmlStrategy {

    Result strategyHtml(BrokerAuth auth);
}
