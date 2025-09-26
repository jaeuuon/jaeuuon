package com.jaeuuon.common.constant;

/**
 * 공통 상수
 */
public class CommonConstant {

    /**
     * 스캔, 예외 추적 시 사용되는 최상위 패키지
     *
     * <pre>
     *     {@code
     *     // 컴포넌트 스캔
     *     @SpringBootApplication(scanBasePackages = {CommonConstant.BASE_PACKAGE})
     *     public class ExampleApplication {
     *         ...
     *     }
     *     }
     * </pre>
     * <pre>
     *     {@code
     *     // 예외 추적
     *     for (StackTraceElement stackTrace : exception.getStackTrace()) {
     *         if (stackTrace.getClassName().startsWith(CommonConstant.BASE_PACKAGE)) {
     *             ...
     *         }
     *     }
     *     }
     * </pre>
     */
    public static final String BASE_PACKAGE = "com.jaeuuon";

    /**
     * 문자열 결합, 분리 시 사용되는 구분자
     *
     * <pre>
     *     {@code
     *     // "A,B,..."
     *     String.join(CommonConstant.DELIMITER, "A", "B", ...);
     *     }
     * </pre>
     * <pre>
     *     {@code
     *     // {"A", "B", ...}
     *     "A,B,...".split(CommonConstant.DELIMITER);
     *     }
     * </pre>
     */
    public static final String DELIMITER = ",";

}
