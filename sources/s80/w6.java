package s80;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class w6 implements u50.o {

    /* renamed from: a, reason: collision with root package name */
    public final t80.d f111840a;

    /* renamed from: b, reason: collision with root package name */
    public final u50.i0 f111841b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f111842c;

    public w6(t80.d carousel, u50.i0 i0Var, boolean z13) {
        Intrinsics.checkNotNullParameter(carousel, "carousel");
        this.f111840a = carousel;
        this.f111841b = i0Var;
        this.f111842c = z13;
    }

    public static w6 e(w6 w6Var, t80.d carousel, u50.i0 i0Var, boolean z13, int i13) {
        if ((i13 & 1) != 0) {
            carousel = w6Var.f111840a;
        }
        if ((i13 & 2) != 0) {
            i0Var = w6Var.f111841b;
        }
        if ((i13 & 4) != 0) {
            z13 = w6Var.f111842c;
        }
        w6Var.getClass();
        Intrinsics.checkNotNullParameter(carousel, "carousel");
        return new w6(carousel, i0Var, z13);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof w6)) {
            return false;
        }
        w6 w6Var = (w6) obj;
        return Intrinsics.d(this.f111840a, w6Var.f111840a) && Intrinsics.d(this.f111841b, w6Var.f111841b) && this.f111842c == w6Var.f111842c;
    }

    public final int hashCode() {
        int hashCode = this.f111840a.f116683a.hashCode() * 31;
        u50.i0 i0Var = this.f111841b;
        return Boolean.hashCode(this.f111842c) + ((hashCode + (i0Var == null ? 0 : i0Var.hashCode())) * 31);
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("EmptyStateCarouselDisplayState(carousel=");
        sb3.append(this.f111840a);
        sb3.append(", ctaLabel=");
        sb3.append(this.f111841b);
        sb3.append(", visible=");
        return a.a.r(sb3, this.f111842c, ")");
    }
}
