package io.jsonwebtoken.impl.lang;

import io.jsonwebtoken.lang.UnknownClassException;

@Deprecated
/* loaded from: classes4.dex */
public final class LegacyServices {
    public static <T> T loadFirst(Class<T> cls) {
        try {
            return (T) Services.loadFirst(cls);
        } catch (UnavailableImplementationException e13) {
            throw new UnknownClassException(e13.getMessage(), e13);
        }
    }
}
