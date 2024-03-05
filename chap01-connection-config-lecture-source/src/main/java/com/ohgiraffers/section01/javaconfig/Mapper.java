package com.ohgiraffers.section01.javaconfig;

import org.apache.ibatis.annotations.Select;

public interface Mapper {

    @Select("SELECT CURDATE() FROM DUAL")
    java.util.Date selectSysDate(); // 쿼리문을 식별하기 위한 식별자 역할은 하는 메소드

}
