package s80;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class t6 implements u50.o {

    /* renamed from: a, reason: collision with root package name */
    public final ra0.u f111805a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f111806b;

    public t6(ra0.u carousel, boolean z13) {
        Intrinsics.checkNotNullParameter(carousel, "carousel");
        this.f111805a = carousel;
        this.f111806b = z13;
    }

    public static t6 e(t6 t6Var, ra0.u carousel, boolean z13, int i13) {
        if ((i13 & 1) != 0) {
            carousel = t6Var.f111805a;
        }
        if ((i13 & 2) != 0) {
            z13 = t6Var.f111806b;
        }
        t6Var.getClass();
        Intrinsics.checkNotNullParameter(carousel, "carousel");
        return new t6(carousel, z13);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof t6)) {
            return false;
        }
        t6 t6Var = (t6) obj;
        return Intrinsics.d(this.f111805a, t6Var.f111805a) && this.f111806b == t6Var.f111806b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f111806b) + (this.f111805a.hashCode() * 31);
    }

    public final String toString() {
        return "ColorPickerDisplayState(carousel=" + this.f111805a + ", visible=" + this.f111806b + ")";
    }
}
