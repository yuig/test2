package io.jsonwebtoken.impl.crypto;

import io.jsonwebtoken.SignatureAlgorithm;
import java.security.Key;

/* loaded from: classes4.dex */
public interface SignerFactory {
    Signer createSigner(SignatureAlgorithm signatureAlgorithm, Key key);
}
