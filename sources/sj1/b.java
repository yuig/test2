package sj1;

import jj1.d;
import kotlin.jvm.internal.Intrinsics;
import oi1.c;
import pj1.f;
import pj1.l;

/* loaded from: classes2.dex */
public final class b implements d, l {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f113024a;

    /* renamed from: b, reason: collision with root package name */
    public final f f113025b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f113026c;

    public b(f indicatorDisplayState, boolean z13) {
        Intrinsics.checkNotNullParameter(indicatorDisplayState, "indicatorDisplayState");
        this.f113024a = false;
        this.f113025b = indicatorDisplayState;
        this.f113026c = z13;
    }

    @Override // pj1.l
    public final c e() {
        return oi1.l.f95312a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return this.f113024a == bVar.f113024a && Intrinsics.d(this.f113025b, bVar.f113025b) && this.f113026c == bVar.f113026c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f113026c) + ((this.f113025b.hashCode() + (Boolean.hashCode(this.f113024a) * 31)) * 31);
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("DirectToSiteIndicatorDisplayState(isVREnabled=");
        sb3.append(this.f113024a);
        sb3.append(", indicatorDisplayState=");
        sb3.append(this.f113025b);
        sb3.append(", isAnimated=");
        return a.a.r(sb3, this.f113026c, ")");
    }
}
