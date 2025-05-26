package u40;

import a.cb;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class j {

    /* renamed from: a, reason: collision with root package name */
    public final String f120340a;

    /* renamed from: b, reason: collision with root package name */
    public final String f120341b;

    /* renamed from: c, reason: collision with root package name */
    public final Boolean f120342c;

    /* renamed from: d, reason: collision with root package name */
    public final String f120343d;

    /* renamed from: e, reason: collision with root package name */
    public final String f120344e;

    /* renamed from: f, reason: collision with root package name */
    public final String f120345f;

    /* renamed from: g, reason: collision with root package name */
    public final String f120346g;

    /* renamed from: h, reason: collision with root package name */
    public final i f120347h;

    public j(String __typename, String id3, Boolean bool, String entityId, String str, String str2, String str3, i iVar) {
        Intrinsics.checkNotNullParameter(__typename, "__typename");
        Intrinsics.checkNotNullParameter(id3, "id");
        Intrinsics.checkNotNullParameter(entityId, "entityId");
        this.f120340a = __typename;
        this.f120341b = id3;
        this.f120342c = bool;
        this.f120343d = entityId;
        this.f120344e = str;
        this.f120345f = str2;
        this.f120346g = str3;
        this.f120347h = iVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j)) {
            return false;
        }
        j jVar = (j) obj;
        return Intrinsics.d(this.f120340a, jVar.f120340a) && Intrinsics.d(this.f120341b, jVar.f120341b) && Intrinsics.d(this.f120342c, jVar.f120342c) && Intrinsics.d(this.f120343d, jVar.f120343d) && Intrinsics.d(this.f120344e, jVar.f120344e) && Intrinsics.d(this.f120345f, jVar.f120345f) && Intrinsics.d(this.f120346g, jVar.f120346g) && Intrinsics.d(this.f120347h, jVar.f120347h);
    }

    public final int hashCode() {
        int d2 = cb.d(this.f120341b, this.f120340a.hashCode() * 31, 31);
        Boolean bool = this.f120342c;
        int d13 = cb.d(this.f120343d, (d2 + (bool == null ? 0 : bool.hashCode())) * 31, 31);
        String str = this.f120344e;
        int hashCode = (d13 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f120345f;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f120346g;
        int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        i iVar = this.f120347h;
        return hashCode3 + (iVar != null ? iVar.hashCode() : 0);
    }

    public final String toString() {
        return "BizPartner(__typename=" + this.f120340a + ", id=" + this.f120341b + ", enableProfileMessage=" + this.f120342c + ", entityId=" + this.f120343d + ", businessName=" + this.f120344e + ", contactPhone=" + this.f120345f + ", contactEmail=" + this.f120346g + ", contactPhoneCountry=" + this.f120347h + ")";
    }
}
