package x40;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class f2 implements z40.z {

    /* renamed from: a, reason: collision with root package name */
    public final String f132370a;

    /* renamed from: b, reason: collision with root package name */
    public final String f132371b;

    /* renamed from: c, reason: collision with root package name */
    public final String f132372c;

    public f2(String __typename, String str, String str2) {
        Intrinsics.checkNotNullParameter(__typename, "__typename");
        this.f132370a = __typename;
        this.f132371b = str;
        this.f132372c = str2;
    }

    @Override // z40.z
    public final String a() {
        return this.f132372c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f2)) {
            return false;
        }
        f2 f2Var = (f2) obj;
        return Intrinsics.d(this.f132370a, f2Var.f132370a) && Intrinsics.d(this.f132371b, f2Var.f132371b) && Intrinsics.d(this.f132372c, f2Var.f132372c);
    }

    @Override // z40.z
    public final String getType() {
        return this.f132371b;
    }

    public final int hashCode() {
        int hashCode = this.f132370a.hashCode() * 31;
        String str = this.f132371b;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f132372c;
        return hashCode2 + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("Embed(__typename=");
        sb3.append(this.f132370a);
        sb3.append(", type=");
        sb3.append(this.f132371b);
        sb3.append(", src=");
        return a.a.p(sb3, this.f132372c, ")");
    }
}
