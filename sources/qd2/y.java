package qd2;

import android.graphics.RectF;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.UnknownFieldException;
import qo2.w0;
import qo2.y0;

/* loaded from: classes4.dex */
public final class y implements qo2.a0 {

    /* renamed from: a, reason: collision with root package name */
    public static final y f103610a;

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ y0 f103611b;

    static {
        y yVar = new y();
        f103610a = yVar;
        y0 y0Var = new y0("PointValueLimits", yVar, 1);
        y0Var.k("bounds", false);
        f103611b = y0Var;
    }

    @Override // no2.h, no2.a
    public final oo2.g a() {
        return f103611b;
    }

    @Override // qo2.a0
    public final no2.b[] b() {
        return w0.f104647b;
    }

    @Override // no2.h
    public final void c(po2.d encoder, Object obj) {
        a0 value = (a0) obj;
        Intrinsics.checkNotNullParameter(encoder, "encoder");
        Intrinsics.checkNotNullParameter(value, "value");
        y0 y0Var = f103611b;
        po2.b b13 = encoder.b(y0Var);
        z zVar = a0.Companion;
        b13.u(y0Var, 0, jd2.e.f75546a, value.f103585b);
        b13.a(y0Var);
    }

    @Override // qo2.a0
    public final no2.b[] d() {
        return new no2.b[]{jd2.e.f75546a};
    }

    @Override // no2.a
    public final Object e(po2.c decoder) {
        Intrinsics.checkNotNullParameter(decoder, "decoder");
        y0 y0Var = f103611b;
        po2.a b13 = decoder.b(y0Var);
        RectF rectF = null;
        boolean z13 = true;
        int i13 = 0;
        while (z13) {
            int o13 = b13.o(y0Var);
            if (o13 == -1) {
                z13 = false;
            } else {
                if (o13 != 0) {
                    throw new UnknownFieldException(o13);
                }
                rectF = (RectF) b13.C(y0Var, 0, jd2.e.f75546a, rectF);
                i13 = 1;
            }
        }
        b13.a(y0Var);
        return new a0(i13, rectF);
    }
}
