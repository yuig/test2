package zd1;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class b0 extends a0 {

    /* renamed from: a, reason: collision with root package name */
    public final String f141688a;

    /* renamed from: b, reason: collision with root package name */
    public final t32.i f141689b;

    public b0(String filterOptionId, t32.i searchType) {
        Intrinsics.checkNotNullParameter(filterOptionId, "filterOptionId");
        Intrinsics.checkNotNullParameter(searchType, "searchType");
        this.f141688a = filterOptionId;
        this.f141689b = searchType;
    }

    @Override // zd1.a0
    /* renamed from: a */
    public final String getFilterOptionId() {
        return this.f141688a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b0)) {
            return false;
        }
        b0 b0Var = (b0) obj;
        return Intrinsics.d(this.f141688a, b0Var.f141688a) && this.f141689b == b0Var.f141689b;
    }

    public final int hashCode() {
        return this.f141689b.hashCode() + (this.f141688a.hashCode() * 31);
    }

    public final String toString() {
        return "UnifiedFilterSearchOptionApiSpec(filterOptionId=" + this.f141688a + ", searchType=" + this.f141689b + ")";
    }
}
