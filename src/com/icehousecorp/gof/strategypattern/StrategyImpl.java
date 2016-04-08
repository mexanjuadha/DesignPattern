package com.icehousecorp.gof.strategypattern;

/**
 * Created by mexanjuadha on 4/8/16.
 */
public class StrategyImpl {

    public StrategyImpl() {

        SoftwareEngineer androidDeveloper = new AndroidDeveloper();
        SoftwareEngineer marketingAnalyst = new MarketingAnalyst();

        androidDeveloper.work();
        marketingAnalyst.work();


    }
}
