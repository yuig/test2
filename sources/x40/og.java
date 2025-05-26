package x40;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class og implements z40.z {

    /* renamed from: a, reason: collision with root package name */
    public final String f132993a;

    /* renamed from: b, reason: collision with root package name */
    public final String f132994b;

    /* renamed from: c, reason: collision with root package name */
    public final String f132995c;

    public og(String __typename, String str, String str2) {
        Intrinsics.checkNotNullParameter(__typename, "__typename");
        this.f132993a = __typename;
        this.f132994b = str;
        this.f132995c = str2;
    }

    @Override // z40.z
    public final String a() {
        return this.f132995c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof og)) {
            return false;
        }
        og ogVar = (og) obj;
        return Intrinsics.d(this.f132993a, ogVar.f132993a) && Intrinsics.d(this.f132994b, ogVar.f132994b) && Intrinsics.d(this.f132995c, ogVar.f132995c);
    }

    @Override // z40.z
    public final String getType() {
        return this.f132994b;
    }

    public final int hashCode() {
        int hashCode = this.f132993a.hashCode() * 31;
        String str = this.f132994b;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f132995c;
        return hashCode2 + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("Embed(__typename=");
        sb3.append(this.f132993a);
        sb3.append(", type=");
        sb3.append(this.f132994b);
        sb3.append(", src=");
        return a.a.p(sb3, this.f132995c, ")");
    }
}
