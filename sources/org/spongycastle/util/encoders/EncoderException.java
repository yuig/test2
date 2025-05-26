package org.spongycastle.util.encoders;

/* loaded from: classes4.dex */
public class EncoderException extends IllegalStateException {

    /* renamed from: a, reason: collision with root package name */
    public Throwable f97476a;

    @Override // java.lang.Throwable
    public final Throwable getCause() {
        return this.f97476a;
    }
}
