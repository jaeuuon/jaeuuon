package com.jaeuuon.common.result.code;

public class CommonResultCode {

    public static final String GET = "COMMON_GET";
    public static final String POST = "COMMON_POST";
    public static final String PUT = "COMMON_PUT";
    public static final String DELETE = "COMMON_DELETE";
    public static final String PATCH = "COMMON_PATCH";

    public static final String BAD_REQUEST = "COMMON_BAD_REQUEST";
    public static final String UNAUTHORIZED = "COMMON_UNAUTHORIZED";
    public static final String FORBIDDEN = "COMMON_FORBIDDEN";
    public static final String NOT_FOUND = "COMMON_NOT_FOUND";
    public static final String METHOD_NOT_ALLOWED = "COMMON_METHOD_NOT_ALLOWED";
    public static final String NOT_ACCEPTABLE = "COMMON_NOT_ACCEPTABLE";
    public static final String CONFLICT = "COMMON_CONFLICT";
    public static final String UNSUPPORTED_MEDIA_TYPE = "COMMON_UNSUPPORTED_MEDIA_TYPE";
    public static final String INTERNAL_SERVER_ERROR = "COMMON_INTERNAL_SERVER_ERROR";
    public static final String SERVICE_UNAVAILABLE = "COMMON_SERVICE_UNAVAILABLE";

    public static final String UNDEFINED = "COMMON_UNDEFINED";

    public static String get(int httpStatusCode) {
        return switch (httpStatusCode) {
            case 400 -> BAD_REQUEST;
            case 401 -> UNAUTHORIZED;
            case 403 -> FORBIDDEN;
            case 404 -> NOT_FOUND;
            case 405 -> METHOD_NOT_ALLOWED;
            case 406 -> NOT_ACCEPTABLE;
            case 409 -> CONFLICT;
            case 415 -> UNSUPPORTED_MEDIA_TYPE;
            case 500 -> INTERNAL_SERVER_ERROR;
            case 503 -> SERVICE_UNAVAILABLE;

            default -> UNDEFINED;
        };
    }

}
