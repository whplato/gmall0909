package com.zhi.gmall.user.service.impl;


import com.alibaba.dubbo.config.annotation.Service;
import com.zhi.gmall.bean.UmsMember;
import com.zhi.gmall.bean.UmsMemberReceiveAddress;
import com.zhi.gmall.service.UserService;
import com.zhi.gmall.user.mapper.UmsMemberReceiveAddressMapper;
import com.zhi.gmall.user.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;


import java.util.List;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    UserMapper userMapper;
    @Autowired
    UmsMemberReceiveAddressMapper umsMemberReceiveAddressMapper;

    @Override
    public List<UmsMember> getAllUser() {
        List<UmsMember> umsMemberList=  userMapper.selectAll();
        return umsMemberList;
    }

    @Override
    public List<UmsMemberReceiveAddress> getReceiveAddressByMemberId(String memberId) {
        UmsMemberReceiveAddress umsMemberReceiveAddress = new UmsMemberReceiveAddress();
        umsMemberReceiveAddress.setMemberId(memberId);
        //根据对象中不为空的属性为条件进行查询，查询出UmsMemberReceiveAddress对象，将结果封装成一个集合。
        //List<UmsMemberReceiveAddress> umsMemberReceiveAddresses = umsMemberReceiveAddressMapper.selectByExample(umsMemberReceiveAddress);
        List<UmsMemberReceiveAddress> umsMemberReceiveAddresses = umsMemberReceiveAddressMapper.select(umsMemberReceiveAddress);
        return umsMemberReceiveAddresses;
    }
}
