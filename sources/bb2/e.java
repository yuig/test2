package bb2;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    public final float f22604a;

    /* renamed from: b, reason: collision with root package name */
    public final float f22605b;

    /* renamed from: c, reason: collision with root package name */
    public final f f22606c;

    public e(float f13, float f14, f scaleType) {
        Intrinsics.checkNotNullParameter(scaleType, "scaleType");
        this.f22604a = f13;
        this.f22605b = f14;
        this.f22606c = scaleType;
    }

    public static e a(e eVar, f scaleType) {
        Intrinsics.checkNotNullParameter(scaleType, "scaleType");
        return new e(eVar.f22604a, eVar.f22605b, scaleType);
    }

    public final f b() {
        return this.f22606c;
    }

    public final float c() {
        return this.f22604a;
    }

    public final float d() {
        return this.f22605b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e)) {
            return false;
        }
        e eVar = (e) obj;
        return Float.compare(this.f22604a, eVar.f22604a) == 0 && Float.compare(this.f22605b, eVar.f22605b) == 0 && this.f22606c == eVar.f22606c;
    }

    public final int hashCode() {
        return this.f22606c.hashCode() + a.a.a(this.f22605b, Float.hashCode(this.f22604a) * 31, 31);
    }

    public final String toString() {
        return "FixedHeightImageSpec(widthHeightRatio=" + this.f22604a + ", widthHeightRatioOffset=" + this.f22605b + ", scaleType=" + this.f22606c + ")";
    }

    public /* synthetic */ e(float f13, f fVar, int i13) {
        this((i13 & 1) != 0 ? 1.0f : f13, 0.0f, (i13 & 4) != 0 ? f.FILL : fVar);
    }
}
