package ra0;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class a0 {

    /* renamed from: a, reason: collision with root package name */
    public final float f106891a;

    /* renamed from: b, reason: collision with root package name */
    public final m f106892b;

    /* renamed from: c, reason: collision with root package name */
    public final m f106893c;

    public a0(float f13, m innerBorderStyle, m outerBorderStyle) {
        Intrinsics.checkNotNullParameter(innerBorderStyle, "innerBorderStyle");
        Intrinsics.checkNotNullParameter(outerBorderStyle, "outerBorderStyle");
        this.f106891a = f13;
        this.f106892b = innerBorderStyle;
        this.f106893c = outerBorderStyle;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a0)) {
            return false;
        }
        a0 a0Var = (a0) obj;
        return n4.e.a(this.f106891a, a0Var.f106891a) && Intrinsics.d(this.f106892b, a0Var.f106892b) && Intrinsics.d(this.f106893c, a0Var.f106893c);
    }

    public final int hashCode() {
        return this.f106893c.hashCode() + ((this.f106892b.hashCode() + (Float.hashCode(this.f106891a) * 31)) * 31);
    }

    public final String toString() {
        return "ColorPickerCellStyle(size=" + n4.e.b(this.f106891a) + ", innerBorderStyle=" + this.f106892b + ", outerBorderStyle=" + this.f106893c + ")";
    }
}
