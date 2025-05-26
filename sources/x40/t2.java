package x40;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class t2 implements z40.d0 {

    /* renamed from: a, reason: collision with root package name */
    public final String f133307a;

    /* renamed from: b, reason: collision with root package name */
    public final String f133308b;

    /* renamed from: c, reason: collision with root package name */
    public final String f133309c;

    /* renamed from: d, reason: collision with root package name */
    public final s2 f133310d;

    /* renamed from: e, reason: collision with root package name */
    public final Boolean f133311e;

    /* renamed from: f, reason: collision with root package name */
    public final Boolean f133312f;

    /* renamed from: g, reason: collision with root package name */
    public final Boolean f133313g;

    /* renamed from: h, reason: collision with root package name */
    public final String f133314h;

    /* renamed from: i, reason: collision with root package name */
    public final String f133315i;

    /* renamed from: j, reason: collision with root package name */
    public final String f133316j;

    /* renamed from: k, reason: collision with root package name */
    public final String f133317k;

    /* renamed from: l, reason: collision with root package name */
    public final String f133318l;

    /* renamed from: m, reason: collision with root package name */
    public final String f133319m;

    /* renamed from: n, reason: collision with root package name */
    public final String f133320n;

    /* renamed from: o, reason: collision with root package name */
    public final String f133321o;

    /* renamed from: p, reason: collision with root package name */
    public final Integer f133322p;

    /* renamed from: q, reason: collision with root package name */
    public final Integer f133323q;

    /* renamed from: r, reason: collision with root package name */
    public final Boolean f133324r;

    /* renamed from: s, reason: collision with root package name */
    public final Boolean f133325s;

    /* renamed from: t, reason: collision with root package name */
    public final Integer f133326t;

    public t2(String __typename, String id3, String entityId, s2 s2Var, Boolean bool, Boolean bool2, Boolean bool3, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, Integer num, Integer num2, Boolean bool4, Boolean bool5, Integer num3) {
        Intrinsics.checkNotNullParameter(__typename, "__typename");
        Intrinsics.checkNotNullParameter(id3, "id");
        Intrinsics.checkNotNullParameter(entityId, "entityId");
        this.f133307a = __typename;
        this.f133308b = id3;
        this.f133309c = entityId;
        this.f133310d = s2Var;
        this.f133311e = bool;
        this.f133312f = bool2;
        this.f133313g = bool3;
        this.f133314h = str;
        this.f133315i = str2;
        this.f133316j = str3;
        this.f133317k = str4;
        this.f133318l = str5;
        this.f133319m = str6;
        this.f133320n = str7;
        this.f133321o = str8;
        this.f133322p = num;
        this.f133323q = num2;
        this.f133324r = bool4;
        this.f133325s = bool5;
        this.f133326t = num3;
    }

    @Override // z40.d0
    public final String a() {
        return this.f133309c;
    }

    @Override // z40.d0
    public final String b() {
        return this.f133316j;
    }

    @Override // z40.d0
    public final Integer c() {
        return this.f133322p;
    }

    @Override // z40.d0
    public final Boolean d() {
        return this.f133324r;
    }

    @Override // z40.d0
    public final String e() {
        return this.f133315i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof t2)) {
            return false;
        }
        t2 t2Var = (t2) obj;
        return Intrinsics.d(this.f133307a, t2Var.f133307a) && Intrinsics.d(this.f133308b, t2Var.f133308b) && Intrinsics.d(this.f133309c, t2Var.f133309c) && Intrinsics.d(this.f133310d, t2Var.f133310d) && Intrinsics.d(this.f133311e, t2Var.f133311e) && Intrinsics.d(this.f133312f, t2Var.f133312f) && Intrinsics.d(this.f133313g, t2Var.f133313g) && Intrinsics.d(this.f133314h, t2Var.f133314h) && Intrinsics.d(this.f133315i, t2Var.f133315i) && Intrinsics.d(this.f133316j, t2Var.f133316j) && Intrinsics.d(this.f133317k, t2Var.f133317k) && Intrinsics.d(this.f133318l, t2Var.f133318l) && Intrinsics.d(this.f133319m, t2Var.f133319m) && Intrinsics.d(this.f133320n, t2Var.f133320n) && Intrinsics.d(this.f133321o, t2Var.f133321o) && Intrinsics.d(this.f133322p, t2Var.f133322p) && Intrinsics.d(this.f133323q, t2Var.f133323q) && Intrinsics.d(this.f133324r, t2Var.f133324r) && Intrinsics.d(this.f133325s, t2Var.f133325s) && Intrinsics.d(this.f133326t, t2Var.f133326t);
    }

    @Override // z40.d0
    public final String f() {
        return this.f133320n;
    }

    @Override // z40.d0
    public final String g() {
        return this.f133321o;
    }

    @Override // z40.d0
    public final String getId() {
        return this.f133308b;
    }

    @Override // z40.d0
    public final Boolean h() {
        return this.f133312f;
    }

    public final int hashCode() {
        int d2 = a.cb.d(this.f133309c, a.cb.d(this.f133308b, this.f133307a.hashCode() * 31, 31), 31);
        s2 s2Var = this.f133310d;
        int hashCode = (d2 + (s2Var == null ? 0 : s2Var.hashCode())) * 31;
        Boolean bool = this.f133311e;
        int hashCode2 = (hashCode + (bool == null ? 0 : bool.hashCode())) * 31;
        Boolean bool2 = this.f133312f;
        int hashCode3 = (hashCode2 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        Boolean bool3 = this.f133313g;
        int hashCode4 = (hashCode3 + (bool3 == null ? 0 : bool3.hashCode())) * 31;
        String str = this.f133314h;
        int hashCode5 = (hashCode4 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f133315i;
        int hashCode6 = (hashCode5 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f133316j;
        int hashCode7 = (hashCode6 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.f133317k;
        int hashCode8 = (hashCode7 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.f133318l;
        int hashCode9 = (hashCode8 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.f133319m;
        int hashCode10 = (hashCode9 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.f133320n;
        int hashCode11 = (hashCode10 + (str7 == null ? 0 : str7.hashCode())) * 31;
        String str8 = this.f133321o;
        int hashCode12 = (hashCode11 + (str8 == null ? 0 : str8.hashCode())) * 31;
        Integer num = this.f133322p;
        int hashCode13 = (hashCode12 + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.f133323q;
        int hashCode14 = (hashCode13 + (num2 == null ? 0 : num2.hashCode())) * 31;
        Boolean bool4 = this.f133324r;
        int hashCode15 = (hashCode14 + (bool4 == null ? 0 : bool4.hashCode())) * 31;
        Boolean bool5 = this.f133325s;
        int hashCode16 = (hashCode15 + (bool5 == null ? 0 : bool5.hashCode())) * 31;
        Integer num3 = this.f133326t;
        return hashCode16 + (num3 != null ? num3.hashCode() : 0);
    }

    @Override // z40.d0
    public final z40.c0 i() {
        return this.f133310d;
    }

    @Override // z40.d0
    public final Integer j() {
        return this.f133323q;
    }

    @Override // z40.d0
    public final String k() {
        return this.f133317k;
    }

    @Override // z40.d0
    public final String l() {
        return this.f133318l;
    }

    @Override // z40.d0
    public final String m() {
        return this.f133314h;
    }

    @Override // z40.d0
    public final Integer n() {
        return this.f133326t;
    }

    @Override // z40.d0
    public final Boolean o() {
        return this.f133313g;
    }

    @Override // z40.d0
    public final String p() {
        return this.f133319m;
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("User(__typename=");
        sb3.append(this.f133307a);
        sb3.append(", id=");
        sb3.append(this.f133308b);
        sb3.append(", entityId=");
        sb3.append(this.f133309c);
        sb3.append(", verifiedIdentity=");
        sb3.append(this.f133310d);
        sb3.append(", blockedByMe=");
        sb3.append(this.f133311e);
        sb3.append(", isVerifiedMerchant=");
        sb3.append(this.f133312f);
        sb3.append(", isDefaultImage=");
        sb3.append(this.f133313g);
        sb3.append(", imageXlargeUrl=");
        sb3.append(this.f133314h);
        sb3.append(", imageLargeUrl=");
        sb3.append(this.f133315i);
        sb3.append(", imageMediumUrl=");
        sb3.append(this.f133316j);
        sb3.append(", imageSmallUrl=");
        sb3.append(this.f133317k);
        sb3.append(", firstName=");
        sb3.append(this.f133318l);
        sb3.append(", lastName=");
        sb3.append(this.f133319m);
        sb3.append(", fullName=");
        sb3.append(this.f133320n);
        sb3.append(", username=");
        sb3.append(this.f133321o);
        sb3.append(", followerCount=");
        sb3.append(this.f133322p);
        sb3.append(", followingCount=");
        sb3.append(this.f133323q);
        sb3.append(", explicitlyFollowedByMe=");
        sb3.append(this.f133324r);
        sb3.append(", isPrivateProfile=");
        sb3.append(this.f133325s);
        sb3.append(", avatarColorIndex=");
        return a.c.i(sb3, this.f133326t, ")");
    }
}
