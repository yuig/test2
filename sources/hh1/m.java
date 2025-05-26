package hh1;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class m {

    /* renamed from: a, reason: collision with root package name */
    public final ve0.d f69187a;

    /* renamed from: b, reason: collision with root package name */
    public final int f69188b;

    /* renamed from: c, reason: collision with root package name */
    public final int f69189c;

    /* renamed from: d, reason: collision with root package name */
    public final int f69190d;

    /* renamed from: e, reason: collision with root package name */
    public final int f69191e;

    public m(ve0.d config, int i13, int i14, int i15, int i16) {
        Intrinsics.checkNotNullParameter(config, "config");
        this.f69187a = config;
        this.f69188b = i13;
        this.f69189c = i14;
        this.f69190d = i15;
        this.f69191e = i16;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof m)) {
            return false;
        }
        m mVar = (m) obj;
        return Intrinsics.d(this.f69187a, mVar.f69187a) && this.f69188b == mVar.f69188b && this.f69189c == mVar.f69189c && this.f69190d == mVar.f69190d && this.f69191e == mVar.f69191e;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f69191e) + ep.b.b(this.f69190d, ep.b.b(this.f69189c, ep.b.b(this.f69188b, this.f69187a.hashCode() * 31, 31), 31), 31);
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("TooltipBubbleSpec(config=");
        sb3.append(this.f69187a);
        sb3.append(", topPadding=");
        sb3.append(this.f69188b);
        sb3.append(", bottomPadding=");
        sb3.append(this.f69189c);
        sb3.append(", startPadding=");
        sb3.append(this.f69190d);
        sb3.append(", endPadding=");
        return a.a.n(sb3, this.f69191e, ")");
    }
}
