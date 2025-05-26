package im2;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class x {

    /* renamed from: d, reason: collision with root package name */
    public static final x f72788d = new x(j0.STRICT, 6);

    /* renamed from: a, reason: collision with root package name */
    public final j0 f72789a;

    /* renamed from: b, reason: collision with root package name */
    public final xk2.j f72790b;

    /* renamed from: c, reason: collision with root package name */
    public final j0 f72791c;

    public x(j0 j0Var, int i13) {
        this(j0Var, (i13 & 2) != 0 ? new xk2.j(1, 0, 0) : null, j0Var);
    }

    public final j0 a() {
        return this.f72791c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof x)) {
            return false;
        }
        x xVar = (x) obj;
        return this.f72789a == xVar.f72789a && Intrinsics.d(this.f72790b, xVar.f72790b) && this.f72791c == xVar.f72791c;
    }

    public final int hashCode() {
        int hashCode = this.f72789a.hashCode() * 31;
        xk2.j jVar = this.f72790b;
        return this.f72791c.hashCode() + ((hashCode + (jVar == null ? 0 : jVar.f135219d)) * 31);
    }

    public final String toString() {
        return "JavaNullabilityAnnotationsStatus(reportLevelBefore=" + this.f72789a + ", sinceVersion=" + this.f72790b + ", reportLevelAfter=" + this.f72791c + ')';
    }

    public x(j0 reportLevelBefore, xk2.j jVar, j0 reportLevelAfter) {
        Intrinsics.checkNotNullParameter(reportLevelBefore, "reportLevelBefore");
        Intrinsics.checkNotNullParameter(reportLevelAfter, "reportLevelAfter");
        this.f72789a = reportLevelBefore;
        this.f72790b = jVar;
        this.f72791c = reportLevelAfter;
    }
}
