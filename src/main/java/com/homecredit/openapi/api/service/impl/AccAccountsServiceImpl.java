package com.homecredit.openapi.api.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.homecredit.openapi.api.dao.AccAccountsDao;
import com.homecredit.openapi.api.dao.GeneralAccAccountsDao;
import com.homecredit.openapi.api.dto.AccAccountsDto;
import com.homecredit.openapi.api.mapper.AccAccountsMapper;
import com.homecredit.openapi.api.model.AccAccounts;
import com.homecredit.openapi.api.service.AccAccountsService;

@Service
public class AccAccountsServiceImpl implements AccAccountsService{
	
	@Autowired
	private AccAccountsDao accDao;
	
	@Autowired
	private GeneralAccAccountsDao genAccDao;
	
	List <AccAccountsDto> resultAccAccounts = null;
	List <AccAccountsDto> inputAccAccounts = null;
	AccAccountsDto accAccountsDto = null;
	AccAccountsMapper accMapper = null;
	List <AccAccounts> listAccAccounts = null;
	
	/* Start General Function In Service	*/
	
	private void listOfJsonParamToDto(List <AccAccountsDto> paramAccAccounts){
		inputAccAccounts = new ArrayList<AccAccountsDto>();
		inputAccAccounts = paramAccAccounts;
	}
	
	private void prepareToMapping (){
		accMapper = new AccAccountsMapper();	
	}
	
	private void clearGeneralObject(){
		accAccountsDto = null; inputAccAccounts=null; accMapper = null; listAccAccounts = null;
		
	}
	
	/* End General Function*/
	                                                              
	/* Start Get Data Function In Service	*/

	public List <AccAccountsDto> centralGetDataAccAccounts (List <AccAccountsDto> paramAccAccounts) throws Exception{
				
		try {
			resultAccAccounts = new ArrayList<AccAccountsDto>();
			this.listOfJsonParamToDto(paramAccAccounts);
			resultAccAccounts = this.getDataAccAccountsFromDB();
		} catch (Exception e) {
			throw new Exception(e.getMessage());
		} finally {
			this.clearGeneralObject();
		}
		return resultAccAccounts;	
	}
	
	private List <AccAccountsDto> getDataAccAccountsFromDB () throws Exception{
		
		try {
			listAccAccounts = new ArrayList<AccAccounts>();
			listAccAccounts = genAccDao.findAll();
			this.prepareToMapping();
			resultAccAccounts = this.processingToMapping(accMapper,listAccAccounts);
		} catch (Exception e) {
			throw new Exception(e.getMessage());
		}
		return resultAccAccounts;
	}
	
	private List <AccAccountsDto> processingToMapping (AccAccountsMapper accMapper, List <AccAccounts> listAccAccounts) throws Exception{
		
		try {			
			for(AccAccounts accAccounts : listAccAccounts){
				accAccountsDto = new AccAccountsDto();
				accAccountsDto = accMapper.changeModeltoDto(accAccounts, accAccountsDto);
				resultAccAccounts.add(accAccountsDto);
			}
		} catch (Exception e) {
			throw new Exception(e.getMessage());
		}
		return resultAccAccounts;
	}
	
	/* End Get Data Function	*/
	
	/* Start Insert Data Function In Service*/
	
	public void centralAddData(AccAccountsDto param)throws Exception{
		
		try {
			this.prepareToMapping();
			this.insertToTableAccAccounts(param);
		} catch (Exception e) {
			throw new Exception(e.getMessage());
		} finally {
			this.clearGeneralObject();
		}
	}
	
	private void insertToTableAccAccounts (AccAccountsDto param)throws Exception{
		
		AccAccounts accAccounts = null;
		
		try {
			accAccounts = new AccAccounts();
			accAccounts = accMapper.changeDtotoModel(param, accAccounts);
			accDao.save(accAccounts);
		} catch (Exception e) {
			throw new Exception(e.getMessage());
		} finally {
			accAccounts = null;
		}
	}
	
	/* End Insert Data Function	*/
	
/* Start Update Data Function In Service*/
	
	public void centralUpdateData(AccAccountsDto param)throws Exception{
		
		try {
			this.prepareToMapping();
			this.updateToTableAccAccounts(param);
		} catch (Exception e) {
			throw new Exception(e.getMessage());
		} finally {
			this.clearGeneralObject();
		}
	}
	
	private void updateToTableAccAccounts (AccAccountsDto param)throws Exception{
		
		AccAccounts accAccounts = null;
		
		try {
			accAccounts = new AccAccounts();
			accAccounts = accMapper.changeDtotoModel(param, accAccounts);
			accDao.saveOrUpdate(accAccounts);
		} catch (Exception e) {
			throw new Exception(e.getMessage());
		} finally {
			accAccounts = null;
		}
	}
	
	/* End Update Data Function	*/
}
