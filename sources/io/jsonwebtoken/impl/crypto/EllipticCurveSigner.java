package io.jsonwebtoken.impl.crypto;

import io.jsonwebtoken.JwtException;
import io.jsonwebtoken.SignatureAlgorithm;
import io.jsonwebtoken.security.SignatureException;
import java.security.InvalidKeyException;
import java.security.Key;
import java.security.PrivateKey;
import java.security.Signature;
import java.security.interfaces.ECKey;

/* loaded from: classes4.dex */
public class EllipticCurveSigner extends EllipticCurveProvider implements Signer {
    public EllipticCurveSigner(SignatureAlgorithm signatureAlgorithm, Key key) {
        super(signatureAlgorithm, key);
        if ((key instanceof PrivateKey) && (key instanceof ECKey)) {
            return;
        }
        throw new IllegalArgumentException("Elliptic Curve signatures must be computed using an EC PrivateKey.  The specified key of type " + key.getClass().getName() + " is not an EC PrivateKey.");
    }

    public byte[] doSign(byte[] bArr) {
        PrivateKey privateKey = (PrivateKey) this.key;
        Signature createSignatureInstance = createSignatureInstance();
        createSignatureInstance.initSign(privateKey);
        createSignatureInstance.update(bArr);
        return EllipticCurveProvider.transcodeSignatureToConcat(createSignatureInstance.sign(), EllipticCurveProvider.getSignatureByteArrayLength(this.alg));
    }

    @Override // io.jsonwebtoken.impl.crypto.Signer
    public byte[] sign(byte[] bArr) {
        try {
            return doSign(bArr);
        } catch (JwtException e13) {
            throw new SignatureException("Unable to convert signature to JOSE format. " + e13.getMessage(), e13);
        } catch (InvalidKeyException e14) {
            throw new SignatureException("Invalid Elliptic Curve PrivateKey. " + e14.getMessage(), e14);
        } catch (java.security.SignatureException e15) {
            throw new SignatureException("Unable to calculate signature using Elliptic Curve PrivateKey. " + e15.getMessage(), e15);
        }
    }
}
