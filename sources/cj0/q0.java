package cj0;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class q0 implements u {

    /* renamed from: a, reason: collision with root package name */
    public final Throwable f27859a;

    /* renamed from: b, reason: collision with root package name */
    public final String f27860b;

    public q0(String detailedMessage, Throwable cause) {
        Intrinsics.checkNotNullParameter(cause, "cause");
        Intrinsics.checkNotNullParameter(detailedMessage, "detailedMessage");
        this.f27859a = cause;
        this.f27860b = detailedMessage;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof q0)) {
            return false;
        }
        q0 q0Var = (q0) obj;
        return Intrinsics.d(this.f27859a, q0Var.f27859a) && Intrinsics.d(this.f27860b, q0Var.f27860b);
    }

    public final int hashCode() {
        return this.f27860b.hashCode() + (this.f27859a.hashCode() * 31);
    }

    public final String toString() {
        return "LogHandledException(cause=" + this.f27859a + ", detailedMessage=" + this.f27860b + ")";
    }
}
