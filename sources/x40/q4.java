package x40;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class q4 implements z40.d0 {

    /* renamed from: a, reason: collision with root package name */
    public final String f133086a;

    /* renamed from: b, reason: collision with root package name */
    public final String f133087b;

    /* renamed from: c, reason: collision with root package name */
    public final String f133088c;

    /* renamed from: d, reason: collision with root package name */
    public final p4 f133089d;

    /* renamed from: e, reason: collision with root package name */
    public final Boolean f133090e;

    /* renamed from: f, reason: collision with root package name */
    public final Boolean f133091f;

    /* renamed from: g, reason: collision with root package name */
    public final Boolean f133092g;

    /* renamed from: h, reason: collision with root package name */
    public final String f133093h;

    /* renamed from: i, reason: collision with root package name */
    public final String f133094i;

    /* renamed from: j, reason: collision with root package name */
    public final String f133095j;

    /* renamed from: k, reason: collision with root package name */
    public final String f133096k;

    /* renamed from: l, reason: collision with root package name */
    public final String f133097l;

    /* renamed from: m, reason: collision with root package name */
    public final String f133098m;

    /* renamed from: n, reason: collision with root package name */
    public final String f133099n;

    /* renamed from: o, reason: collision with root package name */
    public final String f133100o;

    /* renamed from: p, reason: collision with root package name */
    public final Integer f133101p;

    /* renamed from: q, reason: collision with root package name */
    public final Integer f133102q;

    /* renamed from: r, reason: collision with root package name */
    public final Boolean f133103r;

    /* renamed from: s, reason: collision with root package name */
    public final Boolean f133104s;

    /* renamed from: t, reason: collision with root package name */
    public final Integer f133105t;

    public q4(String __typename, String id3, String entityId, p4 p4Var, Boolean bool, Boolean bool2, Boolean bool3, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, Integer num, Integer num2, Boolean bool4, Boolean bool5, Integer num3) {
        Intrinsics.checkNotNullParameter(__typename, "__typename");
        Intrinsics.checkNotNullParameter(id3, "id");
        Intrinsics.checkNotNullParameter(entityId, "entityId");
        this.f133086a = __typename;
        this.f133087b = id3;
        this.f133088c = entityId;
        this.f133089d = p4Var;
        this.f133090e = bool;
        this.f133091f = bool2;
        this.f133092g = bool3;
        this.f133093h = str;
        this.f133094i = str2;
        this.f133095j = str3;
        this.f133096k = str4;
        this.f133097l = str5;
        this.f133098m = str6;
        this.f133099n = str7;
        this.f133100o = str8;
        this.f133101p = num;
        this.f133102q = num2;
        this.f133103r = bool4;
        this.f133104s = bool5;
        this.f133105t = num3;
    }

    @Override // z40.d0
    public final String a() {
        return this.f133088c;
    }

    @Override // z40.d0
    public final String b() {
        return this.f133095j;
    }

    @Override // z40.d0
    public final Integer c() {
        return this.f133101p;
    }

    @Override // z40.d0
    public final Boolean d() {
        return this.f133103r;
    }

    @Override // z40.d0
    public final String e() {
        return this.f133094i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof q4)) {
            return false;
        }
        q4 q4Var = (q4) obj;
        return Intrinsics.d(this.f133086a, q4Var.f133086a) && Intrinsics.d(this.f133087b, q4Var.f133087b) && Intrinsics.d(this.f133088c, q4Var.f133088c) && Intrinsics.d(this.f133089d, q4Var.f133089d) && Intrinsics.d(this.f133090e, q4Var.f133090e) && Intrinsics.d(this.f133091f, q4Var.f133091f) && Intrinsics.d(this.f133092g, q4Var.f133092g) && Intrinsics.d(this.f133093h, q4Var.f133093h) && Intrinsics.d(this.f133094i, q4Var.f133094i) && Intrinsics.d(this.f133095j, q4Var.f133095j) && Intrinsics.d(this.f133096k, q4Var.f133096k) && Intrinsics.d(this.f133097l, q4Var.f133097l) && Intrinsics.d(this.f133098m, q4Var.f133098m) && Intrinsics.d(this.f133099n, q4Var.f133099n) && Intrinsics.d(this.f133100o, q4Var.f133100o) && Intrinsics.d(this.f133101p, q4Var.f133101p) && Intrinsics.d(this.f133102q, q4Var.f133102q) && Intrinsics.d(this.f133103r, q4Var.f133103r) && Intrinsics.d(this.f133104s, q4Var.f133104s) && Intrinsics.d(this.f133105t, q4Var.f133105t);
    }

    @Override // z40.d0
    public final String f() {
        return this.f133099n;
    }

    @Override // z40.d0
    public final String g() {
        return this.f133100o;
    }

    @Override // z40.d0
    public final String getId() {
        return this.f133087b;
    }

    @Override // z40.d0
    public final Boolean h() {
        return this.f133091f;
    }

    public final int hashCode() {
        int d2 = a.cb.d(this.f133088c, a.cb.d(this.f133087b, this.f133086a.hashCode() * 31, 31), 31);
        p4 p4Var = this.f133089d;
        int hashCode = (d2 + (p4Var == null ? 0 : p4Var.hashCode())) * 31;
        Boolean bool = this.f133090e;
        int hashCode2 = (hashCode + (bool == null ? 0 : bool.hashCode())) * 31;
        Boolean bool2 = this.f133091f;
        int hashCode3 = (hashCode2 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        Boolean bool3 = this.f133092g;
        int hashCode4 = (hashCode3 + (bool3 == null ? 0 : bool3.hashCode())) * 31;
        String str = this.f133093h;
        int hashCode5 = (hashCode4 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f133094i;
        int hashCode6 = (hashCode5 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f133095j;
        int hashCode7 = (hashCode6 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.f133096k;
        int hashCode8 = (hashCode7 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.f133097l;
        int hashCode9 = (hashCode8 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.f133098m;
        int hashCode10 = (hashCode9 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.f133099n;
        int hashCode11 = (hashCode10 + (str7 == null ? 0 : str7.hashCode())) * 31;
        String str8 = this.f133100o;
        int hashCode12 = (hashCode11 + (str8 == null ? 0 : str8.hashCode())) * 31;
        Integer num = this.f133101p;
        int hashCode13 = (hashCode12 + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.f133102q;
        int hashCode14 = (hashCode13 + (num2 == null ? 0 : num2.hashCode())) * 31;
        Boolean bool4 = this.f133103r;
        int hashCode15 = (hashCode14 + (bool4 == null ? 0 : bool4.hashCode())) * 31;
        Boolean bool5 = this.f133104s;
        int hashCode16 = (hashCode15 + (bool5 == null ? 0 : bool5.hashCode())) * 31;
        Integer num3 = this.f133105t;
        return hashCode16 + (num3 != null ? num3.hashCode() : 0);
    }

    @Override // z40.d0
    public final z40.c0 i() {
        return this.f133089d;
    }

    @Override // z40.d0
    public final Integer j() {
        return this.f133102q;
    }

    @Override // z40.d0
    public final String k() {
        return this.f133096k;
    }

    @Override // z40.d0
    public final String l() {
        return this.f133097l;
    }

    @Override // z40.d0
    public final String m() {
        return this.f133093h;
    }

    @Override // z40.d0
    public final Integer n() {
        return this.f133105t;
    }

    @Override // z40.d0
    public final Boolean o() {
        return this.f133092g;
    }

    @Override // z40.d0
    public final String p() {
        return this.f133098m;
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("User(__typename=");
        sb3.append(this.f133086a);
        sb3.append(", id=");
        sb3.append(this.f133087b);
        sb3.append(", entityId=");
        sb3.append(this.f133088c);
        sb3.append(", verifiedIdentity=");
        sb3.append(this.f133089d);
        sb3.append(", blockedByMe=");
        sb3.append(this.f133090e);
        sb3.append(", isVerifiedMerchant=");
        sb3.append(this.f133091f);
        sb3.append(", isDefaultImage=");
        sb3.append(this.f133092g);
        sb3.append(", imageXlargeUrl=");
        sb3.append(this.f133093h);
        sb3.append(", imageLargeUrl=");
        sb3.append(this.f133094i);
        sb3.append(", imageMediumUrl=");
        sb3.append(this.f133095j);
        sb3.append(", imageSmallUrl=");
        sb3.append(this.f133096k);
        sb3.append(", firstName=");
        sb3.append(this.f133097l);
        sb3.append(", lastName=");
        sb3.append(this.f133098m);
        sb3.append(", fullName=");
        sb3.append(this.f133099n);
        sb3.append(", username=");
        sb3.append(this.f133100o);
        sb3.append(", followerCount=");
        sb3.append(this.f133101p);
        sb3.append(", followingCount=");
        sb3.append(this.f133102q);
        sb3.append(", explicitlyFollowedByMe=");
        sb3.append(this.f133103r);
        sb3.append(", isPrivateProfile=");
        sb3.append(this.f133104s);
        sb3.append(", avatarColorIndex=");
        return a.c.i(sb3, this.f133105t, ")");
    }
}
