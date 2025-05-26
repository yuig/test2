package g72;

import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.UnknownFieldException;

/* loaded from: classes4.dex */
public final class s implements qo2.a0 {

    /* renamed from: a, reason: collision with root package name */
    public static final s f64095a;

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ qo2.y0 f64096b;

    static {
        s sVar = new s();
        f64095a = sVar;
        qo2.y0 y0Var = new qo2.y0("com.pinterest.shuffles.data.entity.shuffle.effect.BooleanValueConfig", sVar, 3);
        y0Var.k("bool", false);
        y0Var.k("unique", true);
        y0Var.k("value", true);
        f64096b = y0Var;
    }

    @Override // no2.h, no2.a
    public final oo2.g a() {
        return f64096b;
    }

    @Override // qo2.a0
    public final no2.b[] b() {
        return qo2.w0.f104647b;
    }

    @Override // no2.h
    public final void c(po2.d encoder, Object obj) {
        x value = (x) obj;
        Intrinsics.checkNotNullParameter(encoder, "encoder");
        Intrinsics.checkNotNullParameter(value, "value");
        qo2.y0 y0Var = f64096b;
        po2.b b13 = encoder.b(y0Var);
        b13.u(y0Var, 0, t.f64108a, value.f64139a);
        boolean j13 = b13.j(y0Var);
        boolean z13 = value.f64140b;
        if (j13 || z13) {
            b13.E(y0Var, 1, z13);
        }
        boolean j14 = b13.j(y0Var);
        boolean z14 = value.f64141c;
        if (j14 || z14 != value.f64139a.f64125a) {
            b13.E(y0Var, 2, z14);
        }
        b13.a(y0Var);
    }

    @Override // qo2.a0
    public final no2.b[] d() {
        qo2.g gVar = qo2.g.f104555a;
        return new no2.b[]{t.f64108a, gVar, gVar};
    }

    @Override // no2.a
    public final Object e(po2.c decoder) {
        Intrinsics.checkNotNullParameter(decoder, "decoder");
        qo2.y0 y0Var = f64096b;
        po2.a b13 = decoder.b(y0Var);
        v vVar = null;
        boolean z13 = true;
        int i13 = 0;
        boolean z14 = false;
        boolean z15 = false;
        while (z13) {
            int o13 = b13.o(y0Var);
            if (o13 == -1) {
                z13 = false;
            } else if (o13 == 0) {
                vVar = (v) b13.C(y0Var, 0, t.f64108a, vVar);
                i13 |= 1;
            } else if (o13 == 1) {
                z14 = b13.h(y0Var, 1);
                i13 |= 2;
            } else {
                if (o13 != 2) {
                    throw new UnknownFieldException(o13);
                }
                z15 = b13.h(y0Var, 2);
                i13 |= 4;
            }
        }
        b13.a(y0Var);
        return new x(i13, vVar, z14, z15);
    }
}
