package qa2;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class d1 {

    /* renamed from: a, reason: collision with root package name */
    public int f103248a;

    /* renamed from: b, reason: collision with root package name */
    public int f103249b;

    /* renamed from: c, reason: collision with root package name */
    public Float f103250c;

    /* renamed from: d, reason: collision with root package name */
    public float f103251d;

    /* renamed from: e, reason: collision with root package name */
    public int f103252e;

    /* renamed from: f, reason: collision with root package name */
    public int f103253f;

    /* renamed from: g, reason: collision with root package name */
    public c1 f103254g;

    /* renamed from: h, reason: collision with root package name */
    public float f103255h;

    public d1(int i13, int i14, Float f13, float f14, int i15, int i16, c1 pinLevelingResizeType, float f15) {
        Intrinsics.checkNotNullParameter(pinLevelingResizeType, "pinLevelingResizeType");
        this.f103248a = i13;
        this.f103249b = i14;
        this.f103250c = f13;
        this.f103251d = f14;
        this.f103252e = i15;
        this.f103253f = i16;
        this.f103254g = pinLevelingResizeType;
        this.f103255h = f15;
    }

    public final int a() {
        return this.f103253f;
    }

    public final int b() {
        return this.f103252e;
    }

    public final c1 c() {
        return this.f103254g;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d1)) {
            return false;
        }
        d1 d1Var = (d1) obj;
        return this.f103248a == d1Var.f103248a && this.f103249b == d1Var.f103249b && Intrinsics.d(this.f103250c, d1Var.f103250c) && Float.compare(this.f103251d, d1Var.f103251d) == 0 && this.f103252e == d1Var.f103252e && this.f103253f == d1Var.f103253f && this.f103254g == d1Var.f103254g && Float.compare(this.f103255h, d1Var.f103255h) == 0;
    }

    public final int hashCode() {
        int b13 = ep.b.b(this.f103249b, Integer.hashCode(this.f103248a) * 31, 31);
        Float f13 = this.f103250c;
        return Float.hashCode(this.f103255h) + ((this.f103254g.hashCode() + ep.b.b(this.f103253f, ep.b.b(this.f103252e, a.a.a(this.f103251d, (b13 + (f13 == null ? 0 : f13.hashCode())) * 31, 31), 31), 31)) * 31);
    }

    public final String toString() {
        int i13 = this.f103248a;
        int i14 = this.f103249b;
        Float f13 = this.f103250c;
        float f14 = this.f103251d;
        int i15 = this.f103252e;
        int i16 = this.f103253f;
        c1 c1Var = this.f103254g;
        float f15 = this.f103255h;
        StringBuilder t13 = a.a.t("PinSpec(originalImageWidth=", i13, ", originalImageHeight=", i14, ", pinWidthHeightRatio=");
        t13.append(f13);
        t13.append(", pinWidthHeightRatioOffset=");
        t13.append(f14);
        t13.append(", imageWidth=");
        a.a.z(t13, i15, ", imageHeight=", i16, ", pinLevelingResizeType=");
        t13.append(c1Var);
        t13.append(", maxPinLevelingCropPercentage=");
        t13.append(f15);
        t13.append(")");
        return t13.toString();
    }

    public /* synthetic */ d1() {
        this(0, 0, null, 0.0f, 0, 0, c1.NONE, 0.8f);
    }
}
