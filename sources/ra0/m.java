package ra0;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class m {

    /* renamed from: a, reason: collision with root package name */
    public final float f106959a;

    /* renamed from: b, reason: collision with root package name */
    public final i0 f106960b;

    /* renamed from: c, reason: collision with root package name */
    public final i0 f106961c;

    public m(float f13, i0 colors, i0 contrastColors) {
        Intrinsics.checkNotNullParameter(colors, "colors");
        Intrinsics.checkNotNullParameter(contrastColors, "contrastColors");
        this.f106959a = f13;
        this.f106960b = colors;
        this.f106961c = contrastColors;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof m)) {
            return false;
        }
        m mVar = (m) obj;
        return n4.e.a(this.f106959a, mVar.f106959a) && Intrinsics.d(this.f106960b, mVar.f106960b) && Intrinsics.d(this.f106961c, mVar.f106961c);
    }

    public final int hashCode() {
        return this.f106961c.hashCode() + ((this.f106960b.hashCode() + (Float.hashCode(this.f106959a) * 31)) * 31);
    }

    public final String toString() {
        return "ColorPickerBorderStyle(width=" + n4.e.b(this.f106959a) + ", colors=" + this.f106960b + ", contrastColors=" + this.f106961c + ")";
    }
}
