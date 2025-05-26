package mu;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class a0 {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f88185a;

    /* renamed from: b, reason: collision with root package name */
    public final String f88186b;

    /* renamed from: c, reason: collision with root package name */
    public final String f88187c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f88188d;

    public a0(String str, String str2, boolean z13, boolean z14) {
        this.f88185a = z13;
        this.f88186b = str;
        this.f88187c = str2;
        this.f88188d = z14;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a0)) {
            return false;
        }
        a0 a0Var = (a0) obj;
        return this.f88185a == a0Var.f88185a && Intrinsics.d(this.f88186b, a0Var.f88186b) && Intrinsics.d(this.f88187c, a0Var.f88187c) && this.f88188d == a0Var.f88188d;
    }

    public final int hashCode() {
        int hashCode = Boolean.hashCode(this.f88185a) * 31;
        String str = this.f88186b;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f88187c;
        return Boolean.hashCode(this.f88188d) + ((hashCode2 + (str2 != null ? str2.hashCode() : 0)) * 31);
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("BottomSheetDisplayState(isAwarenessVideo=");
        sb3.append(this.f88185a);
        sb3.append(", title=");
        sb3.append(this.f88186b);
        sb3.append(", promoterName=");
        sb3.append(this.f88187c);
        sb3.append(", isEligibleForAdsGridRepTests=");
        return a.a.r(sb3, this.f88188d, ")");
    }
}
