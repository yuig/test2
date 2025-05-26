package io.jsonwebtoken.security;

import a.a;
import io.jsonwebtoken.SignatureAlgorithm;
import io.jsonwebtoken.lang.Assert;
import io.jsonwebtoken.lang.Classes;
import java.security.KeyPair;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import javax.crypto.SecretKey;
import javax.crypto.spec.SecretKeySpec;

/* loaded from: classes4.dex */
public final class Keys {
    private static final String EC = "io.jsonwebtoken.impl.crypto.EllipticCurveProvider";
    private static final String MAC = "io.jsonwebtoken.impl.crypto.MacProvider";
    private static final String RSA = "io.jsonwebtoken.impl.crypto.RsaProvider";
    private static final Class[] SIG_ARG_TYPES = {SignatureAlgorithm.class};
    private static final List<SignatureAlgorithm> PREFERRED_HMAC_ALGS = Collections.unmodifiableList(Arrays.asList(SignatureAlgorithm.HS512, SignatureAlgorithm.HS384, SignatureAlgorithm.HS256));

    /* renamed from: io.jsonwebtoken.security.Keys$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$io$jsonwebtoken$SignatureAlgorithm;

        static {
            int[] iArr = new int[SignatureAlgorithm.values().length];
            $SwitchMap$io$jsonwebtoken$SignatureAlgorithm = iArr;
            try {
                iArr[SignatureAlgorithm.HS256.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$io$jsonwebtoken$SignatureAlgorithm[SignatureAlgorithm.HS384.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$io$jsonwebtoken$SignatureAlgorithm[SignatureAlgorithm.HS512.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                $SwitchMap$io$jsonwebtoken$SignatureAlgorithm[SignatureAlgorithm.RS256.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                $SwitchMap$io$jsonwebtoken$SignatureAlgorithm[SignatureAlgorithm.PS256.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                $SwitchMap$io$jsonwebtoken$SignatureAlgorithm[SignatureAlgorithm.RS384.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                $SwitchMap$io$jsonwebtoken$SignatureAlgorithm[SignatureAlgorithm.PS384.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                $SwitchMap$io$jsonwebtoken$SignatureAlgorithm[SignatureAlgorithm.RS512.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                $SwitchMap$io$jsonwebtoken$SignatureAlgorithm[SignatureAlgorithm.PS512.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                $SwitchMap$io$jsonwebtoken$SignatureAlgorithm[SignatureAlgorithm.ES256.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                $SwitchMap$io$jsonwebtoken$SignatureAlgorithm[SignatureAlgorithm.ES384.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                $SwitchMap$io$jsonwebtoken$SignatureAlgorithm[SignatureAlgorithm.ES512.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
        }
    }

    private Keys() {
    }

    public static SecretKey hmacShaKeyFor(byte[] bArr) {
        if (bArr == null) {
            throw new InvalidKeyException("SecretKey byte array cannot be null.");
        }
        int length = bArr.length * 8;
        for (SignatureAlgorithm signatureAlgorithm : PREFERRED_HMAC_ALGS) {
            if (length >= signatureAlgorithm.getMinKeyLength()) {
                return new SecretKeySpec(bArr, signatureAlgorithm.getJcaName());
            }
        }
        StringBuilder s13 = a.s("The specified key byte array is ", length, " bits which is not secure enough for any JWT HMAC-SHA algorithm.  The JWT JWA Specification (RFC 7518, Section 3.2) states that keys used with HMAC-SHA algorithms MUST have a size >= 256 bits (the key size must be greater than or equal to the hash output size).  Consider using the ");
        s13.append(Keys.class.getName());
        s13.append("#secretKeyFor(SignatureAlgorithm) method to create a key guaranteed to be secure enough for your preferred HMAC-SHA algorithm.  See https://tools.ietf.org/html/rfc7518#section-3.2 for more information.");
        throw new WeakKeyException(s13.toString());
    }

    public static KeyPair keyPairFor(SignatureAlgorithm signatureAlgorithm) {
        Assert.notNull(signatureAlgorithm, "SignatureAlgorithm cannot be null.");
        switch (AnonymousClass1.$SwitchMap$io$jsonwebtoken$SignatureAlgorithm[signatureAlgorithm.ordinal()]) {
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
                return (KeyPair) Classes.invokeStatic(RSA, "generateKeyPair", SIG_ARG_TYPES, signatureAlgorithm);
            case 10:
            case 11:
            case 12:
                return (KeyPair) Classes.invokeStatic(EC, "generateKeyPair", SIG_ARG_TYPES, signatureAlgorithm);
            default:
                throw new IllegalArgumentException("The " + signatureAlgorithm.name() + " algorithm does not support Key Pairs.");
        }
    }

    public static SecretKey secretKeyFor(SignatureAlgorithm signatureAlgorithm) {
        Assert.notNull(signatureAlgorithm, "SignatureAlgorithm cannot be null.");
        int i13 = AnonymousClass1.$SwitchMap$io$jsonwebtoken$SignatureAlgorithm[signatureAlgorithm.ordinal()];
        if (i13 == 1 || i13 == 2 || i13 == 3) {
            return (SecretKey) Classes.invokeStatic(MAC, "generateKey", SIG_ARG_TYPES, signatureAlgorithm);
        }
        throw new IllegalArgumentException("The " + signatureAlgorithm.name() + " algorithm does not support shared secret keys.");
    }
}
