package x40;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class wi implements z40.y {

    /* renamed from: b, reason: collision with root package name */
    public final String f133632b;

    /* renamed from: c, reason: collision with root package name */
    public final String f133633c;

    /* renamed from: d, reason: collision with root package name */
    public final String f133634d;

    /* renamed from: e, reason: collision with root package name */
    public final Boolean f133635e;

    /* renamed from: f, reason: collision with root package name */
    public final Integer f133636f;

    /* renamed from: g, reason: collision with root package name */
    public final String f133637g;

    /* renamed from: h, reason: collision with root package name */
    public final String f133638h;

    /* renamed from: i, reason: collision with root package name */
    public final String f133639i;

    /* renamed from: j, reason: collision with root package name */
    public final Boolean f133640j;

    /* renamed from: k, reason: collision with root package name */
    public final Boolean f133641k;

    /* renamed from: l, reason: collision with root package name */
    public final Boolean f133642l;

    /* renamed from: m, reason: collision with root package name */
    public final vi f133643m;

    /* renamed from: n, reason: collision with root package name */
    public final List f133644n;

    /* renamed from: o, reason: collision with root package name */
    public final List f133645o;

    /* renamed from: p, reason: collision with root package name */
    public final Boolean f133646p;

    public wi(String __typename, String id3, String entityId, Boolean bool, Integer num, String str, String str2, String str3, Boolean bool2, Boolean bool3, Boolean bool4, vi viVar, List list, List list2, Boolean bool5) {
        Intrinsics.checkNotNullParameter(__typename, "__typename");
        Intrinsics.checkNotNullParameter(id3, "id");
        Intrinsics.checkNotNullParameter(entityId, "entityId");
        this.f133632b = __typename;
        this.f133633c = id3;
        this.f133634d = entityId;
        this.f133635e = bool;
        this.f133636f = num;
        this.f133637g = str;
        this.f133638h = str2;
        this.f133639i = str3;
        this.f133640j = bool2;
        this.f133641k = bool3;
        this.f133642l = bool4;
        this.f133643m = viVar;
        this.f133644n = list;
        this.f133645o = list2;
        this.f133646p = bool5;
    }

    @Override // z40.y
    public final String a() {
        return this.f133634d;
    }

    @Override // z40.y
    public final String b() {
        return this.f133638h;
    }

    @Override // z40.y
    public final Integer c() {
        return this.f133636f;
    }

    @Override // z40.y
    public final Boolean d() {
        return this.f133635e;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof wi)) {
            return false;
        }
        wi wiVar = (wi) obj;
        return Intrinsics.d(this.f133632b, wiVar.f133632b) && Intrinsics.d(this.f133633c, wiVar.f133633c) && Intrinsics.d(this.f133634d, wiVar.f133634d) && Intrinsics.d(this.f133635e, wiVar.f133635e) && Intrinsics.d(this.f133636f, wiVar.f133636f) && Intrinsics.d(this.f133637g, wiVar.f133637g) && Intrinsics.d(this.f133638h, wiVar.f133638h) && Intrinsics.d(this.f133639i, wiVar.f133639i) && Intrinsics.d(this.f133640j, wiVar.f133640j) && Intrinsics.d(this.f133641k, wiVar.f133641k) && Intrinsics.d(this.f133642l, wiVar.f133642l) && Intrinsics.d(this.f133643m, wiVar.f133643m) && Intrinsics.d(this.f133644n, wiVar.f133644n) && Intrinsics.d(this.f133645o, wiVar.f133645o) && Intrinsics.d(this.f133646p, wiVar.f133646p);
    }

    @Override // z40.y
    public final String f() {
        return this.f133637g;
    }

    @Override // z40.y
    public final String g() {
        return this.f133639i;
    }

    @Override // z40.y
    public final String getId() {
        return this.f133633c;
    }

    @Override // z40.y
    public final Boolean h() {
        return this.f133640j;
    }

    public final int hashCode() {
        int d2 = a.cb.d(this.f133634d, a.cb.d(this.f133633c, this.f133632b.hashCode() * 31, 31), 31);
        Boolean bool = this.f133635e;
        int hashCode = (d2 + (bool == null ? 0 : bool.hashCode())) * 31;
        Integer num = this.f133636f;
        int hashCode2 = (hashCode + (num == null ? 0 : num.hashCode())) * 31;
        String str = this.f133637g;
        int hashCode3 = (hashCode2 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f133638h;
        int hashCode4 = (hashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f133639i;
        int hashCode5 = (hashCode4 + (str3 == null ? 0 : str3.hashCode())) * 31;
        Boolean bool2 = this.f133640j;
        int hashCode6 = (hashCode5 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        Boolean bool3 = this.f133641k;
        int hashCode7 = (hashCode6 + (bool3 == null ? 0 : bool3.hashCode())) * 31;
        Boolean bool4 = this.f133642l;
        int hashCode8 = (hashCode7 + (bool4 == null ? 0 : bool4.hashCode())) * 31;
        vi viVar = this.f133643m;
        int hashCode9 = (hashCode8 + (viVar == null ? 0 : viVar.hashCode())) * 31;
        List list = this.f133644n;
        int hashCode10 = (hashCode9 + (list == null ? 0 : list.hashCode())) * 31;
        List list2 = this.f133645o;
        int hashCode11 = (hashCode10 + (list2 == null ? 0 : list2.hashCode())) * 31;
        Boolean bool5 = this.f133646p;
        return hashCode11 + (bool5 != null ? bool5.hashCode() : 0);
    }

    @Override // z40.y
    public final z40.x i() {
        return this.f133643m;
    }

    @Override // z40.y
    public final Boolean j() {
        return this.f133642l;
    }

    @Override // z40.y
    public final Boolean k() {
        return this.f133646p;
    }

    @Override // z40.y
    public final List l() {
        return this.f133644n;
    }

    @Override // z40.y
    public final Boolean m() {
        return this.f133641k;
    }

    @Override // z40.y
    public final List n() {
        return this.f133645o;
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("Node(__typename=");
        sb3.append(this.f133632b);
        sb3.append(", id=");
        sb3.append(this.f133633c);
        sb3.append(", entityId=");
        sb3.append(this.f133634d);
        sb3.append(", explicitlyFollowedByMe=");
        sb3.append(this.f133635e);
        sb3.append(", followerCount=");
        sb3.append(this.f133636f);
        sb3.append(", fullName=");
        sb3.append(this.f133637g);
        sb3.append(", imageMediumUrl=");
        sb3.append(this.f133638h);
        sb3.append(", username=");
        sb3.append(this.f133639i);
        sb3.append(", isVerifiedMerchant=");
        sb3.append(this.f133640j);
        sb3.append(", blockedByMe=");
        sb3.append(this.f133641k);
        sb3.append(", isPrivateProfile=");
        sb3.append(this.f133642l);
        sb3.append(", verifiedIdentity=");
        sb3.append(this.f133643m);
        sb3.append(", contextualPinImageUrls=");
        sb3.append(this.f133644n);
        sb3.append(", recentPinImages=");
        sb3.append(this.f133645o);
        sb3.append(", showCreatorProfile=");
        return a.c.h(sb3, this.f133646p, ")");
    }
}
