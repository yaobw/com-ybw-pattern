package com.pattern.strategy.jumpHtml;

import com.common.db.QueryParam;
import com.common.response.Result;

import java.util.List;

/**
 * @description:
 * @author: yaobw
 * @date: 2020/5/25 7:57 下午
 */
public class DifferentHtmlServiceImpl extends AbstractDifferentHtml{

    @Override
    public Result<?> strategyHtml(BrokerAuth auth) {
        return super.strategyHtml(auth);
    }


    public static void main(String[] args) {
        DifferentHtmlServiceImpl impl = new DifferentHtmlServiceImpl();
        BrokerAuth auth = new BrokerAuth();
        auth.setBrokerId("123");
        auth.setGotoHtml("P");
        auth.setOrgRank("333");
        impl.strategyHtml(auth);
    }



}
