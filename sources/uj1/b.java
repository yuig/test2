package uj1;

import jj1.d;
import kotlin.jvm.internal.Intrinsics;
import oi1.c;
import oi1.n;
import pj1.f;
import pj1.l;

/* loaded from: classes2.dex */
public final class b implements d, l {

    /* renamed from: a, reason: collision with root package name */
    public final f f122332a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f122333b;

    /* renamed from: c, reason: collision with root package name */
    public final int f122334c;

    /* renamed from: d, reason: collision with root package name */
    public final int f122335d;

    /* renamed from: e, reason: collision with root package name */
    public final Integer f122336e;

    public b(f indicatorDisplayState, boolean z13, int i13, int i14, Integer num) {
        Intrinsics.checkNotNullParameter(indicatorDisplayState, "indicatorDisplayState");
        this.f122332a = indicatorDisplayState;
        this.f122333b = z13;
        this.f122334c = i13;
        this.f122335d = i14;
        this.f122336e = num;
    }

    @Override // pj1.l
    public final c e() {
        return n.f95314a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return Intrinsics.d(this.f122332a, bVar.f122332a) && this.f122333b == bVar.f122333b && this.f122334c == bVar.f122334c && this.f122335d == bVar.f122335d && Intrinsics.d(this.f122336e, bVar.f122336e);
    }

    public final int hashCode() {
        int b13 = ep.b.b(this.f122335d, ep.b.b(this.f122334c, ep.b.e(this.f122333b, this.f122332a.hashCode() * 31, 31), 31), 31);
        Integer num = this.f122336e;
        return b13 + (num == null ? 0 : num.hashCode());
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("FullscreenIndicatorDisplayState(indicatorDisplayState=");
        sb3.append(this.f122332a);
        sb3.append(", isSecondSlot=");
        sb3.append(this.f122333b);
        sb3.append(", iconOffsetDimen=");
        sb3.append(this.f122334c);
        sb3.append(", tappableRectSizeDimen=");
        sb3.append(this.f122335d);
        sb3.append(", margin=");
        return a.c.i(sb3, this.f122336e, ")");
    }
}
