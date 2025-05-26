package wa2;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class z {

    /* renamed from: a, reason: collision with root package name */
    public final Function1 f128963a;

    public z(pe1.n onOverlayClicked) {
        Intrinsics.checkNotNullParameter(onOverlayClicked, "onOverlayClicked");
        this.f128963a = onOverlayClicked;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof z) && Intrinsics.d(this.f128963a, ((z) obj).f128963a);
    }

    public final int hashCode() {
        return this.f128963a.hashCode();
    }

    public final String toString() {
        return "PinSaveOverlayActionOverride(onOverlayClicked=" + this.f128963a + ")";
    }
}
