package x40;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class c4 implements z40.z {

    /* renamed from: a, reason: collision with root package name */
    public final String f132095a;

    /* renamed from: b, reason: collision with root package name */
    public final String f132096b;

    /* renamed from: c, reason: collision with root package name */
    public final String f132097c;

    public c4(String __typename, String str, String str2) {
        Intrinsics.checkNotNullParameter(__typename, "__typename");
        this.f132095a = __typename;
        this.f132096b = str;
        this.f132097c = str2;
    }

    @Override // z40.z
    public final String a() {
        return this.f132097c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c4)) {
            return false;
        }
        c4 c4Var = (c4) obj;
        return Intrinsics.d(this.f132095a, c4Var.f132095a) && Intrinsics.d(this.f132096b, c4Var.f132096b) && Intrinsics.d(this.f132097c, c4Var.f132097c);
    }

    @Override // z40.z
    public final String getType() {
        return this.f132096b;
    }

    public final int hashCode() {
        int hashCode = this.f132095a.hashCode() * 31;
        String str = this.f132096b;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f132097c;
        return hashCode2 + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("Embed(__typename=");
        sb3.append(this.f132095a);
        sb3.append(", type=");
        sb3.append(this.f132096b);
        sb3.append(", src=");
        return a.a.p(sb3, this.f132097c, ")");
    }
}
