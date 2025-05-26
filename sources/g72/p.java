package g72;

import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.UnknownFieldException;

/* loaded from: classes4.dex */
public final class p implements qo2.a0 {

    /* renamed from: a, reason: collision with root package name */
    public static final p f64068a;

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ qo2.y0 f64069b;

    static {
        p pVar = new p();
        f64068a = pVar;
        qo2.y0 y0Var = new qo2.y0("com.pinterest.shuffles.data.entity.shuffle.effect.BitmapMaskEntity", pVar, 2);
        y0Var.k("mask_bounds", true);
        y0Var.k("mask_image", true);
        f64069b = y0Var;
    }

    @Override // no2.h, no2.a
    public final oo2.g a() {
        return f64069b;
    }

    @Override // qo2.a0
    public final no2.b[] b() {
        return qo2.w0.f104647b;
    }

    @Override // no2.h
    public final void c(po2.d encoder, Object obj) {
        r value = (r) obj;
        Intrinsics.checkNotNullParameter(encoder, "encoder");
        Intrinsics.checkNotNullParameter(value, "value");
        qo2.y0 y0Var = f64069b;
        po2.b b13 = encoder.b(y0Var);
        q qVar = r.Companion;
        if (b13.j(y0Var) || value.f64089a != null) {
            b13.A(y0Var, 0, r.f64088c[0], value.f64089a);
        }
        if (b13.j(y0Var) || value.f64090b != null) {
            b13.A(y0Var, 1, qo2.j1.f104576a, value.f64090b);
        }
        b13.a(y0Var);
    }

    @Override // qo2.a0
    public final no2.b[] d() {
        return new no2.b[]{f0.h.J(r.f64088c[0]), f0.h.J(qo2.j1.f104576a)};
    }

    @Override // no2.a
    public final Object e(po2.c decoder) {
        Intrinsics.checkNotNullParameter(decoder, "decoder");
        qo2.y0 y0Var = f64069b;
        po2.a b13 = decoder.b(y0Var);
        no2.b[] bVarArr = r.f64088c;
        float[][] fArr = null;
        boolean z13 = true;
        String str = null;
        int i13 = 0;
        while (z13) {
            int o13 = b13.o(y0Var);
            if (o13 == -1) {
                z13 = false;
            } else if (o13 == 0) {
                fArr = (float[][]) b13.v(y0Var, 0, bVarArr[0], fArr);
                i13 |= 1;
            } else {
                if (o13 != 1) {
                    throw new UnknownFieldException(o13);
                }
                str = (String) b13.v(y0Var, 1, qo2.j1.f104576a, str);
                i13 |= 2;
            }
        }
        b13.a(y0Var);
        return new r(i13, fArr, str);
    }
}
