package x40;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class u7 implements z40.d0 {

    /* renamed from: a, reason: collision with root package name */
    public final String f133417a;

    /* renamed from: b, reason: collision with root package name */
    public final String f133418b;

    /* renamed from: c, reason: collision with root package name */
    public final String f133419c;

    /* renamed from: d, reason: collision with root package name */
    public final t7 f133420d;

    /* renamed from: e, reason: collision with root package name */
    public final Boolean f133421e;

    /* renamed from: f, reason: collision with root package name */
    public final Boolean f133422f;

    /* renamed from: g, reason: collision with root package name */
    public final Boolean f133423g;

    /* renamed from: h, reason: collision with root package name */
    public final String f133424h;

    /* renamed from: i, reason: collision with root package name */
    public final String f133425i;

    /* renamed from: j, reason: collision with root package name */
    public final String f133426j;

    /* renamed from: k, reason: collision with root package name */
    public final String f133427k;

    /* renamed from: l, reason: collision with root package name */
    public final String f133428l;

    /* renamed from: m, reason: collision with root package name */
    public final String f133429m;

    /* renamed from: n, reason: collision with root package name */
    public final String f133430n;

    /* renamed from: o, reason: collision with root package name */
    public final String f133431o;

    /* renamed from: p, reason: collision with root package name */
    public final Integer f133432p;

    /* renamed from: q, reason: collision with root package name */
    public final Integer f133433q;

    /* renamed from: r, reason: collision with root package name */
    public final Boolean f133434r;

    /* renamed from: s, reason: collision with root package name */
    public final Boolean f133435s;

    /* renamed from: t, reason: collision with root package name */
    public final Integer f133436t;

    public u7(String __typename, String id3, String entityId, t7 t7Var, Boolean bool, Boolean bool2, Boolean bool3, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, Integer num, Integer num2, Boolean bool4, Boolean bool5, Integer num3) {
        Intrinsics.checkNotNullParameter(__typename, "__typename");
        Intrinsics.checkNotNullParameter(id3, "id");
        Intrinsics.checkNotNullParameter(entityId, "entityId");
        this.f133417a = __typename;
        this.f133418b = id3;
        this.f133419c = entityId;
        this.f133420d = t7Var;
        this.f133421e = bool;
        this.f133422f = bool2;
        this.f133423g = bool3;
        this.f133424h = str;
        this.f133425i = str2;
        this.f133426j = str3;
        this.f133427k = str4;
        this.f133428l = str5;
        this.f133429m = str6;
        this.f133430n = str7;
        this.f133431o = str8;
        this.f133432p = num;
        this.f133433q = num2;
        this.f133434r = bool4;
        this.f133435s = bool5;
        this.f133436t = num3;
    }

    @Override // z40.d0
    public final String a() {
        return this.f133419c;
    }

    @Override // z40.d0
    public final String b() {
        return this.f133426j;
    }

    @Override // z40.d0
    public final Integer c() {
        return this.f133432p;
    }

    @Override // z40.d0
    public final Boolean d() {
        return this.f133434r;
    }

    @Override // z40.d0
    public final String e() {
        return this.f133425i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof u7)) {
            return false;
        }
        u7 u7Var = (u7) obj;
        return Intrinsics.d(this.f133417a, u7Var.f133417a) && Intrinsics.d(this.f133418b, u7Var.f133418b) && Intrinsics.d(this.f133419c, u7Var.f133419c) && Intrinsics.d(this.f133420d, u7Var.f133420d) && Intrinsics.d(this.f133421e, u7Var.f133421e) && Intrinsics.d(this.f133422f, u7Var.f133422f) && Intrinsics.d(this.f133423g, u7Var.f133423g) && Intrinsics.d(this.f133424h, u7Var.f133424h) && Intrinsics.d(this.f133425i, u7Var.f133425i) && Intrinsics.d(this.f133426j, u7Var.f133426j) && Intrinsics.d(this.f133427k, u7Var.f133427k) && Intrinsics.d(this.f133428l, u7Var.f133428l) && Intrinsics.d(this.f133429m, u7Var.f133429m) && Intrinsics.d(this.f133430n, u7Var.f133430n) && Intrinsics.d(this.f133431o, u7Var.f133431o) && Intrinsics.d(this.f133432p, u7Var.f133432p) && Intrinsics.d(this.f133433q, u7Var.f133433q) && Intrinsics.d(this.f133434r, u7Var.f133434r) && Intrinsics.d(this.f133435s, u7Var.f133435s) && Intrinsics.d(this.f133436t, u7Var.f133436t);
    }

    @Override // z40.d0
    public final String f() {
        return this.f133430n;
    }

    @Override // z40.d0
    public final String g() {
        return this.f133431o;
    }

    @Override // z40.d0
    public final String getId() {
        return this.f133418b;
    }

    @Override // z40.d0
    public final Boolean h() {
        return this.f133422f;
    }

    public final int hashCode() {
        int d2 = a.cb.d(this.f133419c, a.cb.d(this.f133418b, this.f133417a.hashCode() * 31, 31), 31);
        t7 t7Var = this.f133420d;
        int hashCode = (d2 + (t7Var == null ? 0 : t7Var.hashCode())) * 31;
        Boolean bool = this.f133421e;
        int hashCode2 = (hashCode + (bool == null ? 0 : bool.hashCode())) * 31;
        Boolean bool2 = this.f133422f;
        int hashCode3 = (hashCode2 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        Boolean bool3 = this.f133423g;
        int hashCode4 = (hashCode3 + (bool3 == null ? 0 : bool3.hashCode())) * 31;
        String str = this.f133424h;
        int hashCode5 = (hashCode4 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f133425i;
        int hashCode6 = (hashCode5 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f133426j;
        int hashCode7 = (hashCode6 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.f133427k;
        int hashCode8 = (hashCode7 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.f133428l;
        int hashCode9 = (hashCode8 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.f133429m;
        int hashCode10 = (hashCode9 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.f133430n;
        int hashCode11 = (hashCode10 + (str7 == null ? 0 : str7.hashCode())) * 31;
        String str8 = this.f133431o;
        int hashCode12 = (hashCode11 + (str8 == null ? 0 : str8.hashCode())) * 31;
        Integer num = this.f133432p;
        int hashCode13 = (hashCode12 + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.f133433q;
        int hashCode14 = (hashCode13 + (num2 == null ? 0 : num2.hashCode())) * 31;
        Boolean bool4 = this.f133434r;
        int hashCode15 = (hashCode14 + (bool4 == null ? 0 : bool4.hashCode())) * 31;
        Boolean bool5 = this.f133435s;
        int hashCode16 = (hashCode15 + (bool5 == null ? 0 : bool5.hashCode())) * 31;
        Integer num3 = this.f133436t;
        return hashCode16 + (num3 != null ? num3.hashCode() : 0);
    }

    @Override // z40.d0
    public final z40.c0 i() {
        return this.f133420d;
    }

    @Override // z40.d0
    public final Integer j() {
        return this.f133433q;
    }

    @Override // z40.d0
    public final String k() {
        return this.f133427k;
    }

    @Override // z40.d0
    public final String l() {
        return this.f133428l;
    }

    @Override // z40.d0
    public final String m() {
        return this.f133424h;
    }

    @Override // z40.d0
    public final Integer n() {
        return this.f133436t;
    }

    @Override // z40.d0
    public final Boolean o() {
        return this.f133423g;
    }

    @Override // z40.d0
    public final String p() {
        return this.f133429m;
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("Pinner(__typename=");
        sb3.append(this.f133417a);
        sb3.append(", id=");
        sb3.append(this.f133418b);
        sb3.append(", entityId=");
        sb3.append(this.f133419c);
        sb3.append(", verifiedIdentity=");
        sb3.append(this.f133420d);
        sb3.append(", blockedByMe=");
        sb3.append(this.f133421e);
        sb3.append(", isVerifiedMerchant=");
        sb3.append(this.f133422f);
        sb3.append(", isDefaultImage=");
        sb3.append(this.f133423g);
        sb3.append(", imageXlargeUrl=");
        sb3.append(this.f133424h);
        sb3.append(", imageLargeUrl=");
        sb3.append(this.f133425i);
        sb3.append(", imageMediumUrl=");
        sb3.append(this.f133426j);
        sb3.append(", imageSmallUrl=");
        sb3.append(this.f133427k);
        sb3.append(", firstName=");
        sb3.append(this.f133428l);
        sb3.append(", lastName=");
        sb3.append(this.f133429m);
        sb3.append(", fullName=");
        sb3.append(this.f133430n);
        sb3.append(", username=");
        sb3.append(this.f133431o);
        sb3.append(", followerCount=");
        sb3.append(this.f133432p);
        sb3.append(", followingCount=");
        sb3.append(this.f133433q);
        sb3.append(", explicitlyFollowedByMe=");
        sb3.append(this.f133434r);
        sb3.append(", isPrivateProfile=");
        sb3.append(this.f133435s);
        sb3.append(", avatarColorIndex=");
        return a.c.i(sb3, this.f133436t, ")");
    }
}
