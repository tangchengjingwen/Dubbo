package com.itmayiedu.service.Impl;

import com.itmayiedu.service.UserService;

public class UserServiceImpl implements UserService {

	public String getUserId(Integer id) {
		System.out.println("被客户端（消费者）消费...id : " + id);
		if (id == 1) {
			return "唐成靖文";
		}
		if (id == 2) {
			return "迪丽热巴迪力木拉提";
		}
		return "未找到用户...";
	}

}
