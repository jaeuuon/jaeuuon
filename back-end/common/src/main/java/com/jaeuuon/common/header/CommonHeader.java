package com.jaeuuon.common.header;

/**
 * 공통 헤더
 */
public class CommonHeader {

    /**
     * 로깅 시 사용되는 요청 ID<br />
     * ※ 외부의 요청이 gateway 프로젝트로 들어올 때 추가
     */
    public static final String REQUEST_ID = "Request-ID";

    /**
     * 사용자 확인, 기록, 로깅 시 사용되는 사용자 ID<br />
     * ※ 외부의 요청이 gateway 프로젝트로 들어올 때 JWT Access 또는 Refresh를 파싱하여 추가
     */
    public static final String USER_ID = "User-ID";

}
