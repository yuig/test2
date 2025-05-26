package ni1;

import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class y0 implements z1 {

    /* renamed from: a, reason: collision with root package name */
    public final ui1.q f90895a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f90896b;

    /* renamed from: c, reason: collision with root package name */
    public final Pair f90897c;

    /* renamed from: d, reason: collision with root package name */
    public final long f90898d;

    public y0(ui1.q qVar, Pair gestureXY) {
        long currentTimeMillis = System.currentTimeMillis() * 1000000;
        Intrinsics.checkNotNullParameter(gestureXY, "gestureXY");
        this.f90895a = qVar;
        this.f90896b = false;
        this.f90897c = gestureXY;
        this.f90898d = currentTimeMillis;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof y0)) {
            return false;
        }
        y0 y0Var = (y0) obj;
        return Intrinsics.d(this.f90895a, y0Var.f90895a) && this.f90896b == y0Var.f90896b && Intrinsics.d(this.f90897c, y0Var.f90897c) && this.f90898d == y0Var.f90898d;
    }

    public final int hashCode() {
        ui1.q qVar = this.f90895a;
        return Long.hashCode(this.f90898d) + ((this.f90897c.hashCode() + ep.b.e(this.f90896b, (qVar == null ? 0 : qVar.hashCode()) * 31, 31)) * 31);
    }

    public final String toString() {
        return "CoreCellOnSingleTapUp(touchHandlingPiece=" + this.f90895a + ", wasHandledByInterceptor=" + this.f90896b + ", gestureXY=" + this.f90897c + ", timestamp=" + this.f90898d + ")";
    }
}
