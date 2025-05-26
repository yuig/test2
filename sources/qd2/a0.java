package qd2;

import android.graphics.PointF;
import android.graphics.RectF;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import pd2.o0;
import pd2.p0;

@no2.g
/* loaded from: classes4.dex */
public final class a0 extends c {

    @NotNull
    public static final z Companion = new z();

    /* renamed from: b, reason: collision with root package name */
    public final RectF f103585b;

    public a0(int i13, RectF rectF) {
        if (1 == (i13 & 1)) {
            this.f103585b = rectF;
        } else {
            kg.t.b1(i13, 1, y.f103611b);
            throw null;
        }
    }

    @Override // qd2.c
    public final boolean a(p0 value) {
        Intrinsics.checkNotNullParameter(value, "value");
        if (!(value instanceof o0)) {
            throw new IllegalArgumentException("PointLimits can't accept non-point argument".toString());
        }
        PointF pointF = ((o0) value).f99863b;
        RectF rectF = this.f103585b;
        float f13 = rectF.left;
        float f14 = rectF.right;
        float f15 = pointF.x;
        if (f13 <= f15 && f15 <= f14) {
            float f16 = rectF.top;
            float f17 = rectF.bottom;
            float f18 = pointF.y;
            if (f16 <= f18 && f18 <= f17) {
                return true;
            }
        }
        return false;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof a0) && Intrinsics.d(this.f103585b, ((a0) obj).f103585b);
    }

    public final int hashCode() {
        return this.f103585b.hashCode();
    }

    public final String toString() {
        return "PointLimits(bounds=" + this.f103585b + ')';
    }

    public a0(RectF bounds) {
        Intrinsics.checkNotNullParameter(bounds, "bounds");
        this.f103585b = bounds;
    }
}
