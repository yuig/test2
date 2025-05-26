package e50;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class o implements m, z40.b {

    /* renamed from: d, reason: collision with root package name */
    public final String f57399d;

    /* renamed from: e, reason: collision with root package name */
    public final n f57400e;

    public o(String __typename, n error) {
        Intrinsics.checkNotNullParameter(__typename, "__typename");
        Intrinsics.checkNotNullParameter(error, "error");
        this.f57399d = __typename;
        this.f57400e = error;
    }

    @Override // z40.b
    public final z40.a a() {
        return this.f57400e;
    }

    @Override // z40.b
    public final String b() {
        return this.f57399d;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof o)) {
            return false;
        }
        o oVar = (o) obj;
        return Intrinsics.d(this.f57399d, oVar.f57399d) && Intrinsics.d(this.f57400e, oVar.f57400e);
    }

    public final int hashCode() {
        return this.f57400e.hashCode() + (this.f57399d.hashCode() * 31);
    }

    public final String toString() {
        return "ErrorData(__typename=" + this.f57399d + ", error=" + this.f57400e + ")";
    }
}
