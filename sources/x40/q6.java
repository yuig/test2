package x40;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class q6 {

    /* renamed from: a, reason: collision with root package name */
    public final String f133107a;

    public q6(String entityId) {
        Intrinsics.checkNotNullParameter(entityId, "entityId");
        this.f133107a = entityId;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof q6) && Intrinsics.d(this.f133107a, ((q6) obj).f133107a);
    }

    public final int hashCode() {
        return this.f133107a.hashCode();
    }

    public final String toString() {
        return a.a.p(new StringBuilder("Data(entityId="), this.f133107a, ")");
    }
}
