package x40;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class c2 implements z40.d0 {

    /* renamed from: a, reason: collision with root package name */
    public final String f132073a;

    /* renamed from: b, reason: collision with root package name */
    public final String f132074b;

    /* renamed from: c, reason: collision with root package name */
    public final String f132075c;

    /* renamed from: d, reason: collision with root package name */
    public final b2 f132076d;

    /* renamed from: e, reason: collision with root package name */
    public final Boolean f132077e;

    /* renamed from: f, reason: collision with root package name */
    public final Boolean f132078f;

    /* renamed from: g, reason: collision with root package name */
    public final Boolean f132079g;

    /* renamed from: h, reason: collision with root package name */
    public final String f132080h;

    /* renamed from: i, reason: collision with root package name */
    public final String f132081i;

    /* renamed from: j, reason: collision with root package name */
    public final String f132082j;

    /* renamed from: k, reason: collision with root package name */
    public final String f132083k;

    /* renamed from: l, reason: collision with root package name */
    public final String f132084l;

    /* renamed from: m, reason: collision with root package name */
    public final String f132085m;

    /* renamed from: n, reason: collision with root package name */
    public final String f132086n;

    /* renamed from: o, reason: collision with root package name */
    public final String f132087o;

    /* renamed from: p, reason: collision with root package name */
    public final Integer f132088p;

    /* renamed from: q, reason: collision with root package name */
    public final Integer f132089q;

    /* renamed from: r, reason: collision with root package name */
    public final Boolean f132090r;

    /* renamed from: s, reason: collision with root package name */
    public final Boolean f132091s;

    /* renamed from: t, reason: collision with root package name */
    public final Integer f132092t;

    public c2(String __typename, String id3, String entityId, b2 b2Var, Boolean bool, Boolean bool2, Boolean bool3, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, Integer num, Integer num2, Boolean bool4, Boolean bool5, Integer num3) {
        Intrinsics.checkNotNullParameter(__typename, "__typename");
        Intrinsics.checkNotNullParameter(id3, "id");
        Intrinsics.checkNotNullParameter(entityId, "entityId");
        this.f132073a = __typename;
        this.f132074b = id3;
        this.f132075c = entityId;
        this.f132076d = b2Var;
        this.f132077e = bool;
        this.f132078f = bool2;
        this.f132079g = bool3;
        this.f132080h = str;
        this.f132081i = str2;
        this.f132082j = str3;
        this.f132083k = str4;
        this.f132084l = str5;
        this.f132085m = str6;
        this.f132086n = str7;
        this.f132087o = str8;
        this.f132088p = num;
        this.f132089q = num2;
        this.f132090r = bool4;
        this.f132091s = bool5;
        this.f132092t = num3;
    }

    @Override // z40.d0
    public final String a() {
        return this.f132075c;
    }

    @Override // z40.d0
    public final String b() {
        return this.f132082j;
    }

    @Override // z40.d0
    public final Integer c() {
        return this.f132088p;
    }

    @Override // z40.d0
    public final Boolean d() {
        return this.f132090r;
    }

    @Override // z40.d0
    public final String e() {
        return this.f132081i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c2)) {
            return false;
        }
        c2 c2Var = (c2) obj;
        return Intrinsics.d(this.f132073a, c2Var.f132073a) && Intrinsics.d(this.f132074b, c2Var.f132074b) && Intrinsics.d(this.f132075c, c2Var.f132075c) && Intrinsics.d(this.f132076d, c2Var.f132076d) && Intrinsics.d(this.f132077e, c2Var.f132077e) && Intrinsics.d(this.f132078f, c2Var.f132078f) && Intrinsics.d(this.f132079g, c2Var.f132079g) && Intrinsics.d(this.f132080h, c2Var.f132080h) && Intrinsics.d(this.f132081i, c2Var.f132081i) && Intrinsics.d(this.f132082j, c2Var.f132082j) && Intrinsics.d(this.f132083k, c2Var.f132083k) && Intrinsics.d(this.f132084l, c2Var.f132084l) && Intrinsics.d(this.f132085m, c2Var.f132085m) && Intrinsics.d(this.f132086n, c2Var.f132086n) && Intrinsics.d(this.f132087o, c2Var.f132087o) && Intrinsics.d(this.f132088p, c2Var.f132088p) && Intrinsics.d(this.f132089q, c2Var.f132089q) && Intrinsics.d(this.f132090r, c2Var.f132090r) && Intrinsics.d(this.f132091s, c2Var.f132091s) && Intrinsics.d(this.f132092t, c2Var.f132092t);
    }

    @Override // z40.d0
    public final String f() {
        return this.f132086n;
    }

    @Override // z40.d0
    public final String g() {
        return this.f132087o;
    }

    @Override // z40.d0
    public final String getId() {
        return this.f132074b;
    }

    @Override // z40.d0
    public final Boolean h() {
        return this.f132078f;
    }

    public final int hashCode() {
        int d2 = a.cb.d(this.f132075c, a.cb.d(this.f132074b, this.f132073a.hashCode() * 31, 31), 31);
        b2 b2Var = this.f132076d;
        int hashCode = (d2 + (b2Var == null ? 0 : b2Var.hashCode())) * 31;
        Boolean bool = this.f132077e;
        int hashCode2 = (hashCode + (bool == null ? 0 : bool.hashCode())) * 31;
        Boolean bool2 = this.f132078f;
        int hashCode3 = (hashCode2 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        Boolean bool3 = this.f132079g;
        int hashCode4 = (hashCode3 + (bool3 == null ? 0 : bool3.hashCode())) * 31;
        String str = this.f132080h;
        int hashCode5 = (hashCode4 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f132081i;
        int hashCode6 = (hashCode5 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f132082j;
        int hashCode7 = (hashCode6 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.f132083k;
        int hashCode8 = (hashCode7 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.f132084l;
        int hashCode9 = (hashCode8 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.f132085m;
        int hashCode10 = (hashCode9 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.f132086n;
        int hashCode11 = (hashCode10 + (str7 == null ? 0 : str7.hashCode())) * 31;
        String str8 = this.f132087o;
        int hashCode12 = (hashCode11 + (str8 == null ? 0 : str8.hashCode())) * 31;
        Integer num = this.f132088p;
        int hashCode13 = (hashCode12 + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.f132089q;
        int hashCode14 = (hashCode13 + (num2 == null ? 0 : num2.hashCode())) * 31;
        Boolean bool4 = this.f132090r;
        int hashCode15 = (hashCode14 + (bool4 == null ? 0 : bool4.hashCode())) * 31;
        Boolean bool5 = this.f132091s;
        int hashCode16 = (hashCode15 + (bool5 == null ? 0 : bool5.hashCode())) * 31;
        Integer num3 = this.f132092t;
        return hashCode16 + (num3 != null ? num3.hashCode() : 0);
    }

    @Override // z40.d0
    public final z40.c0 i() {
        return this.f132076d;
    }

    @Override // z40.d0
    public final Integer j() {
        return this.f132089q;
    }

    @Override // z40.d0
    public final String k() {
        return this.f132083k;
    }

    @Override // z40.d0
    public final String l() {
        return this.f132084l;
    }

    @Override // z40.d0
    public final String m() {
        return this.f132080h;
    }

    @Override // z40.d0
    public final Integer n() {
        return this.f132092t;
    }

    @Override // z40.d0
    public final Boolean o() {
        return this.f132079g;
    }

    @Override // z40.d0
    public final String p() {
        return this.f132085m;
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("Sender(__typename=");
        sb3.append(this.f132073a);
        sb3.append(", id=");
        sb3.append(this.f132074b);
        sb3.append(", entityId=");
        sb3.append(this.f132075c);
        sb3.append(", verifiedIdentity=");
        sb3.append(this.f132076d);
        sb3.append(", blockedByMe=");
        sb3.append(this.f132077e);
        sb3.append(", isVerifiedMerchant=");
        sb3.append(this.f132078f);
        sb3.append(", isDefaultImage=");
        sb3.append(this.f132079g);
        sb3.append(", imageXlargeUrl=");
        sb3.append(this.f132080h);
        sb3.append(", imageLargeUrl=");
        sb3.append(this.f132081i);
        sb3.append(", imageMediumUrl=");
        sb3.append(this.f132082j);
        sb3.append(", imageSmallUrl=");
        sb3.append(this.f132083k);
        sb3.append(", firstName=");
        sb3.append(this.f132084l);
        sb3.append(", lastName=");
        sb3.append(this.f132085m);
        sb3.append(", fullName=");
        sb3.append(this.f132086n);
        sb3.append(", username=");
        sb3.append(this.f132087o);
        sb3.append(", followerCount=");
        sb3.append(this.f132088p);
        sb3.append(", followingCount=");
        sb3.append(this.f132089q);
        sb3.append(", explicitlyFollowedByMe=");
        sb3.append(this.f132090r);
        sb3.append(", isPrivateProfile=");
        sb3.append(this.f132091s);
        sb3.append(", avatarColorIndex=");
        return a.c.i(sb3, this.f132092t, ")");
    }
}
