package ot1;

import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class g0 {

    /* renamed from: a, reason: collision with root package name */
    public final int f97573a;

    /* renamed from: b, reason: collision with root package name */
    public final int f97574b;

    /* renamed from: c, reason: collision with root package name */
    public final ArrayList f97575c;

    /* renamed from: d, reason: collision with root package name */
    public final int f97576d;

    /* renamed from: e, reason: collision with root package name */
    public final int f97577e;

    /* renamed from: f, reason: collision with root package name */
    public final int f97578f;

    /* renamed from: g, reason: collision with root package name */
    public final int f97579g;

    public g0(int i13, int i14, ArrayList cpbInfos, int i15, int i16, int i17, int i18) {
        Intrinsics.checkNotNullParameter(cpbInfos, "cpbInfos");
        this.f97573a = i13;
        this.f97574b = i14;
        this.f97575c = cpbInfos;
        this.f97576d = i15;
        this.f97577e = i16;
        this.f97578f = i17;
        this.f97579g = i18;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g0)) {
            return false;
        }
        g0 g0Var = (g0) obj;
        return this.f97573a == g0Var.f97573a && this.f97574b == g0Var.f97574b && Intrinsics.d(this.f97575c, g0Var.f97575c) && this.f97576d == g0Var.f97576d && this.f97577e == g0Var.f97577e && this.f97578f == g0Var.f97578f && this.f97579g == g0Var.f97579g;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f97579g) + ep.b.b(this.f97578f, ep.b.b(this.f97577e, ep.b.b(this.f97576d, (this.f97575c.hashCode() + ep.b.b(this.f97574b, Integer.hashCode(this.f97573a) * 31, 31)) * 31, 31), 31), 31);
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("HrdParameters(bitRateScale=");
        sb3.append(this.f97573a);
        sb3.append(", cpbSizeScale=");
        sb3.append(this.f97574b);
        sb3.append(", cpbInfos=");
        sb3.append(this.f97575c);
        sb3.append(", initialCpbRemovalDelayLength=");
        sb3.append(this.f97576d);
        sb3.append(", cpbRemovalDelayLength=");
        sb3.append(this.f97577e);
        sb3.append(", dpbOutputDelayLength=");
        sb3.append(this.f97578f);
        sb3.append(", timeOffsetLength=");
        return a.a.n(sb3, this.f97579g, ")");
    }
}
