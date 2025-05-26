package io.jsonwebtoken.impl.crypto;

import androidx.credentials.playservices.HiddenActivity$$ExternalSyntheticOutline0;
import io.jsonwebtoken.SignatureAlgorithm;
import io.jsonwebtoken.lang.Assert;
import io.jsonwebtoken.security.SignatureException;
import java.security.Key;
import java.security.MessageDigest;
import java.security.PublicKey;
import java.security.Signature;
import java.security.interfaces.RSAPrivateKey;
import java.security.interfaces.RSAPublicKey;

/* loaded from: classes4.dex */
public class RsaSignatureValidator extends RsaProvider implements SignatureValidator {
    private final RsaSigner SIGNER;

    public RsaSignatureValidator(SignatureAlgorithm signatureAlgorithm, Key key) {
        super(signatureAlgorithm, key);
        boolean z13 = key instanceof RSAPrivateKey;
        Assert.isTrue(z13 || (key instanceof RSAPublicKey), "RSA Signature validation requires either a RSAPublicKey or RSAPrivateKey instance.");
        this.SIGNER = z13 ? new RsaSigner(signatureAlgorithm, key) : null;
    }

    public boolean doVerify(Signature signature, PublicKey publicKey, byte[] bArr, byte[] bArr2) {
        signature.initVerify(publicKey);
        signature.update(bArr);
        return signature.verify(bArr2);
    }

    @Override // io.jsonwebtoken.impl.crypto.SignatureValidator
    public boolean isValid(byte[] bArr, byte[] bArr2) {
        if (!(this.key instanceof PublicKey)) {
            Assert.notNull(this.SIGNER, "RSA Signer instance cannot be null.  This is a bug.  Please report it.");
            return MessageDigest.isEqual(this.SIGNER.sign(bArr), bArr2);
        }
        try {
            return doVerify(createSignatureInstance(), (PublicKey) this.key, bArr, bArr2);
        } catch (Exception e13) {
            throw new SignatureException(HiddenActivity$$ExternalSyntheticOutline0.m(e13, new StringBuilder("Unable to verify RSA signature using configured PublicKey. ")), e13);
        }
    }
}
