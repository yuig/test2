package x40;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class tc implements z40.d0, z40.e {

    /* renamed from: a, reason: collision with root package name */
    public final String f133360a;

    /* renamed from: b, reason: collision with root package name */
    public final String f133361b;

    /* renamed from: c, reason: collision with root package name */
    public final String f133362c;

    /* renamed from: d, reason: collision with root package name */
    public final sc f133363d;

    /* renamed from: e, reason: collision with root package name */
    public final Boolean f133364e;

    /* renamed from: f, reason: collision with root package name */
    public final Boolean f133365f;

    /* renamed from: g, reason: collision with root package name */
    public final Boolean f133366g;

    /* renamed from: h, reason: collision with root package name */
    public final String f133367h;

    /* renamed from: i, reason: collision with root package name */
    public final String f133368i;

    /* renamed from: j, reason: collision with root package name */
    public final String f133369j;

    /* renamed from: k, reason: collision with root package name */
    public final String f133370k;

    /* renamed from: l, reason: collision with root package name */
    public final String f133371l;

    /* renamed from: m, reason: collision with root package name */
    public final String f133372m;

    /* renamed from: n, reason: collision with root package name */
    public final String f133373n;

    /* renamed from: o, reason: collision with root package name */
    public final String f133374o;

    /* renamed from: p, reason: collision with root package name */
    public final Integer f133375p;

    /* renamed from: q, reason: collision with root package name */
    public final Integer f133376q;

    /* renamed from: r, reason: collision with root package name */
    public final Boolean f133377r;

    /* renamed from: s, reason: collision with root package name */
    public final Boolean f133378s;

    /* renamed from: t, reason: collision with root package name */
    public final Integer f133379t;

    public tc(String __typename, String id3, String entityId, sc scVar, Boolean bool, Boolean bool2, Boolean bool3, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, Integer num, Integer num2, Boolean bool4, Boolean bool5, Integer num3) {
        Intrinsics.checkNotNullParameter(__typename, "__typename");
        Intrinsics.checkNotNullParameter(id3, "id");
        Intrinsics.checkNotNullParameter(entityId, "entityId");
        this.f133360a = __typename;
        this.f133361b = id3;
        this.f133362c = entityId;
        this.f133363d = scVar;
        this.f133364e = bool;
        this.f133365f = bool2;
        this.f133366g = bool3;
        this.f133367h = str;
        this.f133368i = str2;
        this.f133369j = str3;
        this.f133370k = str4;
        this.f133371l = str5;
        this.f133372m = str6;
        this.f133373n = str7;
        this.f133374o = str8;
        this.f133375p = num;
        this.f133376q = num2;
        this.f133377r = bool4;
        this.f133378s = bool5;
        this.f133379t = num3;
    }

    @Override // z40.d0
    public final String a() {
        return this.f133362c;
    }

    @Override // z40.d0
    public final String b() {
        return this.f133369j;
    }

    @Override // z40.d0
    public final Integer c() {
        return this.f133375p;
    }

    @Override // z40.d0
    public final Boolean d() {
        return this.f133377r;
    }

    @Override // z40.d0
    public final String e() {
        return this.f133368i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof tc)) {
            return false;
        }
        tc tcVar = (tc) obj;
        return Intrinsics.d(this.f133360a, tcVar.f133360a) && Intrinsics.d(this.f133361b, tcVar.f133361b) && Intrinsics.d(this.f133362c, tcVar.f133362c) && Intrinsics.d(this.f133363d, tcVar.f133363d) && Intrinsics.d(this.f133364e, tcVar.f133364e) && Intrinsics.d(this.f133365f, tcVar.f133365f) && Intrinsics.d(this.f133366g, tcVar.f133366g) && Intrinsics.d(this.f133367h, tcVar.f133367h) && Intrinsics.d(this.f133368i, tcVar.f133368i) && Intrinsics.d(this.f133369j, tcVar.f133369j) && Intrinsics.d(this.f133370k, tcVar.f133370k) && Intrinsics.d(this.f133371l, tcVar.f133371l) && Intrinsics.d(this.f133372m, tcVar.f133372m) && Intrinsics.d(this.f133373n, tcVar.f133373n) && Intrinsics.d(this.f133374o, tcVar.f133374o) && Intrinsics.d(this.f133375p, tcVar.f133375p) && Intrinsics.d(this.f133376q, tcVar.f133376q) && Intrinsics.d(this.f133377r, tcVar.f133377r) && Intrinsics.d(this.f133378s, tcVar.f133378s) && Intrinsics.d(this.f133379t, tcVar.f133379t);
    }

    @Override // z40.d0
    public final String f() {
        return this.f133373n;
    }

    @Override // z40.d0
    public final String g() {
        return this.f133374o;
    }

    @Override // z40.d0
    public final String getId() {
        return this.f133361b;
    }

    @Override // z40.d0
    public final Boolean h() {
        return this.f133365f;
    }

    public final int hashCode() {
        int d2 = a.cb.d(this.f133362c, a.cb.d(this.f133361b, this.f133360a.hashCode() * 31, 31), 31);
        sc scVar = this.f133363d;
        int hashCode = (d2 + (scVar == null ? 0 : scVar.hashCode())) * 31;
        Boolean bool = this.f133364e;
        int hashCode2 = (hashCode + (bool == null ? 0 : bool.hashCode())) * 31;
        Boolean bool2 = this.f133365f;
        int hashCode3 = (hashCode2 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        Boolean bool3 = this.f133366g;
        int hashCode4 = (hashCode3 + (bool3 == null ? 0 : bool3.hashCode())) * 31;
        String str = this.f133367h;
        int hashCode5 = (hashCode4 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f133368i;
        int hashCode6 = (hashCode5 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f133369j;
        int hashCode7 = (hashCode6 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.f133370k;
        int hashCode8 = (hashCode7 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.f133371l;
        int hashCode9 = (hashCode8 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.f133372m;
        int hashCode10 = (hashCode9 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.f133373n;
        int hashCode11 = (hashCode10 + (str7 == null ? 0 : str7.hashCode())) * 31;
        String str8 = this.f133374o;
        int hashCode12 = (hashCode11 + (str8 == null ? 0 : str8.hashCode())) * 31;
        Integer num = this.f133375p;
        int hashCode13 = (hashCode12 + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.f133376q;
        int hashCode14 = (hashCode13 + (num2 == null ? 0 : num2.hashCode())) * 31;
        Boolean bool4 = this.f133377r;
        int hashCode15 = (hashCode14 + (bool4 == null ? 0 : bool4.hashCode())) * 31;
        Boolean bool5 = this.f133378s;
        int hashCode16 = (hashCode15 + (bool5 == null ? 0 : bool5.hashCode())) * 31;
        Integer num3 = this.f133379t;
        return hashCode16 + (num3 != null ? num3.hashCode() : 0);
    }

    @Override // z40.d0
    public final z40.c0 i() {
        return this.f133363d;
    }

    @Override // z40.d0
    public final Integer j() {
        return this.f133376q;
    }

    @Override // z40.d0
    public final String k() {
        return this.f133370k;
    }

    @Override // z40.d0
    public final String l() {
        return this.f133371l;
    }

    @Override // z40.d0
    public final String m() {
        return this.f133367h;
    }

    @Override // z40.d0
    public final Integer n() {
        return this.f133379t;
    }

    @Override // z40.d0
    public final Boolean o() {
        return this.f133366g;
    }

    @Override // z40.d0
    public final String p() {
        return this.f133372m;
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("Sender(__typename=");
        sb3.append(this.f133360a);
        sb3.append(", id=");
        sb3.append(this.f133361b);
        sb3.append(", entityId=");
        sb3.append(this.f133362c);
        sb3.append(", verifiedIdentity=");
        sb3.append(this.f133363d);
        sb3.append(", blockedByMe=");
        sb3.append(this.f133364e);
        sb3.append(", isVerifiedMerchant=");
        sb3.append(this.f133365f);
        sb3.append(", isDefaultImage=");
        sb3.append(this.f133366g);
        sb3.append(", imageXlargeUrl=");
        sb3.append(this.f133367h);
        sb3.append(", imageLargeUrl=");
        sb3.append(this.f133368i);
        sb3.append(", imageMediumUrl=");
        sb3.append(this.f133369j);
        sb3.append(", imageSmallUrl=");
        sb3.append(this.f133370k);
        sb3.append(", firstName=");
        sb3.append(this.f133371l);
        sb3.append(", lastName=");
        sb3.append(this.f133372m);
        sb3.append(", fullName=");
        sb3.append(this.f133373n);
        sb3.append(", username=");
        sb3.append(this.f133374o);
        sb3.append(", followerCount=");
        sb3.append(this.f133375p);
        sb3.append(", followingCount=");
        sb3.append(this.f133376q);
        sb3.append(", explicitlyFollowedByMe=");
        sb3.append(this.f133377r);
        sb3.append(", isPrivateProfile=");
        sb3.append(this.f133378s);
        sb3.append(", avatarColorIndex=");
        return a.c.i(sb3, this.f133379t, ")");
    }
}
