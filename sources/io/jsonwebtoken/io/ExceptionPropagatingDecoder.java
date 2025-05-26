package io.jsonwebtoken.io;

import androidx.credentials.playservices.HiddenActivity$$ExternalSyntheticOutline0;
import io.jsonwebtoken.lang.Assert;

/* loaded from: classes4.dex */
class ExceptionPropagatingDecoder<T, R> implements Decoder<T, R> {
    private final Decoder<T, R> decoder;

    public ExceptionPropagatingDecoder(Decoder<T, R> decoder) {
        Assert.notNull(decoder, "Decoder cannot be null.");
        this.decoder = decoder;
    }

    @Override // io.jsonwebtoken.io.Decoder
    public R decode(T t13) {
        Assert.notNull(t13, "Decode argument cannot be null.");
        try {
            return this.decoder.decode(t13);
        } catch (DecodingException e13) {
            throw e13;
        } catch (Exception e14) {
            throw new DecodingException(HiddenActivity$$ExternalSyntheticOutline0.m(e14, new StringBuilder("Unable to decode input: ")), e14);
        }
    }
}
