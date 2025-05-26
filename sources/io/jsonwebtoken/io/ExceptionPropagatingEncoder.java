package io.jsonwebtoken.io;

import androidx.credentials.playservices.HiddenActivity$$ExternalSyntheticOutline0;
import io.jsonwebtoken.lang.Assert;

/* loaded from: classes4.dex */
class ExceptionPropagatingEncoder<T, R> implements Encoder<T, R> {
    private final Encoder<T, R> encoder;

    public ExceptionPropagatingEncoder(Encoder<T, R> encoder) {
        Assert.notNull(encoder, "Encoder cannot be null.");
        this.encoder = encoder;
    }

    @Override // io.jsonwebtoken.io.Encoder
    public R encode(T t13) {
        Assert.notNull(t13, "Encode argument cannot be null.");
        try {
            return this.encoder.encode(t13);
        } catch (EncodingException e13) {
            throw e13;
        } catch (Exception e14) {
            throw new EncodingException(HiddenActivity$$ExternalSyntheticOutline0.m(e14, new StringBuilder("Unable to encode input: ")), e14);
        }
    }
}
