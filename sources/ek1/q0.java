package ek1;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class q0 implements w0 {

    /* renamed from: a, reason: collision with root package name */
    public final String f59320a;

    /* renamed from: b, reason: collision with root package name */
    public final q8.c0 f59321b;

    public q0(String pinUid, q8.c0 perfEventTime) {
        Intrinsics.checkNotNullParameter(pinUid, "pinUid");
        Intrinsics.checkNotNullParameter(perfEventTime, "perfEventTime");
        this.f59320a = pinUid;
        this.f59321b = perfEventTime;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof q0)) {
            return false;
        }
        q0 q0Var = (q0) obj;
        return Intrinsics.d(this.f59320a, q0Var.f59320a) && Intrinsics.d(this.f59321b, q0Var.f59321b);
    }

    public final int hashCode() {
        return this.f59321b.hashCode() + (this.f59320a.hashCode() * 31);
    }

    public final String toString() {
        return "LogImagePlaceholderError(pinUid=" + this.f59320a + ", perfEventTime=" + this.f59321b + ")";
    }
}
