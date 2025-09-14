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
 * ※ 프로젝트 최상위 그룹을 기반으로 설정 값을 바인딩
 */
@ConfigurationPropertiesScan({CommonConstant.GROUP})
@Configuration
public class CommonConfig {

    /**
     * 직렬화 대상을 전역 변수로 한정
     */
    @Bean
    public ObjectMapper objectMapper() {
        return new ObjectMapper()
                .setVisibility(PropertyAccessor.ALL, JsonAutoDetect.Visibility.NONE)
                .setVisibility(PropertyAccessor.FIELD, JsonAutoDetect.Visibility.ANY);
    }

}
