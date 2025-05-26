package x40;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class oi {

    /* renamed from: a, reason: collision with root package name */
    public final String f133000a;

    /* renamed from: b, reason: collision with root package name */
    public final String f133001b;

    /* renamed from: c, reason: collision with root package name */
    public final Boolean f133002c;

    /* renamed from: d, reason: collision with root package name */
    public final String f133003d;

    /* renamed from: e, reason: collision with root package name */
    public final String f133004e;

    /* renamed from: f, reason: collision with root package name */
    public final String f133005f;

    /* renamed from: g, reason: collision with root package name */
    public final String f133006g;

    /* renamed from: h, reason: collision with root package name */
    public final mi f133007h;

    /* renamed from: i, reason: collision with root package name */
    public final Boolean f133008i;

    /* renamed from: j, reason: collision with root package name */
    public final ni f133009j;

    /* renamed from: k, reason: collision with root package name */
    public final li f133010k;

    public oi(String __typename, String id3, Boolean bool, String entityId, String str, String str2, String str3, mi miVar, Boolean bool2, ni niVar, li liVar) {
        Intrinsics.checkNotNullParameter(__typename, "__typename");
        Intrinsics.checkNotNullParameter(id3, "id");
        Intrinsics.checkNotNullParameter(entityId, "entityId");
        this.f133000a = __typename;
        this.f133001b = id3;
        this.f133002c = bool;
        this.f133003d = entityId;
        this.f133004e = str;
        this.f133005f = str2;
        this.f133006g = str3;
        this.f133007h = miVar;
        this.f133008i = bool2;
        this.f133009j = niVar;
        this.f133010k = liVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof oi)) {
            return false;
        }
        oi oiVar = (oi) obj;
        return Intrinsics.d(this.f133000a, oiVar.f133000a) && Intrinsics.d(this.f133001b, oiVar.f133001b) && Intrinsics.d(this.f133002c, oiVar.f133002c) && Intrinsics.d(this.f133003d, oiVar.f133003d) && Intrinsics.d(this.f133004e, oiVar.f133004e) && Intrinsics.d(this.f133005f, oiVar.f133005f) && Intrinsics.d(this.f133006g, oiVar.f133006g) && Intrinsics.d(this.f133007h, oiVar.f133007h) && Intrinsics.d(this.f133008i, oiVar.f133008i) && Intrinsics.d(this.f133009j, oiVar.f133009j) && Intrinsics.d(this.f133010k, oiVar.f133010k);
    }

    public final int hashCode() {
        int d2 = a.cb.d(this.f133001b, this.f133000a.hashCode() * 31, 31);
        Boolean bool = this.f133002c;
        int d13 = a.cb.d(this.f133003d, (d2 + (bool == null ? 0 : bool.hashCode())) * 31, 31);
        String str = this.f133004e;
        int hashCode = (d13 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f133005f;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f133006g;
        int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        mi miVar = this.f133007h;
        int hashCode4 = (hashCode3 + (miVar == null ? 0 : miVar.hashCode())) * 31;
        Boolean bool2 = this.f133008i;
        int hashCode5 = (hashCode4 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        ni niVar = this.f133009j;
        int hashCode6 = (hashCode5 + (niVar == null ? 0 : niVar.hashCode())) * 31;
        li liVar = this.f133010k;
        return hashCode6 + (liVar != null ? liVar.hashCode() : 0);
    }

    public final String toString() {
        return "BizPartner(__typename=" + this.f133000a + ", id=" + this.f133001b + ", enableProfileMessage=" + this.f133002c + ", entityId=" + this.f133003d + ", businessName=" + this.f133004e + ", contactPhone=" + this.f133005f + ", contactEmail=" + this.f133006g + ", contactPhoneCountry=" + this.f133007h + ", enableProfileAddress=" + this.f133008i + ", profilePlace=" + this.f133009j + ", contactDetails=" + this.f133010k + ")";
    }
}
