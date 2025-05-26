package om0;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class w0 {

    /* renamed from: c, reason: collision with root package name */
    public static final w0 f96611c = new w0(u0.f96603c, s0.f96587c);

    /* renamed from: a, reason: collision with root package name */
    public final u0 f96612a;

    /* renamed from: b, reason: collision with root package name */
    public final s0 f96613b;

    public w0(u0 gridEvents, s0 carouselEvents) {
        Intrinsics.checkNotNullParameter(gridEvents, "gridEvents");
        Intrinsics.checkNotNullParameter(carouselEvents, "carouselEvents");
        this.f96612a = gridEvents;
        this.f96613b = carouselEvents;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof w0)) {
            return false;
        }
        w0 w0Var = (w0) obj;
        return Intrinsics.d(this.f96612a, w0Var.f96612a) && Intrinsics.d(this.f96613b, w0Var.f96613b);
    }

    public final int hashCode() {
        return this.f96613b.hashCode() + (this.f96612a.hashCode() * 31);
    }

    public final String toString() {
        return "SavedContentModuleEvents(gridEvents=" + this.f96612a + ", carouselEvents=" + this.f96613b + ")";
    }
}
