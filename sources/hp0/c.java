package hp0;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class c implements h {

    /* renamed from: a, reason: collision with root package name */
    public final lp0.c f69825a;

    public c(lp0.c swipeType) {
        Intrinsics.checkNotNullParameter(swipeType, "swipeType");
        this.f69825a = swipeType;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof c) && this.f69825a == ((c) obj).f69825a;
    }

    public final int hashCode() {
        return this.f69825a.hashCode();
    }

    public final String toString() {
        return "CarouselSwipe(swipeType=" + this.f69825a + ")";
    }
}
