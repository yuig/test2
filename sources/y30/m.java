package y30;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class m implements e {

    /* renamed from: a, reason: collision with root package name */
    public final String f136756a;

    /* renamed from: b, reason: collision with root package name */
    public final l f136757b;

    public m(String __typename, l lVar) {
        Intrinsics.checkNotNullParameter(__typename, "__typename");
        this.f136756a = __typename;
        this.f136757b = lVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof m)) {
            return false;
        }
        m mVar = (m) obj;
        return Intrinsics.d(this.f136756a, mVar.f136756a) && Intrinsics.d(this.f136757b, mVar.f136757b);
    }

    public final int hashCode() {
        int hashCode = this.f136756a.hashCode() * 31;
        l lVar = this.f136757b;
        return hashCode + (lVar == null ? 0 : lVar.hashCode());
    }

    public final String toString() {
        return "V3RecommendedTodayArticlesDataConnectionContainerData(__typename=" + this.f136756a + ", connection=" + this.f136757b + ")";
    }
}
