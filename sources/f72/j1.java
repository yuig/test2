package f72;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.UnknownFieldException;

/* loaded from: classes4.dex */
public final class j1 implements qo2.a0 {

    /* renamed from: a, reason: collision with root package name */
    public static final j1 f61286a;

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ qo2.y0 f61287b;

    static {
        j1 j1Var = new j1();
        f61286a = j1Var;
        qo2.y0 y0Var = new qo2.y0("com.pinterest.shuffles.data.entity.shuffle.ShuffleUploadEntity.ShuffleItemUploadEntity.Pin", j1Var, 7);
        y0Var.k("item_type", false);
        y0Var.k("offset", false);
        y0Var.k("scale", false);
        y0Var.k("rotation", false);
        y0Var.k("effect_data", false);
        y0Var.k("mask", false);
        y0Var.k("pin_id", false);
        f61287b = y0Var;
    }

    @Override // no2.h, no2.a
    public final oo2.g a() {
        return f61287b;
    }

    @Override // qo2.a0
    public final no2.b[] b() {
        return qo2.w0.f104647b;
    }

    @Override // no2.h
    public final void c(po2.d encoder, Object obj) {
        l1 value = (l1) obj;
        Intrinsics.checkNotNullParameter(encoder, "encoder");
        Intrinsics.checkNotNullParameter(value, "value");
        qo2.y0 y0Var = f61287b;
        po2.b b13 = encoder.b(y0Var);
        b13.D(0, value.f61299b, y0Var);
        b13.u(y0Var, 1, l1.f61298i[1], value.f61300c);
        b13.o(y0Var, 2, value.f61301d);
        b13.o(y0Var, 3, value.f61302e);
        b13.A(y0Var, 4, g72.f0.f63980b, value.f61303f);
        b13.A(y0Var, 5, qo2.j1.f104576a, value.f61304g);
        b13.m(6, value.f61305h, y0Var);
        b13.a(y0Var);
    }

    @Override // qo2.a0
    public final no2.b[] d() {
        no2.b bVar = l1.f61298i[1];
        no2.b J2 = f0.h.J(g72.f0.f63980b);
        qo2.j1 j1Var = qo2.j1.f104576a;
        no2.b J3 = f0.h.J(j1Var);
        qo2.s sVar = qo2.s.f104618a;
        return new no2.b[]{qo2.f0.f104550a, bVar, sVar, sVar, J2, J3, j1Var};
    }

    @Override // no2.a
    public final Object e(po2.c decoder) {
        Intrinsics.checkNotNullParameter(decoder, "decoder");
        qo2.y0 y0Var = f61287b;
        po2.a b13 = decoder.b(y0Var);
        no2.a[] aVarArr = l1.f61298i;
        g72.a0 a0Var = null;
        List list = null;
        String str = null;
        double d2 = 0.0d;
        double d13 = 0.0d;
        int i13 = 0;
        int i14 = 0;
        boolean z13 = true;
        String str2 = null;
        while (z13) {
            int o13 = b13.o(y0Var);
            switch (o13) {
                case -1:
                    z13 = false;
                    break;
                case 0:
                    i14 = b13.D(y0Var, 0);
                    i13 |= 1;
                    break;
                case 1:
                    list = (List) b13.C(y0Var, 1, aVarArr[1], list);
                    i13 |= 2;
                    break;
                case 2:
                    d2 = b13.y(y0Var, 2);
                    i13 |= 4;
                    break;
                case 3:
                    d13 = b13.y(y0Var, 3);
                    i13 |= 8;
                    break;
                case 4:
                    a0Var = (g72.a0) b13.v(y0Var, 4, g72.f0.f63980b, a0Var);
                    i13 |= 16;
                    break;
                case 5:
                    str2 = (String) b13.v(y0Var, 5, qo2.j1.f104576a, str2);
                    i13 |= 32;
                    break;
                case 6:
                    str = b13.k(y0Var, 6);
                    i13 |= 64;
                    break;
                default:
                    throw new UnknownFieldException(o13);
            }
        }
        b13.a(y0Var);
        return new l1(i13, i14, list, d2, d13, a0Var, str2, str);
    }
}
