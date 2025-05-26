package qj1;

import jj1.d;
import kotlin.jvm.internal.Intrinsics;
import oi1.c;
import pj1.f;
import pj1.l;

/* loaded from: classes2.dex */
public final class b implements d, l {

    /* renamed from: a, reason: collision with root package name */
    public final f f104021a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f104022b;

    /* renamed from: c, reason: collision with root package name */
    public final int f104023c;

    /* renamed from: d, reason: collision with root package name */
    public final int f104024d;

    /* renamed from: e, reason: collision with root package name */
    public final Integer f104025e;

    public b(f indicatorDisplayState, boolean z13, int i13, int i14, Integer num) {
        Intrinsics.checkNotNullParameter(indicatorDisplayState, "indicatorDisplayState");
        this.f104021a = indicatorDisplayState;
        this.f104022b = z13;
        this.f104023c = i13;
        this.f104024d = i14;
        this.f104025e = num;
    }

    public static b f(b bVar, f fVar, boolean z13, int i13) {
        if ((i13 & 1) != 0) {
            fVar = bVar.f104021a;
        }
        f indicatorDisplayState = fVar;
        if ((i13 & 2) != 0) {
            z13 = bVar.f104022b;
        }
        int i14 = bVar.f104023c;
        int i15 = bVar.f104024d;
        Integer num = bVar.f104025e;
        bVar.getClass();
        Intrinsics.checkNotNullParameter(indicatorDisplayState, "indicatorDisplayState");
        return new b(indicatorDisplayState, z13, i14, i15, num);
    }

    @Override // pj1.l
    public final c e() {
        return oi1.f.f95306a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return Intrinsics.d(this.f104021a, bVar.f104021a) && this.f104022b == bVar.f104022b && this.f104023c == bVar.f104023c && this.f104024d == bVar.f104024d && Intrinsics.d(this.f104025e, bVar.f104025e);
    }

    public final f g() {
        return this.f104021a;
    }

    public final int hashCode() {
        int b13 = ep.b.b(this.f104024d, ep.b.b(this.f104023c, ep.b.e(this.f104022b, this.f104021a.hashCode() * 31, 31), 31), 31);
        Integer num = this.f104025e;
        return b13 + (num == null ? 0 : num.hashCode());
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("AudioIndicatorDisplayState(indicatorDisplayState=");
        sb3.append(this.f104021a);
        sb3.append(", isHidden=");
        sb3.append(this.f104022b);
        sb3.append(", iconOffsetDimen=");
        sb3.append(this.f104023c);
        sb3.append(", tappableRectSizeDimen=");
        sb3.append(this.f104024d);
        sb3.append(", margin=");
        return a.c.i(sb3, this.f104025e, ")");
    }
}
