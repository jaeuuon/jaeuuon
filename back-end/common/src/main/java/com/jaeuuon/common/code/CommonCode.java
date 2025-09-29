package com.jaeuuon.common.code;

/**
 * 공통 코드<br />
 * ※ 데이터베이스의 컬럼으로 사용되는 열거형 필드일 때 구현
 */
public interface CommonCode {

    /**
     * 열거형 필드와 매핑될 컬럼의 최대 길이
     *
     * <pre>
     *     {@code
     *     public class ExampleEntity {
     *
     *         // example_code VARCHAR(10)
     *         @Column(length = CommonCode.LENGTH)
     *         private ExampleCode exampleCode;
     *
     *     }
     *     }
     * </pre>
     */
    int LENGTH = 10;

    /**
     * 열거형 상수의 컬럼 값을 반환
     *
     * <pre>
     *     {@code
     *     public enum ExampleCode implements CommonCode {
     *
     *         A("a"), ...;
     *
     *         private final String value;
     *
     *         ExampleCode(String value) {
     *             this.value = value;
     *         }
     *
     *         public String getValue() {
     *             return this.value;
     *         }
     *
     *     }
     *     }
     * </pre>
     * <pre>
     *     {@code
     *     // "a"
     *     ExampleCode.A.getValue();
     *     }
     * </pre>
     *
     * @return {@code 컬럼 값}
     */
    String getValue();

}
