package g30;

import kotlin.jvm.internal.Intrinsics;
import pc.i0;

/* loaded from: classes2.dex */
public final class t implements i0 {

    /* renamed from: a, reason: collision with root package name */
    public final s f63439a;

    public t(s sVar) {
        this.f63439a = sVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof t) && Intrinsics.d(this.f63439a, ((t) obj).f63439a);
    }

    public final int hashCode() {
        s sVar = this.f63439a;
        if (sVar == null) {
            return 0;
        }
        return sVar.hashCode();
    }

    public final String toString() {
        return "Data(v3ResendUserEmailMutation=" + this.f63439a + ")";
    }
}
