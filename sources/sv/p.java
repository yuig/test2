package sv;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class p implements r {

    /* renamed from: a, reason: collision with root package name */
    public final String f115310a;

    public p(String collageId) {
        Intrinsics.checkNotNullParameter(collageId, "collageId");
        this.f115310a = collageId;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof p) && Intrinsics.d(this.f115310a, ((p) obj).f115310a);
    }

    public final int hashCode() {
        return this.f115310a.hashCode();
    }

    public final String toString() {
        return a.a.p(new StringBuilder("LoadCutouts(collageId="), this.f115310a, ")");
    }
}
