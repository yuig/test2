package e50;

import a.cb;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class z implements q, z40.y {

    /* renamed from: b, reason: collision with root package name */
    public final String f57461b;

    /* renamed from: c, reason: collision with root package name */
    public final String f57462c;

    /* renamed from: d, reason: collision with root package name */
    public final String f57463d;

    /* renamed from: e, reason: collision with root package name */
    public final Boolean f57464e;

    /* renamed from: f, reason: collision with root package name */
    public final Integer f57465f;

    /* renamed from: g, reason: collision with root package name */
    public final String f57466g;

    /* renamed from: h, reason: collision with root package name */
    public final String f57467h;

    /* renamed from: i, reason: collision with root package name */
    public final String f57468i;

    /* renamed from: j, reason: collision with root package name */
    public final Boolean f57469j;

    /* renamed from: k, reason: collision with root package name */
    public final Boolean f57470k;

    /* renamed from: l, reason: collision with root package name */
    public final Boolean f57471l;

    /* renamed from: m, reason: collision with root package name */
    public final y f57472m;

    /* renamed from: n, reason: collision with root package name */
    public final List f57473n;

    /* renamed from: o, reason: collision with root package name */
    public final List f57474o;

    /* renamed from: p, reason: collision with root package name */
    public final Boolean f57475p;

    public z(String __typename, String id3, String entityId, Boolean bool, Integer num, String str, String str2, String str3, Boolean bool2, Boolean bool3, Boolean bool4, y yVar, List list, List list2, Boolean bool5) {
        Intrinsics.checkNotNullParameter(__typename, "__typename");
        Intrinsics.checkNotNullParameter(id3, "id");
        Intrinsics.checkNotNullParameter(entityId, "entityId");
        this.f57461b = __typename;
        this.f57462c = id3;
        this.f57463d = entityId;
        this.f57464e = bool;
        this.f57465f = num;
        this.f57466g = str;
        this.f57467h = str2;
        this.f57468i = str3;
        this.f57469j = bool2;
        this.f57470k = bool3;
        this.f57471l = bool4;
        this.f57472m = yVar;
        this.f57473n = list;
        this.f57474o = list2;
        this.f57475p = bool5;
    }

    @Override // z40.y
    public final String a() {
        return this.f57463d;
    }

    @Override // z40.y
    public final String b() {
        return this.f57467h;
    }

    @Override // z40.y
    public final Integer c() {
        return this.f57465f;
    }

    @Override // z40.y
    public final Boolean d() {
        return this.f57464e;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof z)) {
            return false;
        }
        z zVar = (z) obj;
        return Intrinsics.d(this.f57461b, zVar.f57461b) && Intrinsics.d(this.f57462c, zVar.f57462c) && Intrinsics.d(this.f57463d, zVar.f57463d) && Intrinsics.d(this.f57464e, zVar.f57464e) && Intrinsics.d(this.f57465f, zVar.f57465f) && Intrinsics.d(this.f57466g, zVar.f57466g) && Intrinsics.d(this.f57467h, zVar.f57467h) && Intrinsics.d(this.f57468i, zVar.f57468i) && Intrinsics.d(this.f57469j, zVar.f57469j) && Intrinsics.d(this.f57470k, zVar.f57470k) && Intrinsics.d(this.f57471l, zVar.f57471l) && Intrinsics.d(this.f57472m, zVar.f57472m) && Intrinsics.d(this.f57473n, zVar.f57473n) && Intrinsics.d(this.f57474o, zVar.f57474o) && Intrinsics.d(this.f57475p, zVar.f57475p);
    }

    @Override // z40.y
    public final String f() {
        return this.f57466g;
    }

    @Override // z40.y
    public final String g() {
        return this.f57468i;
    }

    @Override // z40.y
    public final String getId() {
        return this.f57462c;
    }

    @Override // z40.y
    public final Boolean h() {
        return this.f57469j;
    }

    public final int hashCode() {
        int d2 = cb.d(this.f57463d, cb.d(this.f57462c, this.f57461b.hashCode() * 31, 31), 31);
        Boolean bool = this.f57464e;
        int hashCode = (d2 + (bool == null ? 0 : bool.hashCode())) * 31;
        Integer num = this.f57465f;
        int hashCode2 = (hashCode + (num == null ? 0 : num.hashCode())) * 31;
        String str = this.f57466g;
        int hashCode3 = (hashCode2 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f57467h;
        int hashCode4 = (hashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f57468i;
        int hashCode5 = (hashCode4 + (str3 == null ? 0 : str3.hashCode())) * 31;
        Boolean bool2 = this.f57469j;
        int hashCode6 = (hashCode5 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        Boolean bool3 = this.f57470k;
        int hashCode7 = (hashCode6 + (bool3 == null ? 0 : bool3.hashCode())) * 31;
        Boolean bool4 = this.f57471l;
        int hashCode8 = (hashCode7 + (bool4 == null ? 0 : bool4.hashCode())) * 31;
        y yVar = this.f57472m;
        int hashCode9 = (hashCode8 + (yVar == null ? 0 : yVar.hashCode())) * 31;
        List list = this.f57473n;
        int hashCode10 = (hashCode9 + (list == null ? 0 : list.hashCode())) * 31;
        List list2 = this.f57474o;
        int hashCode11 = (hashCode10 + (list2 == null ? 0 : list2.hashCode())) * 31;
        Boolean bool5 = this.f57475p;
        return hashCode11 + (bool5 != null ? bool5.hashCode() : 0);
    }

    @Override // z40.y
    public final z40.x i() {
        return this.f57472m;
    }

    @Override // z40.y
    public final Boolean j() {
        return this.f57471l;
    }

    @Override // z40.y
    public final Boolean k() {
        return this.f57475p;
    }

    @Override // z40.y
    public final List l() {
        return this.f57473n;
    }

    @Override // z40.y
    public final Boolean m() {
        return this.f57470k;
    }

    @Override // z40.y
    public final List n() {
        return this.f57474o;
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("UserNode(__typename=");
        sb3.append(this.f57461b);
        sb3.append(", id=");
        sb3.append(this.f57462c);
        sb3.append(", entityId=");
        sb3.append(this.f57463d);
        sb3.append(", explicitlyFollowedByMe=");
        sb3.append(this.f57464e);
        sb3.append(", followerCount=");
        sb3.append(this.f57465f);
        sb3.append(", fullName=");
        sb3.append(this.f57466g);
        sb3.append(", imageMediumUrl=");
        sb3.append(this.f57467h);
        sb3.append(", username=");
        sb3.append(this.f57468i);
        sb3.append(", isVerifiedMerchant=");
        sb3.append(this.f57469j);
        sb3.append(", blockedByMe=");
        sb3.append(this.f57470k);
        sb3.append(", isPrivateProfile=");
        sb3.append(this.f57471l);
        sb3.append(", verifiedIdentity=");
        sb3.append(this.f57472m);
        sb3.append(", contextualPinImageUrls=");
        sb3.append(this.f57473n);
        sb3.append(", recentPinImages=");
        sb3.append(this.f57474o);
        sb3.append(", showCreatorProfile=");
        return a.c.h(sb3, this.f57475p, ")");
    }
}
