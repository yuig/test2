package pd2;

import android.graphics.PointF;
import android.graphics.RectF;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@no2.g
/* loaded from: classes4.dex */
public final class t extends u {

    @NotNull
    public static final s Companion = new s();

    /* renamed from: b, reason: collision with root package name */
    public final PointF f99873b;

    /* renamed from: c, reason: collision with root package name */
    public final qd2.a0 f99874c;

    /* renamed from: d, reason: collision with root package name */
    public final o0 f99875d;

    public t(int i13, PointF pointF, qd2.a0 a0Var, o0 o0Var) {
        if (1 != (i13 & 1)) {
            kg.t.b1(i13, 1, r.f99871b);
            throw null;
        }
        this.f99873b = pointF;
        if ((i13 & 2) == 0) {
            this.f99874c = null;
        } else {
            this.f99874c = a0Var;
        }
        if ((i13 & 4) == 0) {
            this.f99875d = new o0(pointF);
        } else {
            this.f99875d = o0Var;
        }
    }

    @Override // pd2.u
    public final p0 a() {
        return this.f99875d;
    }

    @Override // pd2.u
    public final qd2.c b() {
        return this.f99874c;
    }

    public final t c(PointF center, float f13) {
        Intrinsics.checkNotNullParameter(center, "center");
        float f14 = center.x;
        float f15 = center.y;
        return new t(this.f99873b, new qd2.a0(new RectF(f14 - f13, f15 - f13, f14 + f13, f15 + f13)));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof t)) {
            return false;
        }
        t tVar = (t) obj;
        return Intrinsics.d(this.f99873b, tVar.f99873b) && Intrinsics.d(this.f99874c, tVar.f99874c);
    }

    public final int hashCode() {
        int hashCode = this.f99873b.hashCode() * 31;
        qd2.a0 a0Var = this.f99874c;
        return hashCode + (a0Var == null ? 0 : a0Var.f103585b.hashCode());
    }

    public final String toString() {
        return "Point(defaultValue=" + this.f99873b + ", limits=" + this.f99874c + ')';
    }

    public t(PointF defaultValue, qd2.a0 a0Var) {
        Intrinsics.checkNotNullParameter(defaultValue, "defaultValue");
        this.f99873b = defaultValue;
        this.f99874c = a0Var;
        this.f99875d = new o0(defaultValue);
    }
}
