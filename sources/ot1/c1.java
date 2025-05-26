package ot1;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class c1 {

    /* renamed from: a, reason: collision with root package name */
    public final t f97545a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f97546b;

    /* renamed from: c, reason: collision with root package name */
    public final a0 f97547c;

    public c1(t videoFormat, boolean z13, a0 a0Var) {
        Intrinsics.checkNotNullParameter(videoFormat, "videoFormat");
        this.f97545a = videoFormat;
        this.f97546b = z13;
        this.f97547c = a0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c1)) {
            return false;
        }
        c1 c1Var = (c1) obj;
        return this.f97545a == c1Var.f97545a && this.f97546b == c1Var.f97546b && Intrinsics.d(this.f97547c, c1Var.f97547c);
    }

    public final int hashCode() {
        int e13 = ep.b.e(this.f97546b, this.f97545a.hashCode() * 31, 31);
        a0 a0Var = this.f97547c;
        return e13 + (a0Var == null ? 0 : a0Var.hashCode());
    }

    public final String toString() {
        return "VideoSignalType(videoFormat=" + this.f97545a + ", isVideoFullRange=" + this.f97546b + ", colorDescription=" + this.f97547c + ")";
    }
}
