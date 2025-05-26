package y30;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class n implements d {

    /* renamed from: d, reason: collision with root package name */
    public final String f136758d;

    /* renamed from: e, reason: collision with root package name */
    public final e f136759e;

    public n(String __typename, e eVar) {
        Intrinsics.checkNotNullParameter(__typename, "__typename");
        this.f136758d = __typename;
        this.f136759e = eVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof n)) {
            return false;
        }
        n nVar = (n) obj;
        return Intrinsics.d(this.f136758d, nVar.f136758d) && Intrinsics.d(this.f136759e, nVar.f136759e);
    }

    public final int hashCode() {
        int hashCode = this.f136758d.hashCode() * 31;
        e eVar = this.f136759e;
        return hashCode + (eVar == null ? 0 : eVar.hashCode());
    }

    public final String toString() {
        return "V3RecommendedTodayArticlesV3RecommendedTodayArticlesQuery(__typename=" + this.f136758d + ", data=" + this.f136759e + ")";
    }
}
