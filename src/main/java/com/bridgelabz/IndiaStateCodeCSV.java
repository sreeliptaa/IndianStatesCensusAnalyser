package com.bridgelabz;

import com.opencsv.bean.CsvBindByName;

/**
 * Program to implement Indian States Codes
 * @author sreelipta
 * @since 2021-10-6
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
