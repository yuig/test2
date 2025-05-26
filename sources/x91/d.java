package x91;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class d implements j {

    /* renamed from: a, reason: collision with root package name */
    public final zb0.f f134312a;

    public d(zb0.f action) {
        Intrinsics.checkNotNullParameter(action, "action");
        this.f134312a = action;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof d) && Intrinsics.d(this.f134312a, ((d) obj).f134312a);
    }

    public final int hashCode() {
        return this.f134312a.hashCode();
    }

    public final String toString() {
        return "UnblockAlertEvent(action=" + this.f134312a + ")";
    }
}
