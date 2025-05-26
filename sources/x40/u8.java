package x40;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class u8 implements z40.d0 {

    /* renamed from: a, reason: collision with root package name */
    public final String f133437a;

    /* renamed from: b, reason: collision with root package name */
    public final String f133438b;

    /* renamed from: c, reason: collision with root package name */
    public final String f133439c;

    /* renamed from: d, reason: collision with root package name */
    public final t8 f133440d;

    /* renamed from: e, reason: collision with root package name */
    public final Boolean f133441e;

    /* renamed from: f, reason: collision with root package name */
    public final Boolean f133442f;

    /* renamed from: g, reason: collision with root package name */
    public final Boolean f133443g;

    /* renamed from: h, reason: collision with root package name */
    public final String f133444h;

    /* renamed from: i, reason: collision with root package name */
    public final String f133445i;

    /* renamed from: j, reason: collision with root package name */
    public final String f133446j;

    /* renamed from: k, reason: collision with root package name */
    public final String f133447k;

    /* renamed from: l, reason: collision with root package name */
    public final String f133448l;

    /* renamed from: m, reason: collision with root package name */
    public final String f133449m;

    /* renamed from: n, reason: collision with root package name */
    public final String f133450n;

    /* renamed from: o, reason: collision with root package name */
    public final String f133451o;

    /* renamed from: p, reason: collision with root package name */
    public final Integer f133452p;

    /* renamed from: q, reason: collision with root package name */
    public final Integer f133453q;

    /* renamed from: r, reason: collision with root package name */
    public final Boolean f133454r;

    /* renamed from: s, reason: collision with root package name */
    public final Boolean f133455s;

    /* renamed from: t, reason: collision with root package name */
    public final Integer f133456t;

    public u8(String __typename, String id3, String entityId, t8 t8Var, Boolean bool, Boolean bool2, Boolean bool3, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, Integer num, Integer num2, Boolean bool4, Boolean bool5, Integer num3) {
        Intrinsics.checkNotNullParameter(__typename, "__typename");
        Intrinsics.checkNotNullParameter(id3, "id");
        Intrinsics.checkNotNullParameter(entityId, "entityId");
        this.f133437a = __typename;
        this.f133438b = id3;
        this.f133439c = entityId;
        this.f133440d = t8Var;
        this.f133441e = bool;
        this.f133442f = bool2;
        this.f133443g = bool3;
        this.f133444h = str;
        this.f133445i = str2;
        this.f133446j = str3;
        this.f133447k = str4;
        this.f133448l = str5;
        this.f133449m = str6;
        this.f133450n = str7;
        this.f133451o = str8;
        this.f133452p = num;
        this.f133453q = num2;
        this.f133454r = bool4;
        this.f133455s = bool5;
        this.f133456t = num3;
    }

    @Override // z40.d0
    public final String a() {
        return this.f133439c;
    }

    @Override // z40.d0
    public final String b() {
        return this.f133446j;
    }

    @Override // z40.d0
    public final Integer c() {
        return this.f133452p;
    }

    @Override // z40.d0
    public final Boolean d() {
        return this.f133454r;
    }

    @Override // z40.d0
    public final String e() {
        return this.f133445i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof u8)) {
            return false;
        }
        u8 u8Var = (u8) obj;
        return Intrinsics.d(this.f133437a, u8Var.f133437a) && Intrinsics.d(this.f133438b, u8Var.f133438b) && Intrinsics.d(this.f133439c, u8Var.f133439c) && Intrinsics.d(this.f133440d, u8Var.f133440d) && Intrinsics.d(this.f133441e, u8Var.f133441e) && Intrinsics.d(this.f133442f, u8Var.f133442f) && Intrinsics.d(this.f133443g, u8Var.f133443g) && Intrinsics.d(this.f133444h, u8Var.f133444h) && Intrinsics.d(this.f133445i, u8Var.f133445i) && Intrinsics.d(this.f133446j, u8Var.f133446j) && Intrinsics.d(this.f133447k, u8Var.f133447k) && Intrinsics.d(this.f133448l, u8Var.f133448l) && Intrinsics.d(this.f133449m, u8Var.f133449m) && Intrinsics.d(this.f133450n, u8Var.f133450n) && Intrinsics.d(this.f133451o, u8Var.f133451o) && Intrinsics.d(this.f133452p, u8Var.f133452p) && Intrinsics.d(this.f133453q, u8Var.f133453q) && Intrinsics.d(this.f133454r, u8Var.f133454r) && Intrinsics.d(this.f133455s, u8Var.f133455s) && Intrinsics.d(this.f133456t, u8Var.f133456t);
    }

    @Override // z40.d0
    public final String f() {
        return this.f133450n;
    }

    @Override // z40.d0
    public final String g() {
        return this.f133451o;
    }

    @Override // z40.d0
    public final String getId() {
        return this.f133438b;
    }

    @Override // z40.d0
    public final Boolean h() {
        return this.f133442f;
    }

    public final int hashCode() {
        int d2 = a.cb.d(this.f133439c, a.cb.d(this.f133438b, this.f133437a.hashCode() * 31, 31), 31);
        t8 t8Var = this.f133440d;
        int hashCode = (d2 + (t8Var == null ? 0 : t8Var.hashCode())) * 31;
        Boolean bool = this.f133441e;
        int hashCode2 = (hashCode + (bool == null ? 0 : bool.hashCode())) * 31;
        Boolean bool2 = this.f133442f;
        int hashCode3 = (hashCode2 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        Boolean bool3 = this.f133443g;
        int hashCode4 = (hashCode3 + (bool3 == null ? 0 : bool3.hashCode())) * 31;
        String str = this.f133444h;
        int hashCode5 = (hashCode4 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f133445i;
        int hashCode6 = (hashCode5 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f133446j;
        int hashCode7 = (hashCode6 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.f133447k;
        int hashCode8 = (hashCode7 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.f133448l;
        int hashCode9 = (hashCode8 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.f133449m;
        int hashCode10 = (hashCode9 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.f133450n;
        int hashCode11 = (hashCode10 + (str7 == null ? 0 : str7.hashCode())) * 31;
        String str8 = this.f133451o;
        int hashCode12 = (hashCode11 + (str8 == null ? 0 : str8.hashCode())) * 31;
        Integer num = this.f133452p;
        int hashCode13 = (hashCode12 + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.f133453q;
        int hashCode14 = (hashCode13 + (num2 == null ? 0 : num2.hashCode())) * 31;
        Boolean bool4 = this.f133454r;
        int hashCode15 = (hashCode14 + (bool4 == null ? 0 : bool4.hashCode())) * 31;
        Boolean bool5 = this.f133455s;
        int hashCode16 = (hashCode15 + (bool5 == null ? 0 : bool5.hashCode())) * 31;
        Integer num3 = this.f133456t;
        return hashCode16 + (num3 != null ? num3.hashCode() : 0);
    }

    @Override // z40.d0
    public final z40.c0 i() {
        return this.f133440d;
    }

    @Override // z40.d0
    public final Integer j() {
        return this.f133453q;
    }

    @Override // z40.d0
    public final String k() {
        return this.f133447k;
    }

    @Override // z40.d0
    public final String l() {
        return this.f133448l;
    }

    @Override // z40.d0
    public final String m() {
        return this.f133444h;
    }

    @Override // z40.d0
    public final Integer n() {
        return this.f133456t;
    }

    @Override // z40.d0
    public final Boolean o() {
        return this.f133443g;
    }

    @Override // z40.d0
    public final String p() {
        return this.f133449m;
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("User(__typename=");
        sb3.append(this.f133437a);
        sb3.append(", id=");
        sb3.append(this.f133438b);
        sb3.append(", entityId=");
        sb3.append(this.f133439c);
        sb3.append(", verifiedIdentity=");
        sb3.append(this.f133440d);
        sb3.append(", blockedByMe=");
        sb3.append(this.f133441e);
        sb3.append(", isVerifiedMerchant=");
        sb3.append(this.f133442f);
        sb3.append(", isDefaultImage=");
        sb3.append(this.f133443g);
        sb3.append(", imageXlargeUrl=");
        sb3.append(this.f133444h);
        sb3.append(", imageLargeUrl=");
        sb3.append(this.f133445i);
        sb3.append(", imageMediumUrl=");
        sb3.append(this.f133446j);
        sb3.append(", imageSmallUrl=");
        sb3.append(this.f133447k);
        sb3.append(", firstName=");
        sb3.append(this.f133448l);
        sb3.append(", lastName=");
        sb3.append(this.f133449m);
        sb3.append(", fullName=");
        sb3.append(this.f133450n);
        sb3.append(", username=");
        sb3.append(this.f133451o);
        sb3.append(", followerCount=");
        sb3.append(this.f133452p);
        sb3.append(", followingCount=");
        sb3.append(this.f133453q);
        sb3.append(", explicitlyFollowedByMe=");
        sb3.append(this.f133454r);
        sb3.append(", isPrivateProfile=");
        sb3.append(this.f133455s);
        sb3.append(", avatarColorIndex=");
        return a.c.i(sb3, this.f133456t, ")");
    }
}
