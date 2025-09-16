package com.jaeuuon.common.config;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.annotation.PropertyAccessor;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.jaeuuon.common.constant.CommonConstant;
import org.springframework.boot.context.properties.ConfigurationPropertiesScan;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * 공통 설정<br />
 * ※ 최상위 패키지를 기준으로 @ConfigurationProperties가 적용된 클래스를 스캔하여 빈으로 등록
 */
@ConfigurationPropertiesScan({CommonConstant.BASE_PACKAGE})
@Configuration
public class CommonConfig {

    /**
     * ObjectMapper의 직렬화 대상을 필드로 한정<br />
     * ※ 응답 클래스의 getter 포함을 방지
     */
    @Bean
    public ObjectMapper objectMapper() {
        return new ObjectMapper()
                .setVisibility(PropertyAccessor.ALL, JsonAutoDetect.Visibility.NONE)
                .setVisibility(PropertyAccessor.FIELD, JsonAutoDetect.Visibility.ANY);
    }

}
