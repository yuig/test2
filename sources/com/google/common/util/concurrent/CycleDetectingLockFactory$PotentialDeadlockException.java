package com.google.common.util.concurrent;

import java.util.Objects;
import pk.o1;

/* loaded from: classes3.dex */
public final class CycleDetectingLockFactory$PotentialDeadlockException extends IllegalStateException {
    static {
        o1.p(3, jk.r.class.getName(), "com.google.common.util.concurrent.CycleDetectingLockFactory$PotentialDeadlockException", ph.a.class.getName());
    }

    @Override // java.lang.Throwable
    public final String getMessage() {
        String message = super.getMessage();
        Objects.requireNonNull(message);
        StringBuilder sb3 = new StringBuilder(message);
        for (Throwable th3 = null; th3 != null; th3 = th3.getCause()) {
            sb3.append(", ");
            sb3.append(th3.getMessage());
        }
        return sb3.toString();
    }
}
