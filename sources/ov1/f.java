package ov1;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class f {

    /* renamed from: a, reason: collision with root package name */
    public final int f97725a;

    /* renamed from: b, reason: collision with root package name */
    public final int f97726b;

    /* renamed from: c, reason: collision with root package name */
    public final Integer f97727c;

    public f(int i13, Integer num, int i14) {
        i13 = (i14 & 1) != 0 ? nv1.d.one_bar_container : i13;
        int i15 = nv1.d.search_header_p_recycler_view;
        num = (i14 & 4) != 0 ? null : num;
        this.f97725a = i13;
        this.f97726b = i15;
        this.f97727c = num;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f)) {
            return false;
        }
        f fVar = (f) obj;
        return this.f97725a == fVar.f97725a && this.f97726b == fVar.f97726b && Intrinsics.d(this.f97727c, fVar.f97727c);
    }

    public final int hashCode() {
        int b13 = ep.b.b(this.f97726b, Integer.hashCode(this.f97725a) * 31, 31);
        Integer num = this.f97727c;
        return b13 + (num == null ? 0 : num.hashCode());
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("OneBarLayoutResources(oneBarContainerId=");
        sb3.append(this.f97725a);
        sb3.append(", oneBarRecyclerId=");
        sb3.append(this.f97726b);
        sb3.append(", emptyStateContainerId=");
        return a.c.i(sb3, this.f97727c, ")");
    }
}
