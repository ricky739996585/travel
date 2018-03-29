package com.ricky.travel.serviceImpl;

import com.ricky.travel.dao.DivideVOMapper;
import com.ricky.travel.domain.DivideVO;
import com.ricky.travel.domain.DivideVOExample;
import com.ricky.travel.service.DivideService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.sql.Date;
import java.util.List;
@Service
public class DivideServiceImpl implements DivideService {
    @Autowired
    public DivideVOMapper divideVOMapper;

    @Override
    public DivideVO getDivide(Integer id) {
        return divideVOMapper.selectByPrimaryKey(id);
    }

    @Override
    public int insert(DivideVO divideVO) {
        return divideVOMapper.insertSelective(divideVO);
    }

    @Override
    public void update(DivideVO divideVO) {
        divideVOMapper.updateByPrimaryKeySelective(divideVO);
    }

    @Override
    public void delete(Integer id) {
        divideVOMapper.deleteByPrimaryKey(id);
    }

    @Override
    public DivideVO getDivideByAdminIdAndAuthId(Integer adminId, Integer authId) {
        DivideVOExample example=new DivideVOExample();
        example.createCriteria().andAdminIdEqualTo(adminId);
        example.createCriteria().andAuthIdEqualTo(authId);
        example.setOrderByClause("Divide_Date");
        List<DivideVO> list=divideVOMapper.selectByExample(example);
        return list.get(0);
    }

    public void insertAuth(int adminId,int authId){
        DivideVO divideVO=new DivideVO();
        divideVO.setAdminId(adminId);
        divideVO.setAuthId(authId);
        divideVO.setDivideDate(new Date(System.currentTimeMillis()));
        divideVOMapper.insertSelective(divideVO);
    }

    public void deleteAuth(int adminId,int authId){
        DivideVOExample example=new DivideVOExample();
        example.createCriteria().andAdminIdEqualTo(adminId).andAuthIdEqualTo(authId);
        example.setOrderByClause("Divide_Date");
        List<DivideVO> list=divideVOMapper.selectByExample(example);
        DivideVO divideVO=list.get(0);
        divideVOMapper.deleteByPrimaryKey(divideVO.getDivideId());
    }

//    public void divide(String[] newAuths,String[] oldAuths,int adminId){
//        for (int i=0;i<newAuths.length&&i<oldAuths.length;i++){
//            //增加权限给用户
//            //原本权限为0，修改为1
//            if("0".equals(oldAuths[i])&&"1".equals(newAuths[i])){
//                insertAuth(adminId,i+1);
//            }else if ("1".equals(oldAuths[i])&&"0".equals(newAuths[i])){
//                divideService.deleteAuth(adminId,i+1);
//            }
//        }
//    }
}
