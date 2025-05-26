package org.spongycastle.util.encoders;

/* loaded from: classes4.dex */
public class DecoderException extends IllegalStateException {

    /* renamed from: a, reason: collision with root package name */
    public Throwable f97475a;

    @Override // java.lang.Throwable
    public final Throwable getCause() {
        return this.f97475a;
    }
}
