package x40;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class u4 {

    /* renamed from: a, reason: collision with root package name */
    public final String f133411a;

    /* renamed from: b, reason: collision with root package name */
    public final String f133412b;

    /* renamed from: c, reason: collision with root package name */
    public final String f133413c;

    public u4(String __typename, String str, String str2) {
        Intrinsics.checkNotNullParameter(__typename, "__typename");
        this.f133411a = __typename;
        this.f133412b = str;
        this.f133413c = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof u4)) {
            return false;
        }
        u4 u4Var = (u4) obj;
        return Intrinsics.d(this.f133411a, u4Var.f133411a) && Intrinsics.d(this.f133412b, u4Var.f133412b) && Intrinsics.d(this.f133413c, u4Var.f133413c);
    }

    public final int hashCode() {
        int hashCode = this.f133411a.hashCode() * 31;
        String str = this.f133412b;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f133413c;
        return hashCode2 + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("ReadTimesM(__typename=");
        sb3.append(this.f133411a);
        sb3.append(", time=");
        sb3.append(this.f133412b);
        sb3.append(", userId=");
        return a.a.p(sb3, this.f133413c, ")");
    }
}
