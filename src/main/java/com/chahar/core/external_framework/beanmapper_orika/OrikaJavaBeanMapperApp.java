package com.chahar.core.external_framework.beanmapper_orika;

import ma.glasnost.orika.MapperFacade;
import ma.glasnost.orika.MapperFactory;
import ma.glasnost.orika.impl.DefaultMapperFactory;
import ma.glasnost.orika.metadata.ClassMapBuilder;

public class OrikaJavaBeanMapperApp {

	public static void main(String[] args) {
		 final MapperFactory mapperFactory = new DefaultMapperFactory.Builder().build();
		 
		 ClassMapBuilder<UserModel,UserDto> classMapBuilder= mapperFactory.classMap(UserModel.class, UserDto.class);
		 classMapBuilder.field("email", "email1").register();
		 
		 MapperFacade mapperFacade  = mapperFactory.getMapperFacade();
		 
		 UserModel userModel = new UserModel("yash","chahar","yash123@gmail.com");
		 UserDto userDto = mapperFacade.map(userModel, UserDto.class);
		 
		 System.out.println(userDto);
	}

}
