package x40;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class lf implements z40.d0 {

    /* renamed from: a, reason: collision with root package name */
    public final String f132754a;

    /* renamed from: b, reason: collision with root package name */
    public final String f132755b;

    /* renamed from: c, reason: collision with root package name */
    public final String f132756c;

    /* renamed from: d, reason: collision with root package name */
    public final kf f132757d;

    /* renamed from: e, reason: collision with root package name */
    public final Boolean f132758e;

    /* renamed from: f, reason: collision with root package name */
    public final Boolean f132759f;

    /* renamed from: g, reason: collision with root package name */
    public final Boolean f132760g;

    /* renamed from: h, reason: collision with root package name */
    public final String f132761h;

    /* renamed from: i, reason: collision with root package name */
    public final String f132762i;

    /* renamed from: j, reason: collision with root package name */
    public final String f132763j;

    /* renamed from: k, reason: collision with root package name */
    public final String f132764k;

    /* renamed from: l, reason: collision with root package name */
    public final String f132765l;

    /* renamed from: m, reason: collision with root package name */
    public final String f132766m;

    /* renamed from: n, reason: collision with root package name */
    public final String f132767n;

    /* renamed from: o, reason: collision with root package name */
    public final String f132768o;

    /* renamed from: p, reason: collision with root package name */
    public final Integer f132769p;

    /* renamed from: q, reason: collision with root package name */
    public final Integer f132770q;

    /* renamed from: r, reason: collision with root package name */
    public final Boolean f132771r;

    /* renamed from: s, reason: collision with root package name */
    public final Boolean f132772s;

    /* renamed from: t, reason: collision with root package name */
    public final Integer f132773t;

    public lf(String __typename, String id3, String entityId, kf kfVar, Boolean bool, Boolean bool2, Boolean bool3, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, Integer num, Integer num2, Boolean bool4, Boolean bool5, Integer num3) {
        Intrinsics.checkNotNullParameter(__typename, "__typename");
        Intrinsics.checkNotNullParameter(id3, "id");
        Intrinsics.checkNotNullParameter(entityId, "entityId");
        this.f132754a = __typename;
        this.f132755b = id3;
        this.f132756c = entityId;
        this.f132757d = kfVar;
        this.f132758e = bool;
        this.f132759f = bool2;
        this.f132760g = bool3;
        this.f132761h = str;
        this.f132762i = str2;
        this.f132763j = str3;
        this.f132764k = str4;
        this.f132765l = str5;
        this.f132766m = str6;
        this.f132767n = str7;
        this.f132768o = str8;
        this.f132769p = num;
        this.f132770q = num2;
        this.f132771r = bool4;
        this.f132772s = bool5;
        this.f132773t = num3;
    }

    @Override // z40.d0
    public final String a() {
        return this.f132756c;
    }

    @Override // z40.d0
    public final String b() {
        return this.f132763j;
    }

    @Override // z40.d0
    public final Integer c() {
        return this.f132769p;
    }

    @Override // z40.d0
    public final Boolean d() {
        return this.f132771r;
    }

    @Override // z40.d0
    public final String e() {
        return this.f132762i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof lf)) {
            return false;
        }
        lf lfVar = (lf) obj;
        return Intrinsics.d(this.f132754a, lfVar.f132754a) && Intrinsics.d(this.f132755b, lfVar.f132755b) && Intrinsics.d(this.f132756c, lfVar.f132756c) && Intrinsics.d(this.f132757d, lfVar.f132757d) && Intrinsics.d(this.f132758e, lfVar.f132758e) && Intrinsics.d(this.f132759f, lfVar.f132759f) && Intrinsics.d(this.f132760g, lfVar.f132760g) && Intrinsics.d(this.f132761h, lfVar.f132761h) && Intrinsics.d(this.f132762i, lfVar.f132762i) && Intrinsics.d(this.f132763j, lfVar.f132763j) && Intrinsics.d(this.f132764k, lfVar.f132764k) && Intrinsics.d(this.f132765l, lfVar.f132765l) && Intrinsics.d(this.f132766m, lfVar.f132766m) && Intrinsics.d(this.f132767n, lfVar.f132767n) && Intrinsics.d(this.f132768o, lfVar.f132768o) && Intrinsics.d(this.f132769p, lfVar.f132769p) && Intrinsics.d(this.f132770q, lfVar.f132770q) && Intrinsics.d(this.f132771r, lfVar.f132771r) && Intrinsics.d(this.f132772s, lfVar.f132772s) && Intrinsics.d(this.f132773t, lfVar.f132773t);
    }

    @Override // z40.d0
    public final String f() {
        return this.f132767n;
    }

    @Override // z40.d0
    public final String g() {
        return this.f132768o;
    }

    @Override // z40.d0
    public final String getId() {
        return this.f132755b;
    }

    @Override // z40.d0
    public final Boolean h() {
        return this.f132759f;
    }

    public final int hashCode() {
        int d2 = a.cb.d(this.f132756c, a.cb.d(this.f132755b, this.f132754a.hashCode() * 31, 31), 31);
        kf kfVar = this.f132757d;
        int hashCode = (d2 + (kfVar == null ? 0 : kfVar.hashCode())) * 31;
        Boolean bool = this.f132758e;
        int hashCode2 = (hashCode + (bool == null ? 0 : bool.hashCode())) * 31;
        Boolean bool2 = this.f132759f;
        int hashCode3 = (hashCode2 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        Boolean bool3 = this.f132760g;
        int hashCode4 = (hashCode3 + (bool3 == null ? 0 : bool3.hashCode())) * 31;
        String str = this.f132761h;
        int hashCode5 = (hashCode4 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f132762i;
        int hashCode6 = (hashCode5 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f132763j;
        int hashCode7 = (hashCode6 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.f132764k;
        int hashCode8 = (hashCode7 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.f132765l;
        int hashCode9 = (hashCode8 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.f132766m;
        int hashCode10 = (hashCode9 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.f132767n;
        int hashCode11 = (hashCode10 + (str7 == null ? 0 : str7.hashCode())) * 31;
        String str8 = this.f132768o;
        int hashCode12 = (hashCode11 + (str8 == null ? 0 : str8.hashCode())) * 31;
        Integer num = this.f132769p;
        int hashCode13 = (hashCode12 + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.f132770q;
        int hashCode14 = (hashCode13 + (num2 == null ? 0 : num2.hashCode())) * 31;
        Boolean bool4 = this.f132771r;
        int hashCode15 = (hashCode14 + (bool4 == null ? 0 : bool4.hashCode())) * 31;
        Boolean bool5 = this.f132772s;
        int hashCode16 = (hashCode15 + (bool5 == null ? 0 : bool5.hashCode())) * 31;
        Integer num3 = this.f132773t;
        return hashCode16 + (num3 != null ? num3.hashCode() : 0);
    }

    @Override // z40.d0
    public final z40.c0 i() {
        return this.f132757d;
    }

    @Override // z40.d0
    public final Integer j() {
        return this.f132770q;
    }

    @Override // z40.d0
    public final String k() {
        return this.f132764k;
    }

    @Override // z40.d0
    public final String l() {
        return this.f132765l;
    }

    @Override // z40.d0
    public final String m() {
        return this.f132761h;
    }

    @Override // z40.d0
    public final Integer n() {
        return this.f132773t;
    }

    @Override // z40.d0
    public final Boolean o() {
        return this.f132760g;
    }

    @Override // z40.d0
    public final String p() {
        return this.f132766m;
    }

    public final Boolean q() {
        return this.f132758e;
    }

    public final Boolean r() {
        return this.f132772s;
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("OfficialUser(__typename=");
        sb3.append(this.f132754a);
        sb3.append(", id=");
        sb3.append(this.f132755b);
        sb3.append(", entityId=");
        sb3.append(this.f132756c);
        sb3.append(", verifiedIdentity=");
        sb3.append(this.f132757d);
        sb3.append(", blockedByMe=");
        sb3.append(this.f132758e);
        sb3.append(", isVerifiedMerchant=");
        sb3.append(this.f132759f);
        sb3.append(", isDefaultImage=");
        sb3.append(this.f132760g);
        sb3.append(", imageXlargeUrl=");
        sb3.append(this.f132761h);
        sb3.append(", imageLargeUrl=");
        sb3.append(this.f132762i);
        sb3.append(", imageMediumUrl=");
        sb3.append(this.f132763j);
        sb3.append(", imageSmallUrl=");
        sb3.append(this.f132764k);
        sb3.append(", firstName=");
        sb3.append(this.f132765l);
        sb3.append(", lastName=");
        sb3.append(this.f132766m);
        sb3.append(", fullName=");
        sb3.append(this.f132767n);
        sb3.append(", username=");
        sb3.append(this.f132768o);
        sb3.append(", followerCount=");
        sb3.append(this.f132769p);
        sb3.append(", followingCount=");
        sb3.append(this.f132770q);
        sb3.append(", explicitlyFollowedByMe=");
        sb3.append(this.f132771r);
        sb3.append(", isPrivateProfile=");
        sb3.append(this.f132772s);
        sb3.append(", avatarColorIndex=");
        return a.c.i(sb3, this.f132773t, ")");
    }
}
