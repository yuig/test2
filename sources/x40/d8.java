package x40;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class d8 implements z40.d0, z40.g {

    /* renamed from: a, reason: collision with root package name */
    public final String f132214a;

    /* renamed from: b, reason: collision with root package name */
    public final String f132215b;

    /* renamed from: c, reason: collision with root package name */
    public final String f132216c;

    /* renamed from: d, reason: collision with root package name */
    public final c8 f132217d;

    /* renamed from: e, reason: collision with root package name */
    public final Boolean f132218e;

    /* renamed from: f, reason: collision with root package name */
    public final Boolean f132219f;

    /* renamed from: g, reason: collision with root package name */
    public final Boolean f132220g;

    /* renamed from: h, reason: collision with root package name */
    public final String f132221h;

    /* renamed from: i, reason: collision with root package name */
    public final String f132222i;

    /* renamed from: j, reason: collision with root package name */
    public final String f132223j;

    /* renamed from: k, reason: collision with root package name */
    public final String f132224k;

    /* renamed from: l, reason: collision with root package name */
    public final String f132225l;

    /* renamed from: m, reason: collision with root package name */
    public final String f132226m;

    /* renamed from: n, reason: collision with root package name */
    public final String f132227n;

    /* renamed from: o, reason: collision with root package name */
    public final String f132228o;

    /* renamed from: p, reason: collision with root package name */
    public final Integer f132229p;

    /* renamed from: q, reason: collision with root package name */
    public final Integer f132230q;

    /* renamed from: r, reason: collision with root package name */
    public final Boolean f132231r;

    /* renamed from: s, reason: collision with root package name */
    public final Boolean f132232s;

    /* renamed from: t, reason: collision with root package name */
    public final Integer f132233t;

    public d8(String __typename, String id3, String entityId, c8 c8Var, Boolean bool, Boolean bool2, Boolean bool3, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, Integer num, Integer num2, Boolean bool4, Boolean bool5, Integer num3) {
        Intrinsics.checkNotNullParameter(__typename, "__typename");
        Intrinsics.checkNotNullParameter(id3, "id");
        Intrinsics.checkNotNullParameter(entityId, "entityId");
        this.f132214a = __typename;
        this.f132215b = id3;
        this.f132216c = entityId;
        this.f132217d = c8Var;
        this.f132218e = bool;
        this.f132219f = bool2;
        this.f132220g = bool3;
        this.f132221h = str;
        this.f132222i = str2;
        this.f132223j = str3;
        this.f132224k = str4;
        this.f132225l = str5;
        this.f132226m = str6;
        this.f132227n = str7;
        this.f132228o = str8;
        this.f132229p = num;
        this.f132230q = num2;
        this.f132231r = bool4;
        this.f132232s = bool5;
        this.f132233t = num3;
    }

    @Override // z40.d0
    public final String a() {
        return this.f132216c;
    }

    @Override // z40.d0
    public final String b() {
        return this.f132223j;
    }

    @Override // z40.d0
    public final Integer c() {
        return this.f132229p;
    }

    @Override // z40.d0
    public final Boolean d() {
        return this.f132231r;
    }

    @Override // z40.d0
    public final String e() {
        return this.f132222i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d8)) {
            return false;
        }
        d8 d8Var = (d8) obj;
        return Intrinsics.d(this.f132214a, d8Var.f132214a) && Intrinsics.d(this.f132215b, d8Var.f132215b) && Intrinsics.d(this.f132216c, d8Var.f132216c) && Intrinsics.d(this.f132217d, d8Var.f132217d) && Intrinsics.d(this.f132218e, d8Var.f132218e) && Intrinsics.d(this.f132219f, d8Var.f132219f) && Intrinsics.d(this.f132220g, d8Var.f132220g) && Intrinsics.d(this.f132221h, d8Var.f132221h) && Intrinsics.d(this.f132222i, d8Var.f132222i) && Intrinsics.d(this.f132223j, d8Var.f132223j) && Intrinsics.d(this.f132224k, d8Var.f132224k) && Intrinsics.d(this.f132225l, d8Var.f132225l) && Intrinsics.d(this.f132226m, d8Var.f132226m) && Intrinsics.d(this.f132227n, d8Var.f132227n) && Intrinsics.d(this.f132228o, d8Var.f132228o) && Intrinsics.d(this.f132229p, d8Var.f132229p) && Intrinsics.d(this.f132230q, d8Var.f132230q) && Intrinsics.d(this.f132231r, d8Var.f132231r) && Intrinsics.d(this.f132232s, d8Var.f132232s) && Intrinsics.d(this.f132233t, d8Var.f132233t);
    }

    @Override // z40.d0
    public final String f() {
        return this.f132227n;
    }

    @Override // z40.d0
    public final String g() {
        return this.f132228o;
    }

    @Override // z40.d0
    public final String getId() {
        return this.f132215b;
    }

    @Override // z40.d0
    public final Boolean h() {
        return this.f132219f;
    }

    public final int hashCode() {
        int d2 = a.cb.d(this.f132216c, a.cb.d(this.f132215b, this.f132214a.hashCode() * 31, 31), 31);
        c8 c8Var = this.f132217d;
        int hashCode = (d2 + (c8Var == null ? 0 : c8Var.hashCode())) * 31;
        Boolean bool = this.f132218e;
        int hashCode2 = (hashCode + (bool == null ? 0 : bool.hashCode())) * 31;
        Boolean bool2 = this.f132219f;
        int hashCode3 = (hashCode2 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        Boolean bool3 = this.f132220g;
        int hashCode4 = (hashCode3 + (bool3 == null ? 0 : bool3.hashCode())) * 31;
        String str = this.f132221h;
        int hashCode5 = (hashCode4 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f132222i;
        int hashCode6 = (hashCode5 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f132223j;
        int hashCode7 = (hashCode6 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.f132224k;
        int hashCode8 = (hashCode7 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.f132225l;
        int hashCode9 = (hashCode8 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.f132226m;
        int hashCode10 = (hashCode9 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.f132227n;
        int hashCode11 = (hashCode10 + (str7 == null ? 0 : str7.hashCode())) * 31;
        String str8 = this.f132228o;
        int hashCode12 = (hashCode11 + (str8 == null ? 0 : str8.hashCode())) * 31;
        Integer num = this.f132229p;
        int hashCode13 = (hashCode12 + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.f132230q;
        int hashCode14 = (hashCode13 + (num2 == null ? 0 : num2.hashCode())) * 31;
        Boolean bool4 = this.f132231r;
        int hashCode15 = (hashCode14 + (bool4 == null ? 0 : bool4.hashCode())) * 31;
        Boolean bool5 = this.f132232s;
        int hashCode16 = (hashCode15 + (bool5 == null ? 0 : bool5.hashCode())) * 31;
        Integer num3 = this.f132233t;
        return hashCode16 + (num3 != null ? num3.hashCode() : 0);
    }

    @Override // z40.d0
    public final z40.c0 i() {
        return this.f132217d;
    }

    @Override // z40.d0
    public final Integer j() {
        return this.f132230q;
    }

    @Override // z40.d0
    public final String k() {
        return this.f132224k;
    }

    @Override // z40.d0
    public final String l() {
        return this.f132225l;
    }

    @Override // z40.d0
    public final String m() {
        return this.f132221h;
    }

    @Override // z40.d0
    public final Integer n() {
        return this.f132233t;
    }

    @Override // z40.d0
    public final Boolean o() {
        return this.f132220g;
    }

    @Override // z40.d0
    public final String p() {
        return this.f132226m;
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("Sender(__typename=");
        sb3.append(this.f132214a);
        sb3.append(", id=");
        sb3.append(this.f132215b);
        sb3.append(", entityId=");
        sb3.append(this.f132216c);
        sb3.append(", verifiedIdentity=");
        sb3.append(this.f132217d);
        sb3.append(", blockedByMe=");
        sb3.append(this.f132218e);
        sb3.append(", isVerifiedMerchant=");
        sb3.append(this.f132219f);
        sb3.append(", isDefaultImage=");
        sb3.append(this.f132220g);
        sb3.append(", imageXlargeUrl=");
        sb3.append(this.f132221h);
        sb3.append(", imageLargeUrl=");
        sb3.append(this.f132222i);
        sb3.append(", imageMediumUrl=");
        sb3.append(this.f132223j);
        sb3.append(", imageSmallUrl=");
        sb3.append(this.f132224k);
        sb3.append(", firstName=");
        sb3.append(this.f132225l);
        sb3.append(", lastName=");
        sb3.append(this.f132226m);
        sb3.append(", fullName=");
        sb3.append(this.f132227n);
        sb3.append(", username=");
        sb3.append(this.f132228o);
        sb3.append(", followerCount=");
        sb3.append(this.f132229p);
        sb3.append(", followingCount=");
        sb3.append(this.f132230q);
        sb3.append(", explicitlyFollowedByMe=");
        sb3.append(this.f132231r);
        sb3.append(", isPrivateProfile=");
        sb3.append(this.f132232s);
        sb3.append(", avatarColorIndex=");
        return a.c.i(sb3, this.f132233t, ")");
    }
}
