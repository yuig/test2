package yi1;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class j implements k {

    /* renamed from: a, reason: collision with root package name */
    public final float f139106a;

    /* renamed from: b, reason: collision with root package name */
    public final u50.n f139107b;

    /* renamed from: c, reason: collision with root package name */
    public final bb2.f f139108c;

    public j(float f13, u50.n widthHeightRatioOffset, bb2.f scaleType) {
        Intrinsics.checkNotNullParameter(widthHeightRatioOffset, "widthHeightRatioOffset");
        Intrinsics.checkNotNullParameter(scaleType, "scaleType");
        this.f139106a = f13;
        this.f139107b = widthHeightRatioOffset;
        this.f139108c = scaleType;
    }

    public final bb2.f e() {
        return this.f139108c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j)) {
            return false;
        }
        j jVar = (j) obj;
        return Float.compare(this.f139106a, jVar.f139106a) == 0 && Intrinsics.d(this.f139107b, jVar.f139107b) && this.f139108c == jVar.f139108c;
    }

    public final float f() {
        return this.f139106a;
    }

    public final u50.n g() {
        return this.f139107b;
    }

    public final int hashCode() {
        return this.f139108c.hashCode() + d7.g.e(this.f139107b, Float.hashCode(this.f139106a) * 31, 31);
    }

    public final String toString() {
        return "ScaledToRatio(widthHeightRatio=" + this.f139106a + ", widthHeightRatioOffset=" + this.f139107b + ", scaleType=" + this.f139108c + ")";
    }
}
