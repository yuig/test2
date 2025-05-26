package x40;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class ug implements z40.d0 {

    /* renamed from: a, reason: collision with root package name */
    public final String f133495a;

    /* renamed from: b, reason: collision with root package name */
    public final String f133496b;

    /* renamed from: c, reason: collision with root package name */
    public final String f133497c;

    /* renamed from: d, reason: collision with root package name */
    public final tg f133498d;

    /* renamed from: e, reason: collision with root package name */
    public final Boolean f133499e;

    /* renamed from: f, reason: collision with root package name */
    public final Boolean f133500f;

    /* renamed from: g, reason: collision with root package name */
    public final Boolean f133501g;

    /* renamed from: h, reason: collision with root package name */
    public final String f133502h;

    /* renamed from: i, reason: collision with root package name */
    public final String f133503i;

    /* renamed from: j, reason: collision with root package name */
    public final String f133504j;

    /* renamed from: k, reason: collision with root package name */
    public final String f133505k;

    /* renamed from: l, reason: collision with root package name */
    public final String f133506l;

    /* renamed from: m, reason: collision with root package name */
    public final String f133507m;

    /* renamed from: n, reason: collision with root package name */
    public final String f133508n;

    /* renamed from: o, reason: collision with root package name */
    public final String f133509o;

    /* renamed from: p, reason: collision with root package name */
    public final Integer f133510p;

    /* renamed from: q, reason: collision with root package name */
    public final Integer f133511q;

    /* renamed from: r, reason: collision with root package name */
    public final Boolean f133512r;

    /* renamed from: s, reason: collision with root package name */
    public final Boolean f133513s;

    /* renamed from: t, reason: collision with root package name */
    public final Integer f133514t;

    public ug(String __typename, String id3, String entityId, tg tgVar, Boolean bool, Boolean bool2, Boolean bool3, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, Integer num, Integer num2, Boolean bool4, Boolean bool5, Integer num3) {
        Intrinsics.checkNotNullParameter(__typename, "__typename");
        Intrinsics.checkNotNullParameter(id3, "id");
        Intrinsics.checkNotNullParameter(entityId, "entityId");
        this.f133495a = __typename;
        this.f133496b = id3;
        this.f133497c = entityId;
        this.f133498d = tgVar;
        this.f133499e = bool;
        this.f133500f = bool2;
        this.f133501g = bool3;
        this.f133502h = str;
        this.f133503i = str2;
        this.f133504j = str3;
        this.f133505k = str4;
        this.f133506l = str5;
        this.f133507m = str6;
        this.f133508n = str7;
        this.f133509o = str8;
        this.f133510p = num;
        this.f133511q = num2;
        this.f133512r = bool4;
        this.f133513s = bool5;
        this.f133514t = num3;
    }

    @Override // z40.d0
    public final String a() {
        return this.f133497c;
    }

    @Override // z40.d0
    public final String b() {
        return this.f133504j;
    }

    @Override // z40.d0
    public final Integer c() {
        return this.f133510p;
    }

    @Override // z40.d0
    public final Boolean d() {
        return this.f133512r;
    }

    @Override // z40.d0
    public final String e() {
        return this.f133503i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ug)) {
            return false;
        }
        ug ugVar = (ug) obj;
        return Intrinsics.d(this.f133495a, ugVar.f133495a) && Intrinsics.d(this.f133496b, ugVar.f133496b) && Intrinsics.d(this.f133497c, ugVar.f133497c) && Intrinsics.d(this.f133498d, ugVar.f133498d) && Intrinsics.d(this.f133499e, ugVar.f133499e) && Intrinsics.d(this.f133500f, ugVar.f133500f) && Intrinsics.d(this.f133501g, ugVar.f133501g) && Intrinsics.d(this.f133502h, ugVar.f133502h) && Intrinsics.d(this.f133503i, ugVar.f133503i) && Intrinsics.d(this.f133504j, ugVar.f133504j) && Intrinsics.d(this.f133505k, ugVar.f133505k) && Intrinsics.d(this.f133506l, ugVar.f133506l) && Intrinsics.d(this.f133507m, ugVar.f133507m) && Intrinsics.d(this.f133508n, ugVar.f133508n) && Intrinsics.d(this.f133509o, ugVar.f133509o) && Intrinsics.d(this.f133510p, ugVar.f133510p) && Intrinsics.d(this.f133511q, ugVar.f133511q) && Intrinsics.d(this.f133512r, ugVar.f133512r) && Intrinsics.d(this.f133513s, ugVar.f133513s) && Intrinsics.d(this.f133514t, ugVar.f133514t);
    }

    @Override // z40.d0
    public final String f() {
        return this.f133508n;
    }

    @Override // z40.d0
    public final String g() {
        return this.f133509o;
    }

    @Override // z40.d0
    public final String getId() {
        return this.f133496b;
    }

    @Override // z40.d0
    public final Boolean h() {
        return this.f133500f;
    }

    public final int hashCode() {
        int d2 = a.cb.d(this.f133497c, a.cb.d(this.f133496b, this.f133495a.hashCode() * 31, 31), 31);
        tg tgVar = this.f133498d;
        int hashCode = (d2 + (tgVar == null ? 0 : tgVar.hashCode())) * 31;
        Boolean bool = this.f133499e;
        int hashCode2 = (hashCode + (bool == null ? 0 : bool.hashCode())) * 31;
        Boolean bool2 = this.f133500f;
        int hashCode3 = (hashCode2 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        Boolean bool3 = this.f133501g;
        int hashCode4 = (hashCode3 + (bool3 == null ? 0 : bool3.hashCode())) * 31;
        String str = this.f133502h;
        int hashCode5 = (hashCode4 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f133503i;
        int hashCode6 = (hashCode5 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f133504j;
        int hashCode7 = (hashCode6 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.f133505k;
        int hashCode8 = (hashCode7 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.f133506l;
        int hashCode9 = (hashCode8 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.f133507m;
        int hashCode10 = (hashCode9 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.f133508n;
        int hashCode11 = (hashCode10 + (str7 == null ? 0 : str7.hashCode())) * 31;
        String str8 = this.f133509o;
        int hashCode12 = (hashCode11 + (str8 == null ? 0 : str8.hashCode())) * 31;
        Integer num = this.f133510p;
        int hashCode13 = (hashCode12 + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.f133511q;
        int hashCode14 = (hashCode13 + (num2 == null ? 0 : num2.hashCode())) * 31;
        Boolean bool4 = this.f133512r;
        int hashCode15 = (hashCode14 + (bool4 == null ? 0 : bool4.hashCode())) * 31;
        Boolean bool5 = this.f133513s;
        int hashCode16 = (hashCode15 + (bool5 == null ? 0 : bool5.hashCode())) * 31;
        Integer num3 = this.f133514t;
        return hashCode16 + (num3 != null ? num3.hashCode() : 0);
    }

    @Override // z40.d0
    public final z40.c0 i() {
        return this.f133498d;
    }

    @Override // z40.d0
    public final Integer j() {
        return this.f133511q;
    }

    @Override // z40.d0
    public final String k() {
        return this.f133505k;
    }

    @Override // z40.d0
    public final String l() {
        return this.f133506l;
    }

    @Override // z40.d0
    public final String m() {
        return this.f133502h;
    }

    @Override // z40.d0
    public final Integer n() {
        return this.f133514t;
    }

    @Override // z40.d0
    public final Boolean o() {
        return this.f133501g;
    }

    @Override // z40.d0
    public final String p() {
        return this.f133507m;
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("OfficialUser(__typename=");
        sb3.append(this.f133495a);
        sb3.append(", id=");
        sb3.append(this.f133496b);
        sb3.append(", entityId=");
        sb3.append(this.f133497c);
        sb3.append(", verifiedIdentity=");
        sb3.append(this.f133498d);
        sb3.append(", blockedByMe=");
        sb3.append(this.f133499e);
        sb3.append(", isVerifiedMerchant=");
        sb3.append(this.f133500f);
        sb3.append(", isDefaultImage=");
        sb3.append(this.f133501g);
        sb3.append(", imageXlargeUrl=");
        sb3.append(this.f133502h);
        sb3.append(", imageLargeUrl=");
        sb3.append(this.f133503i);
        sb3.append(", imageMediumUrl=");
        sb3.append(this.f133504j);
        sb3.append(", imageSmallUrl=");
        sb3.append(this.f133505k);
        sb3.append(", firstName=");
        sb3.append(this.f133506l);
        sb3.append(", lastName=");
        sb3.append(this.f133507m);
        sb3.append(", fullName=");
        sb3.append(this.f133508n);
        sb3.append(", username=");
        sb3.append(this.f133509o);
        sb3.append(", followerCount=");
        sb3.append(this.f133510p);
        sb3.append(", followingCount=");
        sb3.append(this.f133511q);
        sb3.append(", explicitlyFollowedByMe=");
        sb3.append(this.f133512r);
        sb3.append(", isPrivateProfile=");
        sb3.append(this.f133513s);
        sb3.append(", avatarColorIndex=");
        return a.c.i(sb3, this.f133514t, ")");
    }
}
