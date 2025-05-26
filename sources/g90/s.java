package g90;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class s implements v {

    /* renamed from: a, reason: collision with root package name */
    public final String f64563a;

    public s(String collageId) {
        Intrinsics.checkNotNullParameter(collageId, "collageId");
        this.f64563a = collageId;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof s) && Intrinsics.d(this.f64563a, ((s) obj).f64563a);
    }

    public final int hashCode() {
        return this.f64563a.hashCode();
    }

    public final String toString() {
        return a.a.p(new StringBuilder("LoadCutouts(collageId="), this.f64563a, ")");
    }
}
