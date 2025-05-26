package x40;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class x2 {

    /* renamed from: a, reason: collision with root package name */
    public final String f133652a;

    /* renamed from: b, reason: collision with root package name */
    public final String f133653b;

    /* renamed from: c, reason: collision with root package name */
    public final String f133654c;

    public x2(String __typename, String str, String str2) {
        Intrinsics.checkNotNullParameter(__typename, "__typename");
        this.f133652a = __typename;
        this.f133653b = str;
        this.f133654c = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof x2)) {
            return false;
        }
        x2 x2Var = (x2) obj;
        return Intrinsics.d(this.f133652a, x2Var.f133652a) && Intrinsics.d(this.f133653b, x2Var.f133653b) && Intrinsics.d(this.f133654c, x2Var.f133654c);
    }

    public final int hashCode() {
        int hashCode = this.f133652a.hashCode() * 31;
        String str = this.f133653b;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f133654c;
        return hashCode2 + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("ReadTimesM(__typename=");
        sb3.append(this.f133652a);
        sb3.append(", userId=");
        sb3.append(this.f133653b);
        sb3.append(", time=");
        return a.a.p(sb3, this.f133654c, ")");
    }
}
