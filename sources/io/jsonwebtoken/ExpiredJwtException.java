package io.jsonwebtoken;

/* loaded from: classes4.dex */
public class ExpiredJwtException extends ClaimJwtException {
    public ExpiredJwtException(Header header, Claims claims, String str) {
        super(header, claims, str);
    }

    public ExpiredJwtException(Header header, Claims claims, String str, Throwable th3) {
        super(header, claims, str, th3);
    }
}
