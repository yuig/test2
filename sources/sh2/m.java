package sh2;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class m {

    /* renamed from: a, reason: collision with root package name */
    public final String f112992a;

    /* renamed from: b, reason: collision with root package name */
    public String f112993b;

    /* renamed from: c, reason: collision with root package name */
    public String f112994c;

    public m(String instrumentationScopeName) {
        Intrinsics.checkNotNullParameter(instrumentationScopeName, "instrumentationScopeName");
        this.f112992a = instrumentationScopeName;
        this.f112993b = null;
        this.f112994c = null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof m)) {
            return false;
        }
        m mVar = (m) obj;
        return Intrinsics.d(this.f112992a, mVar.f112992a) && Intrinsics.d(this.f112993b, mVar.f112993b) && Intrinsics.d(this.f112994c, mVar.f112994c);
    }

    public final int hashCode() {
        int hashCode = this.f112992a.hashCode() * 31;
        String str = this.f112993b;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f112994c;
        return hashCode2 + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("TracerKey(instrumentationScopeName=");
        sb3.append(this.f112992a);
        sb3.append(", instrumentationScopeVersion=");
        sb3.append(this.f112993b);
        sb3.append(", schemaUrl=");
        return ep.b.k(sb3, this.f112994c, ')');
    }
}
