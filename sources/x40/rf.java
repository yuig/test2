package x40;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class rf implements z40.d0 {

    /* renamed from: a, reason: collision with root package name */
    public final String f133190a;

    /* renamed from: b, reason: collision with root package name */
    public final String f133191b;

    /* renamed from: c, reason: collision with root package name */
    public final String f133192c;

    /* renamed from: d, reason: collision with root package name */
    public final qf f133193d;

    /* renamed from: e, reason: collision with root package name */
    public final Boolean f133194e;

    /* renamed from: f, reason: collision with root package name */
    public final Boolean f133195f;

    /* renamed from: g, reason: collision with root package name */
    public final Boolean f133196g;

    /* renamed from: h, reason: collision with root package name */
    public final String f133197h;

    /* renamed from: i, reason: collision with root package name */
    public final String f133198i;

    /* renamed from: j, reason: collision with root package name */
    public final String f133199j;

    /* renamed from: k, reason: collision with root package name */
    public final String f133200k;

    /* renamed from: l, reason: collision with root package name */
    public final String f133201l;

    /* renamed from: m, reason: collision with root package name */
    public final String f133202m;

    /* renamed from: n, reason: collision with root package name */
    public final String f133203n;

    /* renamed from: o, reason: collision with root package name */
    public final String f133204o;

    /* renamed from: p, reason: collision with root package name */
    public final Integer f133205p;

    /* renamed from: q, reason: collision with root package name */
    public final Integer f133206q;

    /* renamed from: r, reason: collision with root package name */
    public final Boolean f133207r;

    /* renamed from: s, reason: collision with root package name */
    public final Boolean f133208s;

    /* renamed from: t, reason: collision with root package name */
    public final Integer f133209t;

    public rf(String __typename, String id3, String entityId, qf qfVar, Boolean bool, Boolean bool2, Boolean bool3, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, Integer num, Integer num2, Boolean bool4, Boolean bool5, Integer num3) {
        Intrinsics.checkNotNullParameter(__typename, "__typename");
        Intrinsics.checkNotNullParameter(id3, "id");
        Intrinsics.checkNotNullParameter(entityId, "entityId");
        this.f133190a = __typename;
        this.f133191b = id3;
        this.f133192c = entityId;
        this.f133193d = qfVar;
        this.f133194e = bool;
        this.f133195f = bool2;
        this.f133196g = bool3;
        this.f133197h = str;
        this.f133198i = str2;
        this.f133199j = str3;
        this.f133200k = str4;
        this.f133201l = str5;
        this.f133202m = str6;
        this.f133203n = str7;
        this.f133204o = str8;
        this.f133205p = num;
        this.f133206q = num2;
        this.f133207r = bool4;
        this.f133208s = bool5;
        this.f133209t = num3;
    }

    @Override // z40.d0
    public final String a() {
        return this.f133192c;
    }

    @Override // z40.d0
    public final String b() {
        return this.f133199j;
    }

    @Override // z40.d0
    public final Integer c() {
        return this.f133205p;
    }

    @Override // z40.d0
    public final Boolean d() {
        return this.f133207r;
    }

    @Override // z40.d0
    public final String e() {
        return this.f133198i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof rf)) {
            return false;
        }
        rf rfVar = (rf) obj;
        return Intrinsics.d(this.f133190a, rfVar.f133190a) && Intrinsics.d(this.f133191b, rfVar.f133191b) && Intrinsics.d(this.f133192c, rfVar.f133192c) && Intrinsics.d(this.f133193d, rfVar.f133193d) && Intrinsics.d(this.f133194e, rfVar.f133194e) && Intrinsics.d(this.f133195f, rfVar.f133195f) && Intrinsics.d(this.f133196g, rfVar.f133196g) && Intrinsics.d(this.f133197h, rfVar.f133197h) && Intrinsics.d(this.f133198i, rfVar.f133198i) && Intrinsics.d(this.f133199j, rfVar.f133199j) && Intrinsics.d(this.f133200k, rfVar.f133200k) && Intrinsics.d(this.f133201l, rfVar.f133201l) && Intrinsics.d(this.f133202m, rfVar.f133202m) && Intrinsics.d(this.f133203n, rfVar.f133203n) && Intrinsics.d(this.f133204o, rfVar.f133204o) && Intrinsics.d(this.f133205p, rfVar.f133205p) && Intrinsics.d(this.f133206q, rfVar.f133206q) && Intrinsics.d(this.f133207r, rfVar.f133207r) && Intrinsics.d(this.f133208s, rfVar.f133208s) && Intrinsics.d(this.f133209t, rfVar.f133209t);
    }

    @Override // z40.d0
    public final String f() {
        return this.f133203n;
    }

    @Override // z40.d0
    public final String g() {
        return this.f133204o;
    }

    @Override // z40.d0
    public final String getId() {
        return this.f133191b;
    }

    @Override // z40.d0
    public final Boolean h() {
        return this.f133195f;
    }

    public final int hashCode() {
        int d2 = a.cb.d(this.f133192c, a.cb.d(this.f133191b, this.f133190a.hashCode() * 31, 31), 31);
        qf qfVar = this.f133193d;
        int hashCode = (d2 + (qfVar == null ? 0 : qfVar.hashCode())) * 31;
        Boolean bool = this.f133194e;
        int hashCode2 = (hashCode + (bool == null ? 0 : bool.hashCode())) * 31;
        Boolean bool2 = this.f133195f;
        int hashCode3 = (hashCode2 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        Boolean bool3 = this.f133196g;
        int hashCode4 = (hashCode3 + (bool3 == null ? 0 : bool3.hashCode())) * 31;
        String str = this.f133197h;
        int hashCode5 = (hashCode4 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f133198i;
        int hashCode6 = (hashCode5 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f133199j;
        int hashCode7 = (hashCode6 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.f133200k;
        int hashCode8 = (hashCode7 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.f133201l;
        int hashCode9 = (hashCode8 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.f133202m;
        int hashCode10 = (hashCode9 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.f133203n;
        int hashCode11 = (hashCode10 + (str7 == null ? 0 : str7.hashCode())) * 31;
        String str8 = this.f133204o;
        int hashCode12 = (hashCode11 + (str8 == null ? 0 : str8.hashCode())) * 31;
        Integer num = this.f133205p;
        int hashCode13 = (hashCode12 + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.f133206q;
        int hashCode14 = (hashCode13 + (num2 == null ? 0 : num2.hashCode())) * 31;
        Boolean bool4 = this.f133207r;
        int hashCode15 = (hashCode14 + (bool4 == null ? 0 : bool4.hashCode())) * 31;
        Boolean bool5 = this.f133208s;
        int hashCode16 = (hashCode15 + (bool5 == null ? 0 : bool5.hashCode())) * 31;
        Integer num3 = this.f133209t;
        return hashCode16 + (num3 != null ? num3.hashCode() : 0);
    }

    @Override // z40.d0
    public final z40.c0 i() {
        return this.f133193d;
    }

    @Override // z40.d0
    public final Integer j() {
        return this.f133206q;
    }

    @Override // z40.d0
    public final String k() {
        return this.f133200k;
    }

    @Override // z40.d0
    public final String l() {
        return this.f133201l;
    }

    @Override // z40.d0
    public final String m() {
        return this.f133197h;
    }

    @Override // z40.d0
    public final Integer n() {
        return this.f133209t;
    }

    @Override // z40.d0
    public final Boolean o() {
        return this.f133196g;
    }

    @Override // z40.d0
    public final String p() {
        return this.f133202m;
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("NativeCreator(__typename=");
        sb3.append(this.f133190a);
        sb3.append(", id=");
        sb3.append(this.f133191b);
        sb3.append(", entityId=");
        sb3.append(this.f133192c);
        sb3.append(", verifiedIdentity=");
        sb3.append(this.f133193d);
        sb3.append(", blockedByMe=");
        sb3.append(this.f133194e);
        sb3.append(", isVerifiedMerchant=");
        sb3.append(this.f133195f);
        sb3.append(", isDefaultImage=");
        sb3.append(this.f133196g);
        sb3.append(", imageXlargeUrl=");
        sb3.append(this.f133197h);
        sb3.append(", imageLargeUrl=");
        sb3.append(this.f133198i);
        sb3.append(", imageMediumUrl=");
        sb3.append(this.f133199j);
        sb3.append(", imageSmallUrl=");
        sb3.append(this.f133200k);
        sb3.append(", firstName=");
        sb3.append(this.f133201l);
        sb3.append(", lastName=");
        sb3.append(this.f133202m);
        sb3.append(", fullName=");
        sb3.append(this.f133203n);
        sb3.append(", username=");
        sb3.append(this.f133204o);
        sb3.append(", followerCount=");
        sb3.append(this.f133205p);
        sb3.append(", followingCount=");
        sb3.append(this.f133206q);
        sb3.append(", explicitlyFollowedByMe=");
        sb3.append(this.f133207r);
        sb3.append(", isPrivateProfile=");
        sb3.append(this.f133208s);
        sb3.append(", avatarColorIndex=");
        return a.c.i(sb3, this.f133209t, ")");
    }
}
