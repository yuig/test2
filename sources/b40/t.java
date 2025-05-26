package b40;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class t implements e0, z40.b {

    /* renamed from: d, reason: collision with root package name */
    public final String f21746d;

    /* renamed from: e, reason: collision with root package name */
    public final s f21747e;

    public t(String __typename, s error) {
        Intrinsics.checkNotNullParameter(__typename, "__typename");
        Intrinsics.checkNotNullParameter(error, "error");
        this.f21746d = __typename;
        this.f21747e = error;
    }

    @Override // z40.b
    public final z40.a a() {
        return this.f21747e;
    }

    @Override // z40.b
    public final String b() {
        return this.f21746d;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof t)) {
            return false;
        }
        t tVar = (t) obj;
        return Intrinsics.d(this.f21746d, tVar.f21746d) && Intrinsics.d(this.f21747e, tVar.f21747e);
    }

    public final int hashCode() {
        return this.f21747e.hashCode() + (this.f21746d.hashCode() * 31);
    }

    public final String toString() {
        return "ErrorV3GetNewsSummaryQuery(__typename=" + this.f21746d + ", error=" + this.f21747e + ")";
    }
}
