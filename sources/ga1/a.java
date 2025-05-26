package ga1;

import com.pinterest.api.model.wy0;
import kotlin.jvm.internal.Intrinsics;
import u50.k0;
import zy.a0;

/* loaded from: classes5.dex */
public final class a implements u50.o {

    /* renamed from: a, reason: collision with root package name */
    public final a0 f64612a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f64613b;

    /* renamed from: c, reason: collision with root package name */
    public final wy0 f64614c;

    /* renamed from: d, reason: collision with root package name */
    public final k0 f64615d;

    public a(a0 pinalyticsDisplayState, boolean z13, wy0 wy0Var, k0 k0Var) {
        Intrinsics.checkNotNullParameter(pinalyticsDisplayState, "pinalyticsDisplayState");
        this.f64612a = pinalyticsDisplayState;
        this.f64613b = z13;
        this.f64614c = wy0Var;
        this.f64615d = k0Var;
    }

    public static a e(a aVar, a0 pinalyticsDisplayState, boolean z13, wy0 wy0Var, int i13) {
        if ((i13 & 1) != 0) {
            pinalyticsDisplayState = aVar.f64612a;
        }
        if ((i13 & 2) != 0) {
            z13 = aVar.f64613b;
        }
        if ((i13 & 4) != 0) {
            wy0Var = aVar.f64614c;
        }
        k0 k0Var = aVar.f64615d;
        aVar.getClass();
        Intrinsics.checkNotNullParameter(pinalyticsDisplayState, "pinalyticsDisplayState");
        return new a(pinalyticsDisplayState, z13, wy0Var, k0Var);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return Intrinsics.d(this.f64612a, aVar.f64612a) && this.f64613b == aVar.f64613b && Intrinsics.d(this.f64614c, aVar.f64614c) && Intrinsics.d(this.f64615d, aVar.f64615d);
    }

    public final int hashCode() {
        int e13 = ep.b.e(this.f64613b, this.f64612a.hashCode() * 31, 31);
        wy0 wy0Var = this.f64614c;
        int hashCode = (e13 + (wy0Var == null ? 0 : wy0Var.hashCode())) * 31;
        k0 k0Var = this.f64615d;
        return hashCode + (k0Var != null ? k0Var.hashCode() : 0);
    }

    public final String toString() {
        return "ClaimSuccessDisplayState(pinalyticsDisplayState=" + this.f64612a + ", isLoading=" + this.f64613b + ", user=" + this.f64614c + ", actionButtonStringRes=" + this.f64615d + ")";
    }
}
