package y30;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class b implements d, z40.b {

    /* renamed from: d, reason: collision with root package name */
    public final String f136735d;

    /* renamed from: e, reason: collision with root package name */
    public final a f136736e;

    public b(String __typename, a error) {
        Intrinsics.checkNotNullParameter(__typename, "__typename");
        Intrinsics.checkNotNullParameter(error, "error");
        this.f136735d = __typename;
        this.f136736e = error;
    }

    @Override // z40.b
    public final z40.a a() {
        return this.f136736e;
    }

    @Override // z40.b
    public final String b() {
        return this.f136735d;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return Intrinsics.d(this.f136735d, bVar.f136735d) && Intrinsics.d(this.f136736e, bVar.f136736e);
    }

    public final int hashCode() {
        return this.f136736e.hashCode() + (this.f136735d.hashCode() * 31);
    }

    public final String toString() {
        return "ErrorV3RecommendedTodayArticlesQuery(__typename=" + this.f136735d + ", error=" + this.f136736e + ")";
    }
}
