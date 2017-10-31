/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.zisal.criptoutil;

import id.co.telkomsigma.util.io.CommonIOUtils;
import org.jasypt.util.text.BasicTextEncryptor;
import org.jasypt.util.text.StrongTextEncryptor;

/**
 *
 * @author fauzi
 */
public class Test {
    public static void main(String[] args) {
        String text = "/*==========simple==========*/\n" +
"INSERT INTO simple (code,name,remarks,sync) values ('data 1','data 1','data 1','1');\n" +
"INSERT INTO simple (code,name,remarks,sync) values ('data 2','data 2','data 2','1');\n" +
"INSERT INTO simple (code,name,remarks,sync) values ('data 3','data 3','data 3','1');\n" +
"INSERT INTO simple (code,name,remarks,sync) values ('data 4','data 4','data 4','1');\n" +
"/*==========simple2==========*/\n" +
"INSERT INTO simple2 (code,name,remarks,sync) values ('data 1','data 1','data 1','1');\n" +
"INSERT INTO simple2 (code,name,remarks,sync) values ('data 2','data 2','data 2','1');\n" +
"INSERT INTO simple2 (code,name,remarks,sync) values ('data 3','data 3','data 3','1');\n" +
"INSERT INTO simple2 (code,name,remarks,sync) values ('data 4','data 4','data 4','1');\n" +
"/*==========mst_currency==========*/\n" +
"INSERT INTO mst_currency (code,name,remarks,status,created_by,created_on,created_ip,created_platform,modified_by,modified_on,modified_ip,modified_platform) values ('IDRI','Indonesian Rupiah','Mata uang rupiah Ind','1','admin','2017-03-26 16:40:07.0','null','null','null','1970-01-01 08:00:00.0','null','null');\n" +
"INSERT INTO mst_currency (code,name,remarks,status,created_by,created_on,created_ip,created_platform,modified_by,modified_on,modified_ip,modified_platform) values ('USD','United States of America Dollar','Mata uang dollar Ame','1','admin','2017-03-26 16:40:13.0','null','null','null','1970-01-01 08:00:00.0','null','null');";
        String pass = "oke";
        String pathPlain = "/home/fauzi/test";
        String pathEnc = "/home/fauzi/enc";
        String pathDec = "/home/fauzi/dec";
        BasicTextEncryptor textEncryptor = new BasicTextEncryptor();
        textEncryptor.setPassword(pass);
        String myEncryptedText = textEncryptor.encrypt(text);
        CommonIOUtils.write(pathEnc, myEncryptedText.getBytes());
        String plainText = textEncryptor.decrypt(myEncryptedText);
        CommonIOUtils.write(pathDec, plainText.getBytes());
    }
}
