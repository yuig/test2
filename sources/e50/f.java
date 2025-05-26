package e50;

import a.cb;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class f implements a, z40.y {

    /* renamed from: b, reason: collision with root package name */
    public final String f57321b;

    /* renamed from: c, reason: collision with root package name */
    public final String f57322c;

    /* renamed from: d, reason: collision with root package name */
    public final String f57323d;

    /* renamed from: e, reason: collision with root package name */
    public final Boolean f57324e;

    /* renamed from: f, reason: collision with root package name */
    public final Integer f57325f;

    /* renamed from: g, reason: collision with root package name */
    public final String f57326g;

    /* renamed from: h, reason: collision with root package name */
    public final String f57327h;

    /* renamed from: i, reason: collision with root package name */
    public final String f57328i;

    /* renamed from: j, reason: collision with root package name */
    public final Boolean f57329j;

    /* renamed from: k, reason: collision with root package name */
    public final Boolean f57330k;

    /* renamed from: l, reason: collision with root package name */
    public final Boolean f57331l;

    /* renamed from: m, reason: collision with root package name */
    public final e f57332m;

    /* renamed from: n, reason: collision with root package name */
    public final List f57333n;

    /* renamed from: o, reason: collision with root package name */
    public final List f57334o;

    /* renamed from: p, reason: collision with root package name */
    public final Boolean f57335p;

    public f(String __typename, String id3, String entityId, Boolean bool, Integer num, String str, String str2, String str3, Boolean bool2, Boolean bool3, Boolean bool4, e eVar, List list, List list2, Boolean bool5) {
        Intrinsics.checkNotNullParameter(__typename, "__typename");
        Intrinsics.checkNotNullParameter(id3, "id");
        Intrinsics.checkNotNullParameter(entityId, "entityId");
        this.f57321b = __typename;
        this.f57322c = id3;
        this.f57323d = entityId;
        this.f57324e = bool;
        this.f57325f = num;
        this.f57326g = str;
        this.f57327h = str2;
        this.f57328i = str3;
        this.f57329j = bool2;
        this.f57330k = bool3;
        this.f57331l = bool4;
        this.f57332m = eVar;
        this.f57333n = list;
        this.f57334o = list2;
        this.f57335p = bool5;
    }

    @Override // z40.y
    public final String a() {
        return this.f57323d;
    }

    @Override // z40.y
    public final String b() {
        return this.f57327h;
    }

    @Override // z40.y
    public final Integer c() {
        return this.f57325f;
    }

    @Override // z40.y
    public final Boolean d() {
        return this.f57324e;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f)) {
            return false;
        }
        f fVar = (f) obj;
        return Intrinsics.d(this.f57321b, fVar.f57321b) && Intrinsics.d(this.f57322c, fVar.f57322c) && Intrinsics.d(this.f57323d, fVar.f57323d) && Intrinsics.d(this.f57324e, fVar.f57324e) && Intrinsics.d(this.f57325f, fVar.f57325f) && Intrinsics.d(this.f57326g, fVar.f57326g) && Intrinsics.d(this.f57327h, fVar.f57327h) && Intrinsics.d(this.f57328i, fVar.f57328i) && Intrinsics.d(this.f57329j, fVar.f57329j) && Intrinsics.d(this.f57330k, fVar.f57330k) && Intrinsics.d(this.f57331l, fVar.f57331l) && Intrinsics.d(this.f57332m, fVar.f57332m) && Intrinsics.d(this.f57333n, fVar.f57333n) && Intrinsics.d(this.f57334o, fVar.f57334o) && Intrinsics.d(this.f57335p, fVar.f57335p);
    }

    @Override // z40.y
    public final String f() {
        return this.f57326g;
    }

    @Override // z40.y
    public final String g() {
        return this.f57328i;
    }

    @Override // z40.y
    public final String getId() {
        return this.f57322c;
    }

    @Override // z40.y
    public final Boolean h() {
        return this.f57329j;
    }

    public final int hashCode() {
        int d2 = cb.d(this.f57323d, cb.d(this.f57322c, this.f57321b.hashCode() * 31, 31), 31);
        Boolean bool = this.f57324e;
        int hashCode = (d2 + (bool == null ? 0 : bool.hashCode())) * 31;
        Integer num = this.f57325f;
        int hashCode2 = (hashCode + (num == null ? 0 : num.hashCode())) * 31;
        String str = this.f57326g;
        int hashCode3 = (hashCode2 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f57327h;
        int hashCode4 = (hashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f57328i;
        int hashCode5 = (hashCode4 + (str3 == null ? 0 : str3.hashCode())) * 31;
        Boolean bool2 = this.f57329j;
        int hashCode6 = (hashCode5 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        Boolean bool3 = this.f57330k;
        int hashCode7 = (hashCode6 + (bool3 == null ? 0 : bool3.hashCode())) * 31;
        Boolean bool4 = this.f57331l;
        int hashCode8 = (hashCode7 + (bool4 == null ? 0 : bool4.hashCode())) * 31;
        e eVar = this.f57332m;
        int hashCode9 = (hashCode8 + (eVar == null ? 0 : eVar.hashCode())) * 31;
        List list = this.f57333n;
        int hashCode10 = (hashCode9 + (list == null ? 0 : list.hashCode())) * 31;
        List list2 = this.f57334o;
        int hashCode11 = (hashCode10 + (list2 == null ? 0 : list2.hashCode())) * 31;
        Boolean bool5 = this.f57335p;
        return hashCode11 + (bool5 != null ? bool5.hashCode() : 0);
    }

    @Override // z40.y
    public final z40.x i() {
        return this.f57332m;
    }

    @Override // z40.y
    public final Boolean j() {
        return this.f57331l;
    }

    @Override // z40.y
    public final Boolean k() {
        return this.f57335p;
    }

    @Override // z40.y
    public final List l() {
        return this.f57333n;
    }

    @Override // z40.y
    public final Boolean m() {
        return this.f57330k;
    }

    @Override // z40.y
    public final List n() {
        return this.f57334o;
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("UserNode(__typename=");
        sb3.append(this.f57321b);
        sb3.append(", id=");
        sb3.append(this.f57322c);
        sb3.append(", entityId=");
        sb3.append(this.f57323d);
        sb3.append(", explicitlyFollowedByMe=");
        sb3.append(this.f57324e);
        sb3.append(", followerCount=");
        sb3.append(this.f57325f);
        sb3.append(", fullName=");
        sb3.append(this.f57326g);
        sb3.append(", imageMediumUrl=");
        sb3.append(this.f57327h);
        sb3.append(", username=");
        sb3.append(this.f57328i);
        sb3.append(", isVerifiedMerchant=");
        sb3.append(this.f57329j);
        sb3.append(", blockedByMe=");
        sb3.append(this.f57330k);
        sb3.append(", isPrivateProfile=");
        sb3.append(this.f57331l);
        sb3.append(", verifiedIdentity=");
        sb3.append(this.f57332m);
        sb3.append(", contextualPinImageUrls=");
        sb3.append(this.f57333n);
        sb3.append(", recentPinImages=");
        sb3.append(this.f57334o);
        sb3.append(", showCreatorProfile=");
        return a.c.h(sb3, this.f57335p, ")");
    }
}
