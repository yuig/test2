package ek1;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class u0 implements w0 {

    /* renamed from: a, reason: collision with root package name */
    public final String f59382a;

    /* renamed from: b, reason: collision with root package name */
    public final q8.c0 f59383b;

    public u0(String pinUid, q8.c0 perfEventTime) {
        Intrinsics.checkNotNullParameter(pinUid, "pinUid");
        Intrinsics.checkNotNullParameter(perfEventTime, "perfEventTime");
        this.f59382a = pinUid;
        this.f59383b = perfEventTime;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof u0)) {
            return false;
        }
        u0 u0Var = (u0) obj;
        return Intrinsics.d(this.f59382a, u0Var.f59382a) && Intrinsics.d(this.f59383b, u0Var.f59383b);
    }

    public final int hashCode() {
        return this.f59383b.hashCode() + (this.f59382a.hashCode() * 31);
    }

    public final String toString() {
        return "LogPlaceholderDrawn(pinUid=" + this.f59382a + ", perfEventTime=" + this.f59383b + ")";
    }
}
