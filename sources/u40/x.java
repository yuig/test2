package u40;

import a.cb;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class x {

    /* renamed from: a, reason: collision with root package name */
    public final String f120433a;

    /* renamed from: b, reason: collision with root package name */
    public final String f120434b;

    /* renamed from: c, reason: collision with root package name */
    public final Boolean f120435c;

    /* renamed from: d, reason: collision with root package name */
    public final String f120436d;

    /* renamed from: e, reason: collision with root package name */
    public final String f120437e;

    /* renamed from: f, reason: collision with root package name */
    public final String f120438f;

    /* renamed from: g, reason: collision with root package name */
    public final String f120439g;

    /* renamed from: h, reason: collision with root package name */
    public final w f120440h;

    public x(String __typename, String id3, Boolean bool, String entityId, String str, String str2, String str3, w wVar) {
        Intrinsics.checkNotNullParameter(__typename, "__typename");
        Intrinsics.checkNotNullParameter(id3, "id");
        Intrinsics.checkNotNullParameter(entityId, "entityId");
        this.f120433a = __typename;
        this.f120434b = id3;
        this.f120435c = bool;
        this.f120436d = entityId;
        this.f120437e = str;
        this.f120438f = str2;
        this.f120439g = str3;
        this.f120440h = wVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof x)) {
            return false;
        }
        x xVar = (x) obj;
        return Intrinsics.d(this.f120433a, xVar.f120433a) && Intrinsics.d(this.f120434b, xVar.f120434b) && Intrinsics.d(this.f120435c, xVar.f120435c) && Intrinsics.d(this.f120436d, xVar.f120436d) && Intrinsics.d(this.f120437e, xVar.f120437e) && Intrinsics.d(this.f120438f, xVar.f120438f) && Intrinsics.d(this.f120439g, xVar.f120439g) && Intrinsics.d(this.f120440h, xVar.f120440h);
    }

    public final int hashCode() {
        int d2 = cb.d(this.f120434b, this.f120433a.hashCode() * 31, 31);
        Boolean bool = this.f120435c;
        int d13 = cb.d(this.f120436d, (d2 + (bool == null ? 0 : bool.hashCode())) * 31, 31);
        String str = this.f120437e;
        int hashCode = (d13 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f120438f;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f120439g;
        int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        w wVar = this.f120440h;
        return hashCode3 + (wVar != null ? wVar.hashCode() : 0);
    }

    public final String toString() {
        return "BizPartner(__typename=" + this.f120433a + ", id=" + this.f120434b + ", enableProfileMessage=" + this.f120435c + ", entityId=" + this.f120436d + ", businessName=" + this.f120437e + ", contactPhone=" + this.f120438f + ", contactEmail=" + this.f120439g + ", contactPhoneCountry=" + this.f120440h + ")";
    }
}
