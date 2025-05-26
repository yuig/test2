package x40;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class ta implements z40.d0 {

    /* renamed from: a, reason: collision with root package name */
    public final String f133339a;

    /* renamed from: b, reason: collision with root package name */
    public final String f133340b;

    /* renamed from: c, reason: collision with root package name */
    public final String f133341c;

    /* renamed from: d, reason: collision with root package name */
    public final sa f133342d;

    /* renamed from: e, reason: collision with root package name */
    public final Boolean f133343e;

    /* renamed from: f, reason: collision with root package name */
    public final Boolean f133344f;

    /* renamed from: g, reason: collision with root package name */
    public final Boolean f133345g;

    /* renamed from: h, reason: collision with root package name */
    public final String f133346h;

    /* renamed from: i, reason: collision with root package name */
    public final String f133347i;

    /* renamed from: j, reason: collision with root package name */
    public final String f133348j;

    /* renamed from: k, reason: collision with root package name */
    public final String f133349k;

    /* renamed from: l, reason: collision with root package name */
    public final String f133350l;

    /* renamed from: m, reason: collision with root package name */
    public final String f133351m;

    /* renamed from: n, reason: collision with root package name */
    public final String f133352n;

    /* renamed from: o, reason: collision with root package name */
    public final String f133353o;

    /* renamed from: p, reason: collision with root package name */
    public final Integer f133354p;

    /* renamed from: q, reason: collision with root package name */
    public final Integer f133355q;

    /* renamed from: r, reason: collision with root package name */
    public final Boolean f133356r;

    /* renamed from: s, reason: collision with root package name */
    public final Boolean f133357s;

    /* renamed from: t, reason: collision with root package name */
    public final Integer f133358t;

    public ta(String __typename, String id3, String entityId, sa saVar, Boolean bool, Boolean bool2, Boolean bool3, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, Integer num, Integer num2, Boolean bool4, Boolean bool5, Integer num3) {
        Intrinsics.checkNotNullParameter(__typename, "__typename");
        Intrinsics.checkNotNullParameter(id3, "id");
        Intrinsics.checkNotNullParameter(entityId, "entityId");
        this.f133339a = __typename;
        this.f133340b = id3;
        this.f133341c = entityId;
        this.f133342d = saVar;
        this.f133343e = bool;
        this.f133344f = bool2;
        this.f133345g = bool3;
        this.f133346h = str;
        this.f133347i = str2;
        this.f133348j = str3;
        this.f133349k = str4;
        this.f133350l = str5;
        this.f133351m = str6;
        this.f133352n = str7;
        this.f133353o = str8;
        this.f133354p = num;
        this.f133355q = num2;
        this.f133356r = bool4;
        this.f133357s = bool5;
        this.f133358t = num3;
    }

    @Override // z40.d0
    public final String a() {
        return this.f133341c;
    }

    @Override // z40.d0
    public final String b() {
        return this.f133348j;
    }

    @Override // z40.d0
    public final Integer c() {
        return this.f133354p;
    }

    @Override // z40.d0
    public final Boolean d() {
        return this.f133356r;
    }

    @Override // z40.d0
    public final String e() {
        return this.f133347i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ta)) {
            return false;
        }
        ta taVar = (ta) obj;
        return Intrinsics.d(this.f133339a, taVar.f133339a) && Intrinsics.d(this.f133340b, taVar.f133340b) && Intrinsics.d(this.f133341c, taVar.f133341c) && Intrinsics.d(this.f133342d, taVar.f133342d) && Intrinsics.d(this.f133343e, taVar.f133343e) && Intrinsics.d(this.f133344f, taVar.f133344f) && Intrinsics.d(this.f133345g, taVar.f133345g) && Intrinsics.d(this.f133346h, taVar.f133346h) && Intrinsics.d(this.f133347i, taVar.f133347i) && Intrinsics.d(this.f133348j, taVar.f133348j) && Intrinsics.d(this.f133349k, taVar.f133349k) && Intrinsics.d(this.f133350l, taVar.f133350l) && Intrinsics.d(this.f133351m, taVar.f133351m) && Intrinsics.d(this.f133352n, taVar.f133352n) && Intrinsics.d(this.f133353o, taVar.f133353o) && Intrinsics.d(this.f133354p, taVar.f133354p) && Intrinsics.d(this.f133355q, taVar.f133355q) && Intrinsics.d(this.f133356r, taVar.f133356r) && Intrinsics.d(this.f133357s, taVar.f133357s) && Intrinsics.d(this.f133358t, taVar.f133358t);
    }

    @Override // z40.d0
    public final String f() {
        return this.f133352n;
    }

    @Override // z40.d0
    public final String g() {
        return this.f133353o;
    }

    @Override // z40.d0
    public final String getId() {
        return this.f133340b;
    }

    @Override // z40.d0
    public final Boolean h() {
        return this.f133344f;
    }

    public final int hashCode() {
        int d2 = a.cb.d(this.f133341c, a.cb.d(this.f133340b, this.f133339a.hashCode() * 31, 31), 31);
        sa saVar = this.f133342d;
        int hashCode = (d2 + (saVar == null ? 0 : saVar.hashCode())) * 31;
        Boolean bool = this.f133343e;
        int hashCode2 = (hashCode + (bool == null ? 0 : bool.hashCode())) * 31;
        Boolean bool2 = this.f133344f;
        int hashCode3 = (hashCode2 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        Boolean bool3 = this.f133345g;
        int hashCode4 = (hashCode3 + (bool3 == null ? 0 : bool3.hashCode())) * 31;
        String str = this.f133346h;
        int hashCode5 = (hashCode4 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f133347i;
        int hashCode6 = (hashCode5 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f133348j;
        int hashCode7 = (hashCode6 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.f133349k;
        int hashCode8 = (hashCode7 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.f133350l;
        int hashCode9 = (hashCode8 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.f133351m;
        int hashCode10 = (hashCode9 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.f133352n;
        int hashCode11 = (hashCode10 + (str7 == null ? 0 : str7.hashCode())) * 31;
        String str8 = this.f133353o;
        int hashCode12 = (hashCode11 + (str8 == null ? 0 : str8.hashCode())) * 31;
        Integer num = this.f133354p;
        int hashCode13 = (hashCode12 + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.f133355q;
        int hashCode14 = (hashCode13 + (num2 == null ? 0 : num2.hashCode())) * 31;
        Boolean bool4 = this.f133356r;
        int hashCode15 = (hashCode14 + (bool4 == null ? 0 : bool4.hashCode())) * 31;
        Boolean bool5 = this.f133357s;
        int hashCode16 = (hashCode15 + (bool5 == null ? 0 : bool5.hashCode())) * 31;
        Integer num3 = this.f133358t;
        return hashCode16 + (num3 != null ? num3.hashCode() : 0);
    }

    @Override // z40.d0
    public final z40.c0 i() {
        return this.f133342d;
    }

    @Override // z40.d0
    public final Integer j() {
        return this.f133355q;
    }

    @Override // z40.d0
    public final String k() {
        return this.f133349k;
    }

    @Override // z40.d0
    public final String l() {
        return this.f133350l;
    }

    @Override // z40.d0
    public final String m() {
        return this.f133346h;
    }

    @Override // z40.d0
    public final Integer n() {
        return this.f133358t;
    }

    @Override // z40.d0
    public final Boolean o() {
        return this.f133345g;
    }

    @Override // z40.d0
    public final String p() {
        return this.f133351m;
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("Pinner(__typename=");
        sb3.append(this.f133339a);
        sb3.append(", id=");
        sb3.append(this.f133340b);
        sb3.append(", entityId=");
        sb3.append(this.f133341c);
        sb3.append(", verifiedIdentity=");
        sb3.append(this.f133342d);
        sb3.append(", blockedByMe=");
        sb3.append(this.f133343e);
        sb3.append(", isVerifiedMerchant=");
        sb3.append(this.f133344f);
        sb3.append(", isDefaultImage=");
        sb3.append(this.f133345g);
        sb3.append(", imageXlargeUrl=");
        sb3.append(this.f133346h);
        sb3.append(", imageLargeUrl=");
        sb3.append(this.f133347i);
        sb3.append(", imageMediumUrl=");
        sb3.append(this.f133348j);
        sb3.append(", imageSmallUrl=");
        sb3.append(this.f133349k);
        sb3.append(", firstName=");
        sb3.append(this.f133350l);
        sb3.append(", lastName=");
        sb3.append(this.f133351m);
        sb3.append(", fullName=");
        sb3.append(this.f133352n);
        sb3.append(", username=");
        sb3.append(this.f133353o);
        sb3.append(", followerCount=");
        sb3.append(this.f133354p);
        sb3.append(", followingCount=");
        sb3.append(this.f133355q);
        sb3.append(", explicitlyFollowedByMe=");
        sb3.append(this.f133356r);
        sb3.append(", isPrivateProfile=");
        sb3.append(this.f133357s);
        sb3.append(", avatarColorIndex=");
        return a.c.i(sb3, this.f133358t, ")");
    }
}
