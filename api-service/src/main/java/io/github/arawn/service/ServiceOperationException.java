package io.github.arawn.service;

public class ServiceOperationException extends RuntimeException {

    public ServiceOperationException() {
        super("서비스 수행 중 예외가 발생했습니다.");
    }
}
