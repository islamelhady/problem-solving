// Created by islam elhady on 09/05/2019.

class UsernameValidator{

public static final String regularExpression="[a-zA-Z][a-zA-Z0-9_]{7,29}$";
}
/*
 *  a-z : Alphabet range a to z in lowercase
 * A-Z: Alphabet range a to z in uppercase
 * 0-9: Number range 0 to 9 digits.
 The limit the characters in Username we used:
 {7,29} i.e more than 7 character and less than 29 characters.
 * Expression [a-z]:  Gives a single character in A to Z in lowercase.
 * Similarly [A-Z]: Gives a single character in A to Z in Uppercase.
 * [0-9] : Gives a single digit in range 0 to 9 .
 */