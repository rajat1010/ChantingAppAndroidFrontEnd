package com.service.iscon.vcr.Constants;

/**
 * Created by vinod on 9/30/2015.
 */
public class ValidationPatternConstants {
    public static String UserFullNameValidationFind = "[a-zA-Z ]*$";
    public static String GeneralEMailValidationPattern = "[a-z0-9!#$%&'*+/=?^_`{|}~-]+(?:\\.[a-z0-9!#$%&'*+/=?^_`{|}~-]+)*@(?:[a-z0-9](?:[a-z0-9-]*[a-z0-9])?\\.)+[a-z0-9](?:[a-z0-9-]*[a-z0-9])?";
    public static String UserNameValidationPattern = "^[A-Za-z0-9]*$";
    //public static String UserNameValidationPattern = "^[A-Za-z][A-Za-z0-9]*$";
    public static String UserMobileValidationPattern = "[0-9 -]*$";
    public static String UserMobileValidationPattern1 = "[0-9]{10}?";
}
