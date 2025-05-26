package bb2;

import kotlin.jvm.internal.Intrinsics;
import u50.n;
import u50.q;
import u50.x;

/* loaded from: classes4.dex */
public final class i {

    /* renamed from: a, reason: collision with root package name */
    public final float f22607a;

    /* renamed from: b, reason: collision with root package name */
    public final n f22608b;

    /* renamed from: c, reason: collision with root package name */
    public final f f22609c;

    /* renamed from: d, reason: collision with root package name */
    public final f f22610d;

    public /* synthetic */ i(float f13, n nVar, f fVar, int i13) {
        this((i13 & 1) != 0 ? 1.0f : f13, (i13 & 2) != 0 ? q.f120581a : nVar, (i13 & 4) != 0 ? f.FILL : fVar, f.FILL);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v2, types: [u50.n] */
    public static i a(i iVar, float f13, x xVar, f scaleType, int i13) {
        if ((i13 & 1) != 0) {
            f13 = iVar.f22607a;
        }
        x widthHeightRatioOffset = xVar;
        if ((i13 & 2) != 0) {
            widthHeightRatioOffset = iVar.f22608b;
        }
        if ((i13 & 4) != 0) {
            scaleType = iVar.f22609c;
        }
        f originalScaleType = iVar.f22610d;
        iVar.getClass();
        Intrinsics.checkNotNullParameter(widthHeightRatioOffset, "widthHeightRatioOffset");
        Intrinsics.checkNotNullParameter(scaleType, "scaleType");
        Intrinsics.checkNotNullParameter(originalScaleType, "originalScaleType");
        return new i(f13, widthHeightRatioOffset, scaleType, originalScaleType);
    }

    public final float b() {
        return this.f22607a;
    }

    public final n c() {
        return this.f22608b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i)) {
            return false;
        }
        i iVar = (i) obj;
        return Float.compare(this.f22607a, iVar.f22607a) == 0 && Intrinsics.d(this.f22608b, iVar.f22608b) && this.f22609c == iVar.f22609c && this.f22610d == iVar.f22610d;
    }

    public final int hashCode() {
        return this.f22610d.hashCode() + ((this.f22609c.hashCode() + d7.g.e(this.f22608b, Float.hashCode(this.f22607a) * 31, 31)) * 31);
    }

    public final String toString() {
        return "SbaFixedHeightImageSpec(widthHeightRatio=" + this.f22607a + ", widthHeightRatioOffset=" + this.f22608b + ", scaleType=" + this.f22609c + ", originalScaleType=" + this.f22610d + ")";
    }

    public i(float f13, n widthHeightRatioOffset, f scaleType, f originalScaleType) {
        Intrinsics.checkNotNullParameter(widthHeightRatioOffset, "widthHeightRatioOffset");
        Intrinsics.checkNotNullParameter(scaleType, "scaleType");
        Intrinsics.checkNotNullParameter(originalScaleType, "originalScaleType");
        this.f22607a = f13;
        this.f22608b = widthHeightRatioOffset;
        this.f22609c = scaleType;
        this.f22610d = originalScaleType;
    }
}
