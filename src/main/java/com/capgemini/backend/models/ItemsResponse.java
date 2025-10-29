package com.capgemini.backend.models;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.Setter;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class ItemsResponse {

  @JsonProperty("items")
  @NonNull
  private ArrayList<Product> productList;

}

