package x40;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class ca implements z40.d0 {

    /* renamed from: a, reason: collision with root package name */
    public final String f132105a;

    /* renamed from: b, reason: collision with root package name */
    public final String f132106b;

    /* renamed from: c, reason: collision with root package name */
    public final String f132107c;

    /* renamed from: d, reason: collision with root package name */
    public final ba f132108d;

    /* renamed from: e, reason: collision with root package name */
    public final Boolean f132109e;

    /* renamed from: f, reason: collision with root package name */
    public final Boolean f132110f;

    /* renamed from: g, reason: collision with root package name */
    public final Boolean f132111g;

    /* renamed from: h, reason: collision with root package name */
    public final String f132112h;

    /* renamed from: i, reason: collision with root package name */
    public final String f132113i;

    /* renamed from: j, reason: collision with root package name */
    public final String f132114j;

    /* renamed from: k, reason: collision with root package name */
    public final String f132115k;

    /* renamed from: l, reason: collision with root package name */
    public final String f132116l;

    /* renamed from: m, reason: collision with root package name */
    public final String f132117m;

    /* renamed from: n, reason: collision with root package name */
    public final String f132118n;

    /* renamed from: o, reason: collision with root package name */
    public final String f132119o;

    /* renamed from: p, reason: collision with root package name */
    public final Integer f132120p;

    /* renamed from: q, reason: collision with root package name */
    public final Integer f132121q;

    /* renamed from: r, reason: collision with root package name */
    public final Boolean f132122r;

    /* renamed from: s, reason: collision with root package name */
    public final Boolean f132123s;

    /* renamed from: t, reason: collision with root package name */
    public final Integer f132124t;

    public ca(String __typename, String id3, String entityId, ba baVar, Boolean bool, Boolean bool2, Boolean bool3, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, Integer num, Integer num2, Boolean bool4, Boolean bool5, Integer num3) {
        Intrinsics.checkNotNullParameter(__typename, "__typename");
        Intrinsics.checkNotNullParameter(id3, "id");
        Intrinsics.checkNotNullParameter(entityId, "entityId");
        this.f132105a = __typename;
        this.f132106b = id3;
        this.f132107c = entityId;
        this.f132108d = baVar;
        this.f132109e = bool;
        this.f132110f = bool2;
        this.f132111g = bool3;
        this.f132112h = str;
        this.f132113i = str2;
        this.f132114j = str3;
        this.f132115k = str4;
        this.f132116l = str5;
        this.f132117m = str6;
        this.f132118n = str7;
        this.f132119o = str8;
        this.f132120p = num;
        this.f132121q = num2;
        this.f132122r = bool4;
        this.f132123s = bool5;
        this.f132124t = num3;
    }

    @Override // z40.d0
    public final String a() {
        return this.f132107c;
    }

    @Override // z40.d0
    public final String b() {
        return this.f132114j;
    }

    @Override // z40.d0
    public final Integer c() {
        return this.f132120p;
    }

    @Override // z40.d0
    public final Boolean d() {
        return this.f132122r;
    }

    @Override // z40.d0
    public final String e() {
        return this.f132113i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ca)) {
            return false;
        }
        ca caVar = (ca) obj;
        return Intrinsics.d(this.f132105a, caVar.f132105a) && Intrinsics.d(this.f132106b, caVar.f132106b) && Intrinsics.d(this.f132107c, caVar.f132107c) && Intrinsics.d(this.f132108d, caVar.f132108d) && Intrinsics.d(this.f132109e, caVar.f132109e) && Intrinsics.d(this.f132110f, caVar.f132110f) && Intrinsics.d(this.f132111g, caVar.f132111g) && Intrinsics.d(this.f132112h, caVar.f132112h) && Intrinsics.d(this.f132113i, caVar.f132113i) && Intrinsics.d(this.f132114j, caVar.f132114j) && Intrinsics.d(this.f132115k, caVar.f132115k) && Intrinsics.d(this.f132116l, caVar.f132116l) && Intrinsics.d(this.f132117m, caVar.f132117m) && Intrinsics.d(this.f132118n, caVar.f132118n) && Intrinsics.d(this.f132119o, caVar.f132119o) && Intrinsics.d(this.f132120p, caVar.f132120p) && Intrinsics.d(this.f132121q, caVar.f132121q) && Intrinsics.d(this.f132122r, caVar.f132122r) && Intrinsics.d(this.f132123s, caVar.f132123s) && Intrinsics.d(this.f132124t, caVar.f132124t);
    }

    @Override // z40.d0
    public final String f() {
        return this.f132118n;
    }

    @Override // z40.d0
    public final String g() {
        return this.f132119o;
    }

    @Override // z40.d0
    public final String getId() {
        return this.f132106b;
    }

    @Override // z40.d0
    public final Boolean h() {
        return this.f132110f;
    }

    public final int hashCode() {
        int d2 = a.cb.d(this.f132107c, a.cb.d(this.f132106b, this.f132105a.hashCode() * 31, 31), 31);
        ba baVar = this.f132108d;
        int hashCode = (d2 + (baVar == null ? 0 : baVar.hashCode())) * 31;
        Boolean bool = this.f132109e;
        int hashCode2 = (hashCode + (bool == null ? 0 : bool.hashCode())) * 31;
        Boolean bool2 = this.f132110f;
        int hashCode3 = (hashCode2 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        Boolean bool3 = this.f132111g;
        int hashCode4 = (hashCode3 + (bool3 == null ? 0 : bool3.hashCode())) * 31;
        String str = this.f132112h;
        int hashCode5 = (hashCode4 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f132113i;
        int hashCode6 = (hashCode5 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f132114j;
        int hashCode7 = (hashCode6 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.f132115k;
        int hashCode8 = (hashCode7 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.f132116l;
        int hashCode9 = (hashCode8 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.f132117m;
        int hashCode10 = (hashCode9 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.f132118n;
        int hashCode11 = (hashCode10 + (str7 == null ? 0 : str7.hashCode())) * 31;
        String str8 = this.f132119o;
        int hashCode12 = (hashCode11 + (str8 == null ? 0 : str8.hashCode())) * 31;
        Integer num = this.f132120p;
        int hashCode13 = (hashCode12 + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.f132121q;
        int hashCode14 = (hashCode13 + (num2 == null ? 0 : num2.hashCode())) * 31;
        Boolean bool4 = this.f132122r;
        int hashCode15 = (hashCode14 + (bool4 == null ? 0 : bool4.hashCode())) * 31;
        Boolean bool5 = this.f132123s;
        int hashCode16 = (hashCode15 + (bool5 == null ? 0 : bool5.hashCode())) * 31;
        Integer num3 = this.f132124t;
        return hashCode16 + (num3 != null ? num3.hashCode() : 0);
    }

    @Override // z40.d0
    public final z40.c0 i() {
        return this.f132108d;
    }

    @Override // z40.d0
    public final Integer j() {
        return this.f132121q;
    }

    @Override // z40.d0
    public final String k() {
        return this.f132115k;
    }

    @Override // z40.d0
    public final String l() {
        return this.f132116l;
    }

    @Override // z40.d0
    public final String m() {
        return this.f132112h;
    }

    @Override // z40.d0
    public final Integer n() {
        return this.f132124t;
    }

    @Override // z40.d0
    public final Boolean o() {
        return this.f132111g;
    }

    @Override // z40.d0
    public final String p() {
        return this.f132117m;
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("Pinner(__typename=");
        sb3.append(this.f132105a);
        sb3.append(", id=");
        sb3.append(this.f132106b);
        sb3.append(", entityId=");
        sb3.append(this.f132107c);
        sb3.append(", verifiedIdentity=");
        sb3.append(this.f132108d);
        sb3.append(", blockedByMe=");
        sb3.append(this.f132109e);
        sb3.append(", isVerifiedMerchant=");
        sb3.append(this.f132110f);
        sb3.append(", isDefaultImage=");
        sb3.append(this.f132111g);
        sb3.append(", imageXlargeUrl=");
        sb3.append(this.f132112h);
        sb3.append(", imageLargeUrl=");
        sb3.append(this.f132113i);
        sb3.append(", imageMediumUrl=");
        sb3.append(this.f132114j);
        sb3.append(", imageSmallUrl=");
        sb3.append(this.f132115k);
        sb3.append(", firstName=");
        sb3.append(this.f132116l);
        sb3.append(", lastName=");
        sb3.append(this.f132117m);
        sb3.append(", fullName=");
        sb3.append(this.f132118n);
        sb3.append(", username=");
        sb3.append(this.f132119o);
        sb3.append(", followerCount=");
        sb3.append(this.f132120p);
        sb3.append(", followingCount=");
        sb3.append(this.f132121q);
        sb3.append(", explicitlyFollowedByMe=");
        sb3.append(this.f132122r);
        sb3.append(", isPrivateProfile=");
        sb3.append(this.f132123s);
        sb3.append(", avatarColorIndex=");
        return a.c.i(sb3, this.f132124t, ")");
    }
}
