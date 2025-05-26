package sa0;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class a0 implements b0 {

    /* renamed from: a, reason: collision with root package name */
    public final String f112159a;

    public a0(String sourceId) {
        Intrinsics.checkNotNullParameter(sourceId, "sourceId");
        this.f112159a = sourceId;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof a0) && Intrinsics.d(this.f112159a, ((a0) obj).f112159a);
    }

    public final int hashCode() {
        return this.f112159a.hashCode();
    }

    public final String toString() {
        return a.a.p(new StringBuilder("Pin(sourceId="), this.f112159a, ")");
    }
}
