package ay1;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class i0 implements k0 {

    /* renamed from: a, reason: collision with root package name */
    public final jw1.b f20675a;

    public i0(wx1.b adapter) {
        Intrinsics.checkNotNullParameter(adapter, "adapter");
        this.f20675a = adapter;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof i0) && Intrinsics.d(this.f20675a, ((i0) obj).f20675a);
    }

    public final int hashCode() {
        return this.f20675a.hashCode();
    }

    public final String toString() {
        return "Success(adapter=" + this.f20675a + ")";
    }
}
