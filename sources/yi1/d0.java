package yi1;

import h32.d4;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class d0 implements f0 {

    /* renamed from: a, reason: collision with root package name */
    public final d4 f139079a;

    /* renamed from: b, reason: collision with root package name */
    public final q8.c0 f139080b;

    public d0(d4 viewType) {
        q8.c0 perfEventTime = new q8.c0(1);
        Intrinsics.checkNotNullParameter(viewType, "viewType");
        Intrinsics.checkNotNullParameter(perfEventTime, "perfEventTime");
        this.f139079a = viewType;
        this.f139080b = perfEventTime;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d0)) {
            return false;
        }
        d0 d0Var = (d0) obj;
        return this.f139079a == d0Var.f139079a && Intrinsics.d(this.f139080b, d0Var.f139080b);
    }

    public final int hashCode() {
        return this.f139080b.hashCode() + (this.f139079a.hashCode() * 31);
    }

    public final String toString() {
        return "PostImageLoadStarted(viewType=" + this.f139079a + ", perfEventTime=" + this.f139080b + ")";
    }
}
