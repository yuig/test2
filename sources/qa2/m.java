package qa2;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class m {

    /* renamed from: a, reason: collision with root package name */
    public final int f103312a;

    /* renamed from: b, reason: collision with root package name */
    public final int f103313b;

    /* renamed from: c, reason: collision with root package name */
    public final int f103314c;

    /* renamed from: d, reason: collision with root package name */
    public final int f103315d;

    /* renamed from: e, reason: collision with root package name */
    public final c1 f103316e;

    /* renamed from: f, reason: collision with root package name */
    public final float f103317f;

    public m(int i13, int i14, int i15, int i16, c1 pinLevelingResizeType, float f13) {
        Intrinsics.checkNotNullParameter(pinLevelingResizeType, "pinLevelingResizeType");
        this.f103312a = i13;
        this.f103313b = i14;
        this.f103314c = i15;
        this.f103315d = i16;
        this.f103316e = pinLevelingResizeType;
        this.f103317f = f13;
    }

    public static m b(m mVar, int i13, int i14, c1 c1Var, float f13, int i15) {
        int i16 = mVar.f103312a;
        int i17 = mVar.f103313b;
        if ((i15 & 4) != 0) {
            i13 = mVar.f103314c;
        }
        int i18 = i13;
        if ((i15 & 8) != 0) {
            i14 = mVar.f103315d;
        }
        int i19 = i14;
        if ((i15 & 16) != 0) {
            c1Var = mVar.f103316e;
        }
        c1 pinLevelingResizeType = c1Var;
        if ((i15 & 32) != 0) {
            f13 = mVar.f103317f;
        }
        mVar.getClass();
        Intrinsics.checkNotNullParameter(pinLevelingResizeType, "pinLevelingResizeType");
        return new m(i16, i17, i18, i19, pinLevelingResizeType, f13);
    }

    public final m a(float f13, float f14) {
        return b(this, 0, ml2.c.c((this.f103314c * f13) + f14), null, 0.0f, 55);
    }

    public final float c() {
        return this.f103317f;
    }

    public final int d() {
        return this.f103313b;
    }

    public final int e() {
        return this.f103312a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof m)) {
            return false;
        }
        m mVar = (m) obj;
        return this.f103312a == mVar.f103312a && this.f103313b == mVar.f103313b && this.f103314c == mVar.f103314c && this.f103315d == mVar.f103315d && this.f103316e == mVar.f103316e && Float.compare(this.f103317f, mVar.f103317f) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.f103317f) + ((this.f103316e.hashCode() + ep.b.b(this.f103315d, ep.b.b(this.f103314c, ep.b.b(this.f103313b, Integer.hashCode(this.f103312a) * 31, 31), 31), 31)) * 31);
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("ImmutablePinSpec(originalImageWidth=");
        sb3.append(this.f103312a);
        sb3.append(", originalImageHeight=");
        sb3.append(this.f103313b);
        sb3.append(", imageWidth=");
        sb3.append(this.f103314c);
        sb3.append(", imageHeight=");
        sb3.append(this.f103315d);
        sb3.append(", pinLevelingResizeType=");
        sb3.append(this.f103316e);
        sb3.append(", maxPinLevelingCropPercentage=");
        return d7.g.i(sb3, this.f103317f, ")");
    }

    public /* synthetic */ m(int i13, int i14, int i15, int i16, c1 c1Var, int i17) {
        this((i17 & 1) != 0 ? 0 : i13, (i17 & 2) != 0 ? 0 : i14, (i17 & 4) != 0 ? 0 : i15, (i17 & 8) != 0 ? 0 : i16, (i17 & 16) != 0 ? c1.NONE : c1Var, 0.8f);
    }
}
