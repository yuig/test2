package oq;

import h32.a4;
import h32.d4;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class f0 {

    /* renamed from: a, reason: collision with root package name */
    public final nx.d0 f97030a;

    /* renamed from: b, reason: collision with root package name */
    public final d4 f97031b;

    /* renamed from: c, reason: collision with root package name */
    public final a4 f97032c;

    public f0(nx.d0 d0Var, d4 viewType, a4 a4Var) {
        Intrinsics.checkNotNullParameter(viewType, "viewType");
        this.f97030a = d0Var;
        this.f97031b = viewType;
        this.f97032c = a4Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f0)) {
            return false;
        }
        f0 f0Var = (f0) obj;
        return Intrinsics.d(this.f97030a, f0Var.f97030a) && this.f97031b == f0Var.f97031b && this.f97032c == f0Var.f97032c;
    }

    public final int hashCode() {
        nx.d0 d0Var = this.f97030a;
        int hashCode = (this.f97031b.hashCode() + ((d0Var == null ? 0 : d0Var.hashCode()) * 31)) * 31;
        a4 a4Var = this.f97032c;
        return hashCode + (a4Var != null ? a4Var.hashCode() : 0);
    }

    public final String toString() {
        return "ModuleMetadata(pinalytics=" + this.f97030a + ", viewType=" + this.f97031b + ", viewParameterType=" + this.f97032c + ")";
    }
}
