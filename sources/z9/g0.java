package z9;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class g0 {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f141188a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f141189b;

    /* renamed from: c, reason: collision with root package name */
    public final int f141190c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f141191d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f141192e;

    /* renamed from: f, reason: collision with root package name */
    public final int f141193f;

    /* renamed from: g, reason: collision with root package name */
    public final int f141194g;

    /* renamed from: h, reason: collision with root package name */
    public final int f141195h;

    /* renamed from: i, reason: collision with root package name */
    public final int f141196i;

    public g0(boolean z13, boolean z14, int i13, boolean z15, boolean z16, int i14, int i15, int i16, int i17) {
        this.f141188a = z13;
        this.f141189b = z14;
        this.f141190c = i13;
        this.f141191d = z15;
        this.f141192e = z16;
        this.f141193f = i14;
        this.f141194g = i15;
        this.f141195h = i16;
        this.f141196i = i17;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof g0)) {
            return false;
        }
        g0 g0Var = (g0) obj;
        if (this.f141188a == g0Var.f141188a && this.f141189b == g0Var.f141189b && this.f141190c == g0Var.f141190c) {
            g0Var.getClass();
            if (Intrinsics.d(null, null) && this.f141191d == g0Var.f141191d && this.f141192e == g0Var.f141192e && this.f141193f == g0Var.f141193f && this.f141194g == g0Var.f141194g && this.f141195h == g0Var.f141195h && this.f141196i == g0Var.f141196i) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((((((((((((((((this.f141188a ? 1 : 0) * 31) + (this.f141189b ? 1 : 0)) * 31) + this.f141190c) * 31) + 0) * 31) + (this.f141191d ? 1 : 0)) * 31) + (this.f141192e ? 1 : 0)) * 31) + this.f141193f) * 31) + this.f141194g) * 31) + this.f141195h) * 31) + this.f141196i;
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder();
        sb3.append(g0.class.getSimpleName());
        sb3.append("(");
        if (this.f141188a) {
            sb3.append("launchSingleTop ");
        }
        if (this.f141189b) {
            sb3.append("restoreState ");
        }
        int i13 = this.f141196i;
        int i14 = this.f141195h;
        int i15 = this.f141194g;
        int i16 = this.f141193f;
        if (i16 != -1 || i15 != -1 || i14 != -1 || i13 != -1) {
            sb3.append("anim(enterAnim=0x");
            sb3.append(Integer.toHexString(i16));
            sb3.append(" exitAnim=0x");
            sb3.append(Integer.toHexString(i15));
            sb3.append(" popEnterAnim=0x");
            sb3.append(Integer.toHexString(i14));
            sb3.append(" popExitAnim=0x");
            sb3.append(Integer.toHexString(i13));
            sb3.append(")");
        }
        String sb4 = sb3.toString();
        Intrinsics.checkNotNullExpressionValue(sb4, "sb.toString()");
        return sb4;
    }
}
