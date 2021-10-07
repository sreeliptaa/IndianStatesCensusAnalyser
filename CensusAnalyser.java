package com.bridgelabz;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;


/**
 * Purpose - To implement Indian States Census Analyser
 * @author - Sreelipta
 * @since - 2021-10-06
 */

public class CensusAnalyser {
    public static void main(String[] args) throws IOException, CensusAnalyserException {
        String filePathRead = "C:\\Users\\panda\\IdeaProjects\\census analyser\\src\\main\\resources\\IndiaStateCensusData";
        String fileName = "IndianStateCensusData";
        String delimiter =",";
        List<String> stringName = new ArrayList<>();
        stringName.add("State");
        stringName.add("Population");
        stringName.add("AreaInSqKm");
        stringName.add("DensityPerSqKm");

        ReadOperation readObj = new ReadOperation();
        int count = readObj.readDataCount(filePathRead, fileName);
        System.out.println(count);

        readObj.readDelimiter(filePathRead, delimiter);
        readObj.readHeader(filePathRead, stringName);
    }
}