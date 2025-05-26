package ct0;

import kotlin.jvm.internal.Intrinsics;
import l82.i0;
import o82.j0;

/* loaded from: classes5.dex */
public final class z implements i0 {

    /* renamed from: a, reason: collision with root package name */
    public final j0 f53173a;

    public z(j0 multiSectionVMState) {
        Intrinsics.checkNotNullParameter(multiSectionVMState, "multiSectionVMState");
        this.f53173a = multiSectionVMState;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof z) && Intrinsics.d(this.f53173a, ((z) obj).f53173a);
    }

    public final int hashCode() {
        return this.f53173a.f93634a.hashCode();
    }

    public final String toString() {
        return "SbaHftInterestsTabVMState(multiSectionVMState=" + this.f53173a + ")";
    }
}
