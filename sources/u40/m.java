package u40;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class m implements f {

    /* renamed from: a, reason: collision with root package name */
    public final String f120385a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f120386b;

    /* renamed from: c, reason: collision with root package name */
    public final g f120387c;

    public m(String __typename, Object obj, g gVar) {
        Intrinsics.checkNotNullParameter(__typename, "__typename");
        this.f120385a = __typename;
        this.f120386b = obj;
        this.f120387c = gVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof m)) {
            return false;
        }
        m mVar = (m) obj;
        return Intrinsics.d(this.f120385a, mVar.f120385a) && Intrinsics.d(this.f120386b, mVar.f120386b) && Intrinsics.d(this.f120387c, mVar.f120387c);
    }

    public final int hashCode() {
        int hashCode = this.f120385a.hashCode() * 31;
        Object obj = this.f120386b;
        int hashCode2 = (hashCode + (obj == null ? 0 : obj.hashCode())) * 31;
        g gVar = this.f120387c;
        return hashCode2 + (gVar != null ? gVar.hashCode() : 0);
    }

    public final String toString() {
        return "V3UsersMeViewerV3UsersMeViewerResponse(__typename=" + this.f120385a + ", commerceEnvConfig=" + this.f120386b + ", data=" + this.f120387c + ")";
    }
}
