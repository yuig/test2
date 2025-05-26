package io.jsonwebtoken;

/* loaded from: classes4.dex */
public class MissingClaimException extends InvalidClaimException {
    public MissingClaimException(Header header, Claims claims, String str) {
        super(header, claims, str);
    }

    public MissingClaimException(Header header, Claims claims, String str, Throwable th3) {
        super(header, claims, str, th3);
    }
}
