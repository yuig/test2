package x40;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class dh implements z40.d0 {

    /* renamed from: a, reason: collision with root package name */
    public final String f132271a;

    /* renamed from: b, reason: collision with root package name */
    public final String f132272b;

    /* renamed from: c, reason: collision with root package name */
    public final String f132273c;

    /* renamed from: d, reason: collision with root package name */
    public final ch f132274d;

    /* renamed from: e, reason: collision with root package name */
    public final Boolean f132275e;

    /* renamed from: f, reason: collision with root package name */
    public final Boolean f132276f;

    /* renamed from: g, reason: collision with root package name */
    public final Boolean f132277g;

    /* renamed from: h, reason: collision with root package name */
    public final String f132278h;

    /* renamed from: i, reason: collision with root package name */
    public final String f132279i;

    /* renamed from: j, reason: collision with root package name */
    public final String f132280j;

    /* renamed from: k, reason: collision with root package name */
    public final String f132281k;

    /* renamed from: l, reason: collision with root package name */
    public final String f132282l;

    /* renamed from: m, reason: collision with root package name */
    public final String f132283m;

    /* renamed from: n, reason: collision with root package name */
    public final String f132284n;

    /* renamed from: o, reason: collision with root package name */
    public final String f132285o;

    /* renamed from: p, reason: collision with root package name */
    public final Integer f132286p;

    /* renamed from: q, reason: collision with root package name */
    public final Integer f132287q;

    /* renamed from: r, reason: collision with root package name */
    public final Boolean f132288r;

    /* renamed from: s, reason: collision with root package name */
    public final Boolean f132289s;

    /* renamed from: t, reason: collision with root package name */
    public final Integer f132290t;

    public dh(String __typename, String id3, String entityId, ch chVar, Boolean bool, Boolean bool2, Boolean bool3, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, Integer num, Integer num2, Boolean bool4, Boolean bool5, Integer num3) {
        Intrinsics.checkNotNullParameter(__typename, "__typename");
        Intrinsics.checkNotNullParameter(id3, "id");
        Intrinsics.checkNotNullParameter(entityId, "entityId");
        this.f132271a = __typename;
        this.f132272b = id3;
        this.f132273c = entityId;
        this.f132274d = chVar;
        this.f132275e = bool;
        this.f132276f = bool2;
        this.f132277g = bool3;
        this.f132278h = str;
        this.f132279i = str2;
        this.f132280j = str3;
        this.f132281k = str4;
        this.f132282l = str5;
        this.f132283m = str6;
        this.f132284n = str7;
        this.f132285o = str8;
        this.f132286p = num;
        this.f132287q = num2;
        this.f132288r = bool4;
        this.f132289s = bool5;
        this.f132290t = num3;
    }

    @Override // z40.d0
    public final String a() {
        return this.f132273c;
    }

    @Override // z40.d0
    public final String b() {
        return this.f132280j;
    }

    @Override // z40.d0
    public final Integer c() {
        return this.f132286p;
    }

    @Override // z40.d0
    public final Boolean d() {
        return this.f132288r;
    }

    @Override // z40.d0
    public final String e() {
        return this.f132279i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dh)) {
            return false;
        }
        dh dhVar = (dh) obj;
        return Intrinsics.d(this.f132271a, dhVar.f132271a) && Intrinsics.d(this.f132272b, dhVar.f132272b) && Intrinsics.d(this.f132273c, dhVar.f132273c) && Intrinsics.d(this.f132274d, dhVar.f132274d) && Intrinsics.d(this.f132275e, dhVar.f132275e) && Intrinsics.d(this.f132276f, dhVar.f132276f) && Intrinsics.d(this.f132277g, dhVar.f132277g) && Intrinsics.d(this.f132278h, dhVar.f132278h) && Intrinsics.d(this.f132279i, dhVar.f132279i) && Intrinsics.d(this.f132280j, dhVar.f132280j) && Intrinsics.d(this.f132281k, dhVar.f132281k) && Intrinsics.d(this.f132282l, dhVar.f132282l) && Intrinsics.d(this.f132283m, dhVar.f132283m) && Intrinsics.d(this.f132284n, dhVar.f132284n) && Intrinsics.d(this.f132285o, dhVar.f132285o) && Intrinsics.d(this.f132286p, dhVar.f132286p) && Intrinsics.d(this.f132287q, dhVar.f132287q) && Intrinsics.d(this.f132288r, dhVar.f132288r) && Intrinsics.d(this.f132289s, dhVar.f132289s) && Intrinsics.d(this.f132290t, dhVar.f132290t);
    }

    @Override // z40.d0
    public final String f() {
        return this.f132284n;
    }

    @Override // z40.d0
    public final String g() {
        return this.f132285o;
    }

    @Override // z40.d0
    public final String getId() {
        return this.f132272b;
    }

    @Override // z40.d0
    public final Boolean h() {
        return this.f132276f;
    }

    public final int hashCode() {
        int d2 = a.cb.d(this.f132273c, a.cb.d(this.f132272b, this.f132271a.hashCode() * 31, 31), 31);
        ch chVar = this.f132274d;
        int hashCode = (d2 + (chVar == null ? 0 : chVar.hashCode())) * 31;
        Boolean bool = this.f132275e;
        int hashCode2 = (hashCode + (bool == null ? 0 : bool.hashCode())) * 31;
        Boolean bool2 = this.f132276f;
        int hashCode3 = (hashCode2 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        Boolean bool3 = this.f132277g;
        int hashCode4 = (hashCode3 + (bool3 == null ? 0 : bool3.hashCode())) * 31;
        String str = this.f132278h;
        int hashCode5 = (hashCode4 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f132279i;
        int hashCode6 = (hashCode5 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f132280j;
        int hashCode7 = (hashCode6 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.f132281k;
        int hashCode8 = (hashCode7 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.f132282l;
        int hashCode9 = (hashCode8 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.f132283m;
        int hashCode10 = (hashCode9 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.f132284n;
        int hashCode11 = (hashCode10 + (str7 == null ? 0 : str7.hashCode())) * 31;
        String str8 = this.f132285o;
        int hashCode12 = (hashCode11 + (str8 == null ? 0 : str8.hashCode())) * 31;
        Integer num = this.f132286p;
        int hashCode13 = (hashCode12 + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.f132287q;
        int hashCode14 = (hashCode13 + (num2 == null ? 0 : num2.hashCode())) * 31;
        Boolean bool4 = this.f132288r;
        int hashCode15 = (hashCode14 + (bool4 == null ? 0 : bool4.hashCode())) * 31;
        Boolean bool5 = this.f132289s;
        int hashCode16 = (hashCode15 + (bool5 == null ? 0 : bool5.hashCode())) * 31;
        Integer num3 = this.f132290t;
        return hashCode16 + (num3 != null ? num3.hashCode() : 0);
    }

    @Override // z40.d0
    public final z40.c0 i() {
        return this.f132274d;
    }

    @Override // z40.d0
    public final Integer j() {
        return this.f132287q;
    }

    @Override // z40.d0
    public final String k() {
        return this.f132281k;
    }

    @Override // z40.d0
    public final String l() {
        return this.f132282l;
    }

    @Override // z40.d0
    public final String m() {
        return this.f132278h;
    }

    @Override // z40.d0
    public final Integer n() {
        return this.f132290t;
    }

    @Override // z40.d0
    public final Boolean o() {
        return this.f132277g;
    }

    @Override // z40.d0
    public final String p() {
        return this.f132283m;
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("Pinner(__typename=");
        sb3.append(this.f132271a);
        sb3.append(", id=");
        sb3.append(this.f132272b);
        sb3.append(", entityId=");
        sb3.append(this.f132273c);
        sb3.append(", verifiedIdentity=");
        sb3.append(this.f132274d);
        sb3.append(", blockedByMe=");
        sb3.append(this.f132275e);
        sb3.append(", isVerifiedMerchant=");
        sb3.append(this.f132276f);
        sb3.append(", isDefaultImage=");
        sb3.append(this.f132277g);
        sb3.append(", imageXlargeUrl=");
        sb3.append(this.f132278h);
        sb3.append(", imageLargeUrl=");
        sb3.append(this.f132279i);
        sb3.append(", imageMediumUrl=");
        sb3.append(this.f132280j);
        sb3.append(", imageSmallUrl=");
        sb3.append(this.f132281k);
        sb3.append(", firstName=");
        sb3.append(this.f132282l);
        sb3.append(", lastName=");
        sb3.append(this.f132283m);
        sb3.append(", fullName=");
        sb3.append(this.f132284n);
        sb3.append(", username=");
        sb3.append(this.f132285o);
        sb3.append(", followerCount=");
        sb3.append(this.f132286p);
        sb3.append(", followingCount=");
        sb3.append(this.f132287q);
        sb3.append(", explicitlyFollowedByMe=");
        sb3.append(this.f132288r);
        sb3.append(", isPrivateProfile=");
        sb3.append(this.f132289s);
        sb3.append(", avatarColorIndex=");
        return a.c.i(sb3, this.f132290t, ")");
    }
}
