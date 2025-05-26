package k51;

import kotlin.jvm.internal.Intrinsics;
import l82.i0;
import zy.l0;

/* loaded from: classes5.dex */
public final class v implements i0 {

    /* renamed from: a, reason: collision with root package name */
    public final n f78338a;

    /* renamed from: b, reason: collision with root package name */
    public final b22.l f78339b;

    /* renamed from: c, reason: collision with root package name */
    public final l0 f78340c;

    public v(n appearance, b22.l currentlyPersistedViewType, l0 pinalyticsVMState) {
        Intrinsics.checkNotNullParameter(appearance, "appearance");
        Intrinsics.checkNotNullParameter(currentlyPersistedViewType, "currentlyPersistedViewType");
        Intrinsics.checkNotNullParameter(pinalyticsVMState, "pinalyticsVMState");
        this.f78338a = appearance;
        this.f78339b = currentlyPersistedViewType;
        this.f78340c = pinalyticsVMState;
    }

    public static v b(v vVar, n appearance, b22.l currentlyPersistedViewType, l0 pinalyticsVMState, int i13) {
        if ((i13 & 1) != 0) {
            appearance = vVar.f78338a;
        }
        if ((i13 & 2) != 0) {
            currentlyPersistedViewType = vVar.f78339b;
        }
        if ((i13 & 4) != 0) {
            pinalyticsVMState = vVar.f78340c;
        }
        vVar.getClass();
        Intrinsics.checkNotNullParameter(appearance, "appearance");
        Intrinsics.checkNotNullParameter(currentlyPersistedViewType, "currentlyPersistedViewType");
        Intrinsics.checkNotNullParameter(pinalyticsVMState, "pinalyticsVMState");
        return new v(appearance, currentlyPersistedViewType, pinalyticsVMState);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof v)) {
            return false;
        }
        v vVar = (v) obj;
        return this.f78338a == vVar.f78338a && this.f78339b == vVar.f78339b && Intrinsics.d(this.f78340c, vVar.f78340c);
    }

    public final int hashCode() {
        return this.f78340c.hashCode() + ((this.f78339b.hashCode() + (this.f78338a.hashCode() * 31)) * 31);
    }

    public final String toString() {
        return "ViewOptionsVMState(appearance=" + this.f78338a + ", currentlyPersistedViewType=" + this.f78339b + ", pinalyticsVMState=" + this.f78340c + ")";
    }

    public /* synthetic */ v(b22.l lVar, int i13) {
        this(n.SEARCH_BAR, (i13 & 2) != 0 ? b22.l.COMPACT : lVar, new l0((h32.i0) null, 3));
    }
}
