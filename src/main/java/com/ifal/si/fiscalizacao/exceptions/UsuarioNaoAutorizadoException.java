package com.ifal.si.fiscalizacao.exceptions;

public class UsuarioNaoAutorizadoException extends Exception {
    public UsuarioNaoAutorizadoException(String mensagem) {
        super(mensagem);
    }
}
