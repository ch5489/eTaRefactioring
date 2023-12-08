package kr.pe.eta.service.callreq;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import kr.pe.eta.domain.Call;
import kr.pe.eta.domain.Like;

@Mapper
public interface CallReqDao {

	public List<Call> getEndAddrList(int userNo) throws Exception;

	public List<Like> getLikeList(int userNo) throws Exception;

	public void addLikeList(int userNo) throws Exception;

	public void addCall(Call call) throws Exception;

	public int getCallNo() throws Exception;

	public void deleteCall(int callNo) throws Exception;

	public Integer getCallDriver(String carOpt, boolean petOpt, int driverNo) throws Exception;

	public void updateDealCode(int callNo) throws Exception;

	public void updateShareCode(int callNo) throws Exception;

	public void updateLikeAddr(String likeAddr, String likeName, int userNo, int likeNo) throws Exception;

	public void deleteLikeAddr(int likeNo, int userNo) throws Exception;

	public void deleteCustomName(int userNo) throws Exception;

	public List<Integer> getBlackList(int passengerNo) throws Exception;

}
