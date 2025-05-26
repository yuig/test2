package o82;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class j0 implements l82.i0 {

    /* renamed from: a, reason: collision with root package name */
    public final List f93634a;

    public j0(List vmStates) {
        Intrinsics.checkNotNullParameter(vmStates, "vmStates");
        this.f93634a = vmStates;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof j0) && Intrinsics.d(this.f93634a, ((j0) obj).f93634a);
    }

    public final int hashCode() {
        return this.f93634a.hashCode();
    }

    public final String toString() {
        return a.c.j(new StringBuilder("MultiSectionVMState(vmStates="), this.f93634a, ")");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public j0(i2 sectionVMState) {
        this(kotlin.collections.e0.b(sectionVMState));
        Intrinsics.checkNotNullParameter(sectionVMState, "sectionVMState");
    }

    public j0() {
        this(kotlin.collections.q0.f80391a);
    }
}
