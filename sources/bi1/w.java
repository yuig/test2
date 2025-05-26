package bi1;

import h32.f1;
import h32.g0;
import h32.u0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class w implements y {

    /* renamed from: a, reason: collision with root package name */
    public final String f22882a;

    /* renamed from: b, reason: collision with root package name */
    public final f1 f22883b;

    /* renamed from: c, reason: collision with root package name */
    public final u0 f22884c;

    /* renamed from: d, reason: collision with root package name */
    public final g0 f22885d;

    public w(String pinId, f1 eventType, u0 u0Var, g0 g0Var, int i13) {
        eventType = (i13 & 2) != 0 ? f1.TAP : eventType;
        u0Var = (i13 & 4) != 0 ? null : u0Var;
        g0Var = (i13 & 8) != 0 ? null : g0Var;
        Intrinsics.checkNotNullParameter(pinId, "pinId");
        Intrinsics.checkNotNullParameter(eventType, "eventType");
        this.f22882a = pinId;
        this.f22883b = eventType;
        this.f22884c = u0Var;
        this.f22885d = g0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof w)) {
            return false;
        }
        w wVar = (w) obj;
        return Intrinsics.d(this.f22882a, wVar.f22882a) && this.f22883b == wVar.f22883b && this.f22884c == wVar.f22884c && this.f22885d == wVar.f22885d;
    }

    public final int hashCode() {
        int hashCode = (this.f22883b.hashCode() + (this.f22882a.hashCode() * 31)) * 31;
        u0 u0Var = this.f22884c;
        int hashCode2 = (hashCode + (u0Var == null ? 0 : u0Var.hashCode())) * 31;
        g0 g0Var = this.f22885d;
        return hashCode2 + (g0Var != null ? g0Var.hashCode() : 0);
    }

    public final String toString() {
        return "TrackUserAction(pinId=" + this.f22882a + ", eventType=" + this.f22883b + ", elementType=" + this.f22884c + ", componentType=" + this.f22885d + ")";
    }
}
