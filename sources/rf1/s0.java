package rf1;

import java.util.HashMap;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class s0 {

    /* renamed from: a, reason: collision with root package name */
    public final g4.u f107896a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f107897b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f107898c;

    /* renamed from: d, reason: collision with root package name */
    public final HashMap f107899d;

    public s0(g4.u uVar, boolean z13, boolean z14, HashMap auxData) {
        Intrinsics.checkNotNullParameter(auxData, "auxData");
        this.f107896a = uVar;
        this.f107897b = z13;
        this.f107898c = z14;
        this.f107899d = auxData;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof s0)) {
            return false;
        }
        s0 s0Var = (s0) obj;
        return Intrinsics.d(this.f107896a, s0Var.f107896a) && this.f107897b == s0Var.f107897b && this.f107898c == s0Var.f107898c && Intrinsics.d(this.f107899d, s0Var.f107899d);
    }

    public final int hashCode() {
        g4.u uVar = this.f107896a;
        return this.f107899d.hashCode() + ep.b.e(this.f107898c, ep.b.e(this.f107897b, (uVar == null ? 0 : uVar.hashCode()) * 31, 31), 31);
    }

    public final String toString() {
        return "StoryPinEventLogging(trackingParamOverrides=" + this.f107896a + ", logFullScreenView=" + this.f107897b + ", logTimeSpentAsTopLevelMetric=" + this.f107898c + ", auxData=" + this.f107899d + ")";
    }
}
