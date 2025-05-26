package qd2;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import pd2.f0;
import pd2.p0;

@no2.g
/* loaded from: classes4.dex */
public final class f extends l {

    @NotNull
    public static final e Companion = new e();

    /* renamed from: c, reason: collision with root package name */
    public final float f103589c;

    /* renamed from: d, reason: collision with root package name */
    public final float f103590d;

    public f(int i13, float f13, float f14) {
        if (3 != (i13 & 3)) {
            kg.t.b1(i13, 3, d.f103588b);
            throw null;
        }
        this.f103589c = f13;
        this.f103590d = f14;
    }

    @Override // qd2.c
    public final boolean a(p0 value) {
        Intrinsics.checkNotNullParameter(value, "value");
        if (!(value instanceof f0)) {
            throw new IllegalArgumentException("FloatValueBounds can't accept non-float argument".toString());
        }
        float f13 = ((f0) value).f99839b;
        return this.f103589c <= f13 && f13 <= this.f103590d;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f)) {
            return false;
        }
        f fVar = (f) obj;
        return Float.compare(this.f103589c, fVar.f103589c) == 0 && Float.compare(this.f103590d, fVar.f103590d) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.f103590d) + (Float.hashCode(this.f103589c) * 31);
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("Bounds(minBound=");
        sb3.append(this.f103589c);
        sb3.append(", maxBound=");
        return d7.g.h(sb3, this.f103590d, ')');
    }

    public f(float f13, float f14) {
        this.f103589c = f13;
        this.f103590d = f14;
    }
}
