package net.quikkly.core;

import java.math.BigInteger;
import java.util.Locale;

/* loaded from: classes4.dex */
public class IntUtils {
    private static final String ALPHABET = "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz";
    private static final BigInteger BIG_2_64 = BigInteger.valueOf(2).pow(64);

    public static BigInteger alphanumericAsBigInteger(String str) {
        return alphanumericAsBigInteger(str, ALPHABET);
    }

    public static String bigIntegerAsAlphanumeric(BigInteger bigInteger) {
        return bigIntegerAsAlphanumeric(bigInteger, ALPHABET);
    }

    public static long bigIntegerAsUnsignedLong(BigInteger bigInteger) {
        if (bigInteger == null) {
            throw new IllegalArgumentException("Data value is null.");
        }
        if (bigInteger.signum() < 0) {
            throw new IllegalArgumentException("Data value is negative.");
        }
        if (bigInteger.bitLength() <= 64) {
            return bigInteger.longValue();
        }
        throw new IllegalArgumentException("Data value is out of long range: " + bigInteger.bitCount() + ", " + bigInteger.bitLength());
    }

    private static void checkValidAlphabet(String str) {
        if (ALPHABET.equals(str)) {
            return;
        }
        if (StrUtils.isEmpty(str)) {
            throw new IllegalArgumentException("Alphabet must be a non-empty string.");
        }
        int i13 = 0;
        while (i13 < str.length()) {
            int i14 = i13 + 1;
            for (int i15 = i14; i15 < str.length(); i15++) {
                if (str.charAt(i13) == str.charAt(i15)) {
                    throw new IllegalArgumentException("Alphabet must have unique characters.");
                }
            }
            i13 = i14;
        }
    }

    public static BigInteger unsignedLongAsBigInteger(long j13) {
        return j13 >= 0 ? BigInteger.valueOf(j13) : BigInteger.valueOf(j13).add(BIG_2_64);
    }

    public static BigInteger alphanumericAsBigInteger(String str, String str2) {
        if (StrUtils.isEmpty(str)) {
            throw new IllegalArgumentException("Text must be a non-empty string");
        }
        checkValidAlphabet(str2);
        BigInteger valueOf = BigInteger.valueOf(str2.length());
        BigInteger bigInteger = BigInteger.ZERO;
        for (int i13 = 0; i13 < str.length(); i13++) {
            char charAt = str.charAt(i13);
            int indexOf = str2.indexOf(charAt);
            if (indexOf < 0) {
                throw new IllegalArgumentException(String.format(Locale.US, "Unexpected character \"%c\" for alphabet %s.", Character.valueOf(charAt), str2));
            }
            bigInteger = bigInteger.multiply(valueOf).add(BigInteger.valueOf(indexOf));
        }
        return bigInteger;
    }

    public static String bigIntegerAsAlphanumeric(BigInteger bigInteger, String str) {
        if (bigInteger == null || bigInteger.signum() < 0) {
            throw new IllegalArgumentException("Value must be non-negative BigInteger.");
        }
        checkValidAlphabet(str);
        BigInteger valueOf = BigInteger.valueOf(str.length());
        if (bigInteger.equals(BigInteger.ZERO)) {
            return "" + str.charAt(0);
        }
        StringBuilder sb3 = new StringBuilder();
        while (bigInteger.compareTo(BigInteger.ZERO) > 0) {
            sb3.append(str.charAt(bigInteger.mod(valueOf).intValue()));
            bigInteger = bigInteger.divide(valueOf);
        }
        return sb3.reverse().toString();
    }
}
