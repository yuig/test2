package x40;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class d0 {

    /* renamed from: a, reason: collision with root package name */
    public final String f132202a;

    public d0(String entityId) {
        Intrinsics.checkNotNullParameter(entityId, "entityId");
        this.f132202a = entityId;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof d0) && Intrinsics.d(this.f132202a, ((d0) obj).f132202a);
    }

    public final int hashCode() {
        return this.f132202a.hashCode();
    }

    public final String toString() {
        return a.a.p(new StringBuilder("Thread(entityId="), this.f132202a, ")");
    }
}
