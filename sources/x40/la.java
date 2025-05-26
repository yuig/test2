package x40;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class la implements z40.d0, z40.g {

    /* renamed from: a, reason: collision with root package name */
    public final String f132727a;

    /* renamed from: b, reason: collision with root package name */
    public final String f132728b;

    /* renamed from: c, reason: collision with root package name */
    public final String f132729c;

    /* renamed from: d, reason: collision with root package name */
    public final ka f132730d;

    /* renamed from: e, reason: collision with root package name */
    public final Boolean f132731e;

    /* renamed from: f, reason: collision with root package name */
    public final Boolean f132732f;

    /* renamed from: g, reason: collision with root package name */
    public final Boolean f132733g;

    /* renamed from: h, reason: collision with root package name */
    public final String f132734h;

    /* renamed from: i, reason: collision with root package name */
    public final String f132735i;

    /* renamed from: j, reason: collision with root package name */
    public final String f132736j;

    /* renamed from: k, reason: collision with root package name */
    public final String f132737k;

    /* renamed from: l, reason: collision with root package name */
    public final String f132738l;

    /* renamed from: m, reason: collision with root package name */
    public final String f132739m;

    /* renamed from: n, reason: collision with root package name */
    public final String f132740n;

    /* renamed from: o, reason: collision with root package name */
    public final String f132741o;

    /* renamed from: p, reason: collision with root package name */
    public final Integer f132742p;

    /* renamed from: q, reason: collision with root package name */
    public final Integer f132743q;

    /* renamed from: r, reason: collision with root package name */
    public final Boolean f132744r;

    /* renamed from: s, reason: collision with root package name */
    public final Boolean f132745s;

    /* renamed from: t, reason: collision with root package name */
    public final Integer f132746t;

    public la(String __typename, String id3, String entityId, ka kaVar, Boolean bool, Boolean bool2, Boolean bool3, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, Integer num, Integer num2, Boolean bool4, Boolean bool5, Integer num3) {
        Intrinsics.checkNotNullParameter(__typename, "__typename");
        Intrinsics.checkNotNullParameter(id3, "id");
        Intrinsics.checkNotNullParameter(entityId, "entityId");
        this.f132727a = __typename;
        this.f132728b = id3;
        this.f132729c = entityId;
        this.f132730d = kaVar;
        this.f132731e = bool;
        this.f132732f = bool2;
        this.f132733g = bool3;
        this.f132734h = str;
        this.f132735i = str2;
        this.f132736j = str3;
        this.f132737k = str4;
        this.f132738l = str5;
        this.f132739m = str6;
        this.f132740n = str7;
        this.f132741o = str8;
        this.f132742p = num;
        this.f132743q = num2;
        this.f132744r = bool4;
        this.f132745s = bool5;
        this.f132746t = num3;
    }

    @Override // z40.d0
    public final String a() {
        return this.f132729c;
    }

    @Override // z40.d0
    public final String b() {
        return this.f132736j;
    }

    @Override // z40.d0
    public final Integer c() {
        return this.f132742p;
    }

    @Override // z40.d0
    public final Boolean d() {
        return this.f132744r;
    }

    @Override // z40.d0
    public final String e() {
        return this.f132735i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof la)) {
            return false;
        }
        la laVar = (la) obj;
        return Intrinsics.d(this.f132727a, laVar.f132727a) && Intrinsics.d(this.f132728b, laVar.f132728b) && Intrinsics.d(this.f132729c, laVar.f132729c) && Intrinsics.d(this.f132730d, laVar.f132730d) && Intrinsics.d(this.f132731e, laVar.f132731e) && Intrinsics.d(this.f132732f, laVar.f132732f) && Intrinsics.d(this.f132733g, laVar.f132733g) && Intrinsics.d(this.f132734h, laVar.f132734h) && Intrinsics.d(this.f132735i, laVar.f132735i) && Intrinsics.d(this.f132736j, laVar.f132736j) && Intrinsics.d(this.f132737k, laVar.f132737k) && Intrinsics.d(this.f132738l, laVar.f132738l) && Intrinsics.d(this.f132739m, laVar.f132739m) && Intrinsics.d(this.f132740n, laVar.f132740n) && Intrinsics.d(this.f132741o, laVar.f132741o) && Intrinsics.d(this.f132742p, laVar.f132742p) && Intrinsics.d(this.f132743q, laVar.f132743q) && Intrinsics.d(this.f132744r, laVar.f132744r) && Intrinsics.d(this.f132745s, laVar.f132745s) && Intrinsics.d(this.f132746t, laVar.f132746t);
    }

    @Override // z40.d0
    public final String f() {
        return this.f132740n;
    }

    @Override // z40.d0
    public final String g() {
        return this.f132741o;
    }

    @Override // z40.d0
    public final String getId() {
        return this.f132728b;
    }

    @Override // z40.d0
    public final Boolean h() {
        return this.f132732f;
    }

    public final int hashCode() {
        int d2 = a.cb.d(this.f132729c, a.cb.d(this.f132728b, this.f132727a.hashCode() * 31, 31), 31);
        ka kaVar = this.f132730d;
        int hashCode = (d2 + (kaVar == null ? 0 : kaVar.hashCode())) * 31;
        Boolean bool = this.f132731e;
        int hashCode2 = (hashCode + (bool == null ? 0 : bool.hashCode())) * 31;
        Boolean bool2 = this.f132732f;
        int hashCode3 = (hashCode2 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        Boolean bool3 = this.f132733g;
        int hashCode4 = (hashCode3 + (bool3 == null ? 0 : bool3.hashCode())) * 31;
        String str = this.f132734h;
        int hashCode5 = (hashCode4 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f132735i;
        int hashCode6 = (hashCode5 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f132736j;
        int hashCode7 = (hashCode6 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.f132737k;
        int hashCode8 = (hashCode7 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.f132738l;
        int hashCode9 = (hashCode8 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.f132739m;
        int hashCode10 = (hashCode9 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.f132740n;
        int hashCode11 = (hashCode10 + (str7 == null ? 0 : str7.hashCode())) * 31;
        String str8 = this.f132741o;
        int hashCode12 = (hashCode11 + (str8 == null ? 0 : str8.hashCode())) * 31;
        Integer num = this.f132742p;
        int hashCode13 = (hashCode12 + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.f132743q;
        int hashCode14 = (hashCode13 + (num2 == null ? 0 : num2.hashCode())) * 31;
        Boolean bool4 = this.f132744r;
        int hashCode15 = (hashCode14 + (bool4 == null ? 0 : bool4.hashCode())) * 31;
        Boolean bool5 = this.f132745s;
        int hashCode16 = (hashCode15 + (bool5 == null ? 0 : bool5.hashCode())) * 31;
        Integer num3 = this.f132746t;
        return hashCode16 + (num3 != null ? num3.hashCode() : 0);
    }

    @Override // z40.d0
    public final z40.c0 i() {
        return this.f132730d;
    }

    @Override // z40.d0
    public final Integer j() {
        return this.f132743q;
    }

    @Override // z40.d0
    public final String k() {
        return this.f132737k;
    }

    @Override // z40.d0
    public final String l() {
        return this.f132738l;
    }

    @Override // z40.d0
    public final String m() {
        return this.f132734h;
    }

    @Override // z40.d0
    public final Integer n() {
        return this.f132746t;
    }

    @Override // z40.d0
    public final Boolean o() {
        return this.f132733g;
    }

    @Override // z40.d0
    public final String p() {
        return this.f132739m;
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("Sender(__typename=");
        sb3.append(this.f132727a);
        sb3.append(", id=");
        sb3.append(this.f132728b);
        sb3.append(", entityId=");
        sb3.append(this.f132729c);
        sb3.append(", verifiedIdentity=");
        sb3.append(this.f132730d);
        sb3.append(", blockedByMe=");
        sb3.append(this.f132731e);
        sb3.append(", isVerifiedMerchant=");
        sb3.append(this.f132732f);
        sb3.append(", isDefaultImage=");
        sb3.append(this.f132733g);
        sb3.append(", imageXlargeUrl=");
        sb3.append(this.f132734h);
        sb3.append(", imageLargeUrl=");
        sb3.append(this.f132735i);
        sb3.append(", imageMediumUrl=");
        sb3.append(this.f132736j);
        sb3.append(", imageSmallUrl=");
        sb3.append(this.f132737k);
        sb3.append(", firstName=");
        sb3.append(this.f132738l);
        sb3.append(", lastName=");
        sb3.append(this.f132739m);
        sb3.append(", fullName=");
        sb3.append(this.f132740n);
        sb3.append(", username=");
        sb3.append(this.f132741o);
        sb3.append(", followerCount=");
        sb3.append(this.f132742p);
        sb3.append(", followingCount=");
        sb3.append(this.f132743q);
        sb3.append(", explicitlyFollowedByMe=");
        sb3.append(this.f132744r);
        sb3.append(", isPrivateProfile=");
        sb3.append(this.f132745s);
        sb3.append(", avatarColorIndex=");
        return a.c.i(sb3, this.f132746t, ")");
    }
}
