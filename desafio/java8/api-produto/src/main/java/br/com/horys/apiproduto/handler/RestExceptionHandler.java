package br.com.horys.apiproduto.handler;

import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

public class RestExceptionHandler extends ResponseEntityExceptionHandler {
//    @ExceptionHandler(BadRequestException.class)
//    public ResponseEntity<BadRequestExceptionDetails> handleBadRequestException(BadRequestException bre){
//        return new ResponseEntity<>(
//            ExceptionDetails.ExceptionDetailsBuilder
//            .timestamp(LocalDate.now())
//            .title("Bad Request Exception, Check Docs")
//            .status(HttpStatus.BAD_REQUEST.value())
//            .details(bre.getMessage()))
//            .developerMessage(bre.getClass().getName())
//            .build();
//
//
//    }

}
