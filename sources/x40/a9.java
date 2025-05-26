package x40;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class a9 implements z40.d0, z40.i {

    /* renamed from: a, reason: collision with root package name */
    public final String f131921a;

    /* renamed from: b, reason: collision with root package name */
    public final String f131922b;

    /* renamed from: c, reason: collision with root package name */
    public final String f131923c;

    /* renamed from: d, reason: collision with root package name */
    public final z8 f131924d;

    /* renamed from: e, reason: collision with root package name */
    public final Boolean f131925e;

    /* renamed from: f, reason: collision with root package name */
    public final Boolean f131926f;

    /* renamed from: g, reason: collision with root package name */
    public final Boolean f131927g;

    /* renamed from: h, reason: collision with root package name */
    public final String f131928h;

    /* renamed from: i, reason: collision with root package name */
    public final String f131929i;

    /* renamed from: j, reason: collision with root package name */
    public final String f131930j;

    /* renamed from: k, reason: collision with root package name */
    public final String f131931k;

    /* renamed from: l, reason: collision with root package name */
    public final String f131932l;

    /* renamed from: m, reason: collision with root package name */
    public final String f131933m;

    /* renamed from: n, reason: collision with root package name */
    public final String f131934n;

    /* renamed from: o, reason: collision with root package name */
    public final String f131935o;

    /* renamed from: p, reason: collision with root package name */
    public final Integer f131936p;

    /* renamed from: q, reason: collision with root package name */
    public final Integer f131937q;

    /* renamed from: r, reason: collision with root package name */
    public final Boolean f131938r;

    /* renamed from: s, reason: collision with root package name */
    public final Boolean f131939s;

    /* renamed from: t, reason: collision with root package name */
    public final Integer f131940t;

    public a9(String __typename, String id3, String entityId, z8 z8Var, Boolean bool, Boolean bool2, Boolean bool3, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, Integer num, Integer num2, Boolean bool4, Boolean bool5, Integer num3) {
        Intrinsics.checkNotNullParameter(__typename, "__typename");
        Intrinsics.checkNotNullParameter(id3, "id");
        Intrinsics.checkNotNullParameter(entityId, "entityId");
        this.f131921a = __typename;
        this.f131922b = id3;
        this.f131923c = entityId;
        this.f131924d = z8Var;
        this.f131925e = bool;
        this.f131926f = bool2;
        this.f131927g = bool3;
        this.f131928h = str;
        this.f131929i = str2;
        this.f131930j = str3;
        this.f131931k = str4;
        this.f131932l = str5;
        this.f131933m = str6;
        this.f131934n = str7;
        this.f131935o = str8;
        this.f131936p = num;
        this.f131937q = num2;
        this.f131938r = bool4;
        this.f131939s = bool5;
        this.f131940t = num3;
    }

    @Override // z40.d0
    public final String a() {
        return this.f131923c;
    }

    @Override // z40.d0
    public final String b() {
        return this.f131930j;
    }

    @Override // z40.d0
    public final Integer c() {
        return this.f131936p;
    }

    @Override // z40.d0
    public final Boolean d() {
        return this.f131938r;
    }

    @Override // z40.d0
    public final String e() {
        return this.f131929i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a9)) {
            return false;
        }
        a9 a9Var = (a9) obj;
        return Intrinsics.d(this.f131921a, a9Var.f131921a) && Intrinsics.d(this.f131922b, a9Var.f131922b) && Intrinsics.d(this.f131923c, a9Var.f131923c) && Intrinsics.d(this.f131924d, a9Var.f131924d) && Intrinsics.d(this.f131925e, a9Var.f131925e) && Intrinsics.d(this.f131926f, a9Var.f131926f) && Intrinsics.d(this.f131927g, a9Var.f131927g) && Intrinsics.d(this.f131928h, a9Var.f131928h) && Intrinsics.d(this.f131929i, a9Var.f131929i) && Intrinsics.d(this.f131930j, a9Var.f131930j) && Intrinsics.d(this.f131931k, a9Var.f131931k) && Intrinsics.d(this.f131932l, a9Var.f131932l) && Intrinsics.d(this.f131933m, a9Var.f131933m) && Intrinsics.d(this.f131934n, a9Var.f131934n) && Intrinsics.d(this.f131935o, a9Var.f131935o) && Intrinsics.d(this.f131936p, a9Var.f131936p) && Intrinsics.d(this.f131937q, a9Var.f131937q) && Intrinsics.d(this.f131938r, a9Var.f131938r) && Intrinsics.d(this.f131939s, a9Var.f131939s) && Intrinsics.d(this.f131940t, a9Var.f131940t);
    }

    @Override // z40.d0
    public final String f() {
        return this.f131934n;
    }

    @Override // z40.d0
    public final String g() {
        return this.f131935o;
    }

    @Override // z40.d0
    public final String getId() {
        return this.f131922b;
    }

    @Override // z40.d0
    public final Boolean h() {
        return this.f131926f;
    }

    public final int hashCode() {
        int d2 = a.cb.d(this.f131923c, a.cb.d(this.f131922b, this.f131921a.hashCode() * 31, 31), 31);
        z8 z8Var = this.f131924d;
        int hashCode = (d2 + (z8Var == null ? 0 : z8Var.hashCode())) * 31;
        Boolean bool = this.f131925e;
        int hashCode2 = (hashCode + (bool == null ? 0 : bool.hashCode())) * 31;
        Boolean bool2 = this.f131926f;
        int hashCode3 = (hashCode2 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        Boolean bool3 = this.f131927g;
        int hashCode4 = (hashCode3 + (bool3 == null ? 0 : bool3.hashCode())) * 31;
        String str = this.f131928h;
        int hashCode5 = (hashCode4 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f131929i;
        int hashCode6 = (hashCode5 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f131930j;
        int hashCode7 = (hashCode6 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.f131931k;
        int hashCode8 = (hashCode7 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.f131932l;
        int hashCode9 = (hashCode8 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.f131933m;
        int hashCode10 = (hashCode9 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.f131934n;
        int hashCode11 = (hashCode10 + (str7 == null ? 0 : str7.hashCode())) * 31;
        String str8 = this.f131935o;
        int hashCode12 = (hashCode11 + (str8 == null ? 0 : str8.hashCode())) * 31;
        Integer num = this.f131936p;
        int hashCode13 = (hashCode12 + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.f131937q;
        int hashCode14 = (hashCode13 + (num2 == null ? 0 : num2.hashCode())) * 31;
        Boolean bool4 = this.f131938r;
        int hashCode15 = (hashCode14 + (bool4 == null ? 0 : bool4.hashCode())) * 31;
        Boolean bool5 = this.f131939s;
        int hashCode16 = (hashCode15 + (bool5 == null ? 0 : bool5.hashCode())) * 31;
        Integer num3 = this.f131940t;
        return hashCode16 + (num3 != null ? num3.hashCode() : 0);
    }

    @Override // z40.d0
    public final z40.c0 i() {
        return this.f131924d;
    }

    @Override // z40.d0
    public final Integer j() {
        return this.f131937q;
    }

    @Override // z40.d0
    public final String k() {
        return this.f131931k;
    }

    @Override // z40.d0
    public final String l() {
        return this.f131932l;
    }

    @Override // z40.d0
    public final String m() {
        return this.f131928h;
    }

    @Override // z40.d0
    public final Integer n() {
        return this.f131940t;
    }

    @Override // z40.d0
    public final Boolean o() {
        return this.f131927g;
    }

    @Override // z40.d0
    public final String p() {
        return this.f131933m;
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("Node(__typename=");
        sb3.append(this.f131921a);
        sb3.append(", id=");
        sb3.append(this.f131922b);
        sb3.append(", entityId=");
        sb3.append(this.f131923c);
        sb3.append(", verifiedIdentity=");
        sb3.append(this.f131924d);
        sb3.append(", blockedByMe=");
        sb3.append(this.f131925e);
        sb3.append(", isVerifiedMerchant=");
        sb3.append(this.f131926f);
        sb3.append(", isDefaultImage=");
        sb3.append(this.f131927g);
        sb3.append(", imageXlargeUrl=");
        sb3.append(this.f131928h);
        sb3.append(", imageLargeUrl=");
        sb3.append(this.f131929i);
        sb3.append(", imageMediumUrl=");
        sb3.append(this.f131930j);
        sb3.append(", imageSmallUrl=");
        sb3.append(this.f131931k);
        sb3.append(", firstName=");
        sb3.append(this.f131932l);
        sb3.append(", lastName=");
        sb3.append(this.f131933m);
        sb3.append(", fullName=");
        sb3.append(this.f131934n);
        sb3.append(", username=");
        sb3.append(this.f131935o);
        sb3.append(", followerCount=");
        sb3.append(this.f131936p);
        sb3.append(", followingCount=");
        sb3.append(this.f131937q);
        sb3.append(", explicitlyFollowedByMe=");
        sb3.append(this.f131938r);
        sb3.append(", isPrivateProfile=");
        sb3.append(this.f131939s);
        sb3.append(", avatarColorIndex=");
        return a.c.i(sb3, this.f131940t, ")");
    }
}
