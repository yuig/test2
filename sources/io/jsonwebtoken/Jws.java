package io.jsonwebtoken;

/* loaded from: classes4.dex */
public interface Jws<B> extends Jwt<JwsHeader, B> {
    String getSignature();
}
