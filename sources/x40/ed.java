package x40;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class ed implements z40.d0 {

    /* renamed from: a, reason: collision with root package name */
    public final String f132337a;

    /* renamed from: b, reason: collision with root package name */
    public final String f132338b;

    /* renamed from: c, reason: collision with root package name */
    public final String f132339c;

    /* renamed from: d, reason: collision with root package name */
    public final dd f132340d;

    /* renamed from: e, reason: collision with root package name */
    public final Boolean f132341e;

    /* renamed from: f, reason: collision with root package name */
    public final Boolean f132342f;

    /* renamed from: g, reason: collision with root package name */
    public final Boolean f132343g;

    /* renamed from: h, reason: collision with root package name */
    public final String f132344h;

    /* renamed from: i, reason: collision with root package name */
    public final String f132345i;

    /* renamed from: j, reason: collision with root package name */
    public final String f132346j;

    /* renamed from: k, reason: collision with root package name */
    public final String f132347k;

    /* renamed from: l, reason: collision with root package name */
    public final String f132348l;

    /* renamed from: m, reason: collision with root package name */
    public final String f132349m;

    /* renamed from: n, reason: collision with root package name */
    public final String f132350n;

    /* renamed from: o, reason: collision with root package name */
    public final String f132351o;

    /* renamed from: p, reason: collision with root package name */
    public final Integer f132352p;

    /* renamed from: q, reason: collision with root package name */
    public final Integer f132353q;

    /* renamed from: r, reason: collision with root package name */
    public final Boolean f132354r;

    /* renamed from: s, reason: collision with root package name */
    public final Boolean f132355s;

    /* renamed from: t, reason: collision with root package name */
    public final Integer f132356t;

    public ed(String __typename, String id3, String entityId, dd ddVar, Boolean bool, Boolean bool2, Boolean bool3, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, Integer num, Integer num2, Boolean bool4, Boolean bool5, Integer num3) {
        Intrinsics.checkNotNullParameter(__typename, "__typename");
        Intrinsics.checkNotNullParameter(id3, "id");
        Intrinsics.checkNotNullParameter(entityId, "entityId");
        this.f132337a = __typename;
        this.f132338b = id3;
        this.f132339c = entityId;
        this.f132340d = ddVar;
        this.f132341e = bool;
        this.f132342f = bool2;
        this.f132343g = bool3;
        this.f132344h = str;
        this.f132345i = str2;
        this.f132346j = str3;
        this.f132347k = str4;
        this.f132348l = str5;
        this.f132349m = str6;
        this.f132350n = str7;
        this.f132351o = str8;
        this.f132352p = num;
        this.f132353q = num2;
        this.f132354r = bool4;
        this.f132355s = bool5;
        this.f132356t = num3;
    }

    @Override // z40.d0
    public final String a() {
        return this.f132339c;
    }

    @Override // z40.d0
    public final String b() {
        return this.f132346j;
    }

    @Override // z40.d0
    public final Integer c() {
        return this.f132352p;
    }

    @Override // z40.d0
    public final Boolean d() {
        return this.f132354r;
    }

    @Override // z40.d0
    public final String e() {
        return this.f132345i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ed)) {
            return false;
        }
        ed edVar = (ed) obj;
        return Intrinsics.d(this.f132337a, edVar.f132337a) && Intrinsics.d(this.f132338b, edVar.f132338b) && Intrinsics.d(this.f132339c, edVar.f132339c) && Intrinsics.d(this.f132340d, edVar.f132340d) && Intrinsics.d(this.f132341e, edVar.f132341e) && Intrinsics.d(this.f132342f, edVar.f132342f) && Intrinsics.d(this.f132343g, edVar.f132343g) && Intrinsics.d(this.f132344h, edVar.f132344h) && Intrinsics.d(this.f132345i, edVar.f132345i) && Intrinsics.d(this.f132346j, edVar.f132346j) && Intrinsics.d(this.f132347k, edVar.f132347k) && Intrinsics.d(this.f132348l, edVar.f132348l) && Intrinsics.d(this.f132349m, edVar.f132349m) && Intrinsics.d(this.f132350n, edVar.f132350n) && Intrinsics.d(this.f132351o, edVar.f132351o) && Intrinsics.d(this.f132352p, edVar.f132352p) && Intrinsics.d(this.f132353q, edVar.f132353q) && Intrinsics.d(this.f132354r, edVar.f132354r) && Intrinsics.d(this.f132355s, edVar.f132355s) && Intrinsics.d(this.f132356t, edVar.f132356t);
    }

    @Override // z40.d0
    public final String f() {
        return this.f132350n;
    }

    @Override // z40.d0
    public final String g() {
        return this.f132351o;
    }

    @Override // z40.d0
    public final String getId() {
        return this.f132338b;
    }

    @Override // z40.d0
    public final Boolean h() {
        return this.f132342f;
    }

    public final int hashCode() {
        int d2 = a.cb.d(this.f132339c, a.cb.d(this.f132338b, this.f132337a.hashCode() * 31, 31), 31);
        dd ddVar = this.f132340d;
        int hashCode = (d2 + (ddVar == null ? 0 : ddVar.hashCode())) * 31;
        Boolean bool = this.f132341e;
        int hashCode2 = (hashCode + (bool == null ? 0 : bool.hashCode())) * 31;
        Boolean bool2 = this.f132342f;
        int hashCode3 = (hashCode2 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        Boolean bool3 = this.f132343g;
        int hashCode4 = (hashCode3 + (bool3 == null ? 0 : bool3.hashCode())) * 31;
        String str = this.f132344h;
        int hashCode5 = (hashCode4 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f132345i;
        int hashCode6 = (hashCode5 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f132346j;
        int hashCode7 = (hashCode6 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.f132347k;
        int hashCode8 = (hashCode7 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.f132348l;
        int hashCode9 = (hashCode8 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.f132349m;
        int hashCode10 = (hashCode9 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.f132350n;
        int hashCode11 = (hashCode10 + (str7 == null ? 0 : str7.hashCode())) * 31;
        String str8 = this.f132351o;
        int hashCode12 = (hashCode11 + (str8 == null ? 0 : str8.hashCode())) * 31;
        Integer num = this.f132352p;
        int hashCode13 = (hashCode12 + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.f132353q;
        int hashCode14 = (hashCode13 + (num2 == null ? 0 : num2.hashCode())) * 31;
        Boolean bool4 = this.f132354r;
        int hashCode15 = (hashCode14 + (bool4 == null ? 0 : bool4.hashCode())) * 31;
        Boolean bool5 = this.f132355s;
        int hashCode16 = (hashCode15 + (bool5 == null ? 0 : bool5.hashCode())) * 31;
        Integer num3 = this.f132356t;
        return hashCode16 + (num3 != null ? num3.hashCode() : 0);
    }

    @Override // z40.d0
    public final z40.c0 i() {
        return this.f132340d;
    }

    @Override // z40.d0
    public final Integer j() {
        return this.f132353q;
    }

    @Override // z40.d0
    public final String k() {
        return this.f132347k;
    }

    @Override // z40.d0
    public final String l() {
        return this.f132348l;
    }

    @Override // z40.d0
    public final String m() {
        return this.f132344h;
    }

    @Override // z40.d0
    public final Integer n() {
        return this.f132356t;
    }

    @Override // z40.d0
    public final Boolean o() {
        return this.f132343g;
    }

    @Override // z40.d0
    public final String p() {
        return this.f132349m;
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("Node(__typename=");
        sb3.append(this.f132337a);
        sb3.append(", id=");
        sb3.append(this.f132338b);
        sb3.append(", entityId=");
        sb3.append(this.f132339c);
        sb3.append(", verifiedIdentity=");
        sb3.append(this.f132340d);
        sb3.append(", blockedByMe=");
        sb3.append(this.f132341e);
        sb3.append(", isVerifiedMerchant=");
        sb3.append(this.f132342f);
        sb3.append(", isDefaultImage=");
        sb3.append(this.f132343g);
        sb3.append(", imageXlargeUrl=");
        sb3.append(this.f132344h);
        sb3.append(", imageLargeUrl=");
        sb3.append(this.f132345i);
        sb3.append(", imageMediumUrl=");
        sb3.append(this.f132346j);
        sb3.append(", imageSmallUrl=");
        sb3.append(this.f132347k);
        sb3.append(", firstName=");
        sb3.append(this.f132348l);
        sb3.append(", lastName=");
        sb3.append(this.f132349m);
        sb3.append(", fullName=");
        sb3.append(this.f132350n);
        sb3.append(", username=");
        sb3.append(this.f132351o);
        sb3.append(", followerCount=");
        sb3.append(this.f132352p);
        sb3.append(", followingCount=");
        sb3.append(this.f132353q);
        sb3.append(", explicitlyFollowedByMe=");
        sb3.append(this.f132354r);
        sb3.append(", isPrivateProfile=");
        sb3.append(this.f132355s);
        sb3.append(", avatarColorIndex=");
        return a.c.i(sb3, this.f132356t, ")");
    }
}
