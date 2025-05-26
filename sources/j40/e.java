package j40;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class e implements d {

    /* renamed from: d, reason: collision with root package name */
    public final String f74600d;

    public e(String __typename) {
        Intrinsics.checkNotNullParameter(__typename, "__typename");
        this.f74600d = __typename;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof e) && Intrinsics.d(this.f74600d, ((e) obj).f74600d);
    }

    public final int hashCode() {
        return this.f74600d.hashCode();
    }

    public final String toString() {
        return a.a.p(new StringBuilder("V3OrientationSignalsV3OrientationSignalsMutation(__typename="), this.f74600d, ")");
    }
}
