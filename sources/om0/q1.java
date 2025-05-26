package om0;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class q1 implements s1 {

    /* renamed from: a, reason: collision with root package name */
    public final u50.i0 f96571a;

    public q1(u50.i0 label) {
        Intrinsics.checkNotNullParameter(label, "label");
        this.f96571a = label;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof q1) && Intrinsics.d(this.f96571a, ((q1) obj).f96571a);
    }

    public final int hashCode() {
        return this.f96571a.hashCode();
    }

    public final String toString() {
        return "CtaOverlay(label=" + this.f96571a + ")";
    }
}
