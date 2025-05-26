package bx1;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class h implements k {

    /* renamed from: a, reason: collision with root package name */
    public final yw1.d f24106a;

    public h(yw1.d adapter) {
        Intrinsics.checkNotNullParameter(adapter, "adapter");
        this.f24106a = adapter;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof h) && Intrinsics.d(this.f24106a, ((h) obj).f24106a);
    }

    public final int hashCode() {
        return this.f24106a.hashCode();
    }

    public final String toString() {
        return "Loaded(adapter=" + this.f24106a + ")";
    }
}
