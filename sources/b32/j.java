package b32;

import c50.t4;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class j {

    /* renamed from: k, reason: collision with root package name */
    public static final t4 f21477k = new t4(11);

    /* renamed from: a, reason: collision with root package name */
    public final String f21478a;

    /* renamed from: b, reason: collision with root package name */
    public final String f21479b;

    /* renamed from: c, reason: collision with root package name */
    public final e f21480c;

    /* renamed from: d, reason: collision with root package name */
    public final Short f21481d;

    /* renamed from: e, reason: collision with root package name */
    public final List f21482e;

    /* renamed from: f, reason: collision with root package name */
    public final String f21483f;

    /* renamed from: g, reason: collision with root package name */
    public final Double f21484g;

    /* renamed from: h, reason: collision with root package name */
    public final String f21485h;

    /* renamed from: i, reason: collision with root package name */
    public final String f21486i;

    /* renamed from: j, reason: collision with root package name */
    public final String f21487j;

    public j(String str, String str2, e eVar, Short sh3, List list, String str3, Double d2, String str4, String str5, String str6) {
        this.f21478a = str;
        this.f21479b = str2;
        this.f21480c = eVar;
        this.f21481d = sh3;
        this.f21482e = list;
        this.f21483f = str3;
        this.f21484g = d2;
        this.f21485h = str4;
        this.f21486i = str5;
        this.f21487j = str6;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j)) {
            return false;
        }
        j jVar = (j) obj;
        return Intrinsics.d(this.f21478a, jVar.f21478a) && Intrinsics.d(this.f21479b, jVar.f21479b) && this.f21480c == jVar.f21480c && Intrinsics.d(this.f21481d, jVar.f21481d) && Intrinsics.d(this.f21482e, jVar.f21482e) && Intrinsics.d(this.f21483f, jVar.f21483f) && Intrinsics.d(this.f21484g, jVar.f21484g) && Intrinsics.d(this.f21485h, jVar.f21485h) && Intrinsics.d(this.f21486i, jVar.f21486i) && Intrinsics.d(null, null) && Intrinsics.d(null, null) && Intrinsics.d(this.f21487j, jVar.f21487j);
    }

    public final int hashCode() {
        String str = this.f21478a;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.f21479b;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        e eVar = this.f21480c;
        int hashCode3 = (hashCode2 + (eVar == null ? 0 : eVar.hashCode())) * 31;
        Short sh3 = this.f21481d;
        int hashCode4 = (hashCode3 + (sh3 == null ? 0 : sh3.hashCode())) * 31;
        List list = this.f21482e;
        int hashCode5 = (hashCode4 + (list == null ? 0 : list.hashCode())) * 31;
        String str3 = this.f21483f;
        int hashCode6 = (hashCode5 + (str3 == null ? 0 : str3.hashCode())) * 31;
        Double d2 = this.f21484g;
        int hashCode7 = (hashCode6 + (d2 == null ? 0 : d2.hashCode())) * 31;
        String str4 = this.f21485h;
        int hashCode8 = (hashCode7 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.f21486i;
        int hashCode9 = (hashCode8 + (str5 == null ? 0 : str5.hashCode())) * 29791;
        String str6 = this.f21487j;
        return hashCode9 + (str6 != null ? str6.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("RetailerInfo(name=");
        sb3.append(this.f21478a);
        sb3.append(", destinationURL=");
        sb3.append(this.f21479b);
        sb3.append(", platform=");
        sb3.append(this.f21480c);
        sb3.append(", index=");
        sb3.append(this.f21481d);
        sb3.append(", fulfillmentOptionsV2=");
        sb3.append(this.f21482e);
        sb3.append(", logoURL=");
        sb3.append(this.f21483f);
        sb3.append(", price=");
        sb3.append(this.f21484g);
        sb3.append(", currency=");
        sb3.append(this.f21485h);
        sb3.append(", cartingProductID=");
        sb3.append(this.f21486i);
        sb3.append(", fulfillmentOptions=null, deprecatedRetailerID=null, retailerID=");
        return a.a.p(sb3, this.f21487j, ")");
    }
}
