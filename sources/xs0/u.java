package xs0;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class u implements v {

    /* renamed from: a, reason: collision with root package name */
    public final k92.h f135842a;

    public u(k92.h wrapped) {
        Intrinsics.checkNotNullParameter(wrapped, "wrapped");
        this.f135842a = wrapped;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof u) && Intrinsics.d(this.f135842a, ((u) obj).f135842a);
    }

    public final int hashCode() {
        return this.f135842a.hashCode();
    }

    public final String toString() {
        return "WrappedToastEvent(wrapped=" + this.f135842a + ")";
    }
}
