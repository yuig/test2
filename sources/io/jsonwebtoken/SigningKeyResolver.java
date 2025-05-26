package io.jsonwebtoken;

import java.security.Key;

/* loaded from: classes4.dex */
public interface SigningKeyResolver {
    Key resolveSigningKey(JwsHeader jwsHeader, Claims claims);

    Key resolveSigningKey(JwsHeader jwsHeader, String str);
}
