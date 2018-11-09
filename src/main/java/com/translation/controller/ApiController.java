package com.translation.controller;

import com.translation.domain.TranslateRequest;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Api("Endpoint to test that the app is running")
@RequestMapping("/v1")
@Controller
public class ApiController {

	final String response = "[\n" + "    {\n" + "        \"textId\": 0,\n" + "        \"original\": \"Hola mundo\",\n"
			+ "        \"originalLanguage\": {\n" + "            \"script\": \"LATIN\",\n" + "            \"tag\": \"es\",\n"
			+ "            \"language\": \"SPANISH\",\n" + "            \"key\": \"ES\"\n" + "        },\n"
			+ "        \"translated\": \"Hello world\"\n" + "    }\n" + "]";

	@ApiOperation(value = "Receive a list with strings to translate and use an engine to translate all in batch.")
	@RequestMapping(path = "/translate", method = RequestMethod.POST, produces = MediaType.APPLICATION_JSON_VALUE, consumes = MediaType.APPLICATION_JSON_VALUE)
	public @ResponseBody ResponseEntity<Object> translate(@RequestBody final TranslateRequest body) {
		return ResponseEntity.ok(response);
	}

}
