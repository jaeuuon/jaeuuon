package com.jaeuuon.common.util;

import org.springframework.lang.NonNull;

/**
 * 공통 유틸
 */
public class CommonUtil {

    /**
     * 이름과 일치하는 열거형 상수를 반환
     *
     * @param type 열거형 클래스
     * @param name 찾고자 하는 상수의 이름 (대소문자 구분)
     * @param <E>  열거형
     * @return 열거형 상수
     */
    public static <E extends Enum<E>> E findEnum(@NonNull Class<E> type, String name) {
        if (name != null) {
            for (E enumConstant : type.getEnumConstants()) {
                if (enumConstant.name().equals(name)) {
                    return enumConstant;
                }
            }
        }

        return null;
    }

}
