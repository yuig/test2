package r40;

import a.cb;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class f {

    /* renamed from: a, reason: collision with root package name */
    public final String f106137a;

    /* renamed from: b, reason: collision with root package name */
    public final String f106138b;

    /* renamed from: c, reason: collision with root package name */
    public final Boolean f106139c;

    /* renamed from: d, reason: collision with root package name */
    public final String f106140d;

    /* renamed from: e, reason: collision with root package name */
    public final String f106141e;

    /* renamed from: f, reason: collision with root package name */
    public final String f106142f;

    /* renamed from: g, reason: collision with root package name */
    public final String f106143g;

    /* renamed from: h, reason: collision with root package name */
    public final e f106144h;

    public f(String __typename, String id3, Boolean bool, String entityId, String str, String str2, String str3, e eVar) {
        Intrinsics.checkNotNullParameter(__typename, "__typename");
        Intrinsics.checkNotNullParameter(id3, "id");
        Intrinsics.checkNotNullParameter(entityId, "entityId");
        this.f106137a = __typename;
        this.f106138b = id3;
        this.f106139c = bool;
        this.f106140d = entityId;
        this.f106141e = str;
        this.f106142f = str2;
        this.f106143g = str3;
        this.f106144h = eVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f)) {
            return false;
        }
        f fVar = (f) obj;
        return Intrinsics.d(this.f106137a, fVar.f106137a) && Intrinsics.d(this.f106138b, fVar.f106138b) && Intrinsics.d(this.f106139c, fVar.f106139c) && Intrinsics.d(this.f106140d, fVar.f106140d) && Intrinsics.d(this.f106141e, fVar.f106141e) && Intrinsics.d(this.f106142f, fVar.f106142f) && Intrinsics.d(this.f106143g, fVar.f106143g) && Intrinsics.d(this.f106144h, fVar.f106144h);
    }

    public final int hashCode() {
        int d2 = cb.d(this.f106138b, this.f106137a.hashCode() * 31, 31);
        Boolean bool = this.f106139c;
        int d13 = cb.d(this.f106140d, (d2 + (bool == null ? 0 : bool.hashCode())) * 31, 31);
        String str = this.f106141e;
        int hashCode = (d13 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f106142f;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f106143g;
        int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        e eVar = this.f106144h;
        return hashCode3 + (eVar != null ? eVar.hashCode() : 0);
    }

    public final String toString() {
        return "BizPartner(__typename=" + this.f106137a + ", id=" + this.f106138b + ", enableProfileMessage=" + this.f106139c + ", entityId=" + this.f106140d + ", businessName=" + this.f106141e + ", contactPhone=" + this.f106142f + ", contactEmail=" + this.f106143g + ", contactPhoneCountry=" + this.f106144h + ")";
    }
}
