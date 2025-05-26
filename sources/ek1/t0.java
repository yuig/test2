package ek1;

import ey.n2;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class t0 implements w0 {

    /* renamed from: a, reason: collision with root package name */
    public final n2 f59375a;

    /* renamed from: b, reason: collision with root package name */
    public final q8.c0 f59376b;

    public t0(n2 imageLoadStartParams, q8.c0 perfEventTime) {
        Intrinsics.checkNotNullParameter(imageLoadStartParams, "imageLoadStartParams");
        Intrinsics.checkNotNullParameter(perfEventTime, "perfEventTime");
        this.f59375a = imageLoadStartParams;
        this.f59376b = perfEventTime;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof t0)) {
            return false;
        }
        t0 t0Var = (t0) obj;
        return Intrinsics.d(this.f59375a, t0Var.f59375a) && Intrinsics.d(this.f59376b, t0Var.f59376b);
    }

    public final int hashCode() {
        return this.f59376b.hashCode() + (this.f59375a.hashCode() * 31);
    }

    public final String toString() {
        return "LogPinCellImageLoadStartEvent(imageLoadStartParams=" + this.f59375a + ", perfEventTime=" + this.f59376b + ")";
    }
}
