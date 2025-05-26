package u40;

import a.cb;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class z implements u {

    /* renamed from: a, reason: collision with root package name */
    public final String f120450a;

    /* renamed from: b, reason: collision with root package name */
    public final String f120451b;

    /* renamed from: c, reason: collision with root package name */
    public final String f120452c;

    /* renamed from: d, reason: collision with root package name */
    public final String f120453d;

    /* renamed from: e, reason: collision with root package name */
    public final String f120454e;

    /* renamed from: f, reason: collision with root package name */
    public final String f120455f;

    /* renamed from: g, reason: collision with root package name */
    public final String f120456g;

    /* renamed from: h, reason: collision with root package name */
    public final Integer f120457h;

    /* renamed from: i, reason: collision with root package name */
    public final String f120458i;

    /* renamed from: j, reason: collision with root package name */
    public final String f120459j;

    /* renamed from: k, reason: collision with root package name */
    public final Boolean f120460k;

    /* renamed from: l, reason: collision with root package name */
    public final Boolean f120461l;

    /* renamed from: m, reason: collision with root package name */
    public final String f120462m;

    /* renamed from: n, reason: collision with root package name */
    public final String f120463n;

    /* renamed from: o, reason: collision with root package name */
    public final List f120464o;

    /* renamed from: p, reason: collision with root package name */
    public final y f120465p;

    /* renamed from: q, reason: collision with root package name */
    public final String f120466q;

    /* renamed from: r, reason: collision with root package name */
    public final x f120467r;

    /* renamed from: s, reason: collision with root package name */
    public final Boolean f120468s;

    public z(String __typename, String id3, String entityId, String str, String str2, String str3, String str4, Integer num, String str5, String str6, Boolean bool, Boolean bool2, String str7, String str8, List list, y yVar, String str9, x xVar, Boolean bool3) {
        Intrinsics.checkNotNullParameter(__typename, "__typename");
        Intrinsics.checkNotNullParameter(id3, "id");
        Intrinsics.checkNotNullParameter(entityId, "entityId");
        this.f120450a = __typename;
        this.f120451b = id3;
        this.f120452c = entityId;
        this.f120453d = str;
        this.f120454e = str2;
        this.f120455f = str3;
        this.f120456g = str4;
        this.f120457h = num;
        this.f120458i = str5;
        this.f120459j = str6;
        this.f120460k = bool;
        this.f120461l = bool2;
        this.f120462m = str7;
        this.f120463n = str8;
        this.f120464o = list;
        this.f120465p = yVar;
        this.f120466q = str9;
        this.f120467r = xVar;
        this.f120468s = bool3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof z)) {
            return false;
        }
        z zVar = (z) obj;
        return Intrinsics.d(this.f120450a, zVar.f120450a) && Intrinsics.d(this.f120451b, zVar.f120451b) && Intrinsics.d(this.f120452c, zVar.f120452c) && Intrinsics.d(this.f120453d, zVar.f120453d) && Intrinsics.d(this.f120454e, zVar.f120454e) && Intrinsics.d(this.f120455f, zVar.f120455f) && Intrinsics.d(this.f120456g, zVar.f120456g) && Intrinsics.d(this.f120457h, zVar.f120457h) && Intrinsics.d(this.f120458i, zVar.f120458i) && Intrinsics.d(this.f120459j, zVar.f120459j) && Intrinsics.d(this.f120460k, zVar.f120460k) && Intrinsics.d(this.f120461l, zVar.f120461l) && Intrinsics.d(this.f120462m, zVar.f120462m) && Intrinsics.d(this.f120463n, zVar.f120463n) && Intrinsics.d(this.f120464o, zVar.f120464o) && Intrinsics.d(this.f120465p, zVar.f120465p) && Intrinsics.d(this.f120466q, zVar.f120466q) && Intrinsics.d(this.f120467r, zVar.f120467r) && Intrinsics.d(this.f120468s, zVar.f120468s);
    }

    public final int hashCode() {
        int d2 = cb.d(this.f120452c, cb.d(this.f120451b, this.f120450a.hashCode() * 31, 31), 31);
        String str = this.f120453d;
        int hashCode = (d2 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f120454e;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f120455f;
        int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.f120456g;
        int hashCode4 = (hashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        Integer num = this.f120457h;
        int hashCode5 = (hashCode4 + (num == null ? 0 : num.hashCode())) * 31;
        String str5 = this.f120458i;
        int hashCode6 = (hashCode5 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.f120459j;
        int hashCode7 = (hashCode6 + (str6 == null ? 0 : str6.hashCode())) * 31;
        Boolean bool = this.f120460k;
        int hashCode8 = (hashCode7 + (bool == null ? 0 : bool.hashCode())) * 31;
        Boolean bool2 = this.f120461l;
        int hashCode9 = (hashCode8 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        String str7 = this.f120462m;
        int hashCode10 = (hashCode9 + (str7 == null ? 0 : str7.hashCode())) * 31;
        String str8 = this.f120463n;
        int hashCode11 = (hashCode10 + (str8 == null ? 0 : str8.hashCode())) * 31;
        List list = this.f120464o;
        int hashCode12 = (hashCode11 + (list == null ? 0 : list.hashCode())) * 31;
        y yVar = this.f120465p;
        int hashCode13 = (hashCode12 + (yVar == null ? 0 : yVar.hashCode())) * 31;
        String str9 = this.f120466q;
        int hashCode14 = (hashCode13 + (str9 == null ? 0 : str9.hashCode())) * 31;
        x xVar = this.f120467r;
        int hashCode15 = (hashCode14 + (xVar == null ? 0 : xVar.hashCode())) * 31;
        Boolean bool3 = this.f120468s;
        return hashCode15 + (bool3 != null ? bool3.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("UserData(__typename=");
        sb3.append(this.f120450a);
        sb3.append(", id=");
        sb3.append(this.f120451b);
        sb3.append(", entityId=");
        sb3.append(this.f120452c);
        sb3.append(", firstName=");
        sb3.append(this.f120453d);
        sb3.append(", lastName=");
        sb3.append(this.f120454e);
        sb3.append(", fullName=");
        sb3.append(this.f120455f);
        sb3.append(", username=");
        sb3.append(this.f120456g);
        sb3.append(", ageInYears=");
        sb3.append(this.f120457h);
        sb3.append(", email=");
        sb3.append(this.f120458i);
        sb3.append(", imageLargeUrl=");
        sb3.append(this.f120459j);
        sb3.append(", isPartner=");
        sb3.append(this.f120460k);
        sb3.append(", isVerifiedMerchant=");
        sb3.append(this.f120461l);
        sb3.append(", websiteUrl=");
        sb3.append(this.f120462m);
        sb3.append(", about=");
        sb3.append(this.f120463n);
        sb3.append(", pronouns=");
        sb3.append(this.f120464o);
        sb3.append(", verifiedIdentity=");
        sb3.append(this.f120465p);
        sb3.append(", country=");
        sb3.append(this.f120466q);
        sb3.append(", bizPartner=");
        sb3.append(this.f120467r);
        sb3.append(", showAllPins=");
        return a.c.h(sb3, this.f120468s, ")");
    }
}
