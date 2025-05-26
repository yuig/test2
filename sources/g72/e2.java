package g72;

import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.UnknownFieldException;

/* loaded from: classes4.dex */
public final class e2 implements qo2.a0 {

    /* renamed from: a, reason: collision with root package name */
    public static final e2 f63969a;

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ qo2.y0 f63970b;

    static {
        e2 e2Var = new e2();
        f63969a = e2Var;
        qo2.y0 y0Var = new qo2.y0("com.pinterest.shuffles.data.entity.shuffle.effect.KeyframeEntity", e2Var, 4);
        y0Var.k("id", false);
        y0Var.k("duration", false);
        y0Var.k("itemStates", false);
        y0Var.k("timingFunction", false);
        f63970b = y0Var;
    }

    @Override // no2.h, no2.a
    public final oo2.g a() {
        return f63970b;
    }

    @Override // qo2.a0
    public final no2.b[] b() {
        return qo2.w0.f104647b;
    }

    @Override // no2.h
    public final void c(po2.d encoder, Object obj) {
        g2 value = (g2) obj;
        Intrinsics.checkNotNullParameter(encoder, "encoder");
        Intrinsics.checkNotNullParameter(value, "value");
        qo2.y0 y0Var = f63970b;
        po2.b b13 = encoder.b(y0Var);
        b13.m(0, value.f63993a, y0Var);
        b13.o(y0Var, 1, value.f63994b);
        b13.u(y0Var, 2, g2.f63992e[2], value.f63995c);
        b13.m(3, value.f63996d, y0Var);
        b13.a(y0Var);
    }

    @Override // qo2.a0
    public final no2.b[] d() {
        no2.b bVar = g2.f63992e[2];
        qo2.j1 j1Var = qo2.j1.f104576a;
        return new no2.b[]{j1Var, qo2.s.f104618a, bVar, j1Var};
    }

    @Override // no2.a
    public final Object e(po2.c decoder) {
        Intrinsics.checkNotNullParameter(decoder, "decoder");
        qo2.y0 y0Var = f63970b;
        po2.a b13 = decoder.b(y0Var);
        no2.b[] bVarArr = g2.f63992e;
        String str = null;
        Map map = null;
        String str2 = null;
        int i13 = 0;
        double d2 = 0.0d;
        boolean z13 = true;
        while (z13) {
            int o13 = b13.o(y0Var);
            if (o13 == -1) {
                z13 = false;
            } else if (o13 == 0) {
                str = b13.k(y0Var, 0);
                i13 |= 1;
            } else if (o13 == 1) {
                d2 = b13.y(y0Var, 1);
                i13 |= 2;
            } else if (o13 == 2) {
                map = (Map) b13.C(y0Var, 2, bVarArr[2], map);
                i13 |= 4;
            } else {
                if (o13 != 3) {
                    throw new UnknownFieldException(o13);
                }
                str2 = b13.k(y0Var, 3);
                i13 |= 8;
            }
        }
        b13.a(y0Var);
        return new g2(i13, str, d2, map, str2);
    }
}
