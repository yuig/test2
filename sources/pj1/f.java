package pj1;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class f implements jj1.d, l {

    /* renamed from: a, reason: collision with root package name */
    public final int f100290a;

    /* renamed from: b, reason: collision with root package name */
    public final c f100291b;

    /* renamed from: c, reason: collision with root package name */
    public final d f100292c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f100293d;

    /* renamed from: e, reason: collision with root package name */
    public final j f100294e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f100295f;

    public /* synthetic */ f(int i13, c cVar, d dVar, j jVar, int i14) {
        this(i13, (i14 & 2) != 0 ? c.START : cVar, (i14 & 4) != 0 ? d.TOP : dVar, false, jVar, false);
    }

    public static f f(f fVar, j indicatorDrawableDisplayState) {
        int i13 = fVar.f100290a;
        c horizontalAlignment = fVar.f100291b;
        d verticalAlignment = fVar.f100292c;
        boolean z13 = fVar.f100293d;
        boolean z14 = fVar.f100295f;
        fVar.getClass();
        Intrinsics.checkNotNullParameter(horizontalAlignment, "horizontalAlignment");
        Intrinsics.checkNotNullParameter(verticalAlignment, "verticalAlignment");
        Intrinsics.checkNotNullParameter(indicatorDrawableDisplayState, "indicatorDrawableDisplayState");
        return new f(i13, horizontalAlignment, verticalAlignment, z13, indicatorDrawableDisplayState, z14);
    }

    @Override // pj1.l
    public final oi1.c e() {
        return oi1.g.f95307a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f)) {
            return false;
        }
        f fVar = (f) obj;
        return this.f100290a == fVar.f100290a && this.f100291b == fVar.f100291b && this.f100292c == fVar.f100292c && this.f100293d == fVar.f100293d && Intrinsics.d(this.f100294e, fVar.f100294e) && this.f100295f == fVar.f100295f;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f100295f) + ((this.f100294e.hashCode() + ep.b.e(this.f100293d, (this.f100292c.hashCode() + ((this.f100291b.hashCode() + (Integer.hashCode(this.f100290a) * 31)) * 31)) * 31, 31)) * 31);
    }

    public final String toString() {
        return "IndicatorDisplayState(basePadding=" + this.f100290a + ", horizontalAlignment=" + this.f100291b + ", verticalAlignment=" + this.f100292c + ", shouldAddShadow=" + this.f100293d + ", indicatorDrawableDisplayState=" + this.f100294e + ", forceDrawOver=" + this.f100295f + ")";
    }

    public f(int i13, c horizontalAlignment, d verticalAlignment, boolean z13, j indicatorDrawableDisplayState, boolean z14) {
        Intrinsics.checkNotNullParameter(horizontalAlignment, "horizontalAlignment");
        Intrinsics.checkNotNullParameter(verticalAlignment, "verticalAlignment");
        Intrinsics.checkNotNullParameter(indicatorDrawableDisplayState, "indicatorDrawableDisplayState");
        this.f100290a = i13;
        this.f100291b = horizontalAlignment;
        this.f100292c = verticalAlignment;
        this.f100293d = z13;
        this.f100294e = indicatorDrawableDisplayState;
        this.f100295f = z14;
    }
}
