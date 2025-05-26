package g72;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.UnknownFieldException;

/* loaded from: classes4.dex */
public final class z1 implements qo2.a0 {

    /* renamed from: a, reason: collision with root package name */
    public static final z1 f64166a;

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ qo2.y0 f64167b;

    static {
        z1 z1Var = new z1();
        f64166a = z1Var;
        qo2.y0 y0Var = new qo2.y0("com.pinterest.shuffles.data.entity.shuffle.effect.KeyframeAnimationEntity", z1Var, 2);
        y0Var.k("keyFrames", false);
        y0Var.k("loopMode", false);
        f64167b = y0Var;
    }

    @Override // no2.h, no2.a
    public final oo2.g a() {
        return f64167b;
    }

    @Override // qo2.a0
    public final no2.b[] b() {
        return qo2.w0.f104647b;
    }

    @Override // no2.h
    public final void c(po2.d encoder, Object obj) {
        b2 value = (b2) obj;
        Intrinsics.checkNotNullParameter(encoder, "encoder");
        Intrinsics.checkNotNullParameter(value, "value");
        qo2.y0 y0Var = f64167b;
        po2.b b13 = encoder.b(y0Var);
        b13.u(y0Var, 0, b2.f63931c[0], value.f63932a);
        b13.m(1, value.f63933b, y0Var);
        b13.a(y0Var);
    }

    @Override // qo2.a0
    public final no2.b[] d() {
        return new no2.b[]{b2.f63931c[0], qo2.j1.f104576a};
    }

    @Override // no2.a
    public final Object e(po2.c decoder) {
        Intrinsics.checkNotNullParameter(decoder, "decoder");
        qo2.y0 y0Var = f64167b;
        po2.a b13 = decoder.b(y0Var);
        no2.b[] bVarArr = b2.f63931c;
        List list = null;
        boolean z13 = true;
        String str = null;
        int i13 = 0;
        while (z13) {
            int o13 = b13.o(y0Var);
            if (o13 == -1) {
                z13 = false;
            } else if (o13 == 0) {
                list = (List) b13.C(y0Var, 0, bVarArr[0], list);
                i13 |= 1;
            } else {
                if (o13 != 1) {
                    throw new UnknownFieldException(o13);
                }
                str = b13.k(y0Var, 1);
                i13 |= 2;
            }
        }
        b13.a(y0Var);
        return new b2(i13, str, list);
    }
}
