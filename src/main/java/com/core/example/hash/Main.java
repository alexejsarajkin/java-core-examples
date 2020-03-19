package com.core.example.hash;

import java.security.MessageDigest;
import java.security.Security;
import java.util.Set;
import java.util.UUID;

import javax.xml.bind.DatatypeConverter;

public class Main {
  private static final String UUID_STRING = UUID.randomUUID().toString();

  public static void main(String[] args) {

    // Get available algorithms
    Set<String> messageDigest = Security.getAlgorithms("MessageDigest");

    // Get hash for all algorithms
    messageDigest.forEach(e -> System.out.println("Algorithm: " + e + " Value: " + getHash(UUID_STRING.getBytes(), e)));
  }

  public static String getHash(byte[] inputBytes, String algorithm) {
    String hashValue = "";
    try {
      MessageDigest messageDigest = MessageDigest.getInstance(algorithm);
      messageDigest.update(inputBytes);
      byte[] digestedBytes = messageDigest.digest();
      hashValue = DatatypeConverter.printHexBinary(digestedBytes).toLowerCase();
    } catch (Exception e) {
      System.out.println(e.getMessage());
    }
    return hashValue;
  }
}
