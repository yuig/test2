package x40;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class xg implements z40.d0 {

    /* renamed from: a, reason: collision with root package name */
    public final String f133691a;

    /* renamed from: b, reason: collision with root package name */
    public final String f133692b;

    /* renamed from: c, reason: collision with root package name */
    public final String f133693c;

    /* renamed from: d, reason: collision with root package name */
    public final wg f133694d;

    /* renamed from: e, reason: collision with root package name */
    public final Boolean f133695e;

    /* renamed from: f, reason: collision with root package name */
    public final Boolean f133696f;

    /* renamed from: g, reason: collision with root package name */
    public final Boolean f133697g;

    /* renamed from: h, reason: collision with root package name */
    public final String f133698h;

    /* renamed from: i, reason: collision with root package name */
    public final String f133699i;

    /* renamed from: j, reason: collision with root package name */
    public final String f133700j;

    /* renamed from: k, reason: collision with root package name */
    public final String f133701k;

    /* renamed from: l, reason: collision with root package name */
    public final String f133702l;

    /* renamed from: m, reason: collision with root package name */
    public final String f133703m;

    /* renamed from: n, reason: collision with root package name */
    public final String f133704n;

    /* renamed from: o, reason: collision with root package name */
    public final String f133705o;

    /* renamed from: p, reason: collision with root package name */
    public final Integer f133706p;

    /* renamed from: q, reason: collision with root package name */
    public final Integer f133707q;

    /* renamed from: r, reason: collision with root package name */
    public final Boolean f133708r;

    /* renamed from: s, reason: collision with root package name */
    public final Boolean f133709s;

    /* renamed from: t, reason: collision with root package name */
    public final Integer f133710t;

    public xg(String __typename, String id3, String entityId, wg wgVar, Boolean bool, Boolean bool2, Boolean bool3, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, Integer num, Integer num2, Boolean bool4, Boolean bool5, Integer num3) {
        Intrinsics.checkNotNullParameter(__typename, "__typename");
        Intrinsics.checkNotNullParameter(id3, "id");
        Intrinsics.checkNotNullParameter(entityId, "entityId");
        this.f133691a = __typename;
        this.f133692b = id3;
        this.f133693c = entityId;
        this.f133694d = wgVar;
        this.f133695e = bool;
        this.f133696f = bool2;
        this.f133697g = bool3;
        this.f133698h = str;
        this.f133699i = str2;
        this.f133700j = str3;
        this.f133701k = str4;
        this.f133702l = str5;
        this.f133703m = str6;
        this.f133704n = str7;
        this.f133705o = str8;
        this.f133706p = num;
        this.f133707q = num2;
        this.f133708r = bool4;
        this.f133709s = bool5;
        this.f133710t = num3;
    }

    @Override // z40.d0
    public final String a() {
        return this.f133693c;
    }

    @Override // z40.d0
    public final String b() {
        return this.f133700j;
    }

    @Override // z40.d0
    public final Integer c() {
        return this.f133706p;
    }

    @Override // z40.d0
    public final Boolean d() {
        return this.f133708r;
    }

    @Override // z40.d0
    public final String e() {
        return this.f133699i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xg)) {
            return false;
        }
        xg xgVar = (xg) obj;
        return Intrinsics.d(this.f133691a, xgVar.f133691a) && Intrinsics.d(this.f133692b, xgVar.f133692b) && Intrinsics.d(this.f133693c, xgVar.f133693c) && Intrinsics.d(this.f133694d, xgVar.f133694d) && Intrinsics.d(this.f133695e, xgVar.f133695e) && Intrinsics.d(this.f133696f, xgVar.f133696f) && Intrinsics.d(this.f133697g, xgVar.f133697g) && Intrinsics.d(this.f133698h, xgVar.f133698h) && Intrinsics.d(this.f133699i, xgVar.f133699i) && Intrinsics.d(this.f133700j, xgVar.f133700j) && Intrinsics.d(this.f133701k, xgVar.f133701k) && Intrinsics.d(this.f133702l, xgVar.f133702l) && Intrinsics.d(this.f133703m, xgVar.f133703m) && Intrinsics.d(this.f133704n, xgVar.f133704n) && Intrinsics.d(this.f133705o, xgVar.f133705o) && Intrinsics.d(this.f133706p, xgVar.f133706p) && Intrinsics.d(this.f133707q, xgVar.f133707q) && Intrinsics.d(this.f133708r, xgVar.f133708r) && Intrinsics.d(this.f133709s, xgVar.f133709s) && Intrinsics.d(this.f133710t, xgVar.f133710t);
    }

    @Override // z40.d0
    public final String f() {
        return this.f133704n;
    }

    @Override // z40.d0
    public final String g() {
        return this.f133705o;
    }

    @Override // z40.d0
    public final String getId() {
        return this.f133692b;
    }

    @Override // z40.d0
    public final Boolean h() {
        return this.f133696f;
    }

    public final int hashCode() {
        int d2 = a.cb.d(this.f133693c, a.cb.d(this.f133692b, this.f133691a.hashCode() * 31, 31), 31);
        wg wgVar = this.f133694d;
        int hashCode = (d2 + (wgVar == null ? 0 : wgVar.hashCode())) * 31;
        Boolean bool = this.f133695e;
        int hashCode2 = (hashCode + (bool == null ? 0 : bool.hashCode())) * 31;
        Boolean bool2 = this.f133696f;
        int hashCode3 = (hashCode2 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        Boolean bool3 = this.f133697g;
        int hashCode4 = (hashCode3 + (bool3 == null ? 0 : bool3.hashCode())) * 31;
        String str = this.f133698h;
        int hashCode5 = (hashCode4 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f133699i;
        int hashCode6 = (hashCode5 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f133700j;
        int hashCode7 = (hashCode6 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.f133701k;
        int hashCode8 = (hashCode7 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.f133702l;
        int hashCode9 = (hashCode8 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.f133703m;
        int hashCode10 = (hashCode9 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.f133704n;
        int hashCode11 = (hashCode10 + (str7 == null ? 0 : str7.hashCode())) * 31;
        String str8 = this.f133705o;
        int hashCode12 = (hashCode11 + (str8 == null ? 0 : str8.hashCode())) * 31;
        Integer num = this.f133706p;
        int hashCode13 = (hashCode12 + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.f133707q;
        int hashCode14 = (hashCode13 + (num2 == null ? 0 : num2.hashCode())) * 31;
        Boolean bool4 = this.f133708r;
        int hashCode15 = (hashCode14 + (bool4 == null ? 0 : bool4.hashCode())) * 31;
        Boolean bool5 = this.f133709s;
        int hashCode16 = (hashCode15 + (bool5 == null ? 0 : bool5.hashCode())) * 31;
        Integer num3 = this.f133710t;
        return hashCode16 + (num3 != null ? num3.hashCode() : 0);
    }

    @Override // z40.d0
    public final z40.c0 i() {
        return this.f133694d;
    }

    @Override // z40.d0
    public final Integer j() {
        return this.f133707q;
    }

    @Override // z40.d0
    public final String k() {
        return this.f133701k;
    }

    @Override // z40.d0
    public final String l() {
        return this.f133702l;
    }

    @Override // z40.d0
    public final String m() {
        return this.f133698h;
    }

    @Override // z40.d0
    public final Integer n() {
        return this.f133710t;
    }

    @Override // z40.d0
    public final Boolean o() {
        return this.f133697g;
    }

    @Override // z40.d0
    public final String p() {
        return this.f133703m;
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("OfficialUser(__typename=");
        sb3.append(this.f133691a);
        sb3.append(", id=");
        sb3.append(this.f133692b);
        sb3.append(", entityId=");
        sb3.append(this.f133693c);
        sb3.append(", verifiedIdentity=");
        sb3.append(this.f133694d);
        sb3.append(", blockedByMe=");
        sb3.append(this.f133695e);
        sb3.append(", isVerifiedMerchant=");
        sb3.append(this.f133696f);
        sb3.append(", isDefaultImage=");
        sb3.append(this.f133697g);
        sb3.append(", imageXlargeUrl=");
        sb3.append(this.f133698h);
        sb3.append(", imageLargeUrl=");
        sb3.append(this.f133699i);
        sb3.append(", imageMediumUrl=");
        sb3.append(this.f133700j);
        sb3.append(", imageSmallUrl=");
        sb3.append(this.f133701k);
        sb3.append(", firstName=");
        sb3.append(this.f133702l);
        sb3.append(", lastName=");
        sb3.append(this.f133703m);
        sb3.append(", fullName=");
        sb3.append(this.f133704n);
        sb3.append(", username=");
        sb3.append(this.f133705o);
        sb3.append(", followerCount=");
        sb3.append(this.f133706p);
        sb3.append(", followingCount=");
        sb3.append(this.f133707q);
        sb3.append(", explicitlyFollowedByMe=");
        sb3.append(this.f133708r);
        sb3.append(", isPrivateProfile=");
        sb3.append(this.f133709s);
        sb3.append(", avatarColorIndex=");
        return a.c.i(sb3, this.f133710t, ")");
    }
}
