package zd1;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class y extends a0 {

    /* renamed from: a, reason: collision with root package name */
    public final String f141777a;

    /* renamed from: b, reason: collision with root package name */
    public final String f141778b;

    public y(String filterOptionId, String str) {
        Intrinsics.checkNotNullParameter(filterOptionId, "filterOptionId");
        this.f141777a = filterOptionId;
        this.f141778b = str;
    }

    @Override // zd1.a0
    /* renamed from: a */
    public final String getFilterOptionId() {
        return this.f141777a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof y)) {
            return false;
        }
        y yVar = (y) obj;
        return Intrinsics.d(this.f141777a, yVar.f141777a) && Intrinsics.d(this.f141778b, yVar.f141778b);
    }

    public final int hashCode() {
        int hashCode = this.f141777a.hashCode() * 31;
        String str = this.f141778b;
        return hashCode + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("UnifiedFilterDomainOptionApiSpec(filterOptionId=");
        sb3.append(this.f141777a);
        sb3.append(", domain=");
        return a.a.p(sb3, this.f141778b, ")");
    }
}
