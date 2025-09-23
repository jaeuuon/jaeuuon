package com.jaeuuon.common.constant;

/**
 * 요청, 응답 헤더
 */
public class HeaderConstant {

    /**
     * 로깅 시 사용되는 요청 ID<br />
     * ※ gateway 프로젝트에서 외부의 요청이 들어올 때 추가
     *
     * <pre>
     *     {@code
     *     // "7243ab10-157"
     *     serverHttpRequest.getHeaders()
     *             .getFirst(HeaderConstant.REQUEST_ID);
     *     }
     * </pre>
     * <pre>
     *     {@code
     *     // "7243ab10-157"
     *     httpServletRequest.getHeader(HeaderConstant.REQUEST_ID);
     *     }
     * </pre>
     */
    public static final String REQUEST_ID = "Request-ID";

    /**
     * 사용자 확인, 기록, 로깅 시 사용되는 사용자 ID<br />
     * ※ gateway 프로젝트에서 외부의 요청이 들어올 때 JWT Access 또는 Refresh를 파싱하여 추가
     *
     * <pre>
     *     {@code
     *     // "1"
     *     serverHttpRequest.getHeaders()
     *             .getFirst(HeaderConstant.USER_ID);
     *     }
     * </pre>
     * <pre>
     *     {@code
     *     // "1"
     *     httpServletRequest.getHeader(HeaderConstant.USER_ID);
     *     }
     * </pre>
     */
    public static final String USER_ID = "User-ID";

}
