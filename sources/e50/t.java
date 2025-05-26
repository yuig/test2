package e50;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class t {

    /* renamed from: a, reason: collision with root package name */
    public final s f57420a;

    /* renamed from: b, reason: collision with root package name */
    public final Double f57421b;

    public t(s sVar, Double d2) {
        this.f57420a = sVar;
        this.f57421b = d2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof t)) {
            return false;
        }
        t tVar = (t) obj;
        return Intrinsics.d(this.f57420a, tVar.f57420a) && Intrinsics.d(this.f57421b, tVar.f57421b);
    }

    public final int hashCode() {
        s sVar = this.f57420a;
        int hashCode = (sVar == null ? 0 : sVar.hashCode()) * 31;
        Double d2 = this.f57421b;
        return hashCode + (d2 != null ? d2.hashCode() : 0);
    }

    public final String toString() {
        return "DisplayOptions(headerDisplay=" + this.f57420a + ", cornerRadius=" + this.f57421b + ")";
    }
}
