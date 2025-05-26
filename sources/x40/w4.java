package x40;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class w4 implements z40.d0, z40.i {

    /* renamed from: a, reason: collision with root package name */
    public final String f133574a;

    /* renamed from: b, reason: collision with root package name */
    public final String f133575b;

    /* renamed from: c, reason: collision with root package name */
    public final String f133576c;

    /* renamed from: d, reason: collision with root package name */
    public final v4 f133577d;

    /* renamed from: e, reason: collision with root package name */
    public final Boolean f133578e;

    /* renamed from: f, reason: collision with root package name */
    public final Boolean f133579f;

    /* renamed from: g, reason: collision with root package name */
    public final Boolean f133580g;

    /* renamed from: h, reason: collision with root package name */
    public final String f133581h;

    /* renamed from: i, reason: collision with root package name */
    public final String f133582i;

    /* renamed from: j, reason: collision with root package name */
    public final String f133583j;

    /* renamed from: k, reason: collision with root package name */
    public final String f133584k;

    /* renamed from: l, reason: collision with root package name */
    public final String f133585l;

    /* renamed from: m, reason: collision with root package name */
    public final String f133586m;

    /* renamed from: n, reason: collision with root package name */
    public final String f133587n;

    /* renamed from: o, reason: collision with root package name */
    public final String f133588o;

    /* renamed from: p, reason: collision with root package name */
    public final Integer f133589p;

    /* renamed from: q, reason: collision with root package name */
    public final Integer f133590q;

    /* renamed from: r, reason: collision with root package name */
    public final Boolean f133591r;

    /* renamed from: s, reason: collision with root package name */
    public final Boolean f133592s;

    /* renamed from: t, reason: collision with root package name */
    public final Integer f133593t;

    public w4(String __typename, String id3, String entityId, v4 v4Var, Boolean bool, Boolean bool2, Boolean bool3, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, Integer num, Integer num2, Boolean bool4, Boolean bool5, Integer num3) {
        Intrinsics.checkNotNullParameter(__typename, "__typename");
        Intrinsics.checkNotNullParameter(id3, "id");
        Intrinsics.checkNotNullParameter(entityId, "entityId");
        this.f133574a = __typename;
        this.f133575b = id3;
        this.f133576c = entityId;
        this.f133577d = v4Var;
        this.f133578e = bool;
        this.f133579f = bool2;
        this.f133580g = bool3;
        this.f133581h = str;
        this.f133582i = str2;
        this.f133583j = str3;
        this.f133584k = str4;
        this.f133585l = str5;
        this.f133586m = str6;
        this.f133587n = str7;
        this.f133588o = str8;
        this.f133589p = num;
        this.f133590q = num2;
        this.f133591r = bool4;
        this.f133592s = bool5;
        this.f133593t = num3;
    }

    @Override // z40.d0
    public final String a() {
        return this.f133576c;
    }

    @Override // z40.d0
    public final String b() {
        return this.f133583j;
    }

    @Override // z40.d0
    public final Integer c() {
        return this.f133589p;
    }

    @Override // z40.d0
    public final Boolean d() {
        return this.f133591r;
    }

    @Override // z40.d0
    public final String e() {
        return this.f133582i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof w4)) {
            return false;
        }
        w4 w4Var = (w4) obj;
        return Intrinsics.d(this.f133574a, w4Var.f133574a) && Intrinsics.d(this.f133575b, w4Var.f133575b) && Intrinsics.d(this.f133576c, w4Var.f133576c) && Intrinsics.d(this.f133577d, w4Var.f133577d) && Intrinsics.d(this.f133578e, w4Var.f133578e) && Intrinsics.d(this.f133579f, w4Var.f133579f) && Intrinsics.d(this.f133580g, w4Var.f133580g) && Intrinsics.d(this.f133581h, w4Var.f133581h) && Intrinsics.d(this.f133582i, w4Var.f133582i) && Intrinsics.d(this.f133583j, w4Var.f133583j) && Intrinsics.d(this.f133584k, w4Var.f133584k) && Intrinsics.d(this.f133585l, w4Var.f133585l) && Intrinsics.d(this.f133586m, w4Var.f133586m) && Intrinsics.d(this.f133587n, w4Var.f133587n) && Intrinsics.d(this.f133588o, w4Var.f133588o) && Intrinsics.d(this.f133589p, w4Var.f133589p) && Intrinsics.d(this.f133590q, w4Var.f133590q) && Intrinsics.d(this.f133591r, w4Var.f133591r) && Intrinsics.d(this.f133592s, w4Var.f133592s) && Intrinsics.d(this.f133593t, w4Var.f133593t);
    }

    @Override // z40.d0
    public final String f() {
        return this.f133587n;
    }

    @Override // z40.d0
    public final String g() {
        return this.f133588o;
    }

    @Override // z40.d0
    public final String getId() {
        return this.f133575b;
    }

    @Override // z40.d0
    public final Boolean h() {
        return this.f133579f;
    }

    public final int hashCode() {
        int d2 = a.cb.d(this.f133576c, a.cb.d(this.f133575b, this.f133574a.hashCode() * 31, 31), 31);
        v4 v4Var = this.f133577d;
        int hashCode = (d2 + (v4Var == null ? 0 : v4Var.hashCode())) * 31;
        Boolean bool = this.f133578e;
        int hashCode2 = (hashCode + (bool == null ? 0 : bool.hashCode())) * 31;
        Boolean bool2 = this.f133579f;
        int hashCode3 = (hashCode2 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        Boolean bool3 = this.f133580g;
        int hashCode4 = (hashCode3 + (bool3 == null ? 0 : bool3.hashCode())) * 31;
        String str = this.f133581h;
        int hashCode5 = (hashCode4 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f133582i;
        int hashCode6 = (hashCode5 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f133583j;
        int hashCode7 = (hashCode6 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.f133584k;
        int hashCode8 = (hashCode7 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.f133585l;
        int hashCode9 = (hashCode8 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.f133586m;
        int hashCode10 = (hashCode9 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.f133587n;
        int hashCode11 = (hashCode10 + (str7 == null ? 0 : str7.hashCode())) * 31;
        String str8 = this.f133588o;
        int hashCode12 = (hashCode11 + (str8 == null ? 0 : str8.hashCode())) * 31;
        Integer num = this.f133589p;
        int hashCode13 = (hashCode12 + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.f133590q;
        int hashCode14 = (hashCode13 + (num2 == null ? 0 : num2.hashCode())) * 31;
        Boolean bool4 = this.f133591r;
        int hashCode15 = (hashCode14 + (bool4 == null ? 0 : bool4.hashCode())) * 31;
        Boolean bool5 = this.f133592s;
        int hashCode16 = (hashCode15 + (bool5 == null ? 0 : bool5.hashCode())) * 31;
        Integer num3 = this.f133593t;
        return hashCode16 + (num3 != null ? num3.hashCode() : 0);
    }

    @Override // z40.d0
    public final z40.c0 i() {
        return this.f133577d;
    }

    @Override // z40.d0
    public final Integer j() {
        return this.f133590q;
    }

    @Override // z40.d0
    public final String k() {
        return this.f133584k;
    }

    @Override // z40.d0
    public final String l() {
        return this.f133585l;
    }

    @Override // z40.d0
    public final String m() {
        return this.f133581h;
    }

    @Override // z40.d0
    public final Integer n() {
        return this.f133593t;
    }

    @Override // z40.d0
    public final Boolean o() {
        return this.f133580g;
    }

    @Override // z40.d0
    public final String p() {
        return this.f133586m;
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("Node(__typename=");
        sb3.append(this.f133574a);
        sb3.append(", id=");
        sb3.append(this.f133575b);
        sb3.append(", entityId=");
        sb3.append(this.f133576c);
        sb3.append(", verifiedIdentity=");
        sb3.append(this.f133577d);
        sb3.append(", blockedByMe=");
        sb3.append(this.f133578e);
        sb3.append(", isVerifiedMerchant=");
        sb3.append(this.f133579f);
        sb3.append(", isDefaultImage=");
        sb3.append(this.f133580g);
        sb3.append(", imageXlargeUrl=");
        sb3.append(this.f133581h);
        sb3.append(", imageLargeUrl=");
        sb3.append(this.f133582i);
        sb3.append(", imageMediumUrl=");
        sb3.append(this.f133583j);
        sb3.append(", imageSmallUrl=");
        sb3.append(this.f133584k);
        sb3.append(", firstName=");
        sb3.append(this.f133585l);
        sb3.append(", lastName=");
        sb3.append(this.f133586m);
        sb3.append(", fullName=");
        sb3.append(this.f133587n);
        sb3.append(", username=");
        sb3.append(this.f133588o);
        sb3.append(", followerCount=");
        sb3.append(this.f133589p);
        sb3.append(", followingCount=");
        sb3.append(this.f133590q);
        sb3.append(", explicitlyFollowedByMe=");
        sb3.append(this.f133591r);
        sb3.append(", isPrivateProfile=");
        sb3.append(this.f133592s);
        sb3.append(", avatarColorIndex=");
        return a.c.i(sb3, this.f133593t, ")");
    }
}
