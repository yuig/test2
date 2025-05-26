package sq0;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class o {

    /* renamed from: a, reason: collision with root package name */
    public final e0 f115027a;

    /* renamed from: b, reason: collision with root package name */
    public final int f115028b;

    public o(e0 dataSource, int i13) {
        Intrinsics.checkNotNullParameter(dataSource, "dataSource");
        this.f115027a = dataSource;
        this.f115028b = i13;
    }

    public final e0 a() {
        return this.f115027a;
    }

    public final int b() {
        return this.f115028b;
    }

    public final e0 c() {
        return this.f115027a;
    }

    public final int d() {
        return this.f115028b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof o)) {
            return false;
        }
        o oVar = (o) obj;
        return Intrinsics.d(this.f115027a, oVar.f115027a) && this.f115028b == oVar.f115028b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f115028b) + (this.f115027a.hashCode() * 31);
    }

    public final String toString() {
        return "DataSourceAndPositionOffset(dataSource=" + this.f115027a + ", positionOffset=" + this.f115028b + ")";
    }
}
