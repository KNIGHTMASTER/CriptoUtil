/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.zisal.criptoutil;

import java.io.File;

/**
 *
 * @author fauzi
 */
public class CyptoUtilsTest {
    public static void main(String[] args) {
        String key = "zFauzi99999999999";
        File inputFile = new File("document.txt");
        File encryptedFile = new File("/home/fauzi/document.encrypted");
        File decryptedFile = new File("/home/fauzi/document.decrypted");
         
        try {
            CritpUtils.encrypt(key, inputFile, encryptedFile);
            CritpUtils.decrypt(key, encryptedFile, decryptedFile);
        } catch (CryptoException ex) {
            System.out.println(ex.getMessage());
            ex.printStackTrace();
        }
    }
}
