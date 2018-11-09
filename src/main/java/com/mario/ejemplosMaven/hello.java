package com.mario.ejemplosMaven;

import org.apache.commons.codec.digest.DigestUtils;
/**
 * Clase con metodos que reciben un valor y lo encriptan en sha256. Metodo main para probarlo
 * @author Mario
 * 
 */
public class hello {
	public static void main(String[] args) {

        if (args.length < 1) {
            System.err.println("Introduce un valor");
            System.exit(0);
        }
        System.out.println(sha256hex(args[0]));	

    }

    public static String sha256hex(String input) {
        return DigestUtils.sha256Hex(input);
    }
}
