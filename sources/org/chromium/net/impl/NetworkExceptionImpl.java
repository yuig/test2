package org.chromium.net.impl;

import org.chromium.net.NetworkException;

/* loaded from: classes4.dex */
public class NetworkExceptionImpl extends NetworkException {

    /* renamed from: a, reason: collision with root package name */
    public final int f97437a;

    /* renamed from: b, reason: collision with root package name */
    public final int f97438b;

    public NetworkExceptionImpl(String str, int i13, int i14) {
        super(str, null);
        this.f97437a = i13;
        this.f97438b = i14;
    }

    @Override // org.chromium.net.NetworkException
    public final int getCronetInternalErrorCode() {
        return this.f97438b;
    }

    @Override // org.chromium.net.NetworkException
    public final int getErrorCode() {
        return this.f97437a;
    }

    @Override // java.lang.Throwable
    public final String getMessage() {
        StringBuilder sb3 = new StringBuilder(super.getMessage());
        sb3.append(", ErrorCode=");
        sb3.append(this.f97437a);
        int i13 = this.f97438b;
        if (i13 != 0) {
            sb3.append(", InternalErrorCode=");
            sb3.append(i13);
        }
        sb3.append(", Retryable=");
        sb3.append(immediatelyRetryable());
        return sb3.toString();
    }

    @Override // org.chromium.net.NetworkException
    public boolean immediatelyRetryable() {
        int i13 = this.f97437a;
        return i13 == 3 || i13 == 4 || i13 == 5 || i13 == 6 || i13 == 8;
    }
}
