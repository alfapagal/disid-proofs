package com.disid.restful.model;

import org.springframework.roo.addon.javabean.annotations.RooJavaBean;
import org.springframework.roo.addon.javabean.annotations.RooToString;
import org.springframework.roo.addon.jpa.annotations.entity.RooJpaEntity;

import javax.persistence.FetchType;
import javax.persistence.OneToOne;
import javax.validation.constraints.Min;

@RooJavaBean
@RooToString
@RooJpaEntity
public class Address {

  /**
   */
  private String street;

  /**
   */
  private String city;

  /**
   */
  @Min(1L)
  private Integer streetNumber;

  /**
   * Bidirectional composition one-to-one relationship. Child side.
   */
  @OneToOne(fetch = FetchType.LAZY)
  private Customer customer;

  public String toString() {
    return super.toString() + " - Street: " + street + ", City: " + city + ", Number: "
        + streetNumber;
  }
}
