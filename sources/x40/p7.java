package x40;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class p7 implements z40.z {

    /* renamed from: a, reason: collision with root package name */
    public final String f133026a;

    /* renamed from: b, reason: collision with root package name */
    public final String f133027b;

    /* renamed from: c, reason: collision with root package name */
    public final String f133028c;

    public p7(String __typename, String str, String str2) {
        Intrinsics.checkNotNullParameter(__typename, "__typename");
        this.f133026a = __typename;
        this.f133027b = str;
        this.f133028c = str2;
    }

    @Override // z40.z
    public final String a() {
        return this.f133028c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof p7)) {
            return false;
        }
        p7 p7Var = (p7) obj;
        return Intrinsics.d(this.f133026a, p7Var.f133026a) && Intrinsics.d(this.f133027b, p7Var.f133027b) && Intrinsics.d(this.f133028c, p7Var.f133028c);
    }

    @Override // z40.z
    public final String getType() {
        return this.f133027b;
    }

    public final int hashCode() {
        int hashCode = this.f133026a.hashCode() * 31;
        String str = this.f133027b;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f133028c;
        return hashCode2 + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("Embed(__typename=");
        sb3.append(this.f133026a);
        sb3.append(", type=");
        sb3.append(this.f133027b);
        sb3.append(", src=");
        return a.a.p(sb3, this.f133028c, ")");
    }
}
