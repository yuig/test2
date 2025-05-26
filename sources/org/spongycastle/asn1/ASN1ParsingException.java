package org.spongycastle.asn1;

/* loaded from: classes4.dex */
public class ASN1ParsingException extends IllegalStateException {

    /* renamed from: a, reason: collision with root package name */
    public Throwable f97474a;

    @Override // java.lang.Throwable
    public final Throwable getCause() {
        return this.f97474a;
    }
}
