package com.jaeuuon.common.code.user;

import com.jaeuuon.common.code.CommonCode;
import com.jaeuuon.common.constant.CommonConstant;
import com.jaeuuon.common.util.CommonUtil;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import org.springframework.lang.NonNull;

import java.util.HashSet;
import java.util.Set;

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

    /**
     * 결합된 이름 문자열을 분리 및 상수로 변환하여 반환<br />
     * ※ 상수와 일치하지 않는 이름은 제외
     *
     * <pre>
     *     {@code
     *     // [UserAuthorityCode.ADMIN, UserAuthorityCode.USER]
     *     UserAuthorityCode.convertToCodes("ADMIN,USER,UNKNOWN");
     *     }
     * </pre>
     *
     * @param names 결합된 이름 문자열
     * @return {@code Set<UserAuthorityCode>}
     */
    public static Set<UserAuthorityCode> convertToCodes(@NonNull String names) {
        Set<UserAuthorityCode> codes = new HashSet<>();

        for (String name : names.split(CommonConstant.DELIMITER)) {
            UserAuthorityCode code = CommonUtil.findEnum(UserAuthorityCode.class, name);

            if (code != null) {
                codes.add(code);
            }
        }

        return codes;
    }

}
