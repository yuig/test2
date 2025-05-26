package g30;

import kotlin.jvm.internal.Intrinsics;
import pc.i0;

/* loaded from: classes.dex */
public final class f implements i0 {

    /* renamed from: a, reason: collision with root package name */
    public final e f63419a;

    public f(e eVar) {
        this.f63419a = eVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof f) && Intrinsics.d(this.f63419a, ((f) obj).f63419a);
    }

    public final int hashCode() {
        e eVar = this.f63419a;
        if (eVar == null) {
            return 0;
        }
        return eVar.hashCode();
    }

    public final String toString() {
        return "Data(v3AddDeviceTokenMutation=" + this.f63419a + ")";
    }
}
