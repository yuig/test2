package ay1;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class e implements f {

    /* renamed from: a, reason: collision with root package name */
    public final jw1.b f20663a;

    public e(jw1.b adapter) {
        Intrinsics.checkNotNullParameter(adapter, "adapter");
        this.f20663a = adapter;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof e) && Intrinsics.d(this.f20663a, ((e) obj).f20663a);
    }

    public final int hashCode() {
        return this.f20663a.hashCode();
    }

    public final String toString() {
        return "Success(adapter=" + this.f20663a + ")";
    }
}
