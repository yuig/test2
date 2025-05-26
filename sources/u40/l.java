package u40;

import a.cb;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class l implements g {

    /* renamed from: a, reason: collision with root package name */
    public final String f120361a;

    /* renamed from: b, reason: collision with root package name */
    public final String f120362b;

    /* renamed from: c, reason: collision with root package name */
    public final String f120363c;

    /* renamed from: d, reason: collision with root package name */
    public final String f120364d;

    /* renamed from: e, reason: collision with root package name */
    public final String f120365e;

    /* renamed from: f, reason: collision with root package name */
    public final String f120366f;

    /* renamed from: g, reason: collision with root package name */
    public final String f120367g;

    /* renamed from: h, reason: collision with root package name */
    public final Integer f120368h;

    /* renamed from: i, reason: collision with root package name */
    public final String f120369i;

    /* renamed from: j, reason: collision with root package name */
    public final String f120370j;

    /* renamed from: k, reason: collision with root package name */
    public final Boolean f120371k;

    /* renamed from: l, reason: collision with root package name */
    public final Boolean f120372l;

    /* renamed from: m, reason: collision with root package name */
    public final String f120373m;

    /* renamed from: n, reason: collision with root package name */
    public final String f120374n;

    /* renamed from: o, reason: collision with root package name */
    public final List f120375o;

    /* renamed from: p, reason: collision with root package name */
    public final k f120376p;

    /* renamed from: q, reason: collision with root package name */
    public final String f120377q;

    /* renamed from: r, reason: collision with root package name */
    public final j f120378r;

    /* renamed from: s, reason: collision with root package name */
    public final Boolean f120379s;

    public l(String __typename, String id3, String entityId, String str, String str2, String str3, String str4, Integer num, String str5, String str6, Boolean bool, Boolean bool2, String str7, String str8, List list, k kVar, String str9, j jVar, Boolean bool3) {
        Intrinsics.checkNotNullParameter(__typename, "__typename");
        Intrinsics.checkNotNullParameter(id3, "id");
        Intrinsics.checkNotNullParameter(entityId, "entityId");
        this.f120361a = __typename;
        this.f120362b = id3;
        this.f120363c = entityId;
        this.f120364d = str;
        this.f120365e = str2;
        this.f120366f = str3;
        this.f120367g = str4;
        this.f120368h = num;
        this.f120369i = str5;
        this.f120370j = str6;
        this.f120371k = bool;
        this.f120372l = bool2;
        this.f120373m = str7;
        this.f120374n = str8;
        this.f120375o = list;
        this.f120376p = kVar;
        this.f120377q = str9;
        this.f120378r = jVar;
        this.f120379s = bool3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof l)) {
            return false;
        }
        l lVar = (l) obj;
        return Intrinsics.d(this.f120361a, lVar.f120361a) && Intrinsics.d(this.f120362b, lVar.f120362b) && Intrinsics.d(this.f120363c, lVar.f120363c) && Intrinsics.d(this.f120364d, lVar.f120364d) && Intrinsics.d(this.f120365e, lVar.f120365e) && Intrinsics.d(this.f120366f, lVar.f120366f) && Intrinsics.d(this.f120367g, lVar.f120367g) && Intrinsics.d(this.f120368h, lVar.f120368h) && Intrinsics.d(this.f120369i, lVar.f120369i) && Intrinsics.d(this.f120370j, lVar.f120370j) && Intrinsics.d(this.f120371k, lVar.f120371k) && Intrinsics.d(this.f120372l, lVar.f120372l) && Intrinsics.d(this.f120373m, lVar.f120373m) && Intrinsics.d(this.f120374n, lVar.f120374n) && Intrinsics.d(this.f120375o, lVar.f120375o) && Intrinsics.d(this.f120376p, lVar.f120376p) && Intrinsics.d(this.f120377q, lVar.f120377q) && Intrinsics.d(this.f120378r, lVar.f120378r) && Intrinsics.d(this.f120379s, lVar.f120379s);
    }

    public final int hashCode() {
        int d2 = cb.d(this.f120363c, cb.d(this.f120362b, this.f120361a.hashCode() * 31, 31), 31);
        String str = this.f120364d;
        int hashCode = (d2 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f120365e;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f120366f;
        int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.f120367g;
        int hashCode4 = (hashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        Integer num = this.f120368h;
        int hashCode5 = (hashCode4 + (num == null ? 0 : num.hashCode())) * 31;
        String str5 = this.f120369i;
        int hashCode6 = (hashCode5 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.f120370j;
        int hashCode7 = (hashCode6 + (str6 == null ? 0 : str6.hashCode())) * 31;
        Boolean bool = this.f120371k;
        int hashCode8 = (hashCode7 + (bool == null ? 0 : bool.hashCode())) * 31;
        Boolean bool2 = this.f120372l;
        int hashCode9 = (hashCode8 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        String str7 = this.f120373m;
        int hashCode10 = (hashCode9 + (str7 == null ? 0 : str7.hashCode())) * 31;
        String str8 = this.f120374n;
        int hashCode11 = (hashCode10 + (str8 == null ? 0 : str8.hashCode())) * 31;
        List list = this.f120375o;
        int hashCode12 = (hashCode11 + (list == null ? 0 : list.hashCode())) * 31;
        k kVar = this.f120376p;
        int hashCode13 = (hashCode12 + (kVar == null ? 0 : kVar.hashCode())) * 31;
        String str9 = this.f120377q;
        int hashCode14 = (hashCode13 + (str9 == null ? 0 : str9.hashCode())) * 31;
        j jVar = this.f120378r;
        int hashCode15 = (hashCode14 + (jVar == null ? 0 : jVar.hashCode())) * 31;
        Boolean bool3 = this.f120379s;
        return hashCode15 + (bool3 != null ? bool3.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("UserData(__typename=");
        sb3.append(this.f120361a);
        sb3.append(", id=");
        sb3.append(this.f120362b);
        sb3.append(", entityId=");
        sb3.append(this.f120363c);
        sb3.append(", firstName=");
        sb3.append(this.f120364d);
        sb3.append(", lastName=");
        sb3.append(this.f120365e);
        sb3.append(", fullName=");
        sb3.append(this.f120366f);
        sb3.append(", username=");
        sb3.append(this.f120367g);
        sb3.append(", ageInYears=");
        sb3.append(this.f120368h);
        sb3.append(", email=");
        sb3.append(this.f120369i);
        sb3.append(", imageLargeUrl=");
        sb3.append(this.f120370j);
        sb3.append(", isPartner=");
        sb3.append(this.f120371k);
        sb3.append(", isVerifiedMerchant=");
        sb3.append(this.f120372l);
        sb3.append(", websiteUrl=");
        sb3.append(this.f120373m);
        sb3.append(", about=");
        sb3.append(this.f120374n);
        sb3.append(", pronouns=");
        sb3.append(this.f120375o);
        sb3.append(", verifiedIdentity=");
        sb3.append(this.f120376p);
        sb3.append(", country=");
        sb3.append(this.f120377q);
        sb3.append(", bizPartner=");
        sb3.append(this.f120378r);
        sb3.append(", showAllPins=");
        return a.c.h(sb3, this.f120379s, ")");
    }
}
