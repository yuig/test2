package yi1;

import h32.e4;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class a0 implements f0 {

    /* renamed from: a, reason: collision with root package name */
    public final e4 f139070a;

    public a0(e4 visibleEvent) {
        Intrinsics.checkNotNullParameter(visibleEvent, "visibleEvent");
        this.f139070a = visibleEvent;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof a0) && Intrinsics.d(this.f139070a, ((a0) obj).f139070a);
    }

    public final int hashCode() {
        return this.f139070a.hashCode();
    }

    public final String toString() {
        return "OnVisibilityEventAdded(visibleEvent=" + this.f139070a + ")";
    }
}
