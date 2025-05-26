package rg0;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class k {

    /* renamed from: a, reason: collision with root package name */
    public final l f108040a;

    /* renamed from: b, reason: collision with root package name */
    public final l f108041b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f108042c;

    public k(l lVar, l lVar2, boolean z13) {
        this.f108040a = lVar;
        this.f108041b = lVar2;
        this.f108042c = z13;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof k)) {
            return false;
        }
        k kVar = (k) obj;
        return Intrinsics.d(this.f108040a, kVar.f108040a) && Intrinsics.d(this.f108041b, kVar.f108041b) && this.f108042c == kVar.f108042c;
    }

    public final int hashCode() {
        l lVar = this.f108040a;
        int hashCode = (lVar == null ? 0 : lVar.hashCode()) * 31;
        l lVar2 = this.f108041b;
        return Boolean.hashCode(this.f108042c) + ((hashCode + (lVar2 != null ? lVar2.hashCode() : 0)) * 31);
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("Selection(title=");
        sb3.append(this.f108040a);
        sb3.append(", subtitle=");
        sb3.append(this.f108041b);
        sb3.append(", firstPartyAdsEnabled=");
        return a.a.r(sb3, this.f108042c, ")");
    }
}
