package ru1;

import kotlin.jvm.internal.Intrinsics;
import u50.b0;

/* loaded from: classes2.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public final u50.n f110011a;

    /* renamed from: b, reason: collision with root package name */
    public final u50.n f110012b;

    /* renamed from: c, reason: collision with root package name */
    public final u50.n f110013c;

    /* renamed from: d, reason: collision with root package name */
    public final u50.n f110014d;

    /* renamed from: e, reason: collision with root package name */
    public final u50.n f110015e;

    /* renamed from: f, reason: collision with root package name */
    public final u50.i f110016f;

    public b(b0 startPadding, b0 endPadding, b0 topPadding, b0 bottomPadding, b0 bottomMargin, u50.g background) {
        Intrinsics.checkNotNullParameter(startPadding, "startPadding");
        Intrinsics.checkNotNullParameter(endPadding, "endPadding");
        Intrinsics.checkNotNullParameter(topPadding, "topPadding");
        Intrinsics.checkNotNullParameter(bottomPadding, "bottomPadding");
        Intrinsics.checkNotNullParameter(bottomMargin, "bottomMargin");
        Intrinsics.checkNotNullParameter(background, "background");
        this.f110011a = startPadding;
        this.f110012b = endPadding;
        this.f110013c = topPadding;
        this.f110014d = bottomPadding;
        this.f110015e = bottomMargin;
        this.f110016f = background;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return Intrinsics.d(this.f110011a, bVar.f110011a) && Intrinsics.d(this.f110012b, bVar.f110012b) && Intrinsics.d(this.f110013c, bVar.f110013c) && Intrinsics.d(this.f110014d, bVar.f110014d) && Intrinsics.d(this.f110015e, bVar.f110015e) && Intrinsics.d(this.f110016f, bVar.f110016f);
    }

    public final int hashCode() {
        return this.f110016f.hashCode() + d7.g.e(this.f110015e, d7.g.e(this.f110014d, d7.g.e(this.f110013c, d7.g.e(this.f110012b, this.f110011a.hashCode() * 31, 31), 31), 31), 31);
    }

    public final String toString() {
        return "BottomNavBarTabContainerDisplayState(startPadding=" + this.f110011a + ", endPadding=" + this.f110012b + ", topPadding=" + this.f110013c + ", bottomPadding=" + this.f110014d + ", bottomMargin=" + this.f110015e + ", background=" + this.f110016f + ")";
    }
}
