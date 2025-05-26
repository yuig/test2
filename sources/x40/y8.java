package x40;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class y8 {

    /* renamed from: a, reason: collision with root package name */
    public final String f133731a;

    /* renamed from: b, reason: collision with root package name */
    public final String f133732b;

    /* renamed from: c, reason: collision with root package name */
    public final String f133733c;

    public y8(String __typename, String str, String str2) {
        Intrinsics.checkNotNullParameter(__typename, "__typename");
        this.f133731a = __typename;
        this.f133732b = str;
        this.f133733c = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof y8)) {
            return false;
        }
        y8 y8Var = (y8) obj;
        return Intrinsics.d(this.f133731a, y8Var.f133731a) && Intrinsics.d(this.f133732b, y8Var.f133732b) && Intrinsics.d(this.f133733c, y8Var.f133733c);
    }

    public final int hashCode() {
        int hashCode = this.f133731a.hashCode() * 31;
        String str = this.f133732b;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f133733c;
        return hashCode2 + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("ReadTimesM(__typename=");
        sb3.append(this.f133731a);
        sb3.append(", time=");
        sb3.append(this.f133732b);
        sb3.append(", userId=");
        return a.a.p(sb3, this.f133733c, ")");
    }
}
