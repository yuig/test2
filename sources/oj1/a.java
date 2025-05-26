package oj1;

import d7.g;
import eo1.c;
import jj1.d;
import kotlin.jvm.internal.Intrinsics;
import m60.x0;
import u50.k0;
import u50.n;

/* loaded from: classes2.dex */
public final class a implements d {

    /* renamed from: a, reason: collision with root package name */
    public final k0 f95393a;

    /* renamed from: b, reason: collision with root package name */
    public final n f95394b;

    /* renamed from: c, reason: collision with root package name */
    public final int f95395c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f95396d;

    public a(k0 description, n topRadius, int i13, boolean z13) {
        Intrinsics.checkNotNullParameter(description, "description");
        Intrinsics.checkNotNullParameter(topRadius, "topRadius");
        this.f95393a = description;
        this.f95394b = topRadius;
        this.f95395c = i13;
        this.f95396d = z13;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return Intrinsics.d(this.f95393a, aVar.f95393a) && Intrinsics.d(this.f95394b, aVar.f95394b) && this.f95395c == aVar.f95395c && this.f95396d == aVar.f95396d;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f95396d) + ep.b.b(this.f95395c, g.e(this.f95394b, this.f95393a.hashCode() * 31, 31), 31);
    }

    public final String toString() {
        return "EndFrameDisplayState(description=" + this.f95393a + ", topRadius=" + this.f95394b + ", bottomRadius=" + this.f95395c + ", showEndMessage=" + this.f95396d + ")";
    }

    public /* synthetic */ a(n nVar) {
        this(new k0(x0.watch_again), nVar, c.lego_corner_radius_small_to_medium, false);
    }
}
