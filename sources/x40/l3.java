package x40;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class l3 implements z40.z {

    /* renamed from: a, reason: collision with root package name */
    public final String f132695a;

    /* renamed from: b, reason: collision with root package name */
    public final String f132696b;

    /* renamed from: c, reason: collision with root package name */
    public final String f132697c;

    public l3(String __typename, String str, String str2) {
        Intrinsics.checkNotNullParameter(__typename, "__typename");
        this.f132695a = __typename;
        this.f132696b = str;
        this.f132697c = str2;
    }

    @Override // z40.z
    public final String a() {
        return this.f132697c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof l3)) {
            return false;
        }
        l3 l3Var = (l3) obj;
        return Intrinsics.d(this.f132695a, l3Var.f132695a) && Intrinsics.d(this.f132696b, l3Var.f132696b) && Intrinsics.d(this.f132697c, l3Var.f132697c);
    }

    @Override // z40.z
    public final String getType() {
        return this.f132696b;
    }

    public final int hashCode() {
        int hashCode = this.f132695a.hashCode() * 31;
        String str = this.f132696b;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f132697c;
        return hashCode2 + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("Embed(__typename=");
        sb3.append(this.f132695a);
        sb3.append(", type=");
        sb3.append(this.f132696b);
        sb3.append(", src=");
        return a.a.p(sb3, this.f132697c, ")");
    }
}
