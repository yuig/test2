package g30;

import kotlin.jvm.internal.Intrinsics;
import pc.i0;

/* loaded from: classes2.dex */
public final class m implements i0 {

    /* renamed from: a, reason: collision with root package name */
    public final l f63430a;

    public m(l lVar) {
        this.f63430a = lVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof m) && Intrinsics.d(this.f63430a, ((m) obj).f63430a);
    }

    public final int hashCode() {
        l lVar = this.f63430a;
        if (lVar == null) {
            return 0;
        }
        return lVar.hashCode();
    }

    public final String toString() {
        return "Data(v3RemoveDeviceTokenMutation=" + this.f63430a + ")";
    }
}
