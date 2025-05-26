package rf1;

import java.util.HashMap;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class v0 {

    /* renamed from: a, reason: collision with root package name */
    public final h32.g0 f107918a;

    /* renamed from: b, reason: collision with root package name */
    public final h32.g0 f107919b;

    /* renamed from: c, reason: collision with root package name */
    public final HashMap f107920c;

    public v0() {
        HashMap auxData = new HashMap();
        Intrinsics.checkNotNullParameter(auxData, "auxData");
        this.f107918a = null;
        this.f107919b = null;
        this.f107920c = auxData;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof v0)) {
            return false;
        }
        v0 v0Var = (v0) obj;
        return this.f107918a == v0Var.f107918a && this.f107919b == v0Var.f107919b && Intrinsics.d(this.f107920c, v0Var.f107920c);
    }

    public final int hashCode() {
        h32.g0 g0Var = this.f107918a;
        int hashCode = (g0Var == null ? 0 : g0Var.hashCode()) * 31;
        h32.g0 g0Var2 = this.f107919b;
        return this.f107920c.hashCode() + ((hashCode + (g0Var2 != null ? g0Var2.hashCode() : 0)) * 31);
    }

    public final String toString() {
        return "StoryPinUserActionLogging(goToProfileActionComponent=" + this.f107918a + ", followActionComponent=" + this.f107919b + ", auxData=" + this.f107920c + ")";
    }
}
