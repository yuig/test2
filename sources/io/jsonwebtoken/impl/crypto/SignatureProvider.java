package io.jsonwebtoken.impl.crypto;

import a.a;
import io.jsonwebtoken.SignatureAlgorithm;
import io.jsonwebtoken.lang.Assert;
import io.jsonwebtoken.lang.RuntimeEnvironment;
import io.jsonwebtoken.security.SignatureException;
import java.security.Key;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import java.security.Signature;

/* loaded from: classes4.dex */
abstract class SignatureProvider {
    public static final SecureRandom DEFAULT_SECURE_RANDOM;
    protected final SignatureAlgorithm alg;
    protected final Key key;

    static {
        SecureRandom secureRandom = new SecureRandom();
        DEFAULT_SECURE_RANDOM = secureRandom;
        secureRandom.nextBytes(new byte[64]);
    }

    public SignatureProvider(SignatureAlgorithm signatureAlgorithm, Key key) {
        Assert.notNull(signatureAlgorithm, "SignatureAlgorithm cannot be null.");
        Assert.notNull(key, "Key cannot be null.");
        this.alg = signatureAlgorithm;
        this.key = key;
    }

    public Signature createSignatureInstance() {
        try {
            return getSignatureInstance();
        } catch (NoSuchAlgorithmException e13) {
            String str = "Unavailable " + this.alg.getFamilyName() + " Signature algorithm '" + this.alg.getJcaName() + "'.";
            if (!this.alg.isJdkStandard() && !isBouncyCastleAvailable()) {
                str = a.C(str, " This is not a standard JDK algorithm. Try including BouncyCastle in the runtime classpath.");
            }
            throw new SignatureException(str, e13);
        }
    }

    public Signature getSignatureInstance() {
        return Signature.getInstance(this.alg.getJcaName());
    }

    public boolean isBouncyCastleAvailable() {
        return RuntimeEnvironment.BOUNCY_CASTLE_AVAILABLE;
    }
}
