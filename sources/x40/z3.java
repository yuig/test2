package x40;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class z3 implements z40.d0, z40.g {

    /* renamed from: a, reason: collision with root package name */
    public final String f133783a;

    /* renamed from: b, reason: collision with root package name */
    public final String f133784b;

    /* renamed from: c, reason: collision with root package name */
    public final String f133785c;

    /* renamed from: d, reason: collision with root package name */
    public final y3 f133786d;

    /* renamed from: e, reason: collision with root package name */
    public final Boolean f133787e;

    /* renamed from: f, reason: collision with root package name */
    public final Boolean f133788f;

    /* renamed from: g, reason: collision with root package name */
    public final Boolean f133789g;

    /* renamed from: h, reason: collision with root package name */
    public final String f133790h;

    /* renamed from: i, reason: collision with root package name */
    public final String f133791i;

    /* renamed from: j, reason: collision with root package name */
    public final String f133792j;

    /* renamed from: k, reason: collision with root package name */
    public final String f133793k;

    /* renamed from: l, reason: collision with root package name */
    public final String f133794l;

    /* renamed from: m, reason: collision with root package name */
    public final String f133795m;

    /* renamed from: n, reason: collision with root package name */
    public final String f133796n;

    /* renamed from: o, reason: collision with root package name */
    public final String f133797o;

    /* renamed from: p, reason: collision with root package name */
    public final Integer f133798p;

    /* renamed from: q, reason: collision with root package name */
    public final Integer f133799q;

    /* renamed from: r, reason: collision with root package name */
    public final Boolean f133800r;

    /* renamed from: s, reason: collision with root package name */
    public final Boolean f133801s;

    /* renamed from: t, reason: collision with root package name */
    public final Integer f133802t;

    public z3(String __typename, String id3, String entityId, y3 y3Var, Boolean bool, Boolean bool2, Boolean bool3, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, Integer num, Integer num2, Boolean bool4, Boolean bool5, Integer num3) {
        Intrinsics.checkNotNullParameter(__typename, "__typename");
        Intrinsics.checkNotNullParameter(id3, "id");
        Intrinsics.checkNotNullParameter(entityId, "entityId");
        this.f133783a = __typename;
        this.f133784b = id3;
        this.f133785c = entityId;
        this.f133786d = y3Var;
        this.f133787e = bool;
        this.f133788f = bool2;
        this.f133789g = bool3;
        this.f133790h = str;
        this.f133791i = str2;
        this.f133792j = str3;
        this.f133793k = str4;
        this.f133794l = str5;
        this.f133795m = str6;
        this.f133796n = str7;
        this.f133797o = str8;
        this.f133798p = num;
        this.f133799q = num2;
        this.f133800r = bool4;
        this.f133801s = bool5;
        this.f133802t = num3;
    }

    @Override // z40.d0
    public final String a() {
        return this.f133785c;
    }

    @Override // z40.d0
    public final String b() {
        return this.f133792j;
    }

    @Override // z40.d0
    public final Integer c() {
        return this.f133798p;
    }

    @Override // z40.d0
    public final Boolean d() {
        return this.f133800r;
    }

    @Override // z40.d0
    public final String e() {
        return this.f133791i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof z3)) {
            return false;
        }
        z3 z3Var = (z3) obj;
        return Intrinsics.d(this.f133783a, z3Var.f133783a) && Intrinsics.d(this.f133784b, z3Var.f133784b) && Intrinsics.d(this.f133785c, z3Var.f133785c) && Intrinsics.d(this.f133786d, z3Var.f133786d) && Intrinsics.d(this.f133787e, z3Var.f133787e) && Intrinsics.d(this.f133788f, z3Var.f133788f) && Intrinsics.d(this.f133789g, z3Var.f133789g) && Intrinsics.d(this.f133790h, z3Var.f133790h) && Intrinsics.d(this.f133791i, z3Var.f133791i) && Intrinsics.d(this.f133792j, z3Var.f133792j) && Intrinsics.d(this.f133793k, z3Var.f133793k) && Intrinsics.d(this.f133794l, z3Var.f133794l) && Intrinsics.d(this.f133795m, z3Var.f133795m) && Intrinsics.d(this.f133796n, z3Var.f133796n) && Intrinsics.d(this.f133797o, z3Var.f133797o) && Intrinsics.d(this.f133798p, z3Var.f133798p) && Intrinsics.d(this.f133799q, z3Var.f133799q) && Intrinsics.d(this.f133800r, z3Var.f133800r) && Intrinsics.d(this.f133801s, z3Var.f133801s) && Intrinsics.d(this.f133802t, z3Var.f133802t);
    }

    @Override // z40.d0
    public final String f() {
        return this.f133796n;
    }

    @Override // z40.d0
    public final String g() {
        return this.f133797o;
    }

    @Override // z40.d0
    public final String getId() {
        return this.f133784b;
    }

    @Override // z40.d0
    public final Boolean h() {
        return this.f133788f;
    }

    public final int hashCode() {
        int d2 = a.cb.d(this.f133785c, a.cb.d(this.f133784b, this.f133783a.hashCode() * 31, 31), 31);
        y3 y3Var = this.f133786d;
        int hashCode = (d2 + (y3Var == null ? 0 : y3Var.hashCode())) * 31;
        Boolean bool = this.f133787e;
        int hashCode2 = (hashCode + (bool == null ? 0 : bool.hashCode())) * 31;
        Boolean bool2 = this.f133788f;
        int hashCode3 = (hashCode2 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        Boolean bool3 = this.f133789g;
        int hashCode4 = (hashCode3 + (bool3 == null ? 0 : bool3.hashCode())) * 31;
        String str = this.f133790h;
        int hashCode5 = (hashCode4 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f133791i;
        int hashCode6 = (hashCode5 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f133792j;
        int hashCode7 = (hashCode6 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.f133793k;
        int hashCode8 = (hashCode7 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.f133794l;
        int hashCode9 = (hashCode8 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.f133795m;
        int hashCode10 = (hashCode9 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.f133796n;
        int hashCode11 = (hashCode10 + (str7 == null ? 0 : str7.hashCode())) * 31;
        String str8 = this.f133797o;
        int hashCode12 = (hashCode11 + (str8 == null ? 0 : str8.hashCode())) * 31;
        Integer num = this.f133798p;
        int hashCode13 = (hashCode12 + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.f133799q;
        int hashCode14 = (hashCode13 + (num2 == null ? 0 : num2.hashCode())) * 31;
        Boolean bool4 = this.f133800r;
        int hashCode15 = (hashCode14 + (bool4 == null ? 0 : bool4.hashCode())) * 31;
        Boolean bool5 = this.f133801s;
        int hashCode16 = (hashCode15 + (bool5 == null ? 0 : bool5.hashCode())) * 31;
        Integer num3 = this.f133802t;
        return hashCode16 + (num3 != null ? num3.hashCode() : 0);
    }

    @Override // z40.d0
    public final z40.c0 i() {
        return this.f133786d;
    }

    @Override // z40.d0
    public final Integer j() {
        return this.f133799q;
    }

    @Override // z40.d0
    public final String k() {
        return this.f133793k;
    }

    @Override // z40.d0
    public final String l() {
        return this.f133794l;
    }

    @Override // z40.d0
    public final String m() {
        return this.f133790h;
    }

    @Override // z40.d0
    public final Integer n() {
        return this.f133802t;
    }

    @Override // z40.d0
    public final Boolean o() {
        return this.f133789g;
    }

    @Override // z40.d0
    public final String p() {
        return this.f133795m;
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("Sender(__typename=");
        sb3.append(this.f133783a);
        sb3.append(", id=");
        sb3.append(this.f133784b);
        sb3.append(", entityId=");
        sb3.append(this.f133785c);
        sb3.append(", verifiedIdentity=");
        sb3.append(this.f133786d);
        sb3.append(", blockedByMe=");
        sb3.append(this.f133787e);
        sb3.append(", isVerifiedMerchant=");
        sb3.append(this.f133788f);
        sb3.append(", isDefaultImage=");
        sb3.append(this.f133789g);
        sb3.append(", imageXlargeUrl=");
        sb3.append(this.f133790h);
        sb3.append(", imageLargeUrl=");
        sb3.append(this.f133791i);
        sb3.append(", imageMediumUrl=");
        sb3.append(this.f133792j);
        sb3.append(", imageSmallUrl=");
        sb3.append(this.f133793k);
        sb3.append(", firstName=");
        sb3.append(this.f133794l);
        sb3.append(", lastName=");
        sb3.append(this.f133795m);
        sb3.append(", fullName=");
        sb3.append(this.f133796n);
        sb3.append(", username=");
        sb3.append(this.f133797o);
        sb3.append(", followerCount=");
        sb3.append(this.f133798p);
        sb3.append(", followingCount=");
        sb3.append(this.f133799q);
        sb3.append(", explicitlyFollowedByMe=");
        sb3.append(this.f133800r);
        sb3.append(", isPrivateProfile=");
        sb3.append(this.f133801s);
        sb3.append(", avatarColorIndex=");
        return a.c.i(sb3, this.f133802t, ")");
    }
}
