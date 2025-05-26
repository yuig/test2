package gk1;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class j implements k {

    /* renamed from: a, reason: collision with root package name */
    public final oi1.u f65235a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f65236b;

    public j(oi1.u piece, boolean z13) {
        Intrinsics.checkNotNullParameter(piece, "piece");
        this.f65235a = piece;
        this.f65236b = z13;
    }

    public final boolean a() {
        return this.f65236b;
    }

    public final oi1.u b() {
        return this.f65235a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j)) {
            return false;
        }
        j jVar = (j) obj;
        return Intrinsics.d(this.f65235a, jVar.f65235a) && this.f65236b == jVar.f65236b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f65236b) + (this.f65235a.hashCode() * 31);
    }

    public final String toString() {
        return "SinglePiece(piece=" + this.f65235a + ", bringToForeground=" + this.f65236b + ")";
    }
}
