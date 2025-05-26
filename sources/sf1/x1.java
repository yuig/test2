package sf1;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class x1 {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f112791a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f112792b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f112793c;

    /* renamed from: d, reason: collision with root package name */
    public final int f112794d;

    /* renamed from: e, reason: collision with root package name */
    public final w1 f112795e;

    /* renamed from: f, reason: collision with root package name */
    public final int f112796f;

    /* renamed from: g, reason: collision with root package name */
    public final kh2.g0 f112797g;

    public x1(boolean z13, boolean z14, boolean z15, int i13, w1 logging, int i14, kh2.g0 controls) {
        Intrinsics.checkNotNullParameter(logging, "logging");
        Intrinsics.checkNotNullParameter(controls, "controls");
        this.f112791a = z13;
        this.f112792b = z14;
        this.f112793c = z15;
        this.f112794d = i13;
        this.f112795e = logging;
        this.f112796f = i14;
        this.f112797g = controls;
    }

    public static x1 a(x1 x1Var) {
        boolean z13 = x1Var.f112791a;
        boolean z14 = x1Var.f112792b;
        w1 logging = x1Var.f112795e;
        int i13 = x1Var.f112796f;
        kh2.g0 controls = x1Var.f112797g;
        x1Var.getClass();
        Intrinsics.checkNotNullParameter(logging, "logging");
        Intrinsics.checkNotNullParameter(controls, "controls");
        return new x1(z13, z14, false, 3, logging, i13, controls);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof x1)) {
            return false;
        }
        x1 x1Var = (x1) obj;
        return this.f112791a == x1Var.f112791a && this.f112792b == x1Var.f112792b && this.f112793c == x1Var.f112793c && this.f112794d == x1Var.f112794d && Intrinsics.d(this.f112795e, x1Var.f112795e) && this.f112796f == x1Var.f112796f && Intrinsics.d(this.f112797g, x1Var.f112797g);
    }

    public final int hashCode() {
        return this.f112797g.hashCode() + ep.b.b(this.f112796f, (this.f112795e.hashCode() + ep.b.b(this.f112794d, ep.b.e(this.f112793c, ep.b.e(this.f112792b, Boolean.hashCode(this.f112791a) * 31, 31), 31), 31)) * 31, 31);
    }

    public final String toString() {
        return "VideoViewModel(mute=" + this.f112791a + ", loop=" + this.f112792b + ", resetPlayer=" + this.f112793c + ", resizeMode=" + this.f112794d + ", logging=" + this.f112795e + ", layoutResId=" + this.f112796f + ", controls=" + this.f112797g + ")";
    }
}
