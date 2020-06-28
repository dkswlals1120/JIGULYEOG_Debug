package com.mvc.jigulyeog.model.dao;

import java.util.List;

import com.mvc.jigulyeog.model.dto.ChungwonDto;
import com.mvc.jigulyeog.model.dto.PageNavigator;

public interface ChungwonDao {
	
	String NAMESPACE = "mapper.chungwon.";
	
	public List<ChungwonDto> selectList(PageNavigator navi,String searchWord);
	public List<ChungwonDto> newestList(PageNavigator navi,String searchWord);
	public ChungwonDto selectOne(int pet_no);
	public int insert(ChungwonDto dto);
	public int chungDelete(int pet_no);
	public int chungUpdate(ChungwonDto dto);
	
	//페이징
	public int selectCount(String searchWord);
	
}
