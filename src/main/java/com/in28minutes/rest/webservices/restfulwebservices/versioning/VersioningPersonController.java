package com.in28minutes.rest.webservices.restfulwebservices.versioning;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class VersioningPersonController {

	@GetMapping("/v1/person")
	public PersonV1 getFirstVersionOfPerson() {
		return new PersonV1("Ahley nicole");
	}

	@GetMapping("/v2/person")
	public PersonV2 getSecondVersionOfPerson() {
		return new PersonV2(new Name("Josh", "Aurther"));
	}

	@GetMapping(path = "/person", params = "version=1")
	public PersonV2 getFirstVersionOfPersonRequestParameter() {
		return new PersonV2(new Name("Josh", "Aurther"));
	}

	@GetMapping(path = "/person", params = "version=2")
	public PersonV1 getVersionOfPerson() {
		return new PersonV1("Ashley nicole");
	}

	@GetMapping(path = "/person/header", headers = "X-API-VERSION=1")
	public PersonV1 getVersionOfPersonRequestHeader() {
		return new PersonV1("Ashley nicole");
	}

}
