package x40;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class h4 implements z40.d0 {

    /* renamed from: a, reason: collision with root package name */
    public final String f132469a;

    /* renamed from: b, reason: collision with root package name */
    public final String f132470b;

    /* renamed from: c, reason: collision with root package name */
    public final String f132471c;

    /* renamed from: d, reason: collision with root package name */
    public final g4 f132472d;

    /* renamed from: e, reason: collision with root package name */
    public final Boolean f132473e;

    /* renamed from: f, reason: collision with root package name */
    public final Boolean f132474f;

    /* renamed from: g, reason: collision with root package name */
    public final Boolean f132475g;

    /* renamed from: h, reason: collision with root package name */
    public final String f132476h;

    /* renamed from: i, reason: collision with root package name */
    public final String f132477i;

    /* renamed from: j, reason: collision with root package name */
    public final String f132478j;

    /* renamed from: k, reason: collision with root package name */
    public final String f132479k;

    /* renamed from: l, reason: collision with root package name */
    public final String f132480l;

    /* renamed from: m, reason: collision with root package name */
    public final String f132481m;

    /* renamed from: n, reason: collision with root package name */
    public final String f132482n;

    /* renamed from: o, reason: collision with root package name */
    public final String f132483o;

    /* renamed from: p, reason: collision with root package name */
    public final Integer f132484p;

    /* renamed from: q, reason: collision with root package name */
    public final Integer f132485q;

    /* renamed from: r, reason: collision with root package name */
    public final Boolean f132486r;

    /* renamed from: s, reason: collision with root package name */
    public final Boolean f132487s;

    /* renamed from: t, reason: collision with root package name */
    public final Integer f132488t;

    public h4(String __typename, String id3, String entityId, g4 g4Var, Boolean bool, Boolean bool2, Boolean bool3, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, Integer num, Integer num2, Boolean bool4, Boolean bool5, Integer num3) {
        Intrinsics.checkNotNullParameter(__typename, "__typename");
        Intrinsics.checkNotNullParameter(id3, "id");
        Intrinsics.checkNotNullParameter(entityId, "entityId");
        this.f132469a = __typename;
        this.f132470b = id3;
        this.f132471c = entityId;
        this.f132472d = g4Var;
        this.f132473e = bool;
        this.f132474f = bool2;
        this.f132475g = bool3;
        this.f132476h = str;
        this.f132477i = str2;
        this.f132478j = str3;
        this.f132479k = str4;
        this.f132480l = str5;
        this.f132481m = str6;
        this.f132482n = str7;
        this.f132483o = str8;
        this.f132484p = num;
        this.f132485q = num2;
        this.f132486r = bool4;
        this.f132487s = bool5;
        this.f132488t = num3;
    }

    @Override // z40.d0
    public final String a() {
        return this.f132471c;
    }

    @Override // z40.d0
    public final String b() {
        return this.f132478j;
    }

    @Override // z40.d0
    public final Integer c() {
        return this.f132484p;
    }

    @Override // z40.d0
    public final Boolean d() {
        return this.f132486r;
    }

    @Override // z40.d0
    public final String e() {
        return this.f132477i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h4)) {
            return false;
        }
        h4 h4Var = (h4) obj;
        return Intrinsics.d(this.f132469a, h4Var.f132469a) && Intrinsics.d(this.f132470b, h4Var.f132470b) && Intrinsics.d(this.f132471c, h4Var.f132471c) && Intrinsics.d(this.f132472d, h4Var.f132472d) && Intrinsics.d(this.f132473e, h4Var.f132473e) && Intrinsics.d(this.f132474f, h4Var.f132474f) && Intrinsics.d(this.f132475g, h4Var.f132475g) && Intrinsics.d(this.f132476h, h4Var.f132476h) && Intrinsics.d(this.f132477i, h4Var.f132477i) && Intrinsics.d(this.f132478j, h4Var.f132478j) && Intrinsics.d(this.f132479k, h4Var.f132479k) && Intrinsics.d(this.f132480l, h4Var.f132480l) && Intrinsics.d(this.f132481m, h4Var.f132481m) && Intrinsics.d(this.f132482n, h4Var.f132482n) && Intrinsics.d(this.f132483o, h4Var.f132483o) && Intrinsics.d(this.f132484p, h4Var.f132484p) && Intrinsics.d(this.f132485q, h4Var.f132485q) && Intrinsics.d(this.f132486r, h4Var.f132486r) && Intrinsics.d(this.f132487s, h4Var.f132487s) && Intrinsics.d(this.f132488t, h4Var.f132488t);
    }

    @Override // z40.d0
    public final String f() {
        return this.f132482n;
    }

    @Override // z40.d0
    public final String g() {
        return this.f132483o;
    }

    @Override // z40.d0
    public final String getId() {
        return this.f132470b;
    }

    @Override // z40.d0
    public final Boolean h() {
        return this.f132474f;
    }

    public final int hashCode() {
        int d2 = a.cb.d(this.f132471c, a.cb.d(this.f132470b, this.f132469a.hashCode() * 31, 31), 31);
        g4 g4Var = this.f132472d;
        int hashCode = (d2 + (g4Var == null ? 0 : g4Var.hashCode())) * 31;
        Boolean bool = this.f132473e;
        int hashCode2 = (hashCode + (bool == null ? 0 : bool.hashCode())) * 31;
        Boolean bool2 = this.f132474f;
        int hashCode3 = (hashCode2 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        Boolean bool3 = this.f132475g;
        int hashCode4 = (hashCode3 + (bool3 == null ? 0 : bool3.hashCode())) * 31;
        String str = this.f132476h;
        int hashCode5 = (hashCode4 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f132477i;
        int hashCode6 = (hashCode5 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f132478j;
        int hashCode7 = (hashCode6 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.f132479k;
        int hashCode8 = (hashCode7 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.f132480l;
        int hashCode9 = (hashCode8 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.f132481m;
        int hashCode10 = (hashCode9 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.f132482n;
        int hashCode11 = (hashCode10 + (str7 == null ? 0 : str7.hashCode())) * 31;
        String str8 = this.f132483o;
        int hashCode12 = (hashCode11 + (str8 == null ? 0 : str8.hashCode())) * 31;
        Integer num = this.f132484p;
        int hashCode13 = (hashCode12 + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.f132485q;
        int hashCode14 = (hashCode13 + (num2 == null ? 0 : num2.hashCode())) * 31;
        Boolean bool4 = this.f132486r;
        int hashCode15 = (hashCode14 + (bool4 == null ? 0 : bool4.hashCode())) * 31;
        Boolean bool5 = this.f132487s;
        int hashCode16 = (hashCode15 + (bool5 == null ? 0 : bool5.hashCode())) * 31;
        Integer num3 = this.f132488t;
        return hashCode16 + (num3 != null ? num3.hashCode() : 0);
    }

    @Override // z40.d0
    public final z40.c0 i() {
        return this.f132472d;
    }

    @Override // z40.d0
    public final Integer j() {
        return this.f132485q;
    }

    @Override // z40.d0
    public final String k() {
        return this.f132479k;
    }

    @Override // z40.d0
    public final String l() {
        return this.f132480l;
    }

    @Override // z40.d0
    public final String m() {
        return this.f132476h;
    }

    @Override // z40.d0
    public final Integer n() {
        return this.f132488t;
    }

    @Override // z40.d0
    public final Boolean o() {
        return this.f132475g;
    }

    @Override // z40.d0
    public final String p() {
        return this.f132481m;
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("Pinner(__typename=");
        sb3.append(this.f132469a);
        sb3.append(", id=");
        sb3.append(this.f132470b);
        sb3.append(", entityId=");
        sb3.append(this.f132471c);
        sb3.append(", verifiedIdentity=");
        sb3.append(this.f132472d);
        sb3.append(", blockedByMe=");
        sb3.append(this.f132473e);
        sb3.append(", isVerifiedMerchant=");
        sb3.append(this.f132474f);
        sb3.append(", isDefaultImage=");
        sb3.append(this.f132475g);
        sb3.append(", imageXlargeUrl=");
        sb3.append(this.f132476h);
        sb3.append(", imageLargeUrl=");
        sb3.append(this.f132477i);
        sb3.append(", imageMediumUrl=");
        sb3.append(this.f132478j);
        sb3.append(", imageSmallUrl=");
        sb3.append(this.f132479k);
        sb3.append(", firstName=");
        sb3.append(this.f132480l);
        sb3.append(", lastName=");
        sb3.append(this.f132481m);
        sb3.append(", fullName=");
        sb3.append(this.f132482n);
        sb3.append(", username=");
        sb3.append(this.f132483o);
        sb3.append(", followerCount=");
        sb3.append(this.f132484p);
        sb3.append(", followingCount=");
        sb3.append(this.f132485q);
        sb3.append(", explicitlyFollowedByMe=");
        sb3.append(this.f132486r);
        sb3.append(", isPrivateProfile=");
        sb3.append(this.f132487s);
        sb3.append(", avatarColorIndex=");
        return a.c.i(sb3, this.f132488t, ")");
    }
}
