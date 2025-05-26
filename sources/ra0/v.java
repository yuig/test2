package ra0;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class v {

    /* renamed from: a, reason: collision with root package name */
    public final a0 f107012a;

    /* renamed from: b, reason: collision with root package name */
    public final int f107013b;

    /* renamed from: c, reason: collision with root package name */
    public final float f107014c;

    /* renamed from: d, reason: collision with root package name */
    public final float f107015d;

    /* renamed from: e, reason: collision with root package name */
    public final p1.x0 f107016e;

    public v(a0 cellStyle, int i13, float f13, float f14, p1.x0 contentPadding) {
        Intrinsics.checkNotNullParameter(cellStyle, "cellStyle");
        Intrinsics.checkNotNullParameter(contentPadding, "contentPadding");
        this.f107012a = cellStyle;
        this.f107013b = i13;
        this.f107014c = f13;
        this.f107015d = f14;
        this.f107016e = contentPadding;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof v)) {
            return false;
        }
        v vVar = (v) obj;
        return Intrinsics.d(this.f107012a, vVar.f107012a) && this.f107013b == vVar.f107013b && n4.e.a(this.f107014c, vVar.f107014c) && n4.e.a(this.f107015d, vVar.f107015d) && Intrinsics.d(this.f107016e, vVar.f107016e);
    }

    public final int hashCode() {
        return this.f107016e.hashCode() + a.a.a(this.f107015d, a.a.a(this.f107014c, ep.b.b(this.f107013b, this.f107012a.hashCode() * 31, 31), 31), 31);
    }

    public final String toString() {
        String b13 = n4.e.b(this.f107014c);
        String b14 = n4.e.b(this.f107015d);
        StringBuilder sb3 = new StringBuilder("ColorPickerCarouselStyle(cellStyle=");
        sb3.append(this.f107012a);
        sb3.append(", numRows=");
        a.a.A(sb3, this.f107013b, ", rowSpacing=", b13, ", columnSpacing=");
        sb3.append(b14);
        sb3.append(", contentPadding=");
        sb3.append(this.f107016e);
        sb3.append(")");
        return sb3.toString();
    }
}
