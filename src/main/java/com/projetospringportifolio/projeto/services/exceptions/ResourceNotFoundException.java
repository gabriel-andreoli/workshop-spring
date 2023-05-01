package com.projetospringportifolio.projeto.services.exceptions;

public class ResourceNotFoundException extends RuntimeException {

  public ResourceNotFoundException(Object id){
    super("Resoruce not found. Id " + id);
  }

}
