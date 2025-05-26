package x40;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class l8 implements z40.d0 {

    /* renamed from: a, reason: collision with root package name */
    public final String f132706a;

    /* renamed from: b, reason: collision with root package name */
    public final String f132707b;

    /* renamed from: c, reason: collision with root package name */
    public final String f132708c;

    /* renamed from: d, reason: collision with root package name */
    public final k8 f132709d;

    /* renamed from: e, reason: collision with root package name */
    public final Boolean f132710e;

    /* renamed from: f, reason: collision with root package name */
    public final Boolean f132711f;

    /* renamed from: g, reason: collision with root package name */
    public final Boolean f132712g;

    /* renamed from: h, reason: collision with root package name */
    public final String f132713h;

    /* renamed from: i, reason: collision with root package name */
    public final String f132714i;

    /* renamed from: j, reason: collision with root package name */
    public final String f132715j;

    /* renamed from: k, reason: collision with root package name */
    public final String f132716k;

    /* renamed from: l, reason: collision with root package name */
    public final String f132717l;

    /* renamed from: m, reason: collision with root package name */
    public final String f132718m;

    /* renamed from: n, reason: collision with root package name */
    public final String f132719n;

    /* renamed from: o, reason: collision with root package name */
    public final String f132720o;

    /* renamed from: p, reason: collision with root package name */
    public final Integer f132721p;

    /* renamed from: q, reason: collision with root package name */
    public final Integer f132722q;

    /* renamed from: r, reason: collision with root package name */
    public final Boolean f132723r;

    /* renamed from: s, reason: collision with root package name */
    public final Boolean f132724s;

    /* renamed from: t, reason: collision with root package name */
    public final Integer f132725t;

    public l8(String __typename, String id3, String entityId, k8 k8Var, Boolean bool, Boolean bool2, Boolean bool3, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, Integer num, Integer num2, Boolean bool4, Boolean bool5, Integer num3) {
        Intrinsics.checkNotNullParameter(__typename, "__typename");
        Intrinsics.checkNotNullParameter(id3, "id");
        Intrinsics.checkNotNullParameter(entityId, "entityId");
        this.f132706a = __typename;
        this.f132707b = id3;
        this.f132708c = entityId;
        this.f132709d = k8Var;
        this.f132710e = bool;
        this.f132711f = bool2;
        this.f132712g = bool3;
        this.f132713h = str;
        this.f132714i = str2;
        this.f132715j = str3;
        this.f132716k = str4;
        this.f132717l = str5;
        this.f132718m = str6;
        this.f132719n = str7;
        this.f132720o = str8;
        this.f132721p = num;
        this.f132722q = num2;
        this.f132723r = bool4;
        this.f132724s = bool5;
        this.f132725t = num3;
    }

    @Override // z40.d0
    public final String a() {
        return this.f132708c;
    }

    @Override // z40.d0
    public final String b() {
        return this.f132715j;
    }

    @Override // z40.d0
    public final Integer c() {
        return this.f132721p;
    }

    @Override // z40.d0
    public final Boolean d() {
        return this.f132723r;
    }

    @Override // z40.d0
    public final String e() {
        return this.f132714i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof l8)) {
            return false;
        }
        l8 l8Var = (l8) obj;
        return Intrinsics.d(this.f132706a, l8Var.f132706a) && Intrinsics.d(this.f132707b, l8Var.f132707b) && Intrinsics.d(this.f132708c, l8Var.f132708c) && Intrinsics.d(this.f132709d, l8Var.f132709d) && Intrinsics.d(this.f132710e, l8Var.f132710e) && Intrinsics.d(this.f132711f, l8Var.f132711f) && Intrinsics.d(this.f132712g, l8Var.f132712g) && Intrinsics.d(this.f132713h, l8Var.f132713h) && Intrinsics.d(this.f132714i, l8Var.f132714i) && Intrinsics.d(this.f132715j, l8Var.f132715j) && Intrinsics.d(this.f132716k, l8Var.f132716k) && Intrinsics.d(this.f132717l, l8Var.f132717l) && Intrinsics.d(this.f132718m, l8Var.f132718m) && Intrinsics.d(this.f132719n, l8Var.f132719n) && Intrinsics.d(this.f132720o, l8Var.f132720o) && Intrinsics.d(this.f132721p, l8Var.f132721p) && Intrinsics.d(this.f132722q, l8Var.f132722q) && Intrinsics.d(this.f132723r, l8Var.f132723r) && Intrinsics.d(this.f132724s, l8Var.f132724s) && Intrinsics.d(this.f132725t, l8Var.f132725t);
    }

    @Override // z40.d0
    public final String f() {
        return this.f132719n;
    }

    @Override // z40.d0
    public final String g() {
        return this.f132720o;
    }

    @Override // z40.d0
    public final String getId() {
        return this.f132707b;
    }

    @Override // z40.d0
    public final Boolean h() {
        return this.f132711f;
    }

    public final int hashCode() {
        int d2 = a.cb.d(this.f132708c, a.cb.d(this.f132707b, this.f132706a.hashCode() * 31, 31), 31);
        k8 k8Var = this.f132709d;
        int hashCode = (d2 + (k8Var == null ? 0 : k8Var.hashCode())) * 31;
        Boolean bool = this.f132710e;
        int hashCode2 = (hashCode + (bool == null ? 0 : bool.hashCode())) * 31;
        Boolean bool2 = this.f132711f;
        int hashCode3 = (hashCode2 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        Boolean bool3 = this.f132712g;
        int hashCode4 = (hashCode3 + (bool3 == null ? 0 : bool3.hashCode())) * 31;
        String str = this.f132713h;
        int hashCode5 = (hashCode4 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f132714i;
        int hashCode6 = (hashCode5 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f132715j;
        int hashCode7 = (hashCode6 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.f132716k;
        int hashCode8 = (hashCode7 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.f132717l;
        int hashCode9 = (hashCode8 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.f132718m;
        int hashCode10 = (hashCode9 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.f132719n;
        int hashCode11 = (hashCode10 + (str7 == null ? 0 : str7.hashCode())) * 31;
        String str8 = this.f132720o;
        int hashCode12 = (hashCode11 + (str8 == null ? 0 : str8.hashCode())) * 31;
        Integer num = this.f132721p;
        int hashCode13 = (hashCode12 + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.f132722q;
        int hashCode14 = (hashCode13 + (num2 == null ? 0 : num2.hashCode())) * 31;
        Boolean bool4 = this.f132723r;
        int hashCode15 = (hashCode14 + (bool4 == null ? 0 : bool4.hashCode())) * 31;
        Boolean bool5 = this.f132724s;
        int hashCode16 = (hashCode15 + (bool5 == null ? 0 : bool5.hashCode())) * 31;
        Integer num3 = this.f132725t;
        return hashCode16 + (num3 != null ? num3.hashCode() : 0);
    }

    @Override // z40.d0
    public final z40.c0 i() {
        return this.f132709d;
    }

    @Override // z40.d0
    public final Integer j() {
        return this.f132722q;
    }

    @Override // z40.d0
    public final String k() {
        return this.f132716k;
    }

    @Override // z40.d0
    public final String l() {
        return this.f132717l;
    }

    @Override // z40.d0
    public final String m() {
        return this.f132713h;
    }

    @Override // z40.d0
    public final Integer n() {
        return this.f132725t;
    }

    @Override // z40.d0
    public final Boolean o() {
        return this.f132712g;
    }

    @Override // z40.d0
    public final String p() {
        return this.f132718m;
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("Pinner(__typename=");
        sb3.append(this.f132706a);
        sb3.append(", id=");
        sb3.append(this.f132707b);
        sb3.append(", entityId=");
        sb3.append(this.f132708c);
        sb3.append(", verifiedIdentity=");
        sb3.append(this.f132709d);
        sb3.append(", blockedByMe=");
        sb3.append(this.f132710e);
        sb3.append(", isVerifiedMerchant=");
        sb3.append(this.f132711f);
        sb3.append(", isDefaultImage=");
        sb3.append(this.f132712g);
        sb3.append(", imageXlargeUrl=");
        sb3.append(this.f132713h);
        sb3.append(", imageLargeUrl=");
        sb3.append(this.f132714i);
        sb3.append(", imageMediumUrl=");
        sb3.append(this.f132715j);
        sb3.append(", imageSmallUrl=");
        sb3.append(this.f132716k);
        sb3.append(", firstName=");
        sb3.append(this.f132717l);
        sb3.append(", lastName=");
        sb3.append(this.f132718m);
        sb3.append(", fullName=");
        sb3.append(this.f132719n);
        sb3.append(", username=");
        sb3.append(this.f132720o);
        sb3.append(", followerCount=");
        sb3.append(this.f132721p);
        sb3.append(", followingCount=");
        sb3.append(this.f132722q);
        sb3.append(", explicitlyFollowedByMe=");
        sb3.append(this.f132723r);
        sb3.append(", isPrivateProfile=");
        sb3.append(this.f132724s);
        sb3.append(", avatarColorIndex=");
        return a.c.i(sb3, this.f132725t, ")");
    }
}
