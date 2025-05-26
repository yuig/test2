package yx1;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class r extends f0.h {

    /* renamed from: b, reason: collision with root package name */
    public final cy1.d f140407b;

    public r(cy1.d pinStats) {
        Intrinsics.checkNotNullParameter(pinStats, "pinStats");
        this.f140407b = pinStats;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof r) && Intrinsics.d(this.f140407b, ((r) obj).f140407b);
    }

    public final int hashCode() {
        return this.f140407b.hashCode();
    }

    public final cy1.d t0() {
        return this.f140407b;
    }

    public final String toString() {
        return "Success(pinStats=" + this.f140407b + ")";
    }
}
