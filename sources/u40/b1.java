package u40;

import a.cb;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class b1 implements z40.y {

    /* renamed from: b, reason: collision with root package name */
    public final String f120296b;

    /* renamed from: c, reason: collision with root package name */
    public final String f120297c;

    /* renamed from: d, reason: collision with root package name */
    public final String f120298d;

    /* renamed from: e, reason: collision with root package name */
    public final Boolean f120299e;

    /* renamed from: f, reason: collision with root package name */
    public final Integer f120300f;

    /* renamed from: g, reason: collision with root package name */
    public final String f120301g;

    /* renamed from: h, reason: collision with root package name */
    public final String f120302h;

    /* renamed from: i, reason: collision with root package name */
    public final String f120303i;

    /* renamed from: j, reason: collision with root package name */
    public final Boolean f120304j;

    /* renamed from: k, reason: collision with root package name */
    public final Boolean f120305k;

    /* renamed from: l, reason: collision with root package name */
    public final Boolean f120306l;

    /* renamed from: m, reason: collision with root package name */
    public final a1 f120307m;

    /* renamed from: n, reason: collision with root package name */
    public final List f120308n;

    /* renamed from: o, reason: collision with root package name */
    public final List f120309o;

    /* renamed from: p, reason: collision with root package name */
    public final Boolean f120310p;

    public b1(String __typename, String id3, String entityId, Boolean bool, Integer num, String str, String str2, String str3, Boolean bool2, Boolean bool3, Boolean bool4, a1 a1Var, List list, List list2, Boolean bool5) {
        Intrinsics.checkNotNullParameter(__typename, "__typename");
        Intrinsics.checkNotNullParameter(id3, "id");
        Intrinsics.checkNotNullParameter(entityId, "entityId");
        this.f120296b = __typename;
        this.f120297c = id3;
        this.f120298d = entityId;
        this.f120299e = bool;
        this.f120300f = num;
        this.f120301g = str;
        this.f120302h = str2;
        this.f120303i = str3;
        this.f120304j = bool2;
        this.f120305k = bool3;
        this.f120306l = bool4;
        this.f120307m = a1Var;
        this.f120308n = list;
        this.f120309o = list2;
        this.f120310p = bool5;
    }

    @Override // z40.y
    public final String a() {
        return this.f120298d;
    }

    @Override // z40.y
    public final String b() {
        return this.f120302h;
    }

    @Override // z40.y
    public final Integer c() {
        return this.f120300f;
    }

    @Override // z40.y
    public final Boolean d() {
        return this.f120299e;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b1)) {
            return false;
        }
        b1 b1Var = (b1) obj;
        return Intrinsics.d(this.f120296b, b1Var.f120296b) && Intrinsics.d(this.f120297c, b1Var.f120297c) && Intrinsics.d(this.f120298d, b1Var.f120298d) && Intrinsics.d(this.f120299e, b1Var.f120299e) && Intrinsics.d(this.f120300f, b1Var.f120300f) && Intrinsics.d(this.f120301g, b1Var.f120301g) && Intrinsics.d(this.f120302h, b1Var.f120302h) && Intrinsics.d(this.f120303i, b1Var.f120303i) && Intrinsics.d(this.f120304j, b1Var.f120304j) && Intrinsics.d(this.f120305k, b1Var.f120305k) && Intrinsics.d(this.f120306l, b1Var.f120306l) && Intrinsics.d(this.f120307m, b1Var.f120307m) && Intrinsics.d(this.f120308n, b1Var.f120308n) && Intrinsics.d(this.f120309o, b1Var.f120309o) && Intrinsics.d(this.f120310p, b1Var.f120310p);
    }

    @Override // z40.y
    public final String f() {
        return this.f120301g;
    }

    @Override // z40.y
    public final String g() {
        return this.f120303i;
    }

    @Override // z40.y
    public final String getId() {
        return this.f120297c;
    }

    @Override // z40.y
    public final Boolean h() {
        return this.f120304j;
    }

    public final int hashCode() {
        int d2 = cb.d(this.f120298d, cb.d(this.f120297c, this.f120296b.hashCode() * 31, 31), 31);
        Boolean bool = this.f120299e;
        int hashCode = (d2 + (bool == null ? 0 : bool.hashCode())) * 31;
        Integer num = this.f120300f;
        int hashCode2 = (hashCode + (num == null ? 0 : num.hashCode())) * 31;
        String str = this.f120301g;
        int hashCode3 = (hashCode2 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f120302h;
        int hashCode4 = (hashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f120303i;
        int hashCode5 = (hashCode4 + (str3 == null ? 0 : str3.hashCode())) * 31;
        Boolean bool2 = this.f120304j;
        int hashCode6 = (hashCode5 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        Boolean bool3 = this.f120305k;
        int hashCode7 = (hashCode6 + (bool3 == null ? 0 : bool3.hashCode())) * 31;
        Boolean bool4 = this.f120306l;
        int hashCode8 = (hashCode7 + (bool4 == null ? 0 : bool4.hashCode())) * 31;
        a1 a1Var = this.f120307m;
        int hashCode9 = (hashCode8 + (a1Var == null ? 0 : a1Var.hashCode())) * 31;
        List list = this.f120308n;
        int hashCode10 = (hashCode9 + (list == null ? 0 : list.hashCode())) * 31;
        List list2 = this.f120309o;
        int hashCode11 = (hashCode10 + (list2 == null ? 0 : list2.hashCode())) * 31;
        Boolean bool5 = this.f120310p;
        return hashCode11 + (bool5 != null ? bool5.hashCode() : 0);
    }

    @Override // z40.y
    public final z40.x i() {
        return this.f120307m;
    }

    @Override // z40.y
    public final Boolean j() {
        return this.f120306l;
    }

    @Override // z40.y
    public final Boolean k() {
        return this.f120310p;
    }

    @Override // z40.y
    public final List l() {
        return this.f120308n;
    }

    @Override // z40.y
    public final Boolean m() {
        return this.f120305k;
    }

    @Override // z40.y
    public final List n() {
        return this.f120309o;
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("Node(__typename=");
        sb3.append(this.f120296b);
        sb3.append(", id=");
        sb3.append(this.f120297c);
        sb3.append(", entityId=");
        sb3.append(this.f120298d);
        sb3.append(", explicitlyFollowedByMe=");
        sb3.append(this.f120299e);
        sb3.append(", followerCount=");
        sb3.append(this.f120300f);
        sb3.append(", fullName=");
        sb3.append(this.f120301g);
        sb3.append(", imageMediumUrl=");
        sb3.append(this.f120302h);
        sb3.append(", username=");
        sb3.append(this.f120303i);
        sb3.append(", isVerifiedMerchant=");
        sb3.append(this.f120304j);
        sb3.append(", blockedByMe=");
        sb3.append(this.f120305k);
        sb3.append(", isPrivateProfile=");
        sb3.append(this.f120306l);
        sb3.append(", verifiedIdentity=");
        sb3.append(this.f120307m);
        sb3.append(", contextualPinImageUrls=");
        sb3.append(this.f120308n);
        sb3.append(", recentPinImages=");
        sb3.append(this.f120309o);
        sb3.append(", showCreatorProfile=");
        return a.c.h(sb3, this.f120310p, ")");
    }
}
