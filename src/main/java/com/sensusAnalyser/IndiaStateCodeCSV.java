package com.sensusAnalyser;

import com.opencsv.bean.CsvBindByName;

/**
 * Program to implement Indian States Codes
 * @author sheetal
 * @since 2021-09-12
 */
public class IndiaStateCodeCSV {
	@CsvBindByName(column = "SrNo", required = true)
    public String SrNo;

    @CsvBindByName(column = "State Name", required = true)
    public String state;

    @CsvBindByName(column = "TIN", required = true)
    public String TIN;

    @CsvBindByName(column = "StateCode", required = true)
    public String stateCode;

    @Override
    public String toString()
    {
        return "IndiaStateCodeCSV{" +
                "SrNo='" + SrNo + '\'' +
                ", state='" + state + '\'' +
                ", TIN='" + TIN + '\'' +
                ", stateCode='" + stateCode + '\'' +
                '}';
    }
}
