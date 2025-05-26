package x40;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class a6 {

    /* renamed from: a, reason: collision with root package name */
    public final String f131916a;

    public a6(String entityId) {
        Intrinsics.checkNotNullParameter(entityId, "entityId");
        this.f131916a = entityId;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof a6) && Intrinsics.d(this.f131916a, ((a6) obj).f131916a);
    }

    public final int hashCode() {
        return this.f131916a.hashCode();
    }

    public final String toString() {
        return a.a.p(new StringBuilder("Thread(entityId="), this.f131916a, ")");
    }
}
