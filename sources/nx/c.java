package nx;

import h32.h2;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public final h32.g0 f92379a;

    /* renamed from: b, reason: collision with root package name */
    public final q f92380b;

    /* renamed from: c, reason: collision with root package name */
    public final h32.c1 f92381c;

    /* renamed from: d, reason: collision with root package name */
    public final h2 f92382d;

    public /* synthetic */ c(h32.g0 g0Var, q qVar, h32.c1 c1Var, h2 h2Var, int i13) {
        this((i13 & 1) != 0 ? null : g0Var, (i13 & 2) != 0 ? null : qVar, (i13 & 4) != 0 ? null : c1Var, (i13 & 8) != 0 ? null : h2Var);
    }

    public static c a(c cVar, q qVar) {
        h32.g0 g0Var = cVar.f92379a;
        h32.c1 c1Var = cVar.f92381c;
        h2 h2Var = cVar.f92382d;
        cVar.getClass();
        return new c(g0Var, qVar, c1Var, h2Var);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return this.f92379a == cVar.f92379a && Intrinsics.d(this.f92380b, cVar.f92380b) && Intrinsics.d(this.f92381c, cVar.f92381c) && this.f92382d == cVar.f92382d;
    }

    public final int hashCode() {
        h32.g0 g0Var = this.f92379a;
        int hashCode = (g0Var == null ? 0 : g0Var.hashCode()) * 31;
        q qVar = this.f92380b;
        int hashCode2 = (hashCode + (qVar == null ? 0 : qVar.f92450a.hashCode())) * 31;
        h32.c1 c1Var = this.f92381c;
        int hashCode3 = (hashCode2 + (c1Var == null ? 0 : c1Var.hashCode())) * 31;
        h2 h2Var = this.f92382d;
        return hashCode3 + (h2Var != null ? h2Var.hashCode() : 0);
    }

    public final String toString() {
        return "AttributionData(componentType=" + this.f92379a + ", auxData=" + this.f92380b + ", eventData=" + this.f92381c + ", pinImpressionType=" + this.f92382d + ")";
    }

    public c(h32.g0 g0Var, q qVar, h32.c1 c1Var, h2 h2Var) {
        this.f92379a = g0Var;
        this.f92380b = qVar;
        this.f92381c = c1Var;
        this.f92382d = h2Var;
    }
}
