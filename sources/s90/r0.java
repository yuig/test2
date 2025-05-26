package s90;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class r0 implements u50.o {

    /* renamed from: a, reason: collision with root package name */
    public final u50.i0 f112015a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f112016b;

    public r0(u50.i0 label, boolean z13) {
        Intrinsics.checkNotNullParameter(label, "label");
        this.f112015a = label;
        this.f112016b = z13;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof r0)) {
            return false;
        }
        r0 r0Var = (r0) obj;
        return Intrinsics.d(this.f112015a, r0Var.f112015a) && this.f112016b == r0Var.f112016b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f112016b) + (this.f112015a.hashCode() * 31);
    }

    public final String toString() {
        return "CutoutSearchStatusBarState(label=" + this.f112015a + ", isPillVisible=" + this.f112016b + ")";
    }

    public /* synthetic */ r0() {
        this(u50.h0.f120562a, false);
    }
}
