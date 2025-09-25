package com.jaeuuon.common.web.result.helper;

import com.jaeuuon.common.result.code.CommonResultCode;
import lombok.RequiredArgsConstructor;
import org.springframework.lang.NonNull;

import java.lang.reflect.Field;
import java.lang.reflect.Modifier;

@RequiredArgsConstructor
public class ResultCodeHelper<T extends CommonResultCode> {

    @NonNull
    private final Class<T> type;

    public boolean isValid(String value) {
        if (value != null) {
            for (Field field : type.getDeclaredFields()) {
                try {
                    if (Modifier.isStatic(field.getModifiers()) && value.equals(field.get(null))) {
                        return true;
                    }
                } catch (IllegalAccessException ignoredException) {
                }
            }
        }

        return false;
    }

}
