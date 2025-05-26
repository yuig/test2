package jd2;

import kg.t;
import org.jetbrains.annotations.NotNull;

@no2.g
/* loaded from: classes4.dex */
public final class d {

    @NotNull
    public static final c Companion = new c();

    /* renamed from: a, reason: collision with root package name */
    public final float f75544a;

    /* renamed from: b, reason: collision with root package name */
    public final float f75545b;

    public d(int i13, float f13, float f14) {
        if (3 != (i13 & 3)) {
            t.b1(i13, 3, b.f75543b);
            throw null;
        }
        this.f75544a = f13;
        this.f75545b = f14;
    }

    public d(float f13, float f14) {
        this.f75544a = f13;
        this.f75545b = f14;
    }
}
