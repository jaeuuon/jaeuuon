package com.jaeuuon.common.constant;

import com.jaeuuon.common.code.user.UserAuthorityCode;

/**
 * 요청, 응답 헤더명
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

    /**
     * 사용자의 권한 확인 시 사용되는 결합된 사용자 권한 코드 상수들의 이름<br />
     * ※ gateway 프로젝트에서 외부의 요청이 들어올 때 JWT Access를 파싱하여 추가
     *
     * <pre>
     *     {@code
     *     // "ADMIN,USER"
     *     serverHttpRequest.getHeaders()
     *             .getFirst(HeaderConstant.USER_AUTHORITIES);
     *     }
     * </pre>
     * <pre>
     *     {@code
     *     // "ADMIN,USER"
     *     httpServletRequest.getHeader(HeaderConstant.USER_AUTHORITIES);
     *     }
     * </pre>
     *
     * @see UserAuthorityCode
     * @see UserAuthorityCode#convertToCodes(String)
     */
    public static final String USER_AUTHORITIES = "User-Authorities";

}
