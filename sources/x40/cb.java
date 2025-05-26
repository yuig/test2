package x40;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class cb implements z40.d0 {

    /* renamed from: a, reason: collision with root package name */
    public final String f132125a;

    /* renamed from: b, reason: collision with root package name */
    public final String f132126b;

    /* renamed from: c, reason: collision with root package name */
    public final String f132127c;

    /* renamed from: d, reason: collision with root package name */
    public final bb f132128d;

    /* renamed from: e, reason: collision with root package name */
    public final Boolean f132129e;

    /* renamed from: f, reason: collision with root package name */
    public final Boolean f132130f;

    /* renamed from: g, reason: collision with root package name */
    public final Boolean f132131g;

    /* renamed from: h, reason: collision with root package name */
    public final String f132132h;

    /* renamed from: i, reason: collision with root package name */
    public final String f132133i;

    /* renamed from: j, reason: collision with root package name */
    public final String f132134j;

    /* renamed from: k, reason: collision with root package name */
    public final String f132135k;

    /* renamed from: l, reason: collision with root package name */
    public final String f132136l;

    /* renamed from: m, reason: collision with root package name */
    public final String f132137m;

    /* renamed from: n, reason: collision with root package name */
    public final String f132138n;

    /* renamed from: o, reason: collision with root package name */
    public final String f132139o;

    /* renamed from: p, reason: collision with root package name */
    public final Integer f132140p;

    /* renamed from: q, reason: collision with root package name */
    public final Integer f132141q;

    /* renamed from: r, reason: collision with root package name */
    public final Boolean f132142r;

    /* renamed from: s, reason: collision with root package name */
    public final Boolean f132143s;

    /* renamed from: t, reason: collision with root package name */
    public final Integer f132144t;

    public cb(String __typename, String id3, String entityId, bb bbVar, Boolean bool, Boolean bool2, Boolean bool3, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, Integer num, Integer num2, Boolean bool4, Boolean bool5, Integer num3) {
        Intrinsics.checkNotNullParameter(__typename, "__typename");
        Intrinsics.checkNotNullParameter(id3, "id");
        Intrinsics.checkNotNullParameter(entityId, "entityId");
        this.f132125a = __typename;
        this.f132126b = id3;
        this.f132127c = entityId;
        this.f132128d = bbVar;
        this.f132129e = bool;
        this.f132130f = bool2;
        this.f132131g = bool3;
        this.f132132h = str;
        this.f132133i = str2;
        this.f132134j = str3;
        this.f132135k = str4;
        this.f132136l = str5;
        this.f132137m = str6;
        this.f132138n = str7;
        this.f132139o = str8;
        this.f132140p = num;
        this.f132141q = num2;
        this.f132142r = bool4;
        this.f132143s = bool5;
        this.f132144t = num3;
    }

    @Override // z40.d0
    public final String a() {
        return this.f132127c;
    }

    @Override // z40.d0
    public final String b() {
        return this.f132134j;
    }

    @Override // z40.d0
    public final Integer c() {
        return this.f132140p;
    }

    @Override // z40.d0
    public final Boolean d() {
        return this.f132142r;
    }

    @Override // z40.d0
    public final String e() {
        return this.f132133i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof cb)) {
            return false;
        }
        cb cbVar = (cb) obj;
        return Intrinsics.d(this.f132125a, cbVar.f132125a) && Intrinsics.d(this.f132126b, cbVar.f132126b) && Intrinsics.d(this.f132127c, cbVar.f132127c) && Intrinsics.d(this.f132128d, cbVar.f132128d) && Intrinsics.d(this.f132129e, cbVar.f132129e) && Intrinsics.d(this.f132130f, cbVar.f132130f) && Intrinsics.d(this.f132131g, cbVar.f132131g) && Intrinsics.d(this.f132132h, cbVar.f132132h) && Intrinsics.d(this.f132133i, cbVar.f132133i) && Intrinsics.d(this.f132134j, cbVar.f132134j) && Intrinsics.d(this.f132135k, cbVar.f132135k) && Intrinsics.d(this.f132136l, cbVar.f132136l) && Intrinsics.d(this.f132137m, cbVar.f132137m) && Intrinsics.d(this.f132138n, cbVar.f132138n) && Intrinsics.d(this.f132139o, cbVar.f132139o) && Intrinsics.d(this.f132140p, cbVar.f132140p) && Intrinsics.d(this.f132141q, cbVar.f132141q) && Intrinsics.d(this.f132142r, cbVar.f132142r) && Intrinsics.d(this.f132143s, cbVar.f132143s) && Intrinsics.d(this.f132144t, cbVar.f132144t);
    }

    @Override // z40.d0
    public final String f() {
        return this.f132138n;
    }

    @Override // z40.d0
    public final String g() {
        return this.f132139o;
    }

    @Override // z40.d0
    public final String getId() {
        return this.f132126b;
    }

    @Override // z40.d0
    public final Boolean h() {
        return this.f132130f;
    }

    public final int hashCode() {
        int d2 = a.cb.d(this.f132127c, a.cb.d(this.f132126b, this.f132125a.hashCode() * 31, 31), 31);
        bb bbVar = this.f132128d;
        int hashCode = (d2 + (bbVar == null ? 0 : bbVar.hashCode())) * 31;
        Boolean bool = this.f132129e;
        int hashCode2 = (hashCode + (bool == null ? 0 : bool.hashCode())) * 31;
        Boolean bool2 = this.f132130f;
        int hashCode3 = (hashCode2 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        Boolean bool3 = this.f132131g;
        int hashCode4 = (hashCode3 + (bool3 == null ? 0 : bool3.hashCode())) * 31;
        String str = this.f132132h;
        int hashCode5 = (hashCode4 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f132133i;
        int hashCode6 = (hashCode5 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f132134j;
        int hashCode7 = (hashCode6 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.f132135k;
        int hashCode8 = (hashCode7 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.f132136l;
        int hashCode9 = (hashCode8 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.f132137m;
        int hashCode10 = (hashCode9 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.f132138n;
        int hashCode11 = (hashCode10 + (str7 == null ? 0 : str7.hashCode())) * 31;
        String str8 = this.f132139o;
        int hashCode12 = (hashCode11 + (str8 == null ? 0 : str8.hashCode())) * 31;
        Integer num = this.f132140p;
        int hashCode13 = (hashCode12 + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.f132141q;
        int hashCode14 = (hashCode13 + (num2 == null ? 0 : num2.hashCode())) * 31;
        Boolean bool4 = this.f132142r;
        int hashCode15 = (hashCode14 + (bool4 == null ? 0 : bool4.hashCode())) * 31;
        Boolean bool5 = this.f132143s;
        int hashCode16 = (hashCode15 + (bool5 == null ? 0 : bool5.hashCode())) * 31;
        Integer num3 = this.f132144t;
        return hashCode16 + (num3 != null ? num3.hashCode() : 0);
    }

    @Override // z40.d0
    public final z40.c0 i() {
        return this.f132128d;
    }

    @Override // z40.d0
    public final Integer j() {
        return this.f132141q;
    }

    @Override // z40.d0
    public final String k() {
        return this.f132135k;
    }

    @Override // z40.d0
    public final String l() {
        return this.f132136l;
    }

    @Override // z40.d0
    public final String m() {
        return this.f132132h;
    }

    @Override // z40.d0
    public final Integer n() {
        return this.f132144t;
    }

    @Override // z40.d0
    public final Boolean o() {
        return this.f132131g;
    }

    @Override // z40.d0
    public final String p() {
        return this.f132137m;
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("User(__typename=");
        sb3.append(this.f132125a);
        sb3.append(", id=");
        sb3.append(this.f132126b);
        sb3.append(", entityId=");
        sb3.append(this.f132127c);
        sb3.append(", verifiedIdentity=");
        sb3.append(this.f132128d);
        sb3.append(", blockedByMe=");
        sb3.append(this.f132129e);
        sb3.append(", isVerifiedMerchant=");
        sb3.append(this.f132130f);
        sb3.append(", isDefaultImage=");
        sb3.append(this.f132131g);
        sb3.append(", imageXlargeUrl=");
        sb3.append(this.f132132h);
        sb3.append(", imageLargeUrl=");
        sb3.append(this.f132133i);
        sb3.append(", imageMediumUrl=");
        sb3.append(this.f132134j);
        sb3.append(", imageSmallUrl=");
        sb3.append(this.f132135k);
        sb3.append(", firstName=");
        sb3.append(this.f132136l);
        sb3.append(", lastName=");
        sb3.append(this.f132137m);
        sb3.append(", fullName=");
        sb3.append(this.f132138n);
        sb3.append(", username=");
        sb3.append(this.f132139o);
        sb3.append(", followerCount=");
        sb3.append(this.f132140p);
        sb3.append(", followingCount=");
        sb3.append(this.f132141q);
        sb3.append(", explicitlyFollowedByMe=");
        sb3.append(this.f132142r);
        sb3.append(", isPrivateProfile=");
        sb3.append(this.f132143s);
        sb3.append(", avatarColorIndex=");
        return a.c.i(sb3, this.f132144t, ")");
    }
}
