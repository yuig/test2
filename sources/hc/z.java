package hc;

import android.graphics.PointF;

/* loaded from: classes.dex */
public final class z implements l0 {

    /* renamed from: a, reason: collision with root package name */
    public static final z f68687a = new z();

    @Override // hc.l0
    public final Object f(ic.d dVar, float f13) {
        ic.c g13 = dVar.g();
        if (g13 != ic.c.BEGIN_ARRAY && g13 != ic.c.BEGIN_OBJECT) {
            if (g13 != ic.c.NUMBER) {
                throw new IllegalArgumentException("Cannot convert json to point. Next token is " + g13);
            }
            PointF pointF = new PointF(((float) dVar.s1()) * f13, ((float) dVar.s1()) * f13);
            while (dVar.hasNext()) {
                dVar.E();
            }
            return pointF;
        }
        return r.b(dVar, f13);
    }
}
