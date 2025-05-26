package qd2;

import android.graphics.PointF;
import android.graphics.RectF;
import kh2.s0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import pd2.l0;
import pd2.p0;

@no2.g
/* loaded from: classes4.dex */
public final class x extends c {

    @NotNull
    public static final w Companion = new w();

    /* renamed from: b, reason: collision with root package name */
    public final RectF f103609b;

    public x(int i13, RectF rectF) {
        if (1 == (i13 & 1)) {
            this.f103609b = rectF;
        } else {
            kg.t.b1(i13, 1, v.f103608b);
            throw null;
        }
    }

    @Override // qd2.c
    public final boolean a(p0 value) {
        Intrinsics.checkNotNullParameter(value, "value");
        if (!(value instanceof l0)) {
            throw new IllegalArgumentException("LineLimits can't accept non-line argument".toString());
        }
        hd2.f fVar = ((l0) value).f99854b;
        PointF pointF = fVar.f68922a;
        RectF rectF = this.f103609b;
        return s0.y(rectF, pointF) && s0.y(rectF, fVar.f68923b);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof x) && Intrinsics.d(this.f103609b, ((x) obj).f103609b);
    }

    public final int hashCode() {
        return this.f103609b.hashCode();
    }

    public final String toString() {
        return "LineLimits(bounds=" + this.f103609b + ')';
    }

    public x(RectF bounds) {
        Intrinsics.checkNotNullParameter(bounds, "bounds");
        this.f103609b = bounds;
    }
}
