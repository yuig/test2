package x40;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class o1 implements z40.z {

    /* renamed from: a, reason: collision with root package name */
    public final String f132916a;

    /* renamed from: b, reason: collision with root package name */
    public final String f132917b;

    /* renamed from: c, reason: collision with root package name */
    public final String f132918c;

    public o1(String __typename, String str, String str2) {
        Intrinsics.checkNotNullParameter(__typename, "__typename");
        this.f132916a = __typename;
        this.f132917b = str;
        this.f132918c = str2;
    }

    @Override // z40.z
    public final String a() {
        return this.f132918c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof o1)) {
            return false;
        }
        o1 o1Var = (o1) obj;
        return Intrinsics.d(this.f132916a, o1Var.f132916a) && Intrinsics.d(this.f132917b, o1Var.f132917b) && Intrinsics.d(this.f132918c, o1Var.f132918c);
    }

    @Override // z40.z
    public final String getType() {
        return this.f132917b;
    }

    public final int hashCode() {
        int hashCode = this.f132916a.hashCode() * 31;
        String str = this.f132917b;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f132918c;
        return hashCode2 + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("Embed(__typename=");
        sb3.append(this.f132916a);
        sb3.append(", type=");
        sb3.append(this.f132917b);
        sb3.append(", src=");
        return a.a.p(sb3, this.f132918c, ")");
    }
}
