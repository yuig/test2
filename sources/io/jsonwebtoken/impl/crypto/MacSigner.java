package io.jsonwebtoken.impl.crypto;

import io.jsonwebtoken.SignatureAlgorithm;
import io.jsonwebtoken.lang.Assert;
import io.jsonwebtoken.security.SignatureException;
import java.security.InvalidKeyException;
import java.security.Key;
import java.security.NoSuchAlgorithmException;
import javax.crypto.Mac;
import javax.crypto.SecretKey;
import javax.crypto.spec.SecretKeySpec;

/* loaded from: classes4.dex */
public class MacSigner extends MacProvider implements Signer {
    public MacSigner(SignatureAlgorithm signatureAlgorithm, byte[] bArr) {
        this(signatureAlgorithm, new SecretKeySpec(bArr, signatureAlgorithm.getJcaName()));
    }

    public Mac doGetMacInstance() {
        Mac mac = Mac.getInstance(this.alg.getJcaName());
        mac.init(this.key);
        return mac;
    }

    public Mac getMacInstance() {
        try {
            return doGetMacInstance();
        } catch (InvalidKeyException e13) {
            throw new SignatureException("The specified signing key is not a valid " + this.alg.name() + " key: " + e13.getMessage(), e13);
        } catch (NoSuchAlgorithmException e14) {
            throw new SignatureException("Unable to obtain JCA MAC algorithm '" + this.alg.getJcaName() + "': " + e14.getMessage(), e14);
        }
    }

    @Override // io.jsonwebtoken.impl.crypto.Signer
    public byte[] sign(byte[] bArr) {
        return getMacInstance().doFinal(bArr);
    }

    public MacSigner(SignatureAlgorithm signatureAlgorithm, Key key) {
        super(signatureAlgorithm, key);
        Assert.isTrue(signatureAlgorithm.isHmac(), "The MacSigner only supports HMAC signature algorithms.");
        if (key instanceof SecretKey) {
            return;
        }
        throw new IllegalArgumentException("MAC signatures must be computed and verified using a SecretKey.  The specified key of type " + key.getClass().getName() + " is not a SecretKey.");
    }
}
