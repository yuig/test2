package sq0;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class k {

    /* renamed from: a, reason: collision with root package name */
    public final nr0.j f115003a;

    /* renamed from: b, reason: collision with root package name */
    public final int f115004b;

    /* renamed from: c, reason: collision with root package name */
    public final y f115005c;

    public k(nr0.j dataSource, int i13, y scrollDirection) {
        Intrinsics.checkNotNullParameter(dataSource, "dataSource");
        Intrinsics.checkNotNullParameter(scrollDirection, "scrollDirection");
        this.f115003a = dataSource;
        this.f115004b = i13;
        this.f115005c = scrollDirection;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof k)) {
            return false;
        }
        k kVar = (k) obj;
        return Intrinsics.d(this.f115003a, kVar.f115003a) && this.f115004b == kVar.f115004b && this.f115005c == kVar.f115005c;
    }

    public final int hashCode() {
        return this.f115005c.hashCode() + ep.b.b(this.f115004b, this.f115003a.hashCode() * 31, 31);
    }

    public final String toString() {
        return "PendingPrefetch(dataSource=" + this.f115003a + ", position=" + this.f115004b + ", scrollDirection=" + this.f115005c + ")";
    }
}
