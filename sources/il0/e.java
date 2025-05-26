package il0;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class e implements f {

    /* renamed from: a, reason: collision with root package name */
    public final tk0.q f72529a;

    public e(tk0.q innerEvent) {
        Intrinsics.checkNotNullParameter(innerEvent, "innerEvent");
        this.f72529a = innerEvent;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof e) && Intrinsics.d(this.f72529a, ((e) obj).f72529a);
    }

    public final int hashCode() {
        return this.f72529a.hashCode();
    }

    public final String toString() {
        return "WrappedOrganizeFloatingToolbarEvent(innerEvent=" + this.f72529a + ")";
    }
}
