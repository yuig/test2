package x40;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class x9 implements z40.z {

    /* renamed from: a, reason: collision with root package name */
    public final String f133678a;

    /* renamed from: b, reason: collision with root package name */
    public final String f133679b;

    /* renamed from: c, reason: collision with root package name */
    public final String f133680c;

    public x9(String __typename, String str, String str2) {
        Intrinsics.checkNotNullParameter(__typename, "__typename");
        this.f133678a = __typename;
        this.f133679b = str;
        this.f133680c = str2;
    }

    @Override // z40.z
    public final String a() {
        return this.f133680c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof x9)) {
            return false;
        }
        x9 x9Var = (x9) obj;
        return Intrinsics.d(this.f133678a, x9Var.f133678a) && Intrinsics.d(this.f133679b, x9Var.f133679b) && Intrinsics.d(this.f133680c, x9Var.f133680c);
    }

    @Override // z40.z
    public final String getType() {
        return this.f133679b;
    }

    public final int hashCode() {
        int hashCode = this.f133678a.hashCode() * 31;
        String str = this.f133679b;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f133680c;
        return hashCode2 + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("Embed(__typename=");
        sb3.append(this.f133678a);
        sb3.append(", type=");
        sb3.append(this.f133679b);
        sb3.append(", src=");
        return a.a.p(sb3, this.f133680c, ")");
    }
}
