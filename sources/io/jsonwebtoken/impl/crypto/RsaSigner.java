package io.jsonwebtoken.impl.crypto;

import io.jsonwebtoken.SignatureAlgorithm;
import io.jsonwebtoken.security.SignatureException;
import java.security.InvalidKeyException;
import java.security.Key;
import java.security.PrivateKey;
import java.security.Signature;
import java.security.interfaces.RSAKey;

/* loaded from: classes4.dex */
public class RsaSigner extends RsaProvider implements Signer {
    public RsaSigner(SignatureAlgorithm signatureAlgorithm, Key key) {
        super(signatureAlgorithm, key);
        if ((key instanceof PrivateKey) && (key instanceof RSAKey)) {
            return;
        }
        throw new IllegalArgumentException("RSA signatures must be computed using an RSA PrivateKey.  The specified key of type " + key.getClass().getName() + " is not an RSA PrivateKey.");
    }

    public byte[] doSign(byte[] bArr) {
        PrivateKey privateKey = (PrivateKey) this.key;
        Signature createSignatureInstance = createSignatureInstance();
        createSignatureInstance.initSign(privateKey);
        createSignatureInstance.update(bArr);
        return createSignatureInstance.sign();
    }

    @Override // io.jsonwebtoken.impl.crypto.Signer
    public byte[] sign(byte[] bArr) {
        try {
            return doSign(bArr);
        } catch (InvalidKeyException e13) {
            throw new SignatureException("Invalid RSA PrivateKey. " + e13.getMessage(), e13);
        } catch (java.security.SignatureException e14) {
            throw new SignatureException("Unable to calculate signature using RSA PrivateKey. " + e14.getMessage(), e14);
        }
    }
}
