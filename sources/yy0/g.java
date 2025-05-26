package yy0;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class g implements l {

    /* renamed from: a, reason: collision with root package name */
    public final wb2.c f140457a;

    public g(wb2.c direction) {
        Intrinsics.checkNotNullParameter(direction, "direction");
        this.f140457a = direction;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof g) && this.f140457a == ((g) obj).f140457a;
    }

    public final int hashCode() {
        return this.f140457a.hashCode();
    }

    public final String toString() {
        return "LogSwipe(direction=" + this.f140457a + ")";
    }
}
