package r40;

import a.cb;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class h {

    /* renamed from: a, reason: collision with root package name */
    public final String f106148a;

    /* renamed from: b, reason: collision with root package name */
    public final String f106149b;

    /* renamed from: c, reason: collision with root package name */
    public final String f106150c;

    /* renamed from: d, reason: collision with root package name */
    public final String f106151d;

    /* renamed from: e, reason: collision with root package name */
    public final String f106152e;

    /* renamed from: f, reason: collision with root package name */
    public final String f106153f;

    /* renamed from: g, reason: collision with root package name */
    public final String f106154g;

    /* renamed from: h, reason: collision with root package name */
    public final Integer f106155h;

    /* renamed from: i, reason: collision with root package name */
    public final String f106156i;

    /* renamed from: j, reason: collision with root package name */
    public final String f106157j;

    /* renamed from: k, reason: collision with root package name */
    public final Boolean f106158k;

    /* renamed from: l, reason: collision with root package name */
    public final Boolean f106159l;

    /* renamed from: m, reason: collision with root package name */
    public final String f106160m;

    /* renamed from: n, reason: collision with root package name */
    public final String f106161n;

    /* renamed from: o, reason: collision with root package name */
    public final List f106162o;

    /* renamed from: p, reason: collision with root package name */
    public final g f106163p;

    /* renamed from: q, reason: collision with root package name */
    public final String f106164q;

    /* renamed from: r, reason: collision with root package name */
    public final f f106165r;

    /* renamed from: s, reason: collision with root package name */
    public final Boolean f106166s;

    public h(String __typename, String id3, String entityId, String str, String str2, String str3, String str4, Integer num, String str5, String str6, Boolean bool, Boolean bool2, String str7, String str8, List list, g gVar, String str9, f fVar, Boolean bool3) {
        Intrinsics.checkNotNullParameter(__typename, "__typename");
        Intrinsics.checkNotNullParameter(id3, "id");
        Intrinsics.checkNotNullParameter(entityId, "entityId");
        this.f106148a = __typename;
        this.f106149b = id3;
        this.f106150c = entityId;
        this.f106151d = str;
        this.f106152e = str2;
        this.f106153f = str3;
        this.f106154g = str4;
        this.f106155h = num;
        this.f106156i = str5;
        this.f106157j = str6;
        this.f106158k = bool;
        this.f106159l = bool2;
        this.f106160m = str7;
        this.f106161n = str8;
        this.f106162o = list;
        this.f106163p = gVar;
        this.f106164q = str9;
        this.f106165r = fVar;
        this.f106166s = bool3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h)) {
            return false;
        }
        h hVar = (h) obj;
        return Intrinsics.d(this.f106148a, hVar.f106148a) && Intrinsics.d(this.f106149b, hVar.f106149b) && Intrinsics.d(this.f106150c, hVar.f106150c) && Intrinsics.d(this.f106151d, hVar.f106151d) && Intrinsics.d(this.f106152e, hVar.f106152e) && Intrinsics.d(this.f106153f, hVar.f106153f) && Intrinsics.d(this.f106154g, hVar.f106154g) && Intrinsics.d(this.f106155h, hVar.f106155h) && Intrinsics.d(this.f106156i, hVar.f106156i) && Intrinsics.d(this.f106157j, hVar.f106157j) && Intrinsics.d(this.f106158k, hVar.f106158k) && Intrinsics.d(this.f106159l, hVar.f106159l) && Intrinsics.d(this.f106160m, hVar.f106160m) && Intrinsics.d(this.f106161n, hVar.f106161n) && Intrinsics.d(this.f106162o, hVar.f106162o) && Intrinsics.d(this.f106163p, hVar.f106163p) && Intrinsics.d(this.f106164q, hVar.f106164q) && Intrinsics.d(this.f106165r, hVar.f106165r) && Intrinsics.d(this.f106166s, hVar.f106166s);
    }

    public final int hashCode() {
        int d2 = cb.d(this.f106150c, cb.d(this.f106149b, this.f106148a.hashCode() * 31, 31), 31);
        String str = this.f106151d;
        int hashCode = (d2 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f106152e;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f106153f;
        int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.f106154g;
        int hashCode4 = (hashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        Integer num = this.f106155h;
        int hashCode5 = (hashCode4 + (num == null ? 0 : num.hashCode())) * 31;
        String str5 = this.f106156i;
        int hashCode6 = (hashCode5 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.f106157j;
        int hashCode7 = (hashCode6 + (str6 == null ? 0 : str6.hashCode())) * 31;
        Boolean bool = this.f106158k;
        int hashCode8 = (hashCode7 + (bool == null ? 0 : bool.hashCode())) * 31;
        Boolean bool2 = this.f106159l;
        int hashCode9 = (hashCode8 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        String str7 = this.f106160m;
        int hashCode10 = (hashCode9 + (str7 == null ? 0 : str7.hashCode())) * 31;
        String str8 = this.f106161n;
        int hashCode11 = (hashCode10 + (str8 == null ? 0 : str8.hashCode())) * 31;
        List list = this.f106162o;
        int hashCode12 = (hashCode11 + (list == null ? 0 : list.hashCode())) * 31;
        g gVar = this.f106163p;
        int hashCode13 = (hashCode12 + (gVar == null ? 0 : gVar.hashCode())) * 31;
        String str9 = this.f106164q;
        int hashCode14 = (hashCode13 + (str9 == null ? 0 : str9.hashCode())) * 31;
        f fVar = this.f106165r;
        int hashCode15 = (hashCode14 + (fVar == null ? 0 : fVar.hashCode())) * 31;
        Boolean bool3 = this.f106166s;
        return hashCode15 + (bool3 != null ? bool3.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("Data(__typename=");
        sb3.append(this.f106148a);
        sb3.append(", id=");
        sb3.append(this.f106149b);
        sb3.append(", entityId=");
        sb3.append(this.f106150c);
        sb3.append(", firstName=");
        sb3.append(this.f106151d);
        sb3.append(", lastName=");
        sb3.append(this.f106152e);
        sb3.append(", fullName=");
        sb3.append(this.f106153f);
        sb3.append(", username=");
        sb3.append(this.f106154g);
        sb3.append(", ageInYears=");
        sb3.append(this.f106155h);
        sb3.append(", email=");
        sb3.append(this.f106156i);
        sb3.append(", imageLargeUrl=");
        sb3.append(this.f106157j);
        sb3.append(", isPartner=");
        sb3.append(this.f106158k);
        sb3.append(", isVerifiedMerchant=");
        sb3.append(this.f106159l);
        sb3.append(", websiteUrl=");
        sb3.append(this.f106160m);
        sb3.append(", about=");
        sb3.append(this.f106161n);
        sb3.append(", pronouns=");
        sb3.append(this.f106162o);
        sb3.append(", verifiedIdentity=");
        sb3.append(this.f106163p);
        sb3.append(", country=");
        sb3.append(this.f106164q);
        sb3.append(", bizPartner=");
        sb3.append(this.f106165r);
        sb3.append(", showAllPins=");
        return a.c.h(sb3, this.f106166s, ")");
    }
}
