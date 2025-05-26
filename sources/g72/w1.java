package g72;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.UnknownFieldException;

/* loaded from: classes4.dex */
public final class w1 implements qo2.a0 {

    /* renamed from: a, reason: collision with root package name */
    public static final w1 f64133a;

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ qo2.y0 f64134b;

    static {
        w1 w1Var = new w1();
        f64133a = w1Var;
        qo2.y0 y0Var = new qo2.y0("com.pinterest.shuffles.data.entity.shuffle.effect.ItemStateEntity", w1Var, 7);
        y0Var.k("alpha", true);
        y0Var.k("isHidden", true);
        y0Var.k("offset", false);
        y0Var.k("rotation", false);
        y0Var.k("rotationX", true);
        y0Var.k("rotationY", true);
        y0Var.k("scale", false);
        f64134b = y0Var;
    }

    @Override // no2.h, no2.a
    public final oo2.g a() {
        return f64134b;
    }

    @Override // qo2.a0
    public final no2.b[] b() {
        return qo2.w0.f104647b;
    }

    @Override // no2.h
    public final void c(po2.d encoder, Object obj) {
        y1 value = (y1) obj;
        Intrinsics.checkNotNullParameter(encoder, "encoder");
        Intrinsics.checkNotNullParameter(value, "value");
        qo2.y0 y0Var = f64134b;
        po2.b b13 = encoder.b(y0Var);
        x1 x1Var = y1.Companion;
        if (b13.j(y0Var) || !Intrinsics.d(value.f64151a, Float.valueOf(1.0f))) {
            b13.A(y0Var, 0, qo2.z.f104669a, value.f64151a);
        }
        if (b13.j(y0Var) || !Intrinsics.d(value.f64152b, Boolean.FALSE)) {
            b13.A(y0Var, 1, qo2.g.f104555a, value.f64152b);
        }
        b13.u(y0Var, 2, y1.f64150h[2], value.f64153c);
        b13.o(y0Var, 3, value.f64154d);
        boolean j13 = b13.j(y0Var);
        Double d2 = value.f64155e;
        if (j13 || !Intrinsics.d(d2, Double.valueOf(0.0d))) {
            b13.A(y0Var, 4, qo2.s.f104618a, d2);
        }
        boolean j14 = b13.j(y0Var);
        Double d13 = value.f64156f;
        if (j14 || !Intrinsics.d(d13, Double.valueOf(0.0d))) {
            b13.A(y0Var, 5, qo2.s.f104618a, d13);
        }
        b13.o(y0Var, 6, value.f64157g);
        b13.a(y0Var);
    }

    @Override // qo2.a0
    public final no2.b[] d() {
        no2.b[] bVarArr = y1.f64150h;
        no2.b J2 = f0.h.J(qo2.z.f104669a);
        no2.b J3 = f0.h.J(qo2.g.f104555a);
        no2.b bVar = bVarArr[2];
        qo2.s sVar = qo2.s.f104618a;
        return new no2.b[]{J2, J3, bVar, sVar, f0.h.J(sVar), f0.h.J(sVar), sVar};
    }

    @Override // no2.a
    public final Object e(po2.c decoder) {
        Intrinsics.checkNotNullParameter(decoder, "decoder");
        qo2.y0 y0Var = f64134b;
        po2.a b13 = decoder.b(y0Var);
        no2.a[] aVarArr = y1.f64150h;
        Double d2 = null;
        int i13 = 0;
        Float f13 = null;
        Boolean bool = null;
        List list = null;
        Double d13 = null;
        double d14 = 0.0d;
        double d15 = 0.0d;
        boolean z13 = true;
        while (z13) {
            int o13 = b13.o(y0Var);
            switch (o13) {
                case -1:
                    z13 = false;
                    break;
                case 0:
                    f13 = (Float) b13.v(y0Var, 0, qo2.z.f104669a, f13);
                    i13 |= 1;
                    break;
                case 1:
                    bool = (Boolean) b13.v(y0Var, 1, qo2.g.f104555a, bool);
                    i13 |= 2;
                    break;
                case 2:
                    list = (List) b13.C(y0Var, 2, aVarArr[2], list);
                    i13 |= 4;
                    break;
                case 3:
                    d14 = b13.y(y0Var, 3);
                    i13 |= 8;
                    break;
                case 4:
                    d13 = (Double) b13.v(y0Var, 4, qo2.s.f104618a, d13);
                    i13 |= 16;
                    break;
                case 5:
                    d2 = (Double) b13.v(y0Var, 5, qo2.s.f104618a, d2);
                    i13 |= 32;
                    break;
                case 6:
                    d15 = b13.y(y0Var, 6);
                    i13 |= 64;
                    break;
                default:
                    throw new UnknownFieldException(o13);
            }
        }
        b13.a(y0Var);
        return new y1(i13, f13, bool, list, d14, d13, d2, d15);
    }
}
