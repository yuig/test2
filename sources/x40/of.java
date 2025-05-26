package x40;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class of implements z40.d0 {

    /* renamed from: a, reason: collision with root package name */
    public final String f132973a;

    /* renamed from: b, reason: collision with root package name */
    public final String f132974b;

    /* renamed from: c, reason: collision with root package name */
    public final String f132975c;

    /* renamed from: d, reason: collision with root package name */
    public final nf f132976d;

    /* renamed from: e, reason: collision with root package name */
    public final Boolean f132977e;

    /* renamed from: f, reason: collision with root package name */
    public final Boolean f132978f;

    /* renamed from: g, reason: collision with root package name */
    public final Boolean f132979g;

    /* renamed from: h, reason: collision with root package name */
    public final String f132980h;

    /* renamed from: i, reason: collision with root package name */
    public final String f132981i;

    /* renamed from: j, reason: collision with root package name */
    public final String f132982j;

    /* renamed from: k, reason: collision with root package name */
    public final String f132983k;

    /* renamed from: l, reason: collision with root package name */
    public final String f132984l;

    /* renamed from: m, reason: collision with root package name */
    public final String f132985m;

    /* renamed from: n, reason: collision with root package name */
    public final String f132986n;

    /* renamed from: o, reason: collision with root package name */
    public final String f132987o;

    /* renamed from: p, reason: collision with root package name */
    public final Integer f132988p;

    /* renamed from: q, reason: collision with root package name */
    public final Integer f132989q;

    /* renamed from: r, reason: collision with root package name */
    public final Boolean f132990r;

    /* renamed from: s, reason: collision with root package name */
    public final Boolean f132991s;

    /* renamed from: t, reason: collision with root package name */
    public final Integer f132992t;

    public of(String __typename, String id3, String entityId, nf nfVar, Boolean bool, Boolean bool2, Boolean bool3, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, Integer num, Integer num2, Boolean bool4, Boolean bool5, Integer num3) {
        Intrinsics.checkNotNullParameter(__typename, "__typename");
        Intrinsics.checkNotNullParameter(id3, "id");
        Intrinsics.checkNotNullParameter(entityId, "entityId");
        this.f132973a = __typename;
        this.f132974b = id3;
        this.f132975c = entityId;
        this.f132976d = nfVar;
        this.f132977e = bool;
        this.f132978f = bool2;
        this.f132979g = bool3;
        this.f132980h = str;
        this.f132981i = str2;
        this.f132982j = str3;
        this.f132983k = str4;
        this.f132984l = str5;
        this.f132985m = str6;
        this.f132986n = str7;
        this.f132987o = str8;
        this.f132988p = num;
        this.f132989q = num2;
        this.f132990r = bool4;
        this.f132991s = bool5;
        this.f132992t = num3;
    }

    @Override // z40.d0
    public final String a() {
        return this.f132975c;
    }

    @Override // z40.d0
    public final String b() {
        return this.f132982j;
    }

    @Override // z40.d0
    public final Integer c() {
        return this.f132988p;
    }

    @Override // z40.d0
    public final Boolean d() {
        return this.f132990r;
    }

    @Override // z40.d0
    public final String e() {
        return this.f132981i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof of)) {
            return false;
        }
        of ofVar = (of) obj;
        return Intrinsics.d(this.f132973a, ofVar.f132973a) && Intrinsics.d(this.f132974b, ofVar.f132974b) && Intrinsics.d(this.f132975c, ofVar.f132975c) && Intrinsics.d(this.f132976d, ofVar.f132976d) && Intrinsics.d(this.f132977e, ofVar.f132977e) && Intrinsics.d(this.f132978f, ofVar.f132978f) && Intrinsics.d(this.f132979g, ofVar.f132979g) && Intrinsics.d(this.f132980h, ofVar.f132980h) && Intrinsics.d(this.f132981i, ofVar.f132981i) && Intrinsics.d(this.f132982j, ofVar.f132982j) && Intrinsics.d(this.f132983k, ofVar.f132983k) && Intrinsics.d(this.f132984l, ofVar.f132984l) && Intrinsics.d(this.f132985m, ofVar.f132985m) && Intrinsics.d(this.f132986n, ofVar.f132986n) && Intrinsics.d(this.f132987o, ofVar.f132987o) && Intrinsics.d(this.f132988p, ofVar.f132988p) && Intrinsics.d(this.f132989q, ofVar.f132989q) && Intrinsics.d(this.f132990r, ofVar.f132990r) && Intrinsics.d(this.f132991s, ofVar.f132991s) && Intrinsics.d(this.f132992t, ofVar.f132992t);
    }

    @Override // z40.d0
    public final String f() {
        return this.f132986n;
    }

    @Override // z40.d0
    public final String g() {
        return this.f132987o;
    }

    @Override // z40.d0
    public final String getId() {
        return this.f132974b;
    }

    @Override // z40.d0
    public final Boolean h() {
        return this.f132978f;
    }

    public final int hashCode() {
        int d2 = a.cb.d(this.f132975c, a.cb.d(this.f132974b, this.f132973a.hashCode() * 31, 31), 31);
        nf nfVar = this.f132976d;
        int hashCode = (d2 + (nfVar == null ? 0 : nfVar.hashCode())) * 31;
        Boolean bool = this.f132977e;
        int hashCode2 = (hashCode + (bool == null ? 0 : bool.hashCode())) * 31;
        Boolean bool2 = this.f132978f;
        int hashCode3 = (hashCode2 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        Boolean bool3 = this.f132979g;
        int hashCode4 = (hashCode3 + (bool3 == null ? 0 : bool3.hashCode())) * 31;
        String str = this.f132980h;
        int hashCode5 = (hashCode4 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f132981i;
        int hashCode6 = (hashCode5 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f132982j;
        int hashCode7 = (hashCode6 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.f132983k;
        int hashCode8 = (hashCode7 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.f132984l;
        int hashCode9 = (hashCode8 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.f132985m;
        int hashCode10 = (hashCode9 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.f132986n;
        int hashCode11 = (hashCode10 + (str7 == null ? 0 : str7.hashCode())) * 31;
        String str8 = this.f132987o;
        int hashCode12 = (hashCode11 + (str8 == null ? 0 : str8.hashCode())) * 31;
        Integer num = this.f132988p;
        int hashCode13 = (hashCode12 + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.f132989q;
        int hashCode14 = (hashCode13 + (num2 == null ? 0 : num2.hashCode())) * 31;
        Boolean bool4 = this.f132990r;
        int hashCode15 = (hashCode14 + (bool4 == null ? 0 : bool4.hashCode())) * 31;
        Boolean bool5 = this.f132991s;
        int hashCode16 = (hashCode15 + (bool5 == null ? 0 : bool5.hashCode())) * 31;
        Integer num3 = this.f132992t;
        return hashCode16 + (num3 != null ? num3.hashCode() : 0);
    }

    @Override // z40.d0
    public final z40.c0 i() {
        return this.f132976d;
    }

    @Override // z40.d0
    public final Integer j() {
        return this.f132989q;
    }

    @Override // z40.d0
    public final String k() {
        return this.f132983k;
    }

    @Override // z40.d0
    public final String l() {
        return this.f132984l;
    }

    @Override // z40.d0
    public final String m() {
        return this.f132980h;
    }

    @Override // z40.d0
    public final Integer n() {
        return this.f132992t;
    }

    @Override // z40.d0
    public final Boolean o() {
        return this.f132979g;
    }

    @Override // z40.d0
    public final String p() {
        return this.f132985m;
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("OfficialUser(__typename=");
        sb3.append(this.f132973a);
        sb3.append(", id=");
        sb3.append(this.f132974b);
        sb3.append(", entityId=");
        sb3.append(this.f132975c);
        sb3.append(", verifiedIdentity=");
        sb3.append(this.f132976d);
        sb3.append(", blockedByMe=");
        sb3.append(this.f132977e);
        sb3.append(", isVerifiedMerchant=");
        sb3.append(this.f132978f);
        sb3.append(", isDefaultImage=");
        sb3.append(this.f132979g);
        sb3.append(", imageXlargeUrl=");
        sb3.append(this.f132980h);
        sb3.append(", imageLargeUrl=");
        sb3.append(this.f132981i);
        sb3.append(", imageMediumUrl=");
        sb3.append(this.f132982j);
        sb3.append(", imageSmallUrl=");
        sb3.append(this.f132983k);
        sb3.append(", firstName=");
        sb3.append(this.f132984l);
        sb3.append(", lastName=");
        sb3.append(this.f132985m);
        sb3.append(", fullName=");
        sb3.append(this.f132986n);
        sb3.append(", username=");
        sb3.append(this.f132987o);
        sb3.append(", followerCount=");
        sb3.append(this.f132988p);
        sb3.append(", followingCount=");
        sb3.append(this.f132989q);
        sb3.append(", explicitlyFollowedByMe=");
        sb3.append(this.f132990r);
        sb3.append(", isPrivateProfile=");
        sb3.append(this.f132991s);
        sb3.append(", avatarColorIndex=");
        return a.c.i(sb3, this.f132992t, ")");
    }
}
