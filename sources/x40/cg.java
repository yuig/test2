package x40;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class cg implements z40.d0 {

    /* renamed from: a, reason: collision with root package name */
    public final String f132150a;

    /* renamed from: b, reason: collision with root package name */
    public final String f132151b;

    /* renamed from: c, reason: collision with root package name */
    public final String f132152c;

    /* renamed from: d, reason: collision with root package name */
    public final bg f132153d;

    /* renamed from: e, reason: collision with root package name */
    public final Boolean f132154e;

    /* renamed from: f, reason: collision with root package name */
    public final Boolean f132155f;

    /* renamed from: g, reason: collision with root package name */
    public final Boolean f132156g;

    /* renamed from: h, reason: collision with root package name */
    public final String f132157h;

    /* renamed from: i, reason: collision with root package name */
    public final String f132158i;

    /* renamed from: j, reason: collision with root package name */
    public final String f132159j;

    /* renamed from: k, reason: collision with root package name */
    public final String f132160k;

    /* renamed from: l, reason: collision with root package name */
    public final String f132161l;

    /* renamed from: m, reason: collision with root package name */
    public final String f132162m;

    /* renamed from: n, reason: collision with root package name */
    public final String f132163n;

    /* renamed from: o, reason: collision with root package name */
    public final String f132164o;

    /* renamed from: p, reason: collision with root package name */
    public final Integer f132165p;

    /* renamed from: q, reason: collision with root package name */
    public final Integer f132166q;

    /* renamed from: r, reason: collision with root package name */
    public final Boolean f132167r;

    /* renamed from: s, reason: collision with root package name */
    public final Boolean f132168s;

    /* renamed from: t, reason: collision with root package name */
    public final Integer f132169t;

    public cg(String __typename, String id3, String entityId, bg bgVar, Boolean bool, Boolean bool2, Boolean bool3, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, Integer num, Integer num2, Boolean bool4, Boolean bool5, Integer num3) {
        Intrinsics.checkNotNullParameter(__typename, "__typename");
        Intrinsics.checkNotNullParameter(id3, "id");
        Intrinsics.checkNotNullParameter(entityId, "entityId");
        this.f132150a = __typename;
        this.f132151b = id3;
        this.f132152c = entityId;
        this.f132153d = bgVar;
        this.f132154e = bool;
        this.f132155f = bool2;
        this.f132156g = bool3;
        this.f132157h = str;
        this.f132158i = str2;
        this.f132159j = str3;
        this.f132160k = str4;
        this.f132161l = str5;
        this.f132162m = str6;
        this.f132163n = str7;
        this.f132164o = str8;
        this.f132165p = num;
        this.f132166q = num2;
        this.f132167r = bool4;
        this.f132168s = bool5;
        this.f132169t = num3;
    }

    @Override // z40.d0
    public final String a() {
        return this.f132152c;
    }

    @Override // z40.d0
    public final String b() {
        return this.f132159j;
    }

    @Override // z40.d0
    public final Integer c() {
        return this.f132165p;
    }

    @Override // z40.d0
    public final Boolean d() {
        return this.f132167r;
    }

    @Override // z40.d0
    public final String e() {
        return this.f132158i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof cg)) {
            return false;
        }
        cg cgVar = (cg) obj;
        return Intrinsics.d(this.f132150a, cgVar.f132150a) && Intrinsics.d(this.f132151b, cgVar.f132151b) && Intrinsics.d(this.f132152c, cgVar.f132152c) && Intrinsics.d(this.f132153d, cgVar.f132153d) && Intrinsics.d(this.f132154e, cgVar.f132154e) && Intrinsics.d(this.f132155f, cgVar.f132155f) && Intrinsics.d(this.f132156g, cgVar.f132156g) && Intrinsics.d(this.f132157h, cgVar.f132157h) && Intrinsics.d(this.f132158i, cgVar.f132158i) && Intrinsics.d(this.f132159j, cgVar.f132159j) && Intrinsics.d(this.f132160k, cgVar.f132160k) && Intrinsics.d(this.f132161l, cgVar.f132161l) && Intrinsics.d(this.f132162m, cgVar.f132162m) && Intrinsics.d(this.f132163n, cgVar.f132163n) && Intrinsics.d(this.f132164o, cgVar.f132164o) && Intrinsics.d(this.f132165p, cgVar.f132165p) && Intrinsics.d(this.f132166q, cgVar.f132166q) && Intrinsics.d(this.f132167r, cgVar.f132167r) && Intrinsics.d(this.f132168s, cgVar.f132168s) && Intrinsics.d(this.f132169t, cgVar.f132169t);
    }

    @Override // z40.d0
    public final String f() {
        return this.f132163n;
    }

    @Override // z40.d0
    public final String g() {
        return this.f132164o;
    }

    @Override // z40.d0
    public final String getId() {
        return this.f132151b;
    }

    @Override // z40.d0
    public final Boolean h() {
        return this.f132155f;
    }

    public final int hashCode() {
        int d2 = a.cb.d(this.f132152c, a.cb.d(this.f132151b, this.f132150a.hashCode() * 31, 31), 31);
        bg bgVar = this.f132153d;
        int hashCode = (d2 + (bgVar == null ? 0 : bgVar.hashCode())) * 31;
        Boolean bool = this.f132154e;
        int hashCode2 = (hashCode + (bool == null ? 0 : bool.hashCode())) * 31;
        Boolean bool2 = this.f132155f;
        int hashCode3 = (hashCode2 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        Boolean bool3 = this.f132156g;
        int hashCode4 = (hashCode3 + (bool3 == null ? 0 : bool3.hashCode())) * 31;
        String str = this.f132157h;
        int hashCode5 = (hashCode4 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f132158i;
        int hashCode6 = (hashCode5 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f132159j;
        int hashCode7 = (hashCode6 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.f132160k;
        int hashCode8 = (hashCode7 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.f132161l;
        int hashCode9 = (hashCode8 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.f132162m;
        int hashCode10 = (hashCode9 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.f132163n;
        int hashCode11 = (hashCode10 + (str7 == null ? 0 : str7.hashCode())) * 31;
        String str8 = this.f132164o;
        int hashCode12 = (hashCode11 + (str8 == null ? 0 : str8.hashCode())) * 31;
        Integer num = this.f132165p;
        int hashCode13 = (hashCode12 + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.f132166q;
        int hashCode14 = (hashCode13 + (num2 == null ? 0 : num2.hashCode())) * 31;
        Boolean bool4 = this.f132167r;
        int hashCode15 = (hashCode14 + (bool4 == null ? 0 : bool4.hashCode())) * 31;
        Boolean bool5 = this.f132168s;
        int hashCode16 = (hashCode15 + (bool5 == null ? 0 : bool5.hashCode())) * 31;
        Integer num3 = this.f132169t;
        return hashCode16 + (num3 != null ? num3.hashCode() : 0);
    }

    @Override // z40.d0
    public final z40.c0 i() {
        return this.f132153d;
    }

    @Override // z40.d0
    public final Integer j() {
        return this.f132166q;
    }

    @Override // z40.d0
    public final String k() {
        return this.f132160k;
    }

    @Override // z40.d0
    public final String l() {
        return this.f132161l;
    }

    @Override // z40.d0
    public final String m() {
        return this.f132157h;
    }

    @Override // z40.d0
    public final Integer n() {
        return this.f132169t;
    }

    @Override // z40.d0
    public final Boolean o() {
        return this.f132156g;
    }

    @Override // z40.d0
    public final String p() {
        return this.f132162m;
    }

    public final Boolean q() {
        return this.f132154e;
    }

    public final bg r() {
        return this.f132153d;
    }

    public final String s() {
        return this.f132150a;
    }

    public final Boolean t() {
        return this.f132168s;
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("ThirdPartyPinOwner(__typename=");
        sb3.append(this.f132150a);
        sb3.append(", id=");
        sb3.append(this.f132151b);
        sb3.append(", entityId=");
        sb3.append(this.f132152c);
        sb3.append(", verifiedIdentity=");
        sb3.append(this.f132153d);
        sb3.append(", blockedByMe=");
        sb3.append(this.f132154e);
        sb3.append(", isVerifiedMerchant=");
        sb3.append(this.f132155f);
        sb3.append(", isDefaultImage=");
        sb3.append(this.f132156g);
        sb3.append(", imageXlargeUrl=");
        sb3.append(this.f132157h);
        sb3.append(", imageLargeUrl=");
        sb3.append(this.f132158i);
        sb3.append(", imageMediumUrl=");
        sb3.append(this.f132159j);
        sb3.append(", imageSmallUrl=");
        sb3.append(this.f132160k);
        sb3.append(", firstName=");
        sb3.append(this.f132161l);
        sb3.append(", lastName=");
        sb3.append(this.f132162m);
        sb3.append(", fullName=");
        sb3.append(this.f132163n);
        sb3.append(", username=");
        sb3.append(this.f132164o);
        sb3.append(", followerCount=");
        sb3.append(this.f132165p);
        sb3.append(", followingCount=");
        sb3.append(this.f132166q);
        sb3.append(", explicitlyFollowedByMe=");
        sb3.append(this.f132167r);
        sb3.append(", isPrivateProfile=");
        sb3.append(this.f132168s);
        sb3.append(", avatarColorIndex=");
        return a.c.i(sb3, this.f132169t, ")");
    }
}
