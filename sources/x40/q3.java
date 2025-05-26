package x40;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class q3 implements z40.d0 {

    /* renamed from: a, reason: collision with root package name */
    public final String f133066a;

    /* renamed from: b, reason: collision with root package name */
    public final String f133067b;

    /* renamed from: c, reason: collision with root package name */
    public final String f133068c;

    /* renamed from: d, reason: collision with root package name */
    public final p3 f133069d;

    /* renamed from: e, reason: collision with root package name */
    public final Boolean f133070e;

    /* renamed from: f, reason: collision with root package name */
    public final Boolean f133071f;

    /* renamed from: g, reason: collision with root package name */
    public final Boolean f133072g;

    /* renamed from: h, reason: collision with root package name */
    public final String f133073h;

    /* renamed from: i, reason: collision with root package name */
    public final String f133074i;

    /* renamed from: j, reason: collision with root package name */
    public final String f133075j;

    /* renamed from: k, reason: collision with root package name */
    public final String f133076k;

    /* renamed from: l, reason: collision with root package name */
    public final String f133077l;

    /* renamed from: m, reason: collision with root package name */
    public final String f133078m;

    /* renamed from: n, reason: collision with root package name */
    public final String f133079n;

    /* renamed from: o, reason: collision with root package name */
    public final String f133080o;

    /* renamed from: p, reason: collision with root package name */
    public final Integer f133081p;

    /* renamed from: q, reason: collision with root package name */
    public final Integer f133082q;

    /* renamed from: r, reason: collision with root package name */
    public final Boolean f133083r;

    /* renamed from: s, reason: collision with root package name */
    public final Boolean f133084s;

    /* renamed from: t, reason: collision with root package name */
    public final Integer f133085t;

    public q3(String __typename, String id3, String entityId, p3 p3Var, Boolean bool, Boolean bool2, Boolean bool3, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, Integer num, Integer num2, Boolean bool4, Boolean bool5, Integer num3) {
        Intrinsics.checkNotNullParameter(__typename, "__typename");
        Intrinsics.checkNotNullParameter(id3, "id");
        Intrinsics.checkNotNullParameter(entityId, "entityId");
        this.f133066a = __typename;
        this.f133067b = id3;
        this.f133068c = entityId;
        this.f133069d = p3Var;
        this.f133070e = bool;
        this.f133071f = bool2;
        this.f133072g = bool3;
        this.f133073h = str;
        this.f133074i = str2;
        this.f133075j = str3;
        this.f133076k = str4;
        this.f133077l = str5;
        this.f133078m = str6;
        this.f133079n = str7;
        this.f133080o = str8;
        this.f133081p = num;
        this.f133082q = num2;
        this.f133083r = bool4;
        this.f133084s = bool5;
        this.f133085t = num3;
    }

    @Override // z40.d0
    public final String a() {
        return this.f133068c;
    }

    @Override // z40.d0
    public final String b() {
        return this.f133075j;
    }

    @Override // z40.d0
    public final Integer c() {
        return this.f133081p;
    }

    @Override // z40.d0
    public final Boolean d() {
        return this.f133083r;
    }

    @Override // z40.d0
    public final String e() {
        return this.f133074i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof q3)) {
            return false;
        }
        q3 q3Var = (q3) obj;
        return Intrinsics.d(this.f133066a, q3Var.f133066a) && Intrinsics.d(this.f133067b, q3Var.f133067b) && Intrinsics.d(this.f133068c, q3Var.f133068c) && Intrinsics.d(this.f133069d, q3Var.f133069d) && Intrinsics.d(this.f133070e, q3Var.f133070e) && Intrinsics.d(this.f133071f, q3Var.f133071f) && Intrinsics.d(this.f133072g, q3Var.f133072g) && Intrinsics.d(this.f133073h, q3Var.f133073h) && Intrinsics.d(this.f133074i, q3Var.f133074i) && Intrinsics.d(this.f133075j, q3Var.f133075j) && Intrinsics.d(this.f133076k, q3Var.f133076k) && Intrinsics.d(this.f133077l, q3Var.f133077l) && Intrinsics.d(this.f133078m, q3Var.f133078m) && Intrinsics.d(this.f133079n, q3Var.f133079n) && Intrinsics.d(this.f133080o, q3Var.f133080o) && Intrinsics.d(this.f133081p, q3Var.f133081p) && Intrinsics.d(this.f133082q, q3Var.f133082q) && Intrinsics.d(this.f133083r, q3Var.f133083r) && Intrinsics.d(this.f133084s, q3Var.f133084s) && Intrinsics.d(this.f133085t, q3Var.f133085t);
    }

    @Override // z40.d0
    public final String f() {
        return this.f133079n;
    }

    @Override // z40.d0
    public final String g() {
        return this.f133080o;
    }

    @Override // z40.d0
    public final String getId() {
        return this.f133067b;
    }

    @Override // z40.d0
    public final Boolean h() {
        return this.f133071f;
    }

    public final int hashCode() {
        int d2 = a.cb.d(this.f133068c, a.cb.d(this.f133067b, this.f133066a.hashCode() * 31, 31), 31);
        p3 p3Var = this.f133069d;
        int hashCode = (d2 + (p3Var == null ? 0 : p3Var.hashCode())) * 31;
        Boolean bool = this.f133070e;
        int hashCode2 = (hashCode + (bool == null ? 0 : bool.hashCode())) * 31;
        Boolean bool2 = this.f133071f;
        int hashCode3 = (hashCode2 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        Boolean bool3 = this.f133072g;
        int hashCode4 = (hashCode3 + (bool3 == null ? 0 : bool3.hashCode())) * 31;
        String str = this.f133073h;
        int hashCode5 = (hashCode4 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f133074i;
        int hashCode6 = (hashCode5 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f133075j;
        int hashCode7 = (hashCode6 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.f133076k;
        int hashCode8 = (hashCode7 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.f133077l;
        int hashCode9 = (hashCode8 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.f133078m;
        int hashCode10 = (hashCode9 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.f133079n;
        int hashCode11 = (hashCode10 + (str7 == null ? 0 : str7.hashCode())) * 31;
        String str8 = this.f133080o;
        int hashCode12 = (hashCode11 + (str8 == null ? 0 : str8.hashCode())) * 31;
        Integer num = this.f133081p;
        int hashCode13 = (hashCode12 + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.f133082q;
        int hashCode14 = (hashCode13 + (num2 == null ? 0 : num2.hashCode())) * 31;
        Boolean bool4 = this.f133083r;
        int hashCode15 = (hashCode14 + (bool4 == null ? 0 : bool4.hashCode())) * 31;
        Boolean bool5 = this.f133084s;
        int hashCode16 = (hashCode15 + (bool5 == null ? 0 : bool5.hashCode())) * 31;
        Integer num3 = this.f133085t;
        return hashCode16 + (num3 != null ? num3.hashCode() : 0);
    }

    @Override // z40.d0
    public final z40.c0 i() {
        return this.f133069d;
    }

    @Override // z40.d0
    public final Integer j() {
        return this.f133082q;
    }

    @Override // z40.d0
    public final String k() {
        return this.f133076k;
    }

    @Override // z40.d0
    public final String l() {
        return this.f133077l;
    }

    @Override // z40.d0
    public final String m() {
        return this.f133073h;
    }

    @Override // z40.d0
    public final Integer n() {
        return this.f133085t;
    }

    @Override // z40.d0
    public final Boolean o() {
        return this.f133072g;
    }

    @Override // z40.d0
    public final String p() {
        return this.f133078m;
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("Pinner(__typename=");
        sb3.append(this.f133066a);
        sb3.append(", id=");
        sb3.append(this.f133067b);
        sb3.append(", entityId=");
        sb3.append(this.f133068c);
        sb3.append(", verifiedIdentity=");
        sb3.append(this.f133069d);
        sb3.append(", blockedByMe=");
        sb3.append(this.f133070e);
        sb3.append(", isVerifiedMerchant=");
        sb3.append(this.f133071f);
        sb3.append(", isDefaultImage=");
        sb3.append(this.f133072g);
        sb3.append(", imageXlargeUrl=");
        sb3.append(this.f133073h);
        sb3.append(", imageLargeUrl=");
        sb3.append(this.f133074i);
        sb3.append(", imageMediumUrl=");
        sb3.append(this.f133075j);
        sb3.append(", imageSmallUrl=");
        sb3.append(this.f133076k);
        sb3.append(", firstName=");
        sb3.append(this.f133077l);
        sb3.append(", lastName=");
        sb3.append(this.f133078m);
        sb3.append(", fullName=");
        sb3.append(this.f133079n);
        sb3.append(", username=");
        sb3.append(this.f133080o);
        sb3.append(", followerCount=");
        sb3.append(this.f133081p);
        sb3.append(", followingCount=");
        sb3.append(this.f133082q);
        sb3.append(", explicitlyFollowedByMe=");
        sb3.append(this.f133083r);
        sb3.append(", isPrivateProfile=");
        sb3.append(this.f133084s);
        sb3.append(", avatarColorIndex=");
        return a.c.i(sb3, this.f133085t, ")");
    }
}
