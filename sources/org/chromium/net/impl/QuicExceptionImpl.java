package org.chromium.net.impl;

import org.chromium.net.QuicException;

/* loaded from: classes4.dex */
public class QuicExceptionImpl extends QuicException {

    /* renamed from: a, reason: collision with root package name */
    public final int f97439a;

    /* renamed from: b, reason: collision with root package name */
    public final NetworkExceptionImpl f97440b;

    public QuicExceptionImpl(String str, int i13, int i14, int i15) {
        super(str, null);
        this.f97440b = new NetworkExceptionImpl(str, i13, i14);
        this.f97439a = i15;
    }

    @Override // org.chromium.net.NetworkException
    public final int getCronetInternalErrorCode() {
        return this.f97440b.f97438b;
    }

    @Override // org.chromium.net.NetworkException
    public final int getErrorCode() {
        return this.f97440b.f97437a;
    }

    @Override // java.lang.Throwable
    public final String getMessage() {
        return this.f97440b.getMessage() + ", QuicDetailedErrorCode=" + this.f97439a;
    }

    @Override // org.chromium.net.QuicException
    public final int getQuicDetailedErrorCode() {
        return this.f97439a;
    }

    @Override // org.chromium.net.NetworkException
    public final boolean immediatelyRetryable() {
        return this.f97440b.immediatelyRetryable();
    }
}
