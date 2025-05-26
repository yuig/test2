package x40;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class lh implements z40.d0 {

    /* renamed from: a, reason: collision with root package name */
    public final String f132776a;

    /* renamed from: b, reason: collision with root package name */
    public final String f132777b;

    /* renamed from: c, reason: collision with root package name */
    public final String f132778c;

    /* renamed from: d, reason: collision with root package name */
    public final kh f132779d;

    /* renamed from: e, reason: collision with root package name */
    public final Boolean f132780e;

    /* renamed from: f, reason: collision with root package name */
    public final Boolean f132781f;

    /* renamed from: g, reason: collision with root package name */
    public final Boolean f132782g;

    /* renamed from: h, reason: collision with root package name */
    public final String f132783h;

    /* renamed from: i, reason: collision with root package name */
    public final String f132784i;

    /* renamed from: j, reason: collision with root package name */
    public final String f132785j;

    /* renamed from: k, reason: collision with root package name */
    public final String f132786k;

    /* renamed from: l, reason: collision with root package name */
    public final String f132787l;

    /* renamed from: m, reason: collision with root package name */
    public final String f132788m;

    /* renamed from: n, reason: collision with root package name */
    public final String f132789n;

    /* renamed from: o, reason: collision with root package name */
    public final String f132790o;

    /* renamed from: p, reason: collision with root package name */
    public final Integer f132791p;

    /* renamed from: q, reason: collision with root package name */
    public final Integer f132792q;

    /* renamed from: r, reason: collision with root package name */
    public final Boolean f132793r;

    /* renamed from: s, reason: collision with root package name */
    public final Boolean f132794s;

    /* renamed from: t, reason: collision with root package name */
    public final Integer f132795t;

    public lh(String __typename, String id3, String entityId, kh khVar, Boolean bool, Boolean bool2, Boolean bool3, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, Integer num, Integer num2, Boolean bool4, Boolean bool5, Integer num3) {
        Intrinsics.checkNotNullParameter(__typename, "__typename");
        Intrinsics.checkNotNullParameter(id3, "id");
        Intrinsics.checkNotNullParameter(entityId, "entityId");
        this.f132776a = __typename;
        this.f132777b = id3;
        this.f132778c = entityId;
        this.f132779d = khVar;
        this.f132780e = bool;
        this.f132781f = bool2;
        this.f132782g = bool3;
        this.f132783h = str;
        this.f132784i = str2;
        this.f132785j = str3;
        this.f132786k = str4;
        this.f132787l = str5;
        this.f132788m = str6;
        this.f132789n = str7;
        this.f132790o = str8;
        this.f132791p = num;
        this.f132792q = num2;
        this.f132793r = bool4;
        this.f132794s = bool5;
        this.f132795t = num3;
    }

    @Override // z40.d0
    public final String a() {
        return this.f132778c;
    }

    @Override // z40.d0
    public final String b() {
        return this.f132785j;
    }

    @Override // z40.d0
    public final Integer c() {
        return this.f132791p;
    }

    @Override // z40.d0
    public final Boolean d() {
        return this.f132793r;
    }

    @Override // z40.d0
    public final String e() {
        return this.f132784i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof lh)) {
            return false;
        }
        lh lhVar = (lh) obj;
        return Intrinsics.d(this.f132776a, lhVar.f132776a) && Intrinsics.d(this.f132777b, lhVar.f132777b) && Intrinsics.d(this.f132778c, lhVar.f132778c) && Intrinsics.d(this.f132779d, lhVar.f132779d) && Intrinsics.d(this.f132780e, lhVar.f132780e) && Intrinsics.d(this.f132781f, lhVar.f132781f) && Intrinsics.d(this.f132782g, lhVar.f132782g) && Intrinsics.d(this.f132783h, lhVar.f132783h) && Intrinsics.d(this.f132784i, lhVar.f132784i) && Intrinsics.d(this.f132785j, lhVar.f132785j) && Intrinsics.d(this.f132786k, lhVar.f132786k) && Intrinsics.d(this.f132787l, lhVar.f132787l) && Intrinsics.d(this.f132788m, lhVar.f132788m) && Intrinsics.d(this.f132789n, lhVar.f132789n) && Intrinsics.d(this.f132790o, lhVar.f132790o) && Intrinsics.d(this.f132791p, lhVar.f132791p) && Intrinsics.d(this.f132792q, lhVar.f132792q) && Intrinsics.d(this.f132793r, lhVar.f132793r) && Intrinsics.d(this.f132794s, lhVar.f132794s) && Intrinsics.d(this.f132795t, lhVar.f132795t);
    }

    @Override // z40.d0
    public final String f() {
        return this.f132789n;
    }

    @Override // z40.d0
    public final String g() {
        return this.f132790o;
    }

    @Override // z40.d0
    public final String getId() {
        return this.f132777b;
    }

    @Override // z40.d0
    public final Boolean h() {
        return this.f132781f;
    }

    public final int hashCode() {
        int d2 = a.cb.d(this.f132778c, a.cb.d(this.f132777b, this.f132776a.hashCode() * 31, 31), 31);
        kh khVar = this.f132779d;
        int hashCode = (d2 + (khVar == null ? 0 : khVar.hashCode())) * 31;
        Boolean bool = this.f132780e;
        int hashCode2 = (hashCode + (bool == null ? 0 : bool.hashCode())) * 31;
        Boolean bool2 = this.f132781f;
        int hashCode3 = (hashCode2 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        Boolean bool3 = this.f132782g;
        int hashCode4 = (hashCode3 + (bool3 == null ? 0 : bool3.hashCode())) * 31;
        String str = this.f132783h;
        int hashCode5 = (hashCode4 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f132784i;
        int hashCode6 = (hashCode5 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f132785j;
        int hashCode7 = (hashCode6 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.f132786k;
        int hashCode8 = (hashCode7 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.f132787l;
        int hashCode9 = (hashCode8 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.f132788m;
        int hashCode10 = (hashCode9 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.f132789n;
        int hashCode11 = (hashCode10 + (str7 == null ? 0 : str7.hashCode())) * 31;
        String str8 = this.f132790o;
        int hashCode12 = (hashCode11 + (str8 == null ? 0 : str8.hashCode())) * 31;
        Integer num = this.f132791p;
        int hashCode13 = (hashCode12 + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.f132792q;
        int hashCode14 = (hashCode13 + (num2 == null ? 0 : num2.hashCode())) * 31;
        Boolean bool4 = this.f132793r;
        int hashCode15 = (hashCode14 + (bool4 == null ? 0 : bool4.hashCode())) * 31;
        Boolean bool5 = this.f132794s;
        int hashCode16 = (hashCode15 + (bool5 == null ? 0 : bool5.hashCode())) * 31;
        Integer num3 = this.f132795t;
        return hashCode16 + (num3 != null ? num3.hashCode() : 0);
    }

    @Override // z40.d0
    public final z40.c0 i() {
        return this.f132779d;
    }

    @Override // z40.d0
    public final Integer j() {
        return this.f132792q;
    }

    @Override // z40.d0
    public final String k() {
        return this.f132786k;
    }

    @Override // z40.d0
    public final String l() {
        return this.f132787l;
    }

    @Override // z40.d0
    public final String m() {
        return this.f132783h;
    }

    @Override // z40.d0
    public final Integer n() {
        return this.f132795t;
    }

    @Override // z40.d0
    public final Boolean o() {
        return this.f132782g;
    }

    @Override // z40.d0
    public final String p() {
        return this.f132788m;
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("ThirdPartyPinOwner(__typename=");
        sb3.append(this.f132776a);
        sb3.append(", id=");
        sb3.append(this.f132777b);
        sb3.append(", entityId=");
        sb3.append(this.f132778c);
        sb3.append(", verifiedIdentity=");
        sb3.append(this.f132779d);
        sb3.append(", blockedByMe=");
        sb3.append(this.f132780e);
        sb3.append(", isVerifiedMerchant=");
        sb3.append(this.f132781f);
        sb3.append(", isDefaultImage=");
        sb3.append(this.f132782g);
        sb3.append(", imageXlargeUrl=");
        sb3.append(this.f132783h);
        sb3.append(", imageLargeUrl=");
        sb3.append(this.f132784i);
        sb3.append(", imageMediumUrl=");
        sb3.append(this.f132785j);
        sb3.append(", imageSmallUrl=");
        sb3.append(this.f132786k);
        sb3.append(", firstName=");
        sb3.append(this.f132787l);
        sb3.append(", lastName=");
        sb3.append(this.f132788m);
        sb3.append(", fullName=");
        sb3.append(this.f132789n);
        sb3.append(", username=");
        sb3.append(this.f132790o);
        sb3.append(", followerCount=");
        sb3.append(this.f132791p);
        sb3.append(", followingCount=");
        sb3.append(this.f132792q);
        sb3.append(", explicitlyFollowedByMe=");
        sb3.append(this.f132793r);
        sb3.append(", isPrivateProfile=");
        sb3.append(this.f132794s);
        sb3.append(", avatarColorIndex=");
        return a.c.i(sb3, this.f132795t, ")");
    }
}
