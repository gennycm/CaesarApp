package com.example.caesarapp;

public class CaesarCipher {
    private Integer shiftAmount;


    public CaesarCipher(int shiftAmount) {
        this.shiftAmount = shiftAmount;

    }

    public String translate(String input) {
        String cryptedInput = "";
        char letter;
        int ascii;

        for (int i = 0; i < input.length(); i++) {
            letter = input.charAt(i);

            if (letter != ' ') {
                ascii = (int) letter;
                ascii = ascii + (this.shiftAmount % 26);
                ascii = ascii > 'Z' ? ascii - 26 : ascii;
                cryptedInput = cryptedInput + (char) ascii;
            } else {
                cryptedInput = cryptedInput + ' ';
            }
        }

        return cryptedInput;
    }
}
