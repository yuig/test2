package lm0;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class n0 implements w0 {

    /* renamed from: a, reason: collision with root package name */
    public final Throwable f83885a;

    /* renamed from: b, reason: collision with root package name */
    public final String f83886b;

    public n0(String detailedMessage, Throwable cause) {
        Intrinsics.checkNotNullParameter(cause, "cause");
        Intrinsics.checkNotNullParameter(detailedMessage, "detailedMessage");
        this.f83885a = cause;
        this.f83886b = detailedMessage;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof n0)) {
            return false;
        }
        n0 n0Var = (n0) obj;
        return Intrinsics.d(this.f83885a, n0Var.f83885a) && Intrinsics.d(this.f83886b, n0Var.f83886b);
    }

    public final int hashCode() {
        return this.f83886b.hashCode() + (this.f83885a.hashCode() * 31);
    }

    public final String toString() {
        return "LogHandledException(cause=" + this.f83885a + ", detailedMessage=" + this.f83886b + ")";
    }
}
