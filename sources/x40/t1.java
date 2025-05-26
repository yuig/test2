package x40;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class t1 implements z40.d0 {

    /* renamed from: a, reason: collision with root package name */
    public final String f133287a;

    /* renamed from: b, reason: collision with root package name */
    public final String f133288b;

    /* renamed from: c, reason: collision with root package name */
    public final String f133289c;

    /* renamed from: d, reason: collision with root package name */
    public final s1 f133290d;

    /* renamed from: e, reason: collision with root package name */
    public final Boolean f133291e;

    /* renamed from: f, reason: collision with root package name */
    public final Boolean f133292f;

    /* renamed from: g, reason: collision with root package name */
    public final Boolean f133293g;

    /* renamed from: h, reason: collision with root package name */
    public final String f133294h;

    /* renamed from: i, reason: collision with root package name */
    public final String f133295i;

    /* renamed from: j, reason: collision with root package name */
    public final String f133296j;

    /* renamed from: k, reason: collision with root package name */
    public final String f133297k;

    /* renamed from: l, reason: collision with root package name */
    public final String f133298l;

    /* renamed from: m, reason: collision with root package name */
    public final String f133299m;

    /* renamed from: n, reason: collision with root package name */
    public final String f133300n;

    /* renamed from: o, reason: collision with root package name */
    public final String f133301o;

    /* renamed from: p, reason: collision with root package name */
    public final Integer f133302p;

    /* renamed from: q, reason: collision with root package name */
    public final Integer f133303q;

    /* renamed from: r, reason: collision with root package name */
    public final Boolean f133304r;

    /* renamed from: s, reason: collision with root package name */
    public final Boolean f133305s;

    /* renamed from: t, reason: collision with root package name */
    public final Integer f133306t;

    public t1(String __typename, String id3, String entityId, s1 s1Var, Boolean bool, Boolean bool2, Boolean bool3, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, Integer num, Integer num2, Boolean bool4, Boolean bool5, Integer num3) {
        Intrinsics.checkNotNullParameter(__typename, "__typename");
        Intrinsics.checkNotNullParameter(id3, "id");
        Intrinsics.checkNotNullParameter(entityId, "entityId");
        this.f133287a = __typename;
        this.f133288b = id3;
        this.f133289c = entityId;
        this.f133290d = s1Var;
        this.f133291e = bool;
        this.f133292f = bool2;
        this.f133293g = bool3;
        this.f133294h = str;
        this.f133295i = str2;
        this.f133296j = str3;
        this.f133297k = str4;
        this.f133298l = str5;
        this.f133299m = str6;
        this.f133300n = str7;
        this.f133301o = str8;
        this.f133302p = num;
        this.f133303q = num2;
        this.f133304r = bool4;
        this.f133305s = bool5;
        this.f133306t = num3;
    }

    @Override // z40.d0
    public final String a() {
        return this.f133289c;
    }

    @Override // z40.d0
    public final String b() {
        return this.f133296j;
    }

    @Override // z40.d0
    public final Integer c() {
        return this.f133302p;
    }

    @Override // z40.d0
    public final Boolean d() {
        return this.f133304r;
    }

    @Override // z40.d0
    public final String e() {
        return this.f133295i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof t1)) {
            return false;
        }
        t1 t1Var = (t1) obj;
        return Intrinsics.d(this.f133287a, t1Var.f133287a) && Intrinsics.d(this.f133288b, t1Var.f133288b) && Intrinsics.d(this.f133289c, t1Var.f133289c) && Intrinsics.d(this.f133290d, t1Var.f133290d) && Intrinsics.d(this.f133291e, t1Var.f133291e) && Intrinsics.d(this.f133292f, t1Var.f133292f) && Intrinsics.d(this.f133293g, t1Var.f133293g) && Intrinsics.d(this.f133294h, t1Var.f133294h) && Intrinsics.d(this.f133295i, t1Var.f133295i) && Intrinsics.d(this.f133296j, t1Var.f133296j) && Intrinsics.d(this.f133297k, t1Var.f133297k) && Intrinsics.d(this.f133298l, t1Var.f133298l) && Intrinsics.d(this.f133299m, t1Var.f133299m) && Intrinsics.d(this.f133300n, t1Var.f133300n) && Intrinsics.d(this.f133301o, t1Var.f133301o) && Intrinsics.d(this.f133302p, t1Var.f133302p) && Intrinsics.d(this.f133303q, t1Var.f133303q) && Intrinsics.d(this.f133304r, t1Var.f133304r) && Intrinsics.d(this.f133305s, t1Var.f133305s) && Intrinsics.d(this.f133306t, t1Var.f133306t);
    }

    @Override // z40.d0
    public final String f() {
        return this.f133300n;
    }

    @Override // z40.d0
    public final String g() {
        return this.f133301o;
    }

    @Override // z40.d0
    public final String getId() {
        return this.f133288b;
    }

    @Override // z40.d0
    public final Boolean h() {
        return this.f133292f;
    }

    public final int hashCode() {
        int d2 = a.cb.d(this.f133289c, a.cb.d(this.f133288b, this.f133287a.hashCode() * 31, 31), 31);
        s1 s1Var = this.f133290d;
        int hashCode = (d2 + (s1Var == null ? 0 : s1Var.hashCode())) * 31;
        Boolean bool = this.f133291e;
        int hashCode2 = (hashCode + (bool == null ? 0 : bool.hashCode())) * 31;
        Boolean bool2 = this.f133292f;
        int hashCode3 = (hashCode2 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        Boolean bool3 = this.f133293g;
        int hashCode4 = (hashCode3 + (bool3 == null ? 0 : bool3.hashCode())) * 31;
        String str = this.f133294h;
        int hashCode5 = (hashCode4 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f133295i;
        int hashCode6 = (hashCode5 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f133296j;
        int hashCode7 = (hashCode6 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.f133297k;
        int hashCode8 = (hashCode7 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.f133298l;
        int hashCode9 = (hashCode8 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.f133299m;
        int hashCode10 = (hashCode9 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.f133300n;
        int hashCode11 = (hashCode10 + (str7 == null ? 0 : str7.hashCode())) * 31;
        String str8 = this.f133301o;
        int hashCode12 = (hashCode11 + (str8 == null ? 0 : str8.hashCode())) * 31;
        Integer num = this.f133302p;
        int hashCode13 = (hashCode12 + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.f133303q;
        int hashCode14 = (hashCode13 + (num2 == null ? 0 : num2.hashCode())) * 31;
        Boolean bool4 = this.f133304r;
        int hashCode15 = (hashCode14 + (bool4 == null ? 0 : bool4.hashCode())) * 31;
        Boolean bool5 = this.f133305s;
        int hashCode16 = (hashCode15 + (bool5 == null ? 0 : bool5.hashCode())) * 31;
        Integer num3 = this.f133306t;
        return hashCode16 + (num3 != null ? num3.hashCode() : 0);
    }

    @Override // z40.d0
    public final z40.c0 i() {
        return this.f133290d;
    }

    @Override // z40.d0
    public final Integer j() {
        return this.f133303q;
    }

    @Override // z40.d0
    public final String k() {
        return this.f133297k;
    }

    @Override // z40.d0
    public final String l() {
        return this.f133298l;
    }

    @Override // z40.d0
    public final String m() {
        return this.f133294h;
    }

    @Override // z40.d0
    public final Integer n() {
        return this.f133306t;
    }

    @Override // z40.d0
    public final Boolean o() {
        return this.f133293g;
    }

    @Override // z40.d0
    public final String p() {
        return this.f133299m;
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("Pinner(__typename=");
        sb3.append(this.f133287a);
        sb3.append(", id=");
        sb3.append(this.f133288b);
        sb3.append(", entityId=");
        sb3.append(this.f133289c);
        sb3.append(", verifiedIdentity=");
        sb3.append(this.f133290d);
        sb3.append(", blockedByMe=");
        sb3.append(this.f133291e);
        sb3.append(", isVerifiedMerchant=");
        sb3.append(this.f133292f);
        sb3.append(", isDefaultImage=");
        sb3.append(this.f133293g);
        sb3.append(", imageXlargeUrl=");
        sb3.append(this.f133294h);
        sb3.append(", imageLargeUrl=");
        sb3.append(this.f133295i);
        sb3.append(", imageMediumUrl=");
        sb3.append(this.f133296j);
        sb3.append(", imageSmallUrl=");
        sb3.append(this.f133297k);
        sb3.append(", firstName=");
        sb3.append(this.f133298l);
        sb3.append(", lastName=");
        sb3.append(this.f133299m);
        sb3.append(", fullName=");
        sb3.append(this.f133300n);
        sb3.append(", username=");
        sb3.append(this.f133301o);
        sb3.append(", followerCount=");
        sb3.append(this.f133302p);
        sb3.append(", followingCount=");
        sb3.append(this.f133303q);
        sb3.append(", explicitlyFollowedByMe=");
        sb3.append(this.f133304r);
        sb3.append(", isPrivateProfile=");
        sb3.append(this.f133305s);
        sb3.append(", avatarColorIndex=");
        return a.c.i(sb3, this.f133306t, ")");
    }
}
