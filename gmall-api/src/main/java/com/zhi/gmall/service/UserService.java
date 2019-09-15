package com.zhi.gmall.service;

import com.zhi.gmall.bean.UmsMember;
import com.zhi.gmall.bean.UmsMemberReceiveAddress;

import java.util.List;

public interface UserService {

    List<UmsMember> getAllUser();

    List<UmsMemberReceiveAddress> getReceiveAddressByMemberId(String memberId);
}
