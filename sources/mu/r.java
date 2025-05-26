package mu;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class r implements n {

    /* renamed from: a, reason: collision with root package name */
    public final String f88236a;

    public r(String pinId) {
        Intrinsics.checkNotNullParameter(pinId, "pinId");
        this.f88236a = pinId;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof r) && Intrinsics.d(this.f88236a, ((r) obj).f88236a);
    }

    public final int hashCode() {
        return this.f88236a.hashCode();
    }

    public final String toString() {
        return a.a.p(new StringBuilder("PostCarouselDraggingEvent(pinId="), this.f88236a, ")");
    }
}
