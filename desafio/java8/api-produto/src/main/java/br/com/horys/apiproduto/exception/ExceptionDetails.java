package br.com.horys.apiproduto.exception;

import java.time.LocalDateTime;

public class ExceptionDetails {
    protected String title;
    protected int status;
    protected String details;
    protected String developerMessage;
    protected LocalDateTime timestamp;

    public ExceptionDetails(ExceptionDetailsBuilder builder) {
        this.title = builder.title;
        this.status = builder.status;
        this.details = builder.details;
        this.developerMessage = builder.developerMessage;
        this.timestamp = builder.timestamp;
    }

    public String getTitle() {
        return title;
    }

    public int getStatus() {
        return status;
    }

    public String getDetails() {
        return details;
    }

    public String getDeveloperMessage() {
        return developerMessage;
    }

    public LocalDateTime getTimestamp() {
        return timestamp;
    }

    public static class ExceptionDetailsBuilder {
        protected String title;
        protected int status;
        protected String details;
        protected String developerMessage;
        protected LocalDateTime timestamp;


        public ExceptionDetailsBuilder title(String title){
            this.title = title;
            return this;
        }

        public ExceptionDetailsBuilder status(int status){
            this.status = status;
            return this;
        }

        public ExceptionDetailsBuilder details(String details){
            this.details = details;
            return this;
        }

        public ExceptionDetailsBuilder developerMessage(String developerMessage){
            this.developerMessage = developerMessage;
            return this;
        }

        public ExceptionDetailsBuilder timestamp(LocalDateTime timestamp){
            this.timestamp = timestamp;
            return this;
        }

        public ExceptionDetails build(){
            ExceptionDetails exceptionDetails = new ExceptionDetails(this);
            return exceptionDetails;
        }

    }
}
