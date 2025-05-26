package x40;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class s5 {

    /* renamed from: a, reason: collision with root package name */
    public final String f133238a;

    public s5(String entityId) {
        Intrinsics.checkNotNullParameter(entityId, "entityId");
        this.f133238a = entityId;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof s5) && Intrinsics.d(this.f133238a, ((s5) obj).f133238a);
    }

    public final int hashCode() {
        return this.f133238a.hashCode();
    }

    public final String toString() {
        return a.a.p(new StringBuilder("Data(entityId="), this.f133238a, ")");
    }
}
