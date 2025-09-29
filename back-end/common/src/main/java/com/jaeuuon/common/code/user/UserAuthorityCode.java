package com.jaeuuon.common.code.user;

import com.jaeuuon.common.code.CommonCode;
import lombok.Getter;
import lombok.RequiredArgsConstructor;

/**
 * 사용자 권한 코드
 */
@Getter
@RequiredArgsConstructor
public enum UserAuthorityCode implements CommonCode {

    /**
     * 관리자
     */
    ADMIN("ADMIN"),

    /**
     * 일반 사용자
     */
    USER("USER");

    private final String value;

}
