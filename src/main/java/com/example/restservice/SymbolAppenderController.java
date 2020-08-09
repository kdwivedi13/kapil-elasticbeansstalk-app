package com.example.restservice;

import java.util.Arrays;
import java.util.List;
import java.util.regex.Pattern;
import java.util.stream.Collectors;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SymbolAppenderController {
	List<String> companyNames = Arrays.asList("Oracle", "Google", "Microsoft", "Amazon", "Deloitte");
	
	@RequestMapping(value = "/append-copyright-symbol", method = RequestMethod.POST)
	public String appendCopyrightSymbol(@RequestBody final String text) {
		String delimiter = " ";
		return Pattern.compile(delimiter).splitAsStream(text)
				.map(token -> companyNames.contains(token) ? token.concat("©") : token)
				.collect(Collectors.joining(delimiter));
	}
}
