package com.rommelrico.s2datatypesandnullreferencehandling.nullreferences.javacode;

public class NullReferences {

    public static void main(String[] args) {
        String str = null;
        // str.toUpperCase(); // NullPointerException.

        /*
        You can do the below in one line in Kotlin:
        if (bankBranch != null) {
          Address address = bankBranch.getAddress();
          if (address != null) {
            Country country = address.getCountry();
            if (country != null) {
              String countryCode = country.getCountryCode();
            }
          }
        }
        See concise example in NullReferences.kt
         */
    }

}
