package p30;

import kotlin.jvm.internal.Intrinsics;
import pc.i0;

/* loaded from: classes2.dex */
public final class m implements i0 {

    /* renamed from: a, reason: collision with root package name */
    public final l f98744a;

    public m(l lVar) {
        this.f98744a = lVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof m) && Intrinsics.d(this.f98744a, ((m) obj).f98744a);
    }

    public final int hashCode() {
        l lVar = this.f98744a;
        if (lVar == null) {
            return 0;
        }
        return lVar.hashCode();
    }

    public final String toString() {
        return "Data(v3EmailFollowUserMutation=" + this.f98744a + ")";
    }
}
