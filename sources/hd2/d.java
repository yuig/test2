package hd2;

import android.graphics.PointF;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.UnknownFieldException;
import qo2.a0;
import qo2.w0;
import qo2.y0;

/* loaded from: classes4.dex */
public final class d implements a0 {

    /* renamed from: a, reason: collision with root package name */
    public static final d f68920a;

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ y0 f68921b;

    static {
        d dVar = new d();
        f68920a = dVar;
        y0 y0Var = new y0("com.pinterest.xrenderer.common.geometry.LineF", dVar, 2);
        y0Var.k("from", false);
        y0Var.k("to", false);
        f68921b = y0Var;
    }

    @Override // no2.h, no2.a
    public final oo2.g a() {
        return f68921b;
    }

    @Override // qo2.a0
    public final no2.b[] b() {
        return w0.f104647b;
    }

    @Override // no2.h
    public final void c(po2.d encoder, Object obj) {
        f value = (f) obj;
        Intrinsics.checkNotNullParameter(encoder, "encoder");
        Intrinsics.checkNotNullParameter(value, "value");
        y0 y0Var = f68921b;
        po2.b b13 = encoder.b(y0Var);
        jd2.a aVar = jd2.a.f75540a;
        b13.u(y0Var, 0, aVar, value.f68922a);
        b13.u(y0Var, 1, aVar, value.f68923b);
        b13.a(y0Var);
    }

    @Override // qo2.a0
    public final no2.b[] d() {
        jd2.a aVar = jd2.a.f75540a;
        return new no2.b[]{aVar, aVar};
    }

    @Override // no2.a
    public final Object e(po2.c decoder) {
        Intrinsics.checkNotNullParameter(decoder, "decoder");
        y0 y0Var = f68921b;
        po2.a b13 = decoder.b(y0Var);
        PointF pointF = null;
        boolean z13 = true;
        PointF pointF2 = null;
        int i13 = 0;
        while (z13) {
            int o13 = b13.o(y0Var);
            if (o13 == -1) {
                z13 = false;
            } else if (o13 == 0) {
                pointF = (PointF) b13.C(y0Var, 0, jd2.a.f75540a, pointF);
                i13 |= 1;
            } else {
                if (o13 != 1) {
                    throw new UnknownFieldException(o13);
                }
                pointF2 = (PointF) b13.C(y0Var, 1, jd2.a.f75540a, pointF2);
                i13 |= 2;
            }
        }
        b13.a(y0Var);
        return new f(i13, pointF, pointF2);
    }
}
