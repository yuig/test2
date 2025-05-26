package x40;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class uf implements z40.d0 {

    /* renamed from: a, reason: collision with root package name */
    public final String f133475a;

    /* renamed from: b, reason: collision with root package name */
    public final String f133476b;

    /* renamed from: c, reason: collision with root package name */
    public final String f133477c;

    /* renamed from: d, reason: collision with root package name */
    public final tf f133478d;

    /* renamed from: e, reason: collision with root package name */
    public final Boolean f133479e;

    /* renamed from: f, reason: collision with root package name */
    public final Boolean f133480f;

    /* renamed from: g, reason: collision with root package name */
    public final Boolean f133481g;

    /* renamed from: h, reason: collision with root package name */
    public final String f133482h;

    /* renamed from: i, reason: collision with root package name */
    public final String f133483i;

    /* renamed from: j, reason: collision with root package name */
    public final String f133484j;

    /* renamed from: k, reason: collision with root package name */
    public final String f133485k;

    /* renamed from: l, reason: collision with root package name */
    public final String f133486l;

    /* renamed from: m, reason: collision with root package name */
    public final String f133487m;

    /* renamed from: n, reason: collision with root package name */
    public final String f133488n;

    /* renamed from: o, reason: collision with root package name */
    public final String f133489o;

    /* renamed from: p, reason: collision with root package name */
    public final Integer f133490p;

    /* renamed from: q, reason: collision with root package name */
    public final Integer f133491q;

    /* renamed from: r, reason: collision with root package name */
    public final Boolean f133492r;

    /* renamed from: s, reason: collision with root package name */
    public final Boolean f133493s;

    /* renamed from: t, reason: collision with root package name */
    public final Integer f133494t;

    public uf(String __typename, String id3, String entityId, tf tfVar, Boolean bool, Boolean bool2, Boolean bool3, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, Integer num, Integer num2, Boolean bool4, Boolean bool5, Integer num3) {
        Intrinsics.checkNotNullParameter(__typename, "__typename");
        Intrinsics.checkNotNullParameter(id3, "id");
        Intrinsics.checkNotNullParameter(entityId, "entityId");
        this.f133475a = __typename;
        this.f133476b = id3;
        this.f133477c = entityId;
        this.f133478d = tfVar;
        this.f133479e = bool;
        this.f133480f = bool2;
        this.f133481g = bool3;
        this.f133482h = str;
        this.f133483i = str2;
        this.f133484j = str3;
        this.f133485k = str4;
        this.f133486l = str5;
        this.f133487m = str6;
        this.f133488n = str7;
        this.f133489o = str8;
        this.f133490p = num;
        this.f133491q = num2;
        this.f133492r = bool4;
        this.f133493s = bool5;
        this.f133494t = num3;
    }

    @Override // z40.d0
    public final String a() {
        return this.f133477c;
    }

    @Override // z40.d0
    public final String b() {
        return this.f133484j;
    }

    @Override // z40.d0
    public final Integer c() {
        return this.f133490p;
    }

    @Override // z40.d0
    public final Boolean d() {
        return this.f133492r;
    }

    @Override // z40.d0
    public final String e() {
        return this.f133483i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof uf)) {
            return false;
        }
        uf ufVar = (uf) obj;
        return Intrinsics.d(this.f133475a, ufVar.f133475a) && Intrinsics.d(this.f133476b, ufVar.f133476b) && Intrinsics.d(this.f133477c, ufVar.f133477c) && Intrinsics.d(this.f133478d, ufVar.f133478d) && Intrinsics.d(this.f133479e, ufVar.f133479e) && Intrinsics.d(this.f133480f, ufVar.f133480f) && Intrinsics.d(this.f133481g, ufVar.f133481g) && Intrinsics.d(this.f133482h, ufVar.f133482h) && Intrinsics.d(this.f133483i, ufVar.f133483i) && Intrinsics.d(this.f133484j, ufVar.f133484j) && Intrinsics.d(this.f133485k, ufVar.f133485k) && Intrinsics.d(this.f133486l, ufVar.f133486l) && Intrinsics.d(this.f133487m, ufVar.f133487m) && Intrinsics.d(this.f133488n, ufVar.f133488n) && Intrinsics.d(this.f133489o, ufVar.f133489o) && Intrinsics.d(this.f133490p, ufVar.f133490p) && Intrinsics.d(this.f133491q, ufVar.f133491q) && Intrinsics.d(this.f133492r, ufVar.f133492r) && Intrinsics.d(this.f133493s, ufVar.f133493s) && Intrinsics.d(this.f133494t, ufVar.f133494t);
    }

    @Override // z40.d0
    public final String f() {
        return this.f133488n;
    }

    @Override // z40.d0
    public final String g() {
        return this.f133489o;
    }

    @Override // z40.d0
    public final String getId() {
        return this.f133476b;
    }

    @Override // z40.d0
    public final Boolean h() {
        return this.f133480f;
    }

    public final int hashCode() {
        int d2 = a.cb.d(this.f133477c, a.cb.d(this.f133476b, this.f133475a.hashCode() * 31, 31), 31);
        tf tfVar = this.f133478d;
        int hashCode = (d2 + (tfVar == null ? 0 : tfVar.hashCode())) * 31;
        Boolean bool = this.f133479e;
        int hashCode2 = (hashCode + (bool == null ? 0 : bool.hashCode())) * 31;
        Boolean bool2 = this.f133480f;
        int hashCode3 = (hashCode2 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        Boolean bool3 = this.f133481g;
        int hashCode4 = (hashCode3 + (bool3 == null ? 0 : bool3.hashCode())) * 31;
        String str = this.f133482h;
        int hashCode5 = (hashCode4 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f133483i;
        int hashCode6 = (hashCode5 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f133484j;
        int hashCode7 = (hashCode6 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.f133485k;
        int hashCode8 = (hashCode7 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.f133486l;
        int hashCode9 = (hashCode8 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.f133487m;
        int hashCode10 = (hashCode9 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.f133488n;
        int hashCode11 = (hashCode10 + (str7 == null ? 0 : str7.hashCode())) * 31;
        String str8 = this.f133489o;
        int hashCode12 = (hashCode11 + (str8 == null ? 0 : str8.hashCode())) * 31;
        Integer num = this.f133490p;
        int hashCode13 = (hashCode12 + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.f133491q;
        int hashCode14 = (hashCode13 + (num2 == null ? 0 : num2.hashCode())) * 31;
        Boolean bool4 = this.f133492r;
        int hashCode15 = (hashCode14 + (bool4 == null ? 0 : bool4.hashCode())) * 31;
        Boolean bool5 = this.f133493s;
        int hashCode16 = (hashCode15 + (bool5 == null ? 0 : bool5.hashCode())) * 31;
        Integer num3 = this.f133494t;
        return hashCode16 + (num3 != null ? num3.hashCode() : 0);
    }

    @Override // z40.d0
    public final z40.c0 i() {
        return this.f133478d;
    }

    @Override // z40.d0
    public final Integer j() {
        return this.f133491q;
    }

    @Override // z40.d0
    public final String k() {
        return this.f133485k;
    }

    @Override // z40.d0
    public final String l() {
        return this.f133486l;
    }

    @Override // z40.d0
    public final String m() {
        return this.f133482h;
    }

    @Override // z40.d0
    public final Integer n() {
        return this.f133494t;
    }

    @Override // z40.d0
    public final Boolean o() {
        return this.f133481g;
    }

    @Override // z40.d0
    public final String p() {
        return this.f133487m;
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("Pinner(__typename=");
        sb3.append(this.f133475a);
        sb3.append(", id=");
        sb3.append(this.f133476b);
        sb3.append(", entityId=");
        sb3.append(this.f133477c);
        sb3.append(", verifiedIdentity=");
        sb3.append(this.f133478d);
        sb3.append(", blockedByMe=");
        sb3.append(this.f133479e);
        sb3.append(", isVerifiedMerchant=");
        sb3.append(this.f133480f);
        sb3.append(", isDefaultImage=");
        sb3.append(this.f133481g);
        sb3.append(", imageXlargeUrl=");
        sb3.append(this.f133482h);
        sb3.append(", imageLargeUrl=");
        sb3.append(this.f133483i);
        sb3.append(", imageMediumUrl=");
        sb3.append(this.f133484j);
        sb3.append(", imageSmallUrl=");
        sb3.append(this.f133485k);
        sb3.append(", firstName=");
        sb3.append(this.f133486l);
        sb3.append(", lastName=");
        sb3.append(this.f133487m);
        sb3.append(", fullName=");
        sb3.append(this.f133488n);
        sb3.append(", username=");
        sb3.append(this.f133489o);
        sb3.append(", followerCount=");
        sb3.append(this.f133490p);
        sb3.append(", followingCount=");
        sb3.append(this.f133491q);
        sb3.append(", explicitlyFollowedByMe=");
        sb3.append(this.f133492r);
        sb3.append(", isPrivateProfile=");
        sb3.append(this.f133493s);
        sb3.append(", avatarColorIndex=");
        return a.c.i(sb3, this.f133494t, ")");
    }
}
