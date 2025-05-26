package b40;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class b implements e, z40.b {

    /* renamed from: d, reason: collision with root package name */
    public final String f21687d;

    /* renamed from: e, reason: collision with root package name */
    public final a f21688e;

    public b(String __typename, a error) {
        Intrinsics.checkNotNullParameter(__typename, "__typename");
        Intrinsics.checkNotNullParameter(error, "error");
        this.f21687d = __typename;
        this.f21688e = error;
    }

    @Override // z40.b
    public final z40.a a() {
        return this.f21688e;
    }

    @Override // z40.b
    public final String b() {
        return this.f21687d;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return Intrinsics.d(this.f21687d, bVar.f21687d) && Intrinsics.d(this.f21688e, bVar.f21688e);
    }

    public final int hashCode() {
        return this.f21688e.hashCode() + (this.f21687d.hashCode() * 31);
    }

    public final String toString() {
        return "ErrorV3DeleteNewsHubBadgeMutation(__typename=" + this.f21687d + ", error=" + this.f21688e + ")";
    }
}
