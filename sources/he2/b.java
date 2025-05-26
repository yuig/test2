package he2;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public final ke2.d f68964a;

    /* renamed from: b, reason: collision with root package name */
    public final ee2.e f68965b;

    public b(ke2.d dVar, ee2.e eVar) {
        this.f68964a = dVar;
        this.f68965b = eVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return Intrinsics.d(this.f68964a, bVar.f68964a) && Intrinsics.d(this.f68965b, bVar.f68965b);
    }

    public final int hashCode() {
        ke2.d dVar = this.f68964a;
        int hashCode = (dVar == null ? 0 : dVar.hashCode()) * 31;
        ee2.e eVar = this.f68965b;
        return hashCode + (eVar != null ? eVar.hashCode() : 0);
    }

    public final String toString() {
        return "ItemLink(xrItem=" + this.f68964a + ", legacyItem=" + this.f68965b + ')';
    }
}
