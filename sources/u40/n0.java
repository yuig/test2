package u40;

import a.cb;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class n0 implements i0, z40.y {

    /* renamed from: b, reason: collision with root package name */
    public final String f120394b;

    /* renamed from: c, reason: collision with root package name */
    public final String f120395c;

    /* renamed from: d, reason: collision with root package name */
    public final String f120396d;

    /* renamed from: e, reason: collision with root package name */
    public final Boolean f120397e;

    /* renamed from: f, reason: collision with root package name */
    public final Integer f120398f;

    /* renamed from: g, reason: collision with root package name */
    public final String f120399g;

    /* renamed from: h, reason: collision with root package name */
    public final String f120400h;

    /* renamed from: i, reason: collision with root package name */
    public final String f120401i;

    /* renamed from: j, reason: collision with root package name */
    public final Boolean f120402j;

    /* renamed from: k, reason: collision with root package name */
    public final Boolean f120403k;

    /* renamed from: l, reason: collision with root package name */
    public final Boolean f120404l;

    /* renamed from: m, reason: collision with root package name */
    public final m0 f120405m;

    /* renamed from: n, reason: collision with root package name */
    public final List f120406n;

    /* renamed from: o, reason: collision with root package name */
    public final List f120407o;

    /* renamed from: p, reason: collision with root package name */
    public final Boolean f120408p;

    public n0(String __typename, String id3, String entityId, Boolean bool, Integer num, String str, String str2, String str3, Boolean bool2, Boolean bool3, Boolean bool4, m0 m0Var, List list, List list2, Boolean bool5) {
        Intrinsics.checkNotNullParameter(__typename, "__typename");
        Intrinsics.checkNotNullParameter(id3, "id");
        Intrinsics.checkNotNullParameter(entityId, "entityId");
        this.f120394b = __typename;
        this.f120395c = id3;
        this.f120396d = entityId;
        this.f120397e = bool;
        this.f120398f = num;
        this.f120399g = str;
        this.f120400h = str2;
        this.f120401i = str3;
        this.f120402j = bool2;
        this.f120403k = bool3;
        this.f120404l = bool4;
        this.f120405m = m0Var;
        this.f120406n = list;
        this.f120407o = list2;
        this.f120408p = bool5;
    }

    @Override // z40.y
    public final String a() {
        return this.f120396d;
    }

    @Override // z40.y
    public final String b() {
        return this.f120400h;
    }

    @Override // z40.y
    public final Integer c() {
        return this.f120398f;
    }

    @Override // z40.y
    public final Boolean d() {
        return this.f120397e;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof n0)) {
            return false;
        }
        n0 n0Var = (n0) obj;
        return Intrinsics.d(this.f120394b, n0Var.f120394b) && Intrinsics.d(this.f120395c, n0Var.f120395c) && Intrinsics.d(this.f120396d, n0Var.f120396d) && Intrinsics.d(this.f120397e, n0Var.f120397e) && Intrinsics.d(this.f120398f, n0Var.f120398f) && Intrinsics.d(this.f120399g, n0Var.f120399g) && Intrinsics.d(this.f120400h, n0Var.f120400h) && Intrinsics.d(this.f120401i, n0Var.f120401i) && Intrinsics.d(this.f120402j, n0Var.f120402j) && Intrinsics.d(this.f120403k, n0Var.f120403k) && Intrinsics.d(this.f120404l, n0Var.f120404l) && Intrinsics.d(this.f120405m, n0Var.f120405m) && Intrinsics.d(this.f120406n, n0Var.f120406n) && Intrinsics.d(this.f120407o, n0Var.f120407o) && Intrinsics.d(this.f120408p, n0Var.f120408p);
    }

    @Override // z40.y
    public final String f() {
        return this.f120399g;
    }

    @Override // z40.y
    public final String g() {
        return this.f120401i;
    }

    @Override // z40.y
    public final String getId() {
        return this.f120395c;
    }

    @Override // z40.y
    public final Boolean h() {
        return this.f120402j;
    }

    public final int hashCode() {
        int d2 = cb.d(this.f120396d, cb.d(this.f120395c, this.f120394b.hashCode() * 31, 31), 31);
        Boolean bool = this.f120397e;
        int hashCode = (d2 + (bool == null ? 0 : bool.hashCode())) * 31;
        Integer num = this.f120398f;
        int hashCode2 = (hashCode + (num == null ? 0 : num.hashCode())) * 31;
        String str = this.f120399g;
        int hashCode3 = (hashCode2 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f120400h;
        int hashCode4 = (hashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f120401i;
        int hashCode5 = (hashCode4 + (str3 == null ? 0 : str3.hashCode())) * 31;
        Boolean bool2 = this.f120402j;
        int hashCode6 = (hashCode5 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        Boolean bool3 = this.f120403k;
        int hashCode7 = (hashCode6 + (bool3 == null ? 0 : bool3.hashCode())) * 31;
        Boolean bool4 = this.f120404l;
        int hashCode8 = (hashCode7 + (bool4 == null ? 0 : bool4.hashCode())) * 31;
        m0 m0Var = this.f120405m;
        int hashCode9 = (hashCode8 + (m0Var == null ? 0 : m0Var.hashCode())) * 31;
        List list = this.f120406n;
        int hashCode10 = (hashCode9 + (list == null ? 0 : list.hashCode())) * 31;
        List list2 = this.f120407o;
        int hashCode11 = (hashCode10 + (list2 == null ? 0 : list2.hashCode())) * 31;
        Boolean bool5 = this.f120408p;
        return hashCode11 + (bool5 != null ? bool5.hashCode() : 0);
    }

    @Override // z40.y
    public final z40.x i() {
        return this.f120405m;
    }

    @Override // z40.y
    public final Boolean j() {
        return this.f120404l;
    }

    @Override // z40.y
    public final Boolean k() {
        return this.f120408p;
    }

    @Override // z40.y
    public final List l() {
        return this.f120406n;
    }

    @Override // z40.y
    public final Boolean m() {
        return this.f120403k;
    }

    @Override // z40.y
    public final List n() {
        return this.f120407o;
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("UserNode(__typename=");
        sb3.append(this.f120394b);
        sb3.append(", id=");
        sb3.append(this.f120395c);
        sb3.append(", entityId=");
        sb3.append(this.f120396d);
        sb3.append(", explicitlyFollowedByMe=");
        sb3.append(this.f120397e);
        sb3.append(", followerCount=");
        sb3.append(this.f120398f);
        sb3.append(", fullName=");
        sb3.append(this.f120399g);
        sb3.append(", imageMediumUrl=");
        sb3.append(this.f120400h);
        sb3.append(", username=");
        sb3.append(this.f120401i);
        sb3.append(", isVerifiedMerchant=");
        sb3.append(this.f120402j);
        sb3.append(", blockedByMe=");
        sb3.append(this.f120403k);
        sb3.append(", isPrivateProfile=");
        sb3.append(this.f120404l);
        sb3.append(", verifiedIdentity=");
        sb3.append(this.f120405m);
        sb3.append(", contextualPinImageUrls=");
        sb3.append(this.f120406n);
        sb3.append(", recentPinImages=");
        sb3.append(this.f120407o);
        sb3.append(", showCreatorProfile=");
        return a.c.h(sb3, this.f120408p, ")");
    }
}
