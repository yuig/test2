package g30;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class p implements s, z40.b {

    /* renamed from: d, reason: collision with root package name */
    public final String f63435d;

    /* renamed from: e, reason: collision with root package name */
    public final o f63436e;

    public p(String __typename, o error) {
        Intrinsics.checkNotNullParameter(__typename, "__typename");
        Intrinsics.checkNotNullParameter(error, "error");
        this.f63435d = __typename;
        this.f63436e = error;
    }

    @Override // z40.b
    public final z40.a a() {
        return this.f63436e;
    }

    @Override // z40.b
    public final String b() {
        return this.f63435d;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof p)) {
            return false;
        }
        p pVar = (p) obj;
        return Intrinsics.d(this.f63435d, pVar.f63435d) && Intrinsics.d(this.f63436e, pVar.f63436e);
    }

    public final int hashCode() {
        return this.f63436e.hashCode() + (this.f63435d.hashCode() * 31);
    }

    public final String toString() {
        return "ErrorV3ResendUserEmailMutation(__typename=" + this.f63435d + ", error=" + this.f63436e + ")";
    }
}
