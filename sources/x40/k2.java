package x40;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class k2 implements z40.d0 {

    /* renamed from: a, reason: collision with root package name */
    public final String f132629a;

    /* renamed from: b, reason: collision with root package name */
    public final String f132630b;

    /* renamed from: c, reason: collision with root package name */
    public final String f132631c;

    /* renamed from: d, reason: collision with root package name */
    public final j2 f132632d;

    /* renamed from: e, reason: collision with root package name */
    public final Boolean f132633e;

    /* renamed from: f, reason: collision with root package name */
    public final Boolean f132634f;

    /* renamed from: g, reason: collision with root package name */
    public final Boolean f132635g;

    /* renamed from: h, reason: collision with root package name */
    public final String f132636h;

    /* renamed from: i, reason: collision with root package name */
    public final String f132637i;

    /* renamed from: j, reason: collision with root package name */
    public final String f132638j;

    /* renamed from: k, reason: collision with root package name */
    public final String f132639k;

    /* renamed from: l, reason: collision with root package name */
    public final String f132640l;

    /* renamed from: m, reason: collision with root package name */
    public final String f132641m;

    /* renamed from: n, reason: collision with root package name */
    public final String f132642n;

    /* renamed from: o, reason: collision with root package name */
    public final String f132643o;

    /* renamed from: p, reason: collision with root package name */
    public final Integer f132644p;

    /* renamed from: q, reason: collision with root package name */
    public final Integer f132645q;

    /* renamed from: r, reason: collision with root package name */
    public final Boolean f132646r;

    /* renamed from: s, reason: collision with root package name */
    public final Boolean f132647s;

    /* renamed from: t, reason: collision with root package name */
    public final Integer f132648t;

    public k2(String __typename, String id3, String entityId, j2 j2Var, Boolean bool, Boolean bool2, Boolean bool3, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, Integer num, Integer num2, Boolean bool4, Boolean bool5, Integer num3) {
        Intrinsics.checkNotNullParameter(__typename, "__typename");
        Intrinsics.checkNotNullParameter(id3, "id");
        Intrinsics.checkNotNullParameter(entityId, "entityId");
        this.f132629a = __typename;
        this.f132630b = id3;
        this.f132631c = entityId;
        this.f132632d = j2Var;
        this.f132633e = bool;
        this.f132634f = bool2;
        this.f132635g = bool3;
        this.f132636h = str;
        this.f132637i = str2;
        this.f132638j = str3;
        this.f132639k = str4;
        this.f132640l = str5;
        this.f132641m = str6;
        this.f132642n = str7;
        this.f132643o = str8;
        this.f132644p = num;
        this.f132645q = num2;
        this.f132646r = bool4;
        this.f132647s = bool5;
        this.f132648t = num3;
    }

    @Override // z40.d0
    public final String a() {
        return this.f132631c;
    }

    @Override // z40.d0
    public final String b() {
        return this.f132638j;
    }

    @Override // z40.d0
    public final Integer c() {
        return this.f132644p;
    }

    @Override // z40.d0
    public final Boolean d() {
        return this.f132646r;
    }

    @Override // z40.d0
    public final String e() {
        return this.f132637i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof k2)) {
            return false;
        }
        k2 k2Var = (k2) obj;
        return Intrinsics.d(this.f132629a, k2Var.f132629a) && Intrinsics.d(this.f132630b, k2Var.f132630b) && Intrinsics.d(this.f132631c, k2Var.f132631c) && Intrinsics.d(this.f132632d, k2Var.f132632d) && Intrinsics.d(this.f132633e, k2Var.f132633e) && Intrinsics.d(this.f132634f, k2Var.f132634f) && Intrinsics.d(this.f132635g, k2Var.f132635g) && Intrinsics.d(this.f132636h, k2Var.f132636h) && Intrinsics.d(this.f132637i, k2Var.f132637i) && Intrinsics.d(this.f132638j, k2Var.f132638j) && Intrinsics.d(this.f132639k, k2Var.f132639k) && Intrinsics.d(this.f132640l, k2Var.f132640l) && Intrinsics.d(this.f132641m, k2Var.f132641m) && Intrinsics.d(this.f132642n, k2Var.f132642n) && Intrinsics.d(this.f132643o, k2Var.f132643o) && Intrinsics.d(this.f132644p, k2Var.f132644p) && Intrinsics.d(this.f132645q, k2Var.f132645q) && Intrinsics.d(this.f132646r, k2Var.f132646r) && Intrinsics.d(this.f132647s, k2Var.f132647s) && Intrinsics.d(this.f132648t, k2Var.f132648t);
    }

    @Override // z40.d0
    public final String f() {
        return this.f132642n;
    }

    @Override // z40.d0
    public final String g() {
        return this.f132643o;
    }

    @Override // z40.d0
    public final String getId() {
        return this.f132630b;
    }

    @Override // z40.d0
    public final Boolean h() {
        return this.f132634f;
    }

    public final int hashCode() {
        int d2 = a.cb.d(this.f132631c, a.cb.d(this.f132630b, this.f132629a.hashCode() * 31, 31), 31);
        j2 j2Var = this.f132632d;
        int hashCode = (d2 + (j2Var == null ? 0 : j2Var.hashCode())) * 31;
        Boolean bool = this.f132633e;
        int hashCode2 = (hashCode + (bool == null ? 0 : bool.hashCode())) * 31;
        Boolean bool2 = this.f132634f;
        int hashCode3 = (hashCode2 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        Boolean bool3 = this.f132635g;
        int hashCode4 = (hashCode3 + (bool3 == null ? 0 : bool3.hashCode())) * 31;
        String str = this.f132636h;
        int hashCode5 = (hashCode4 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f132637i;
        int hashCode6 = (hashCode5 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f132638j;
        int hashCode7 = (hashCode6 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.f132639k;
        int hashCode8 = (hashCode7 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.f132640l;
        int hashCode9 = (hashCode8 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.f132641m;
        int hashCode10 = (hashCode9 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.f132642n;
        int hashCode11 = (hashCode10 + (str7 == null ? 0 : str7.hashCode())) * 31;
        String str8 = this.f132643o;
        int hashCode12 = (hashCode11 + (str8 == null ? 0 : str8.hashCode())) * 31;
        Integer num = this.f132644p;
        int hashCode13 = (hashCode12 + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.f132645q;
        int hashCode14 = (hashCode13 + (num2 == null ? 0 : num2.hashCode())) * 31;
        Boolean bool4 = this.f132646r;
        int hashCode15 = (hashCode14 + (bool4 == null ? 0 : bool4.hashCode())) * 31;
        Boolean bool5 = this.f132647s;
        int hashCode16 = (hashCode15 + (bool5 == null ? 0 : bool5.hashCode())) * 31;
        Integer num3 = this.f132648t;
        return hashCode16 + (num3 != null ? num3.hashCode() : 0);
    }

    @Override // z40.d0
    public final z40.c0 i() {
        return this.f132632d;
    }

    @Override // z40.d0
    public final Integer j() {
        return this.f132645q;
    }

    @Override // z40.d0
    public final String k() {
        return this.f132639k;
    }

    @Override // z40.d0
    public final String l() {
        return this.f132640l;
    }

    @Override // z40.d0
    public final String m() {
        return this.f132636h;
    }

    @Override // z40.d0
    public final Integer n() {
        return this.f132648t;
    }

    @Override // z40.d0
    public final Boolean o() {
        return this.f132635g;
    }

    @Override // z40.d0
    public final String p() {
        return this.f132641m;
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("Pinner(__typename=");
        sb3.append(this.f132629a);
        sb3.append(", id=");
        sb3.append(this.f132630b);
        sb3.append(", entityId=");
        sb3.append(this.f132631c);
        sb3.append(", verifiedIdentity=");
        sb3.append(this.f132632d);
        sb3.append(", blockedByMe=");
        sb3.append(this.f132633e);
        sb3.append(", isVerifiedMerchant=");
        sb3.append(this.f132634f);
        sb3.append(", isDefaultImage=");
        sb3.append(this.f132635g);
        sb3.append(", imageXlargeUrl=");
        sb3.append(this.f132636h);
        sb3.append(", imageLargeUrl=");
        sb3.append(this.f132637i);
        sb3.append(", imageMediumUrl=");
        sb3.append(this.f132638j);
        sb3.append(", imageSmallUrl=");
        sb3.append(this.f132639k);
        sb3.append(", firstName=");
        sb3.append(this.f132640l);
        sb3.append(", lastName=");
        sb3.append(this.f132641m);
        sb3.append(", fullName=");
        sb3.append(this.f132642n);
        sb3.append(", username=");
        sb3.append(this.f132643o);
        sb3.append(", followerCount=");
        sb3.append(this.f132644p);
        sb3.append(", followingCount=");
        sb3.append(this.f132645q);
        sb3.append(", explicitlyFollowedByMe=");
        sb3.append(this.f132646r);
        sb3.append(", isPrivateProfile=");
        sb3.append(this.f132647s);
        sb3.append(", avatarColorIndex=");
        return a.c.i(sb3, this.f132648t, ")");
    }
}
