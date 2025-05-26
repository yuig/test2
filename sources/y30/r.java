package y30;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class r implements u, z40.b {

    /* renamed from: d, reason: collision with root package name */
    public final String f136764d;

    /* renamed from: e, reason: collision with root package name */
    public final q f136765e;

    public r(String __typename, q error) {
        Intrinsics.checkNotNullParameter(__typename, "__typename");
        Intrinsics.checkNotNullParameter(error, "error");
        this.f136764d = __typename;
        this.f136765e = error;
    }

    @Override // z40.b
    public final z40.a a() {
        return this.f136765e;
    }

    @Override // z40.b
    public final String b() {
        return this.f136764d;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof r)) {
            return false;
        }
        r rVar = (r) obj;
        return Intrinsics.d(this.f136764d, rVar.f136764d) && Intrinsics.d(this.f136765e, rVar.f136765e);
    }

    public final int hashCode() {
        return this.f136765e.hashCode() + (this.f136764d.hashCode() * 31);
    }

    public final String toString() {
        return "ErrorV3GetUserStateQuery(__typename=" + this.f136764d + ", error=" + this.f136765e + ")";
    }
}
