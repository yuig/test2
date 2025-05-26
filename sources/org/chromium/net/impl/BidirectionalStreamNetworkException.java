package org.chromium.net.impl;

/* loaded from: classes4.dex */
public class BidirectionalStreamNetworkException extends NetworkExceptionImpl {
    @Override // org.chromium.net.impl.NetworkExceptionImpl, org.chromium.net.NetworkException
    public final boolean immediatelyRetryable() {
        int i13 = this.f97438b;
        if (i13 == -358 || i13 == -352) {
            return true;
        }
        return super.immediatelyRetryable();
    }
}
