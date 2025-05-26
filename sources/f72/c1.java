package f72;

import com.pinterest.feature.core.view.RecyclerViewTypes;
import g72.v4;
import g72.x4;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.UnknownFieldException;

/* loaded from: classes4.dex */
public final class c1 implements qo2.a0 {

    /* renamed from: a, reason: collision with root package name */
    public static final c1 f61238a;

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ qo2.y0 f61239b;

    static {
        c1 c1Var = new c1();
        f61238a = c1Var;
        qo2.y0 y0Var = new qo2.y0("com.pinterest.shuffles.data.entity.shuffle.ShuffleUploadEntity", c1Var, 8);
        y0Var.k("items", false);
        y0Var.k("parent_id", false);
        y0Var.k("details", false);
        y0Var.k("is_draft", false);
        y0Var.k("is_finished", false);
        y0Var.k("private", false);
        y0Var.k("effect_data", false);
        y0Var.k("compatible_version", true);
        f61239b = y0Var;
    }

    @Override // no2.h, no2.a
    public final oo2.g a() {
        return f61239b;
    }

    @Override // qo2.a0
    public final no2.b[] b() {
        return qo2.w0.f104647b;
    }

    @Override // no2.h
    public final void c(po2.d encoder, Object obj) {
        q1 value = (q1) obj;
        Intrinsics.checkNotNullParameter(encoder, "encoder");
        Intrinsics.checkNotNullParameter(value, "value");
        qo2.y0 y0Var = f61239b;
        po2.b b13 = encoder.b(y0Var);
        b13.u(y0Var, 0, q1.f61340i[0], value.f61341a);
        qo2.j1 j1Var = qo2.j1.f104576a;
        b13.A(y0Var, 1, j1Var, value.f61342b);
        b13.A(y0Var, 2, j1Var, value.f61343c);
        b13.E(y0Var, 3, value.f61344d);
        b13.E(y0Var, 4, value.f61345e);
        b13.E(y0Var, 5, value.f61346f);
        b13.A(y0Var, 6, v4.f64131a, value.f61347g);
        boolean j13 = b13.j(y0Var);
        String str = value.f61348h;
        if (j13 || !Intrinsics.d(str, "1.0.270")) {
            b13.m(7, str, y0Var);
        }
        b13.a(y0Var);
    }

    @Override // qo2.a0
    public final no2.b[] d() {
        no2.b bVar = q1.f61340i[0];
        qo2.j1 j1Var = qo2.j1.f104576a;
        no2.b J2 = f0.h.J(j1Var);
        no2.b J3 = f0.h.J(j1Var);
        no2.b J4 = f0.h.J(v4.f64131a);
        qo2.g gVar = qo2.g.f104555a;
        return new no2.b[]{bVar, J2, J3, gVar, gVar, gVar, J4, j1Var};
    }

    @Override // no2.a
    public final Object e(po2.c decoder) {
        Intrinsics.checkNotNullParameter(decoder, "decoder");
        qo2.y0 y0Var = f61239b;
        po2.a b13 = decoder.b(y0Var);
        no2.a[] aVarArr = q1.f61340i;
        List list = null;
        String str = null;
        String str2 = null;
        x4 x4Var = null;
        String str3 = null;
        int i13 = 0;
        boolean z13 = false;
        boolean z14 = false;
        boolean z15 = false;
        boolean z16 = true;
        while (z16) {
            int o13 = b13.o(y0Var);
            switch (o13) {
                case -1:
                    z16 = false;
                    break;
                case 0:
                    list = (List) b13.C(y0Var, 0, aVarArr[0], list);
                    i13 |= 1;
                    break;
                case 1:
                    str = (String) b13.v(y0Var, 1, qo2.j1.f104576a, str);
                    i13 |= 2;
                    break;
                case 2:
                    str2 = (String) b13.v(y0Var, 2, qo2.j1.f104576a, str2);
                    i13 |= 4;
                    break;
                case 3:
                    z13 = b13.h(y0Var, 3);
                    i13 |= 8;
                    break;
                case 4:
                    z14 = b13.h(y0Var, 4);
                    i13 |= 16;
                    break;
                case 5:
                    z15 = b13.h(y0Var, 5);
                    i13 |= 32;
                    break;
                case 6:
                    x4Var = (x4) b13.v(y0Var, 6, v4.f64131a, x4Var);
                    i13 |= 64;
                    break;
                case 7:
                    str3 = b13.k(y0Var, 7);
                    i13 |= RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_FEEDBACK_FULL_SPAN;
                    break;
                default:
                    throw new UnknownFieldException(o13);
            }
        }
        b13.a(y0Var);
        return new q1(i13, list, str, str2, z13, z14, z15, x4Var, str3);
    }
}
