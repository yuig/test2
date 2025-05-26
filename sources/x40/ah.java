package x40;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class ah implements z40.d0 {

    /* renamed from: a, reason: collision with root package name */
    public final String f131971a;

    /* renamed from: b, reason: collision with root package name */
    public final String f131972b;

    /* renamed from: c, reason: collision with root package name */
    public final String f131973c;

    /* renamed from: d, reason: collision with root package name */
    public final zg f131974d;

    /* renamed from: e, reason: collision with root package name */
    public final Boolean f131975e;

    /* renamed from: f, reason: collision with root package name */
    public final Boolean f131976f;

    /* renamed from: g, reason: collision with root package name */
    public final Boolean f131977g;

    /* renamed from: h, reason: collision with root package name */
    public final String f131978h;

    /* renamed from: i, reason: collision with root package name */
    public final String f131979i;

    /* renamed from: j, reason: collision with root package name */
    public final String f131980j;

    /* renamed from: k, reason: collision with root package name */
    public final String f131981k;

    /* renamed from: l, reason: collision with root package name */
    public final String f131982l;

    /* renamed from: m, reason: collision with root package name */
    public final String f131983m;

    /* renamed from: n, reason: collision with root package name */
    public final String f131984n;

    /* renamed from: o, reason: collision with root package name */
    public final String f131985o;

    /* renamed from: p, reason: collision with root package name */
    public final Integer f131986p;

    /* renamed from: q, reason: collision with root package name */
    public final Integer f131987q;

    /* renamed from: r, reason: collision with root package name */
    public final Boolean f131988r;

    /* renamed from: s, reason: collision with root package name */
    public final Boolean f131989s;

    /* renamed from: t, reason: collision with root package name */
    public final Integer f131990t;

    public ah(String __typename, String id3, String entityId, zg zgVar, Boolean bool, Boolean bool2, Boolean bool3, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, Integer num, Integer num2, Boolean bool4, Boolean bool5, Integer num3) {
        Intrinsics.checkNotNullParameter(__typename, "__typename");
        Intrinsics.checkNotNullParameter(id3, "id");
        Intrinsics.checkNotNullParameter(entityId, "entityId");
        this.f131971a = __typename;
        this.f131972b = id3;
        this.f131973c = entityId;
        this.f131974d = zgVar;
        this.f131975e = bool;
        this.f131976f = bool2;
        this.f131977g = bool3;
        this.f131978h = str;
        this.f131979i = str2;
        this.f131980j = str3;
        this.f131981k = str4;
        this.f131982l = str5;
        this.f131983m = str6;
        this.f131984n = str7;
        this.f131985o = str8;
        this.f131986p = num;
        this.f131987q = num2;
        this.f131988r = bool4;
        this.f131989s = bool5;
        this.f131990t = num3;
    }

    @Override // z40.d0
    public final String a() {
        return this.f131973c;
    }

    @Override // z40.d0
    public final String b() {
        return this.f131980j;
    }

    @Override // z40.d0
    public final Integer c() {
        return this.f131986p;
    }

    @Override // z40.d0
    public final Boolean d() {
        return this.f131988r;
    }

    @Override // z40.d0
    public final String e() {
        return this.f131979i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ah)) {
            return false;
        }
        ah ahVar = (ah) obj;
        return Intrinsics.d(this.f131971a, ahVar.f131971a) && Intrinsics.d(this.f131972b, ahVar.f131972b) && Intrinsics.d(this.f131973c, ahVar.f131973c) && Intrinsics.d(this.f131974d, ahVar.f131974d) && Intrinsics.d(this.f131975e, ahVar.f131975e) && Intrinsics.d(this.f131976f, ahVar.f131976f) && Intrinsics.d(this.f131977g, ahVar.f131977g) && Intrinsics.d(this.f131978h, ahVar.f131978h) && Intrinsics.d(this.f131979i, ahVar.f131979i) && Intrinsics.d(this.f131980j, ahVar.f131980j) && Intrinsics.d(this.f131981k, ahVar.f131981k) && Intrinsics.d(this.f131982l, ahVar.f131982l) && Intrinsics.d(this.f131983m, ahVar.f131983m) && Intrinsics.d(this.f131984n, ahVar.f131984n) && Intrinsics.d(this.f131985o, ahVar.f131985o) && Intrinsics.d(this.f131986p, ahVar.f131986p) && Intrinsics.d(this.f131987q, ahVar.f131987q) && Intrinsics.d(this.f131988r, ahVar.f131988r) && Intrinsics.d(this.f131989s, ahVar.f131989s) && Intrinsics.d(this.f131990t, ahVar.f131990t);
    }

    @Override // z40.d0
    public final String f() {
        return this.f131984n;
    }

    @Override // z40.d0
    public final String g() {
        return this.f131985o;
    }

    @Override // z40.d0
    public final String getId() {
        return this.f131972b;
    }

    @Override // z40.d0
    public final Boolean h() {
        return this.f131976f;
    }

    public final int hashCode() {
        int d2 = a.cb.d(this.f131973c, a.cb.d(this.f131972b, this.f131971a.hashCode() * 31, 31), 31);
        zg zgVar = this.f131974d;
        int hashCode = (d2 + (zgVar == null ? 0 : zgVar.hashCode())) * 31;
        Boolean bool = this.f131975e;
        int hashCode2 = (hashCode + (bool == null ? 0 : bool.hashCode())) * 31;
        Boolean bool2 = this.f131976f;
        int hashCode3 = (hashCode2 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        Boolean bool3 = this.f131977g;
        int hashCode4 = (hashCode3 + (bool3 == null ? 0 : bool3.hashCode())) * 31;
        String str = this.f131978h;
        int hashCode5 = (hashCode4 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f131979i;
        int hashCode6 = (hashCode5 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f131980j;
        int hashCode7 = (hashCode6 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.f131981k;
        int hashCode8 = (hashCode7 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.f131982l;
        int hashCode9 = (hashCode8 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.f131983m;
        int hashCode10 = (hashCode9 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.f131984n;
        int hashCode11 = (hashCode10 + (str7 == null ? 0 : str7.hashCode())) * 31;
        String str8 = this.f131985o;
        int hashCode12 = (hashCode11 + (str8 == null ? 0 : str8.hashCode())) * 31;
        Integer num = this.f131986p;
        int hashCode13 = (hashCode12 + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.f131987q;
        int hashCode14 = (hashCode13 + (num2 == null ? 0 : num2.hashCode())) * 31;
        Boolean bool4 = this.f131988r;
        int hashCode15 = (hashCode14 + (bool4 == null ? 0 : bool4.hashCode())) * 31;
        Boolean bool5 = this.f131989s;
        int hashCode16 = (hashCode15 + (bool5 == null ? 0 : bool5.hashCode())) * 31;
        Integer num3 = this.f131990t;
        return hashCode16 + (num3 != null ? num3.hashCode() : 0);
    }

    @Override // z40.d0
    public final z40.c0 i() {
        return this.f131974d;
    }

    @Override // z40.d0
    public final Integer j() {
        return this.f131987q;
    }

    @Override // z40.d0
    public final String k() {
        return this.f131981k;
    }

    @Override // z40.d0
    public final String l() {
        return this.f131982l;
    }

    @Override // z40.d0
    public final String m() {
        return this.f131978h;
    }

    @Override // z40.d0
    public final Integer n() {
        return this.f131990t;
    }

    @Override // z40.d0
    public final Boolean o() {
        return this.f131977g;
    }

    @Override // z40.d0
    public final String p() {
        return this.f131983m;
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("NativeCreator(__typename=");
        sb3.append(this.f131971a);
        sb3.append(", id=");
        sb3.append(this.f131972b);
        sb3.append(", entityId=");
        sb3.append(this.f131973c);
        sb3.append(", verifiedIdentity=");
        sb3.append(this.f131974d);
        sb3.append(", blockedByMe=");
        sb3.append(this.f131975e);
        sb3.append(", isVerifiedMerchant=");
        sb3.append(this.f131976f);
        sb3.append(", isDefaultImage=");
        sb3.append(this.f131977g);
        sb3.append(", imageXlargeUrl=");
        sb3.append(this.f131978h);
        sb3.append(", imageLargeUrl=");
        sb3.append(this.f131979i);
        sb3.append(", imageMediumUrl=");
        sb3.append(this.f131980j);
        sb3.append(", imageSmallUrl=");
        sb3.append(this.f131981k);
        sb3.append(", firstName=");
        sb3.append(this.f131982l);
        sb3.append(", lastName=");
        sb3.append(this.f131983m);
        sb3.append(", fullName=");
        sb3.append(this.f131984n);
        sb3.append(", username=");
        sb3.append(this.f131985o);
        sb3.append(", followerCount=");
        sb3.append(this.f131986p);
        sb3.append(", followingCount=");
        sb3.append(this.f131987q);
        sb3.append(", explicitlyFollowedByMe=");
        sb3.append(this.f131988r);
        sb3.append(", isPrivateProfile=");
        sb3.append(this.f131989s);
        sb3.append(", avatarColorIndex=");
        return a.c.i(sb3, this.f131990t, ")");
    }
}
