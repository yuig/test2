package oy;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class u1 extends a0 {

    /* renamed from: g, reason: collision with root package name */
    public final String f98208g;

    /* renamed from: h, reason: collision with root package name */
    public final String f98209h;

    /* renamed from: i, reason: collision with root package name */
    public final String f98210i;

    /* renamed from: j, reason: collision with root package name */
    public final int f98211j;

    /* renamed from: k, reason: collision with root package name */
    public final boolean f98212k;

    /* renamed from: l, reason: collision with root package name */
    public final String f98213l;

    /* renamed from: m, reason: collision with root package name */
    public final Boolean f98214m;

    /* renamed from: n, reason: collision with root package name */
    public final s92.o f98215n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u1(String uniqueIdentifier, String str, String str2, int i13, boolean z13, String str3, Boolean bool, s92.o pwtResult) {
        super(uniqueIdentifier, 3, 0);
        Intrinsics.checkNotNullParameter(uniqueIdentifier, "uniqueIdentifier");
        Intrinsics.checkNotNullParameter(pwtResult, "pwtResult");
        this.f98208g = uniqueIdentifier;
        this.f98209h = str;
        this.f98210i = str2;
        this.f98211j = i13;
        this.f98212k = z13;
        this.f98213l = str3;
        this.f98214m = bool;
        this.f98215n = pwtResult;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof u1)) {
            return false;
        }
        u1 u1Var = (u1) obj;
        return Intrinsics.d(this.f98208g, u1Var.f98208g) && Intrinsics.d(this.f98209h, u1Var.f98209h) && Intrinsics.d(this.f98210i, u1Var.f98210i) && this.f98211j == u1Var.f98211j && this.f98212k == u1Var.f98212k && Intrinsics.d(this.f98213l, u1Var.f98213l) && Intrinsics.d(this.f98214m, u1Var.f98214m) && this.f98215n == u1Var.f98215n;
    }

    public final int hashCode() {
        int hashCode = this.f98208g.hashCode() * 31;
        String str = this.f98209h;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f98210i;
        int e13 = ep.b.e(this.f98212k, ep.b.b(this.f98211j, (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31, 31), 31);
        String str3 = this.f98213l;
        int hashCode3 = (e13 + (str3 == null ? 0 : str3.hashCode())) * 31;
        Boolean bool = this.f98214m;
        return this.f98215n.hashCode() + ((hashCode3 + (bool != null ? bool.hashCode() : 0)) * 31);
    }

    public final String toString() {
        return "StoryPinCreateEndEvent(uniqueIdentifier=" + this.f98208g + ", pinUid=" + this.f98209h + ", storyPinData=" + this.f98210i + ", storyPinDataSize=" + this.f98211j + ", isUserCausedError=" + this.f98212k + ", failureMessage=" + this.f98213l + ", isUserCancelled=" + this.f98214m + ", pwtResult=" + this.f98215n + ")";
    }
}
