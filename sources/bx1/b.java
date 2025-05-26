package bx1;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class b implements d {

    /* renamed from: a, reason: collision with root package name */
    public final yw1.d f24101a;

    public b(yw1.d adapter) {
        Intrinsics.checkNotNullParameter(adapter, "adapter");
        this.f24101a = adapter;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof b) && Intrinsics.d(this.f24101a, ((b) obj).f24101a);
    }

    public final int hashCode() {
        return this.f24101a.hashCode();
    }

    public final String toString() {
        return "Loaded(adapter=" + this.f24101a + ")";
    }
}
