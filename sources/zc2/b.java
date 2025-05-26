package zc2;

import kotlin.jvm.internal.Intrinsics;
import u50.f0;
import u50.i0;
import u50.k0;

/* loaded from: classes4.dex */
public final class b implements u50.o {

    /* renamed from: a, reason: collision with root package name */
    public final i0 f141615a;

    /* renamed from: b, reason: collision with root package name */
    public final k0 f141616b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f141617c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f141618d;

    public b(i0 i0Var, k0 k0Var, boolean z13, boolean z14) {
        this.f141615a = i0Var;
        this.f141616b = k0Var;
        this.f141617c = z13;
        this.f141618d = z14;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v2, types: [u50.i0] */
    public static b e(b bVar, f0 f0Var, k0 k0Var, boolean z13, boolean z14, int i13) {
        f0 f0Var2 = f0Var;
        if ((i13 & 1) != 0) {
            f0Var2 = bVar.f141615a;
        }
        if ((i13 & 2) != 0) {
            k0Var = bVar.f141616b;
        }
        if ((i13 & 4) != 0) {
            z13 = bVar.f141617c;
        }
        if ((i13 & 8) != 0) {
            z14 = bVar.f141618d;
        }
        bVar.getClass();
        return new b(f0Var2, k0Var, z13, z14);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return Intrinsics.d(this.f141615a, bVar.f141615a) && Intrinsics.d(this.f141616b, bVar.f141616b) && this.f141617c == bVar.f141617c && this.f141618d == bVar.f141618d;
    }

    public final int hashCode() {
        i0 i0Var = this.f141615a;
        int hashCode = (i0Var == null ? 0 : i0Var.hashCode()) * 31;
        k0 k0Var = this.f141616b;
        return Boolean.hashCode(this.f141618d) + ep.b.e(this.f141617c, (hashCode + (k0Var != null ? k0Var.hashCode() : 0)) * 31, 31);
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("WidgetBoardConfigurationDisplayState(boardSubText=");
        sb3.append(this.f141615a);
        sb3.append(", refreshSubText=");
        sb3.append(this.f141616b);
        sb3.append(", saveEnabled=");
        sb3.append(this.f141617c);
        sb3.append(", showLoading=");
        return a.a.r(sb3, this.f141618d, ")");
    }
}
