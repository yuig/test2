package jd2;

import kg.t;
import org.jetbrains.annotations.NotNull;

@no2.g
/* loaded from: classes4.dex */
public final class h {

    @NotNull
    public static final g Companion = new g();

    /* renamed from: a, reason: collision with root package name */
    public final float f75550a;

    /* renamed from: b, reason: collision with root package name */
    public final float f75551b;

    /* renamed from: c, reason: collision with root package name */
    public final float f75552c;

    /* renamed from: d, reason: collision with root package name */
    public final float f75553d;

    public h(int i13, float f13, float f14, float f15, float f16) {
        if (15 != (i13 & 15)) {
            t.b1(i13, 15, f.f75549b);
            throw null;
        }
        this.f75550a = f13;
        this.f75551b = f14;
        this.f75552c = f15;
        this.f75553d = f16;
    }

    public h(float f13, float f14, float f15, float f16) {
        this.f75550a = f13;
        this.f75551b = f14;
        this.f75552c = f15;
        this.f75553d = f16;
    }
}
