package l71;

import kotlin.jvm.internal.Intrinsics;
import lh0.f3;

/* loaded from: classes5.dex */
public final class v {

    /* renamed from: a, reason: collision with root package name */
    public final f3 f81971a = null;

    /* renamed from: b, reason: collision with root package name */
    public final int f81972b = Integer.MAX_VALUE;

    /* renamed from: c, reason: collision with root package name */
    public final int f81973c = Integer.MAX_VALUE;

    /* renamed from: d, reason: collision with root package name */
    public final int f81974d = Integer.MAX_VALUE;

    /* renamed from: e, reason: collision with root package name */
    public final int f81975e = Integer.MAX_VALUE;

    /* renamed from: f, reason: collision with root package name */
    public int f81976f;

    /* renamed from: g, reason: collision with root package name */
    public int f81977g;

    /* renamed from: h, reason: collision with root package name */
    public int f81978h;

    /* renamed from: i, reason: collision with root package name */
    public int f81979i;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof v)) {
            return false;
        }
        v vVar = (v) obj;
        return Intrinsics.d(this.f81971a, vVar.f81971a) && this.f81972b == vVar.f81972b && this.f81973c == vVar.f81973c && this.f81974d == vVar.f81974d && this.f81975e == vVar.f81975e;
    }

    public final int hashCode() {
        f3 f3Var = this.f81971a;
        return Integer.hashCode(this.f81975e) + ep.b.b(this.f81974d, ep.b.b(this.f81973c, ep.b.b(this.f81972b, (f3Var == null ? 0 : f3Var.hashCode()) * 31, 31), 31), 31);
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("TypeaheadItemLimits(searchLibraryExperiments=");
        sb3.append(this.f81971a);
        sb3.append(", queryCountLimit=");
        sb3.append(this.f81972b);
        sb3.append(", peopleCountLimit=");
        sb3.append(this.f81973c);
        sb3.append(", boardsCountLimit=");
        sb3.append(this.f81974d);
        sb3.append(", itemsCountLimit=");
        return a.a.n(sb3, this.f81975e, ")");
    }
}
