package u40;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class b implements e, z40.b {

    /* renamed from: d, reason: collision with root package name */
    public final String f120293d;

    /* renamed from: e, reason: collision with root package name */
    public final a f120294e;

    public b(String __typename, a error) {
        Intrinsics.checkNotNullParameter(__typename, "__typename");
        Intrinsics.checkNotNullParameter(error, "error");
        this.f120293d = __typename;
        this.f120294e = error;
    }

    @Override // z40.b
    public final z40.a a() {
        return this.f120294e;
    }

    @Override // z40.b
    public final String b() {
        return this.f120293d;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return Intrinsics.d(this.f120293d, bVar.f120293d) && Intrinsics.d(this.f120294e, bVar.f120294e);
    }

    public final int hashCode() {
        return this.f120294e.hashCode() + (this.f120293d.hashCode() * 31);
    }

    public final String toString() {
        return "ErrorV3EditSettingsHandlerResponse(__typename=" + this.f120293d + ", error=" + this.f120294e + ")";
    }
}
