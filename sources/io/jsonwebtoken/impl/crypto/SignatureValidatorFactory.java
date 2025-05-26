package io.jsonwebtoken.impl.crypto;

import io.jsonwebtoken.SignatureAlgorithm;
import java.security.Key;

/* loaded from: classes4.dex */
public interface SignatureValidatorFactory {
    SignatureValidator createSignatureValidator(SignatureAlgorithm signatureAlgorithm, Key key);
}
