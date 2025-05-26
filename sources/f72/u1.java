package f72;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.UnknownFieldException;

/* loaded from: classes4.dex */
public final class u1 implements qo2.a0 {

    /* renamed from: a, reason: collision with root package name */
    public static final u1 f61371a;

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ qo2.y0 f61372b;

    static {
        u1 u1Var = new u1();
        f61371a = u1Var;
        qo2.y0 y0Var = new qo2.y0("com.pinterest.shuffles.data.entity.shuffle.TemplateConfigEntity", u1Var, 4);
        y0Var.k("id", false);
        y0Var.k("type", false);
        y0Var.k("sequence_id", false);
        y0Var.k("labels", false);
        f61372b = y0Var;
    }

    @Override // no2.h, no2.a
    public final oo2.g a() {
        return f61372b;
    }

    @Override // qo2.a0
    public final no2.b[] b() {
        return qo2.w0.f104647b;
    }

    @Override // no2.h
    public final void c(po2.d encoder, Object obj) {
        w1 value = (w1) obj;
        Intrinsics.checkNotNullParameter(encoder, "encoder");
        Intrinsics.checkNotNullParameter(value, "value");
        qo2.y0 y0Var = f61372b;
        po2.b b13 = encoder.b(y0Var);
        b13.m(0, value.f61378a, y0Var);
        b13.m(1, value.f61379b, y0Var);
        b13.D(2, value.f61380c, y0Var);
        b13.u(y0Var, 3, w1.f61377e[3], value.f61381d);
        b13.a(y0Var);
    }

    @Override // qo2.a0
    public final no2.b[] d() {
        no2.b bVar = w1.f61377e[3];
        qo2.j1 j1Var = qo2.j1.f104576a;
        return new no2.b[]{j1Var, j1Var, qo2.f0.f104550a, bVar};
    }

    @Override // no2.a
    public final Object e(po2.c decoder) {
        Intrinsics.checkNotNullParameter(decoder, "decoder");
        qo2.y0 y0Var = f61372b;
        po2.a b13 = decoder.b(y0Var);
        no2.b[] bVarArr = w1.f61377e;
        String str = null;
        String str2 = null;
        List list = null;
        int i13 = 0;
        int i14 = 0;
        boolean z13 = true;
        while (z13) {
            int o13 = b13.o(y0Var);
            if (o13 == -1) {
                z13 = false;
            } else if (o13 == 0) {
                str = b13.k(y0Var, 0);
                i13 |= 1;
            } else if (o13 == 1) {
                str2 = b13.k(y0Var, 1);
                i13 |= 2;
            } else if (o13 == 2) {
                i14 = b13.D(y0Var, 2);
                i13 |= 4;
            } else {
                if (o13 != 3) {
                    throw new UnknownFieldException(o13);
                }
                list = (List) b13.C(y0Var, 3, bVarArr[3], list);
                i13 |= 8;
            }
        }
        b13.a(y0Var);
        return new w1(i13, str, str2, i14, list);
    }
}
