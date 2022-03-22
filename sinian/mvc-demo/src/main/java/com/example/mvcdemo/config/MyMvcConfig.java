package com.example.mvcdemo.config;

import com.example.mvcdemo.controller.HelloController;
import javax.servlet.RequestDispatcher;
import javax.servlet.http.HttpServletRequest;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;


@ControllerAdvice(basePackageClasses = HelloController.class)
public class MyMvcConfig extends ResponseEntityExceptionHandler {

  @ResponseBody
  @ExceptionHandler(MyException.class)
  public ResponseEntity<?> handleControllerException(HttpServletRequest request, Throwable ex) {
    HttpStatus status = getStatus(request);
    final ResponseEntity<MyErrorBody> responseEntity =
        new ResponseEntity<>(
            new MyErrorBody(status.value(), ex.getMessage()), status);
    return responseEntity;
  }

  private HttpStatus getStatus(HttpServletRequest request) {
    Integer code = (Integer) request.getAttribute(RequestDispatcher.ERROR_STATUS_CODE);
    if (code == null) {
      return HttpStatus.INTERNAL_SERVER_ERROR;
    }
    return HttpStatus.resolve(code);
  }


}
