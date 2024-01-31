package com.strabag.app.controller;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.List;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

import com.strabag.app.service.FileParseService;
import com.strabag.app.controller.response.ResultResponse;
import com.strabag.app.entity.JobDetails;

@Component
@Configuration
public class ParseFileController {

	Logger logger = LogManager.getLogger(ParseFileController.class);

	@Autowired
	FileParseService fileParseService;

	public ResultResponse parseFile(String fileDirectory) throws FileNotFoundException, IOException {
		List<String> validFileList = fileParseService.isFileValid(fileDirectory);
		ResultResponse resultResponse = new ResultResponse();
		for (String validfile : validFileList) {

			resultResponse = fileParseService.parseAndSave(validfile);

		}
		return resultResponse;
	}

	public ParseFileController() {
		super();
	}

}
