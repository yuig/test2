package bt0;

import kotlin.jvm.internal.Intrinsics;
import l82.i0;
import o82.j0;

/* loaded from: classes5.dex */
public final class t implements i0 {

    /* renamed from: a, reason: collision with root package name */
    public final String f23889a;

    /* renamed from: b, reason: collision with root package name */
    public final j0 f23890b;

    public t(String userId, j0 multiSectionVMState) {
        Intrinsics.checkNotNullParameter(userId, "userId");
        Intrinsics.checkNotNullParameter(multiSectionVMState, "multiSectionVMState");
        this.f23889a = userId;
        this.f23890b = multiSectionVMState;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof t)) {
            return false;
        }
        t tVar = (t) obj;
        return Intrinsics.d(this.f23889a, tVar.f23889a) && Intrinsics.d(this.f23890b, tVar.f23890b);
    }

    public final int hashCode() {
        return this.f23890b.f93634a.hashCode() + (this.f23889a.hashCode() * 31);
    }

    public final String toString() {
        return "SbaHftFollowingTabVMState(userId=" + this.f23889a + ", multiSectionVMState=" + this.f23890b + ")";
    }
}
