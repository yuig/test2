package hd2;

import android.graphics.PointF;
import kg.t;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@no2.g
/* loaded from: classes4.dex */
public final class f {

    @NotNull
    public static final e Companion = new e();

    /* renamed from: a, reason: collision with root package name */
    public final PointF f68922a;

    /* renamed from: b, reason: collision with root package name */
    public final PointF f68923b;

    public f(int i13, PointF pointF, PointF pointF2) {
        if (3 != (i13 & 3)) {
            t.b1(i13, 3, d.f68921b);
            throw null;
        }
        this.f68922a = pointF;
        this.f68923b = pointF2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f)) {
            return false;
        }
        f fVar = (f) obj;
        return Intrinsics.d(this.f68922a, fVar.f68922a) && Intrinsics.d(this.f68923b, fVar.f68923b);
    }

    public final int hashCode() {
        return this.f68923b.hashCode() + (this.f68922a.hashCode() * 31);
    }

    public final String toString() {
        return "LineF(from=" + this.f68922a + ", to=" + this.f68923b + ')';
    }

    public f(PointF from, PointF to3) {
        Intrinsics.checkNotNullParameter(from, "from");
        Intrinsics.checkNotNullParameter(to3, "to");
        this.f68922a = from;
        this.f68923b = to3;
    }
}
