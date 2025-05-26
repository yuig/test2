package m40;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class b implements d, z40.b {

    /* renamed from: d, reason: collision with root package name */
    public final String f85818d;

    /* renamed from: e, reason: collision with root package name */
    public final a f85819e;

    public b(String __typename, a error) {
        Intrinsics.checkNotNullParameter(__typename, "__typename");
        Intrinsics.checkNotNullParameter(error, "error");
        this.f85818d = __typename;
        this.f85819e = error;
    }

    @Override // z40.b
    public final z40.a a() {
        return this.f85819e;
    }

    @Override // z40.b
    public final String b() {
        return this.f85818d;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return Intrinsics.d(this.f85818d, bVar.f85818d) && Intrinsics.d(this.f85819e, bVar.f85819e);
    }

    public final int hashCode() {
        return this.f85819e.hashCode() + (this.f85818d.hashCode() * 31);
    }

    public final String toString() {
        return "ErrorV3GetCountriesListQuery(__typename=" + this.f85818d + ", error=" + this.f85819e + ")";
    }
}
