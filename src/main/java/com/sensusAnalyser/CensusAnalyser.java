package com.sensusAnalyser;

import com.opencsv.bean.CsvToBean;
import com.opencsv.bean.CsvToBeanBuilder;

import java.io.Reader;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Iterator;

/**
 * program to load data from csv file
 * @author sheetal
 * @since 2021-09-12
 */
public class CensusAnalyser {
	//Creating Method loadIndiaCensusData
	public int loadIndiaCensusData(String csvFilePath) throws CensusAnalyserException {
		try {
			Reader reader = Files.newBufferedReader(Paths.get(csvFilePath));
			// Calling IndianCensusCSV class
			CsvToBeanBuilder<IndiaCensusCSV> csvToBeanBuilder = new CsvToBeanBuilder<>(reader);
			csvToBeanBuilder.withType(IndiaCensusCSV.class);
			csvToBeanBuilder.withIgnoreLeadingWhiteSpace(true);
			CsvToBean<IndiaCensusCSV> csvToBean = csvToBeanBuilder.build();
			Iterator<IndiaCensusCSV> censusCSVIterator = csvToBean.iterator();
			int namOfEateries = 0;
			while (censusCSVIterator.hasNext()) {
				namOfEateries++;
				IndiaCensusCSV censusData = censusCSVIterator.next();
			}
			return namOfEateries;
		} catch (Exception e) {
			throw new CensusAnalyserException(e.getMessage(),
					CensusAnalyserException.ExceptionType.CENSUS_FILE_PROBLEM);
		}
	}
}
