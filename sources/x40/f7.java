package x40;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class f7 implements z40.d0 {

    /* renamed from: a, reason: collision with root package name */
    public final String f132376a;

    /* renamed from: b, reason: collision with root package name */
    public final String f132377b;

    /* renamed from: c, reason: collision with root package name */
    public final String f132378c;

    /* renamed from: d, reason: collision with root package name */
    public final e7 f132379d;

    /* renamed from: e, reason: collision with root package name */
    public final Boolean f132380e;

    /* renamed from: f, reason: collision with root package name */
    public final Boolean f132381f;

    /* renamed from: g, reason: collision with root package name */
    public final Boolean f132382g;

    /* renamed from: h, reason: collision with root package name */
    public final String f132383h;

    /* renamed from: i, reason: collision with root package name */
    public final String f132384i;

    /* renamed from: j, reason: collision with root package name */
    public final String f132385j;

    /* renamed from: k, reason: collision with root package name */
    public final String f132386k;

    /* renamed from: l, reason: collision with root package name */
    public final String f132387l;

    /* renamed from: m, reason: collision with root package name */
    public final String f132388m;

    /* renamed from: n, reason: collision with root package name */
    public final String f132389n;

    /* renamed from: o, reason: collision with root package name */
    public final String f132390o;

    /* renamed from: p, reason: collision with root package name */
    public final Integer f132391p;

    /* renamed from: q, reason: collision with root package name */
    public final Integer f132392q;

    /* renamed from: r, reason: collision with root package name */
    public final Boolean f132393r;

    /* renamed from: s, reason: collision with root package name */
    public final Boolean f132394s;

    /* renamed from: t, reason: collision with root package name */
    public final Integer f132395t;

    public f7(String __typename, String id3, String entityId, e7 e7Var, Boolean bool, Boolean bool2, Boolean bool3, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, Integer num, Integer num2, Boolean bool4, Boolean bool5, Integer num3) {
        Intrinsics.checkNotNullParameter(__typename, "__typename");
        Intrinsics.checkNotNullParameter(id3, "id");
        Intrinsics.checkNotNullParameter(entityId, "entityId");
        this.f132376a = __typename;
        this.f132377b = id3;
        this.f132378c = entityId;
        this.f132379d = e7Var;
        this.f132380e = bool;
        this.f132381f = bool2;
        this.f132382g = bool3;
        this.f132383h = str;
        this.f132384i = str2;
        this.f132385j = str3;
        this.f132386k = str4;
        this.f132387l = str5;
        this.f132388m = str6;
        this.f132389n = str7;
        this.f132390o = str8;
        this.f132391p = num;
        this.f132392q = num2;
        this.f132393r = bool4;
        this.f132394s = bool5;
        this.f132395t = num3;
    }

    @Override // z40.d0
    public final String a() {
        return this.f132378c;
    }

    @Override // z40.d0
    public final String b() {
        return this.f132385j;
    }

    @Override // z40.d0
    public final Integer c() {
        return this.f132391p;
    }

    @Override // z40.d0
    public final Boolean d() {
        return this.f132393r;
    }

    @Override // z40.d0
    public final String e() {
        return this.f132384i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f7)) {
            return false;
        }
        f7 f7Var = (f7) obj;
        return Intrinsics.d(this.f132376a, f7Var.f132376a) && Intrinsics.d(this.f132377b, f7Var.f132377b) && Intrinsics.d(this.f132378c, f7Var.f132378c) && Intrinsics.d(this.f132379d, f7Var.f132379d) && Intrinsics.d(this.f132380e, f7Var.f132380e) && Intrinsics.d(this.f132381f, f7Var.f132381f) && Intrinsics.d(this.f132382g, f7Var.f132382g) && Intrinsics.d(this.f132383h, f7Var.f132383h) && Intrinsics.d(this.f132384i, f7Var.f132384i) && Intrinsics.d(this.f132385j, f7Var.f132385j) && Intrinsics.d(this.f132386k, f7Var.f132386k) && Intrinsics.d(this.f132387l, f7Var.f132387l) && Intrinsics.d(this.f132388m, f7Var.f132388m) && Intrinsics.d(this.f132389n, f7Var.f132389n) && Intrinsics.d(this.f132390o, f7Var.f132390o) && Intrinsics.d(this.f132391p, f7Var.f132391p) && Intrinsics.d(this.f132392q, f7Var.f132392q) && Intrinsics.d(this.f132393r, f7Var.f132393r) && Intrinsics.d(this.f132394s, f7Var.f132394s) && Intrinsics.d(this.f132395t, f7Var.f132395t);
    }

    @Override // z40.d0
    public final String f() {
        return this.f132389n;
    }

    @Override // z40.d0
    public final String g() {
        return this.f132390o;
    }

    @Override // z40.d0
    public final String getId() {
        return this.f132377b;
    }

    @Override // z40.d0
    public final Boolean h() {
        return this.f132381f;
    }

    public final int hashCode() {
        int d2 = a.cb.d(this.f132378c, a.cb.d(this.f132377b, this.f132376a.hashCode() * 31, 31), 31);
        e7 e7Var = this.f132379d;
        int hashCode = (d2 + (e7Var == null ? 0 : e7Var.hashCode())) * 31;
        Boolean bool = this.f132380e;
        int hashCode2 = (hashCode + (bool == null ? 0 : bool.hashCode())) * 31;
        Boolean bool2 = this.f132381f;
        int hashCode3 = (hashCode2 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        Boolean bool3 = this.f132382g;
        int hashCode4 = (hashCode3 + (bool3 == null ? 0 : bool3.hashCode())) * 31;
        String str = this.f132383h;
        int hashCode5 = (hashCode4 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f132384i;
        int hashCode6 = (hashCode5 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f132385j;
        int hashCode7 = (hashCode6 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.f132386k;
        int hashCode8 = (hashCode7 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.f132387l;
        int hashCode9 = (hashCode8 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.f132388m;
        int hashCode10 = (hashCode9 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.f132389n;
        int hashCode11 = (hashCode10 + (str7 == null ? 0 : str7.hashCode())) * 31;
        String str8 = this.f132390o;
        int hashCode12 = (hashCode11 + (str8 == null ? 0 : str8.hashCode())) * 31;
        Integer num = this.f132391p;
        int hashCode13 = (hashCode12 + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.f132392q;
        int hashCode14 = (hashCode13 + (num2 == null ? 0 : num2.hashCode())) * 31;
        Boolean bool4 = this.f132393r;
        int hashCode15 = (hashCode14 + (bool4 == null ? 0 : bool4.hashCode())) * 31;
        Boolean bool5 = this.f132394s;
        int hashCode16 = (hashCode15 + (bool5 == null ? 0 : bool5.hashCode())) * 31;
        Integer num3 = this.f132395t;
        return hashCode16 + (num3 != null ? num3.hashCode() : 0);
    }

    @Override // z40.d0
    public final z40.c0 i() {
        return this.f132379d;
    }

    @Override // z40.d0
    public final Integer j() {
        return this.f132392q;
    }

    @Override // z40.d0
    public final String k() {
        return this.f132386k;
    }

    @Override // z40.d0
    public final String l() {
        return this.f132387l;
    }

    @Override // z40.d0
    public final String m() {
        return this.f132383h;
    }

    @Override // z40.d0
    public final Integer n() {
        return this.f132395t;
    }

    @Override // z40.d0
    public final Boolean o() {
        return this.f132382g;
    }

    @Override // z40.d0
    public final String p() {
        return this.f132388m;
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("InvitedUser(__typename=");
        sb3.append(this.f132376a);
        sb3.append(", id=");
        sb3.append(this.f132377b);
        sb3.append(", entityId=");
        sb3.append(this.f132378c);
        sb3.append(", verifiedIdentity=");
        sb3.append(this.f132379d);
        sb3.append(", blockedByMe=");
        sb3.append(this.f132380e);
        sb3.append(", isVerifiedMerchant=");
        sb3.append(this.f132381f);
        sb3.append(", isDefaultImage=");
        sb3.append(this.f132382g);
        sb3.append(", imageXlargeUrl=");
        sb3.append(this.f132383h);
        sb3.append(", imageLargeUrl=");
        sb3.append(this.f132384i);
        sb3.append(", imageMediumUrl=");
        sb3.append(this.f132385j);
        sb3.append(", imageSmallUrl=");
        sb3.append(this.f132386k);
        sb3.append(", firstName=");
        sb3.append(this.f132387l);
        sb3.append(", lastName=");
        sb3.append(this.f132388m);
        sb3.append(", fullName=");
        sb3.append(this.f132389n);
        sb3.append(", username=");
        sb3.append(this.f132390o);
        sb3.append(", followerCount=");
        sb3.append(this.f132391p);
        sb3.append(", followingCount=");
        sb3.append(this.f132392q);
        sb3.append(", explicitlyFollowedByMe=");
        sb3.append(this.f132393r);
        sb3.append(", isPrivateProfile=");
        sb3.append(this.f132394s);
        sb3.append(", avatarColorIndex=");
        return a.c.i(sb3, this.f132395t, ")");
    }
}
