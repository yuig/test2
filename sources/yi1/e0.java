package yi1;

import h32.d4;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class e0 implements f0 {

    /* renamed from: a, reason: collision with root package name */
    public final d4 f139086a;

    /* renamed from: b, reason: collision with root package name */
    public final q8.c0 f139087b;

    public e0(d4 viewType) {
        q8.c0 perfEventTime = new q8.c0(1);
        Intrinsics.checkNotNullParameter(viewType, "viewType");
        Intrinsics.checkNotNullParameter(perfEventTime, "perfEventTime");
        this.f139086a = viewType;
        this.f139087b = perfEventTime;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e0)) {
            return false;
        }
        e0 e0Var = (e0) obj;
        return this.f139086a == e0Var.f139086a && Intrinsics.d(this.f139087b, e0Var.f139087b);
    }

    public final int hashCode() {
        return this.f139087b.hashCode() + (this.f139086a.hashCode() * 31);
    }

    public final d4 j() {
        return this.f139086a;
    }

    public final String toString() {
        return "PreImageLoadStart(viewType=" + this.f139086a + ", perfEventTime=" + this.f139087b + ")";
    }
}
