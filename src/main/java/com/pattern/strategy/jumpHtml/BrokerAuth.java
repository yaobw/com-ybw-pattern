package com.pattern.strategy.jumpHtml;

import com.common.response.Constants;
import com.common.db.QueryParam;

/**
 * @description:
 * @author: yaobw
 * @date: 2020/5/25 8:00 下午
 */
public class BrokerAuth extends QueryParam {

    private DifferentHtmlStrategy differentHtmlStrategy;

    private String brokerId;

    private String gotoHtml;

    private String orgRank;

    public BrokerAuth() {
    }

    public BrokerAuth(DifferentHtmlStrategy differentHtmlStrategy) {
        this.differentHtmlStrategy = differentHtmlStrategy;
    }

    public BrokerAuth(DifferentHtmlStrategy differentHtmlStrategy, String brokerId, String gotoHtml, String orgRank) {
        this.differentHtmlStrategy = differentHtmlStrategy;
        this.brokerId = brokerId;
        this.gotoHtml = gotoHtml;
        this.orgRank = orgRank;
    }

    public void setDifferentHtmlStrategy(DifferentHtmlStrategy differentHtmlStrategy) {
        this.differentHtmlStrategy = differentHtmlStrategy;
    }

    public DifferentHtmlStrategy getDifferentHtmlStrategy() {
        return differentHtmlStrategy;
    }

    public String getOrgRank() {
        return orgRank;
    }

    public void setOrgRank(String orgRank) {
        this.orgRank = orgRank;
    }

    public String getBrokerId() {
        return brokerId;
    }

    public void setBrokerId(String brokerId) {
        this.brokerId = brokerId;
    }

    public String getGotoHtml() {
        return gotoHtml;
    }

    public void setGotoHtml(String gotoHtml) {
        this.gotoHtml = gotoHtml;
    }


    public DifferentHtmlStrategy chooseStrategy(BrokerAuth auth) {
        if (Constants.PROVINCE.equals(auth.getGotoHtml())) {
            return new StrategyProvince();
        }
        return new StrategyOther();
    }
}
