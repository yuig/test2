package hc;

import android.graphics.Color;

/* loaded from: classes.dex */
public final class f implements l0 {

    /* renamed from: a, reason: collision with root package name */
    public static final f f68641a = new f();

    @Override // hc.l0
    public final Object f(ic.d dVar, float f13) {
        boolean z13 = dVar.g() == ic.c.BEGIN_ARRAY;
        if (z13) {
            dVar.a();
        }
        double s13 = dVar.s1();
        double s14 = dVar.s1();
        double s15 = dVar.s1();
        double s16 = dVar.g() == ic.c.NUMBER ? dVar.s1() : 1.0d;
        if (z13) {
            dVar.d();
        }
        if (s13 <= 1.0d && s14 <= 1.0d && s15 <= 1.0d) {
            s13 *= 255.0d;
            s14 *= 255.0d;
            s15 *= 255.0d;
            if (s16 <= 1.0d) {
                s16 *= 255.0d;
            }
        }
        return Integer.valueOf(Color.argb((int) s16, (int) s13, (int) s14, (int) s15));
    }
}
