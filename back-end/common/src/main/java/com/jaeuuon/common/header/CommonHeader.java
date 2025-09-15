package com.jaeuuon.common.header;

/**
 * 공통 헤더
 */
public class CommonHeader {

    /**
     * 요청 ID<br />
     * ※ gateway 프로젝트에서 추가됨<br />
     * ※ 로깅 시 사용
     */
    public static final String REQUEST_ID = "Request-ID";

    /**
     * 사용자 ID<br />
     * ※ gateway 프로젝트에서 JWT Access 또는 Refresh를 파싱하여 추가됨<br />
     * ※ 사용자 확인, 추적, 로깅 등에 사용
     */
    public static final String USER_ID = "User-ID";

}
