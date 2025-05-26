package x40;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class g8 implements z40.z {

    /* renamed from: a, reason: collision with root package name */
    public final String f132437a;

    /* renamed from: b, reason: collision with root package name */
    public final String f132438b;

    /* renamed from: c, reason: collision with root package name */
    public final String f132439c;

    public g8(String __typename, String str, String str2) {
        Intrinsics.checkNotNullParameter(__typename, "__typename");
        this.f132437a = __typename;
        this.f132438b = str;
        this.f132439c = str2;
    }

    @Override // z40.z
    public final String a() {
        return this.f132439c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g8)) {
            return false;
        }
        g8 g8Var = (g8) obj;
        return Intrinsics.d(this.f132437a, g8Var.f132437a) && Intrinsics.d(this.f132438b, g8Var.f132438b) && Intrinsics.d(this.f132439c, g8Var.f132439c);
    }

    @Override // z40.z
    public final String getType() {
        return this.f132438b;
    }

    public final int hashCode() {
        int hashCode = this.f132437a.hashCode() * 31;
        String str = this.f132438b;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f132439c;
        return hashCode2 + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("Embed(__typename=");
        sb3.append(this.f132437a);
        sb3.append(", type=");
        sb3.append(this.f132438b);
        sb3.append(", src=");
        return a.a.p(sb3, this.f132439c, ")");
    }
}
