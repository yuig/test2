package zd1;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class t {

    /* renamed from: a, reason: collision with root package name */
    public final String f141764a;

    /* renamed from: b, reason: collision with root package name */
    public final u f141765b;

    public t(String label, u sortType) {
        Intrinsics.checkNotNullParameter(label, "label");
        Intrinsics.checkNotNullParameter(sortType, "sortType");
        this.f141764a = label;
        this.f141765b = sortType;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof t)) {
            return false;
        }
        t tVar = (t) obj;
        return Intrinsics.d(this.f141764a, tVar.f141764a) && this.f141765b == tVar.f141765b;
    }

    public final int hashCode() {
        return this.f141765b.hashCode() + (this.f141764a.hashCode() * 31);
    }

    public final String toString() {
        return "SortFilterItem(label=" + this.f141764a + ", sortType=" + this.f141765b + ")";
    }
}
