package hw1;

import kotlin.jvm.internal.Intrinsics;
import l82.i0;
import zy.l0;

/* loaded from: classes4.dex */
public final class u implements i0 {

    /* renamed from: a, reason: collision with root package name */
    public final l0 f70492a;

    public u() {
        l0 pinalyticsVMState = new l0((h32.i0) null, 3);
        Intrinsics.checkNotNullParameter(pinalyticsVMState, "pinalyticsVMState");
        this.f70492a = pinalyticsVMState;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof u) && Intrinsics.d(this.f70492a, ((u) obj).f70492a);
    }

    public final int hashCode() {
        return this.f70492a.hashCode();
    }

    public final String toString() {
        return "ProductTagsVMState(pinalyticsVMState=" + this.f70492a + ")";
    }
}
