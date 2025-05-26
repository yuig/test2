package x40;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class ib implements z40.d0, z40.i {

    /* renamed from: a, reason: collision with root package name */
    public final String f132552a;

    /* renamed from: b, reason: collision with root package name */
    public final String f132553b;

    /* renamed from: c, reason: collision with root package name */
    public final String f132554c;

    /* renamed from: d, reason: collision with root package name */
    public final hb f132555d;

    /* renamed from: e, reason: collision with root package name */
    public final Boolean f132556e;

    /* renamed from: f, reason: collision with root package name */
    public final Boolean f132557f;

    /* renamed from: g, reason: collision with root package name */
    public final Boolean f132558g;

    /* renamed from: h, reason: collision with root package name */
    public final String f132559h;

    /* renamed from: i, reason: collision with root package name */
    public final String f132560i;

    /* renamed from: j, reason: collision with root package name */
    public final String f132561j;

    /* renamed from: k, reason: collision with root package name */
    public final String f132562k;

    /* renamed from: l, reason: collision with root package name */
    public final String f132563l;

    /* renamed from: m, reason: collision with root package name */
    public final String f132564m;

    /* renamed from: n, reason: collision with root package name */
    public final String f132565n;

    /* renamed from: o, reason: collision with root package name */
    public final String f132566o;

    /* renamed from: p, reason: collision with root package name */
    public final Integer f132567p;

    /* renamed from: q, reason: collision with root package name */
    public final Integer f132568q;

    /* renamed from: r, reason: collision with root package name */
    public final Boolean f132569r;

    /* renamed from: s, reason: collision with root package name */
    public final Boolean f132570s;

    /* renamed from: t, reason: collision with root package name */
    public final Integer f132571t;

    public ib(String __typename, String id3, String entityId, hb hbVar, Boolean bool, Boolean bool2, Boolean bool3, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, Integer num, Integer num2, Boolean bool4, Boolean bool5, Integer num3) {
        Intrinsics.checkNotNullParameter(__typename, "__typename");
        Intrinsics.checkNotNullParameter(id3, "id");
        Intrinsics.checkNotNullParameter(entityId, "entityId");
        this.f132552a = __typename;
        this.f132553b = id3;
        this.f132554c = entityId;
        this.f132555d = hbVar;
        this.f132556e = bool;
        this.f132557f = bool2;
        this.f132558g = bool3;
        this.f132559h = str;
        this.f132560i = str2;
        this.f132561j = str3;
        this.f132562k = str4;
        this.f132563l = str5;
        this.f132564m = str6;
        this.f132565n = str7;
        this.f132566o = str8;
        this.f132567p = num;
        this.f132568q = num2;
        this.f132569r = bool4;
        this.f132570s = bool5;
        this.f132571t = num3;
    }

    @Override // z40.d0
    public final String a() {
        return this.f132554c;
    }

    @Override // z40.d0
    public final String b() {
        return this.f132561j;
    }

    @Override // z40.d0
    public final Integer c() {
        return this.f132567p;
    }

    @Override // z40.d0
    public final Boolean d() {
        return this.f132569r;
    }

    @Override // z40.d0
    public final String e() {
        return this.f132560i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ib)) {
            return false;
        }
        ib ibVar = (ib) obj;
        return Intrinsics.d(this.f132552a, ibVar.f132552a) && Intrinsics.d(this.f132553b, ibVar.f132553b) && Intrinsics.d(this.f132554c, ibVar.f132554c) && Intrinsics.d(this.f132555d, ibVar.f132555d) && Intrinsics.d(this.f132556e, ibVar.f132556e) && Intrinsics.d(this.f132557f, ibVar.f132557f) && Intrinsics.d(this.f132558g, ibVar.f132558g) && Intrinsics.d(this.f132559h, ibVar.f132559h) && Intrinsics.d(this.f132560i, ibVar.f132560i) && Intrinsics.d(this.f132561j, ibVar.f132561j) && Intrinsics.d(this.f132562k, ibVar.f132562k) && Intrinsics.d(this.f132563l, ibVar.f132563l) && Intrinsics.d(this.f132564m, ibVar.f132564m) && Intrinsics.d(this.f132565n, ibVar.f132565n) && Intrinsics.d(this.f132566o, ibVar.f132566o) && Intrinsics.d(this.f132567p, ibVar.f132567p) && Intrinsics.d(this.f132568q, ibVar.f132568q) && Intrinsics.d(this.f132569r, ibVar.f132569r) && Intrinsics.d(this.f132570s, ibVar.f132570s) && Intrinsics.d(this.f132571t, ibVar.f132571t);
    }

    @Override // z40.d0
    public final String f() {
        return this.f132565n;
    }

    @Override // z40.d0
    public final String g() {
        return this.f132566o;
    }

    @Override // z40.d0
    public final String getId() {
        return this.f132553b;
    }

    @Override // z40.d0
    public final Boolean h() {
        return this.f132557f;
    }

    public final int hashCode() {
        int d2 = a.cb.d(this.f132554c, a.cb.d(this.f132553b, this.f132552a.hashCode() * 31, 31), 31);
        hb hbVar = this.f132555d;
        int hashCode = (d2 + (hbVar == null ? 0 : hbVar.hashCode())) * 31;
        Boolean bool = this.f132556e;
        int hashCode2 = (hashCode + (bool == null ? 0 : bool.hashCode())) * 31;
        Boolean bool2 = this.f132557f;
        int hashCode3 = (hashCode2 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        Boolean bool3 = this.f132558g;
        int hashCode4 = (hashCode3 + (bool3 == null ? 0 : bool3.hashCode())) * 31;
        String str = this.f132559h;
        int hashCode5 = (hashCode4 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f132560i;
        int hashCode6 = (hashCode5 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f132561j;
        int hashCode7 = (hashCode6 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.f132562k;
        int hashCode8 = (hashCode7 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.f132563l;
        int hashCode9 = (hashCode8 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.f132564m;
        int hashCode10 = (hashCode9 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.f132565n;
        int hashCode11 = (hashCode10 + (str7 == null ? 0 : str7.hashCode())) * 31;
        String str8 = this.f132566o;
        int hashCode12 = (hashCode11 + (str8 == null ? 0 : str8.hashCode())) * 31;
        Integer num = this.f132567p;
        int hashCode13 = (hashCode12 + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.f132568q;
        int hashCode14 = (hashCode13 + (num2 == null ? 0 : num2.hashCode())) * 31;
        Boolean bool4 = this.f132569r;
        int hashCode15 = (hashCode14 + (bool4 == null ? 0 : bool4.hashCode())) * 31;
        Boolean bool5 = this.f132570s;
        int hashCode16 = (hashCode15 + (bool5 == null ? 0 : bool5.hashCode())) * 31;
        Integer num3 = this.f132571t;
        return hashCode16 + (num3 != null ? num3.hashCode() : 0);
    }

    @Override // z40.d0
    public final z40.c0 i() {
        return this.f132555d;
    }

    @Override // z40.d0
    public final Integer j() {
        return this.f132568q;
    }

    @Override // z40.d0
    public final String k() {
        return this.f132562k;
    }

    @Override // z40.d0
    public final String l() {
        return this.f132563l;
    }

    @Override // z40.d0
    public final String m() {
        return this.f132559h;
    }

    @Override // z40.d0
    public final Integer n() {
        return this.f132571t;
    }

    @Override // z40.d0
    public final Boolean o() {
        return this.f132558g;
    }

    @Override // z40.d0
    public final String p() {
        return this.f132564m;
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("Node(__typename=");
        sb3.append(this.f132552a);
        sb3.append(", id=");
        sb3.append(this.f132553b);
        sb3.append(", entityId=");
        sb3.append(this.f132554c);
        sb3.append(", verifiedIdentity=");
        sb3.append(this.f132555d);
        sb3.append(", blockedByMe=");
        sb3.append(this.f132556e);
        sb3.append(", isVerifiedMerchant=");
        sb3.append(this.f132557f);
        sb3.append(", isDefaultImage=");
        sb3.append(this.f132558g);
        sb3.append(", imageXlargeUrl=");
        sb3.append(this.f132559h);
        sb3.append(", imageLargeUrl=");
        sb3.append(this.f132560i);
        sb3.append(", imageMediumUrl=");
        sb3.append(this.f132561j);
        sb3.append(", imageSmallUrl=");
        sb3.append(this.f132562k);
        sb3.append(", firstName=");
        sb3.append(this.f132563l);
        sb3.append(", lastName=");
        sb3.append(this.f132564m);
        sb3.append(", fullName=");
        sb3.append(this.f132565n);
        sb3.append(", username=");
        sb3.append(this.f132566o);
        sb3.append(", followerCount=");
        sb3.append(this.f132567p);
        sb3.append(", followingCount=");
        sb3.append(this.f132568q);
        sb3.append(", explicitlyFollowedByMe=");
        sb3.append(this.f132569r);
        sb3.append(", isPrivateProfile=");
        sb3.append(this.f132570s);
        sb3.append(", avatarColorIndex=");
        return a.c.i(sb3, this.f132571t, ")");
    }
}
