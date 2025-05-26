package x40;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class z2 implements z40.d0 {

    /* renamed from: a, reason: collision with root package name */
    public final String f133763a;

    /* renamed from: b, reason: collision with root package name */
    public final String f133764b;

    /* renamed from: c, reason: collision with root package name */
    public final String f133765c;

    /* renamed from: d, reason: collision with root package name */
    public final y2 f133766d;

    /* renamed from: e, reason: collision with root package name */
    public final Boolean f133767e;

    /* renamed from: f, reason: collision with root package name */
    public final Boolean f133768f;

    /* renamed from: g, reason: collision with root package name */
    public final Boolean f133769g;

    /* renamed from: h, reason: collision with root package name */
    public final String f133770h;

    /* renamed from: i, reason: collision with root package name */
    public final String f133771i;

    /* renamed from: j, reason: collision with root package name */
    public final String f133772j;

    /* renamed from: k, reason: collision with root package name */
    public final String f133773k;

    /* renamed from: l, reason: collision with root package name */
    public final String f133774l;

    /* renamed from: m, reason: collision with root package name */
    public final String f133775m;

    /* renamed from: n, reason: collision with root package name */
    public final String f133776n;

    /* renamed from: o, reason: collision with root package name */
    public final String f133777o;

    /* renamed from: p, reason: collision with root package name */
    public final Integer f133778p;

    /* renamed from: q, reason: collision with root package name */
    public final Integer f133779q;

    /* renamed from: r, reason: collision with root package name */
    public final Boolean f133780r;

    /* renamed from: s, reason: collision with root package name */
    public final Boolean f133781s;

    /* renamed from: t, reason: collision with root package name */
    public final Integer f133782t;

    public z2(String __typename, String id3, String entityId, y2 y2Var, Boolean bool, Boolean bool2, Boolean bool3, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, Integer num, Integer num2, Boolean bool4, Boolean bool5, Integer num3) {
        Intrinsics.checkNotNullParameter(__typename, "__typename");
        Intrinsics.checkNotNullParameter(id3, "id");
        Intrinsics.checkNotNullParameter(entityId, "entityId");
        this.f133763a = __typename;
        this.f133764b = id3;
        this.f133765c = entityId;
        this.f133766d = y2Var;
        this.f133767e = bool;
        this.f133768f = bool2;
        this.f133769g = bool3;
        this.f133770h = str;
        this.f133771i = str2;
        this.f133772j = str3;
        this.f133773k = str4;
        this.f133774l = str5;
        this.f133775m = str6;
        this.f133776n = str7;
        this.f133777o = str8;
        this.f133778p = num;
        this.f133779q = num2;
        this.f133780r = bool4;
        this.f133781s = bool5;
        this.f133782t = num3;
    }

    @Override // z40.d0
    public final String a() {
        return this.f133765c;
    }

    @Override // z40.d0
    public final String b() {
        return this.f133772j;
    }

    @Override // z40.d0
    public final Integer c() {
        return this.f133778p;
    }

    @Override // z40.d0
    public final Boolean d() {
        return this.f133780r;
    }

    @Override // z40.d0
    public final String e() {
        return this.f133771i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof z2)) {
            return false;
        }
        z2 z2Var = (z2) obj;
        return Intrinsics.d(this.f133763a, z2Var.f133763a) && Intrinsics.d(this.f133764b, z2Var.f133764b) && Intrinsics.d(this.f133765c, z2Var.f133765c) && Intrinsics.d(this.f133766d, z2Var.f133766d) && Intrinsics.d(this.f133767e, z2Var.f133767e) && Intrinsics.d(this.f133768f, z2Var.f133768f) && Intrinsics.d(this.f133769g, z2Var.f133769g) && Intrinsics.d(this.f133770h, z2Var.f133770h) && Intrinsics.d(this.f133771i, z2Var.f133771i) && Intrinsics.d(this.f133772j, z2Var.f133772j) && Intrinsics.d(this.f133773k, z2Var.f133773k) && Intrinsics.d(this.f133774l, z2Var.f133774l) && Intrinsics.d(this.f133775m, z2Var.f133775m) && Intrinsics.d(this.f133776n, z2Var.f133776n) && Intrinsics.d(this.f133777o, z2Var.f133777o) && Intrinsics.d(this.f133778p, z2Var.f133778p) && Intrinsics.d(this.f133779q, z2Var.f133779q) && Intrinsics.d(this.f133780r, z2Var.f133780r) && Intrinsics.d(this.f133781s, z2Var.f133781s) && Intrinsics.d(this.f133782t, z2Var.f133782t);
    }

    @Override // z40.d0
    public final String f() {
        return this.f133776n;
    }

    @Override // z40.d0
    public final String g() {
        return this.f133777o;
    }

    @Override // z40.d0
    public final String getId() {
        return this.f133764b;
    }

    @Override // z40.d0
    public final Boolean h() {
        return this.f133768f;
    }

    public final int hashCode() {
        int d2 = a.cb.d(this.f133765c, a.cb.d(this.f133764b, this.f133763a.hashCode() * 31, 31), 31);
        y2 y2Var = this.f133766d;
        int hashCode = (d2 + (y2Var == null ? 0 : y2Var.hashCode())) * 31;
        Boolean bool = this.f133767e;
        int hashCode2 = (hashCode + (bool == null ? 0 : bool.hashCode())) * 31;
        Boolean bool2 = this.f133768f;
        int hashCode3 = (hashCode2 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        Boolean bool3 = this.f133769g;
        int hashCode4 = (hashCode3 + (bool3 == null ? 0 : bool3.hashCode())) * 31;
        String str = this.f133770h;
        int hashCode5 = (hashCode4 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f133771i;
        int hashCode6 = (hashCode5 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f133772j;
        int hashCode7 = (hashCode6 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.f133773k;
        int hashCode8 = (hashCode7 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.f133774l;
        int hashCode9 = (hashCode8 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.f133775m;
        int hashCode10 = (hashCode9 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.f133776n;
        int hashCode11 = (hashCode10 + (str7 == null ? 0 : str7.hashCode())) * 31;
        String str8 = this.f133777o;
        int hashCode12 = (hashCode11 + (str8 == null ? 0 : str8.hashCode())) * 31;
        Integer num = this.f133778p;
        int hashCode13 = (hashCode12 + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.f133779q;
        int hashCode14 = (hashCode13 + (num2 == null ? 0 : num2.hashCode())) * 31;
        Boolean bool4 = this.f133780r;
        int hashCode15 = (hashCode14 + (bool4 == null ? 0 : bool4.hashCode())) * 31;
        Boolean bool5 = this.f133781s;
        int hashCode16 = (hashCode15 + (bool5 == null ? 0 : bool5.hashCode())) * 31;
        Integer num3 = this.f133782t;
        return hashCode16 + (num3 != null ? num3.hashCode() : 0);
    }

    @Override // z40.d0
    public final z40.c0 i() {
        return this.f133766d;
    }

    @Override // z40.d0
    public final Integer j() {
        return this.f133779q;
    }

    @Override // z40.d0
    public final String k() {
        return this.f133773k;
    }

    @Override // z40.d0
    public final String l() {
        return this.f133774l;
    }

    @Override // z40.d0
    public final String m() {
        return this.f133770h;
    }

    @Override // z40.d0
    public final Integer n() {
        return this.f133782t;
    }

    @Override // z40.d0
    public final Boolean o() {
        return this.f133769g;
    }

    @Override // z40.d0
    public final String p() {
        return this.f133775m;
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("Node(__typename=");
        sb3.append(this.f133763a);
        sb3.append(", id=");
        sb3.append(this.f133764b);
        sb3.append(", entityId=");
        sb3.append(this.f133765c);
        sb3.append(", verifiedIdentity=");
        sb3.append(this.f133766d);
        sb3.append(", blockedByMe=");
        sb3.append(this.f133767e);
        sb3.append(", isVerifiedMerchant=");
        sb3.append(this.f133768f);
        sb3.append(", isDefaultImage=");
        sb3.append(this.f133769g);
        sb3.append(", imageXlargeUrl=");
        sb3.append(this.f133770h);
        sb3.append(", imageLargeUrl=");
        sb3.append(this.f133771i);
        sb3.append(", imageMediumUrl=");
        sb3.append(this.f133772j);
        sb3.append(", imageSmallUrl=");
        sb3.append(this.f133773k);
        sb3.append(", firstName=");
        sb3.append(this.f133774l);
        sb3.append(", lastName=");
        sb3.append(this.f133775m);
        sb3.append(", fullName=");
        sb3.append(this.f133776n);
        sb3.append(", username=");
        sb3.append(this.f133777o);
        sb3.append(", followerCount=");
        sb3.append(this.f133778p);
        sb3.append(", followingCount=");
        sb3.append(this.f133779q);
        sb3.append(", explicitlyFollowedByMe=");
        sb3.append(this.f133780r);
        sb3.append(", isPrivateProfile=");
        sb3.append(this.f133781s);
        sb3.append(", avatarColorIndex=");
        return a.c.i(sb3, this.f133782t, ")");
    }
}
