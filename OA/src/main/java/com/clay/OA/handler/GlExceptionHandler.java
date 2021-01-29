package com.clay.OA.handler;

import com.clay.OA.entity.SingleResult;
import com.clay.OA.enums.ErrorStatus;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.MissingServletRequestParameterException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import javax.servlet.http.HttpServletRequest;
import java.sql.SQLException;

/**
 * @program: OA
 * @description: 全局异常处理
 * @author: bob
 * @create: 2021-01-29 15:18
 **/
@RestControllerAdvice
public class GlExceptionHandler {

    private final Logger logger = LoggerFactory.getLogger(this.getClass());


    /**
    * @Description: 处理  MissingServletRequestParameterException
    * @Param: [e, request]
    * @return: com.clay.OA.entity.SingleResult<java.lang.Object>
    * @Author: bob
    * @Date: 2021/1/29
    */
    @ExceptionHandler(value = MissingServletRequestParameterException.class)
    SingleResult<Object> handleMissingServletRequestParameterException(Exception e, HttpServletRequest request) {
        SingleResult<Object> exception = new SingleResult<Object>();
        exception.setCode(ErrorStatus.MissingServletRequestParameterException.getCode());
        exception.setMessage(ErrorStatus.MissingServletRequestParameterException.getMessage());
        logger.error("MissingServletRequestParameterException", "Error found: ", e);
        return exception;
    }

    /**
    * @Description: 处理 NullPointerException
    * @Param: [e, request]
    * @return: com.clay.OA.entity.SingleResult<java.lang.Object>
    * @Author: bob
    * @Date: 2021/1/29
    */
    @ExceptionHandler(value = NullPointerException.class)
    SingleResult<Object> handleNullPointerException(Exception e, HttpServletRequest request) {
        SingleResult<Object> exception = new SingleResult<Object>();
        exception.setCode(ErrorStatus.NullPointerException.getCode());
        exception.setMessage(ErrorStatus.NullPointerException.getMessage());
        logger.error("NullPointerException", "Error found: ", e);
        return exception;
    }

    /**
    * @Description: 处理 ClassNotFoundException
    * @Param: [e, request]
    * @return: com.clay.OA.entity.SingleResult<java.lang.Object>
    * @Author: bob
    * @Date: 2021/1/29
    */
    @ExceptionHandler(value = ClassNotFoundException.class)
    SingleResult<Object> handleClassNotFoundException(Exception e, HttpServletRequest request) {
        SingleResult<Object> exception = new SingleResult<Object>();
        exception.setCode(ErrorStatus.ClassNotFoundException.getCode());
        exception.setMessage(ErrorStatus.ClassNotFoundException.getMessage());
        logger.error("ClassNotFoundException", "Error found: ", e);
        return exception;
    }

    /**
     * @Description: 处理 SQLException
     * @Param: [e, request]
     * @return: com.clay.OA.entity.SingleResult<java.lang.Object>
     * @Author: bob
     * @Date: 2021/1/29
     */
    @ExceptionHandler(value = SQLException.class)
    SingleResult<Object> handleSQLException(Exception e, HttpServletRequest request) {
        SingleResult<Object> exception = new SingleResult<Object>();
        exception.setCode(ErrorStatus.SQLException.getCode());
        exception.setMessage(ErrorStatus.SQLException.getMessage());
        logger.error("SQLException", "Error found: ", e);
        return exception;
    }
}
