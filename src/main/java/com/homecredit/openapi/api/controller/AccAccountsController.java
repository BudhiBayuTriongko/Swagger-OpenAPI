package com.homecredit.openapi.api.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.homecredit.openapi.api.dto.AccAccountsDto;
import com.homecredit.openapi.api.service.AccAccountsService;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

@RestController
@RequestMapping("/openAPI")
@Api(value="openAPI", description="Open API ACC Accounts Services")
public class AccAccountsController {
	
	@Autowired
	private AccAccountsService accServ;
	
	@RequestMapping(value="/getAccAccounts", method = RequestMethod.POST)
	@ApiOperation(value = "Get Data From Table ACC_ACCOUNTS")
	public ResponseEntity<List<AccAccountsDto>> getAccAccounts(@RequestBody List<AccAccountsDto> param){
		List<AccAccountsDto> result = null;
		try {
			result = new ArrayList<AccAccountsDto>();
			result = accServ.centralGetDataAccAccounts(param);
		} catch (Exception e) {
			e.printStackTrace();
			return new ResponseEntity<List<AccAccountsDto>>(result, HttpStatus.INTERNAL_SERVER_ERROR);
		}
		return new ResponseEntity<List<AccAccountsDto>>(result, HttpStatus.OK);
		
	}
	
	@SuppressWarnings({ "unchecked", "rawtypes" })
	@RequestMapping(value="/addAccAccounts", method = RequestMethod.POST)
	@ApiOperation(value = "Insert Data To Table ACC_ACCOUNTS")
	public ResponseEntity<AccAccountsDto> addAccAccounts(@RequestBody AccAccountsDto param){
		try {
			accServ.centralAddData(param);
		} catch (Exception e) {
			e.printStackTrace();
			return new ResponseEntity(null, HttpStatus.INTERNAL_SERVER_ERROR);
		}
		return new ResponseEntity(null, HttpStatus.CREATED);
		
	}
	
	@SuppressWarnings({ "unchecked", "rawtypes" })
	@RequestMapping(value="/updateAccAccounts", method = RequestMethod.POST)
	@ApiOperation(value = "Update Data To Table ACC_ACCOUNTS")
	public ResponseEntity<List<AccAccountsDto>> updateAccAccounts(@RequestBody AccAccountsDto param){
		try {
			accServ.centralUpdateData(param);
		} catch (Exception e) {
			e.printStackTrace();
			return new ResponseEntity(null, HttpStatus.INTERNAL_SERVER_ERROR);
		}
		return new ResponseEntity(null, HttpStatus.CREATED);
		
	}

}
