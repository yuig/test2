package io.jsonwebtoken;

import io.jsonwebtoken.security.SecurityException;

@Deprecated
/* loaded from: classes4.dex */
public class SignatureException extends SecurityException {
    public SignatureException(String str) {
        super(str);
    }

    public SignatureException(String str, Throwable th3) {
        super(str, th3);
    }
}
