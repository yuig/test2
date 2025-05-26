package io.jsonwebtoken.security;

import io.jsonwebtoken.JwtException;

/* loaded from: classes4.dex */
public class SecurityException extends JwtException {
    public SecurityException(String str) {
        super(str);
    }

    public SecurityException(String str, Throwable th3) {
        super(str, th3);
    }
}
