package com.exchange.api.util;

import com.exchange.api.model.Response;
import static com.exchange.api.util.Constants.*;
import static com.exchange.api.util.UUIDHelper.*;

import java.util.List;

public class ResponseHelper {

    public static Response buildOk(List<Object> data, String resource, String http_method){
        Response response = new Response();
        response.id = getUuid();
        response.http_method = http_method;
        response.resource = resource;
        response.code = HTTP_OK;
        response.message = HTTP_MSG_OK;
        response.description = HTTP_DES_OK;
        response.data = data;
        return response;
    }

    public static Response buildCreated(List<Object> data, String resource){
        Response response = new Response();
        response.id = getUuid();
        response.http_method = HTTP_POST;
        response.resource = resource;
        response.code = HTTP_CREATED;
        response.message = HTTP_MSG_CREATED;
        response.description = HTTP_DES_CREATED;
        response.data = data;
        return response;
    }

    public static Response buildConflicts(String resource, String http_method){
        Response response = new Response();
        response.id = getUuid();
        response.http_method = http_method;
        response.resource = resource;
        response.code = HTTP_CONFLICT;
        response.message = HTTP_MSG_CONFLICT;
        response.description = HTTP_DES_CONFLICT;
        response.data = null;
        return response;
    }

    public static Response buildServerError(String resource, String http_method){
        Response response = new Response();
        response.id = getUuid();
        response.http_method = http_method;
        response.resource = resource;
        response.code = HTTP_SERVER_ERROR;
        response.message = HTTP_MSG_SERVER_ERROR;
        response.description = HTTP_DES_SERVER_ERROR;
        response.data = null;
        return response;
    }

}
