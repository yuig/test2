package e72;

import com.pinterest.feature.core.view.RecyclerViewTypes;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.UnknownFieldException;
import qo2.j1;
import qo2.w0;
import qo2.y0;

/* loaded from: classes4.dex */
public final class g implements qo2.a0 {

    /* renamed from: a, reason: collision with root package name */
    public static final g f57652a;

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ y0 f57653b;

    static {
        g gVar = new g();
        f57652a = gVar;
        y0 y0Var = new y0("com.pinterest.shuffles.data.entity.pinterest.PinnerEntity", gVar, 8);
        y0Var.k("id", false);
        y0Var.k("username", true);
        y0Var.k("first_name", true);
        y0Var.k("last_name", true);
        y0Var.k("full_name", true);
        y0Var.k("image_medium_url", true);
        y0Var.k("image_large_url", true);
        y0Var.k("image_xlarge_url", true);
        f57653b = y0Var;
    }

    @Override // no2.h, no2.a
    public final oo2.g a() {
        return f57653b;
    }

    @Override // qo2.a0
    public final no2.b[] b() {
        return w0.f104647b;
    }

    @Override // no2.h
    public final void c(po2.d encoder, Object obj) {
        i value = (i) obj;
        Intrinsics.checkNotNullParameter(encoder, "encoder");
        Intrinsics.checkNotNullParameter(value, "value");
        y0 y0Var = f57653b;
        po2.b b13 = encoder.b(y0Var);
        b13.m(0, value.f57654a, y0Var);
        boolean j13 = b13.j(y0Var);
        String str = value.f57655b;
        if (j13 || str != null) {
            b13.A(y0Var, 1, j1.f104576a, str);
        }
        boolean j14 = b13.j(y0Var);
        String str2 = value.f57656c;
        if (j14 || str2 != null) {
            b13.A(y0Var, 2, j1.f104576a, str2);
        }
        boolean j15 = b13.j(y0Var);
        String str3 = value.f57657d;
        if (j15 || str3 != null) {
            b13.A(y0Var, 3, j1.f104576a, str3);
        }
        boolean j16 = b13.j(y0Var);
        String str4 = value.f57658e;
        if (j16 || str4 != null) {
            b13.A(y0Var, 4, j1.f104576a, str4);
        }
        boolean j17 = b13.j(y0Var);
        String str5 = value.f57659f;
        if (j17 || str5 != null) {
            b13.A(y0Var, 5, j1.f104576a, str5);
        }
        boolean j18 = b13.j(y0Var);
        String str6 = value.f57660g;
        if (j18 || str6 != null) {
            b13.A(y0Var, 6, j1.f104576a, str6);
        }
        boolean j19 = b13.j(y0Var);
        String str7 = value.f57661h;
        if (j19 || str7 != null) {
            b13.A(y0Var, 7, j1.f104576a, str7);
        }
        b13.a(y0Var);
    }

    @Override // qo2.a0
    public final no2.b[] d() {
        j1 j1Var = j1.f104576a;
        return new no2.b[]{j1Var, f0.h.J(j1Var), f0.h.J(j1Var), f0.h.J(j1Var), f0.h.J(j1Var), f0.h.J(j1Var), f0.h.J(j1Var), f0.h.J(j1Var)};
    }

    @Override // no2.a
    public final Object e(po2.c decoder) {
        Intrinsics.checkNotNullParameter(decoder, "decoder");
        y0 y0Var = f57653b;
        po2.a b13 = decoder.b(y0Var);
        int i13 = 0;
        String str = null;
        String str2 = null;
        String str3 = null;
        String str4 = null;
        String str5 = null;
        String str6 = null;
        String str7 = null;
        String str8 = null;
        boolean z13 = true;
        while (z13) {
            int o13 = b13.o(y0Var);
            switch (o13) {
                case -1:
                    z13 = false;
                    break;
                case 0:
                    str = b13.k(y0Var, 0);
                    i13 |= 1;
                    break;
                case 1:
                    str2 = (String) b13.v(y0Var, 1, j1.f104576a, str2);
                    i13 |= 2;
                    break;
                case 2:
                    str3 = (String) b13.v(y0Var, 2, j1.f104576a, str3);
                    i13 |= 4;
                    break;
                case 3:
                    str4 = (String) b13.v(y0Var, 3, j1.f104576a, str4);
                    i13 |= 8;
                    break;
                case 4:
                    str5 = (String) b13.v(y0Var, 4, j1.f104576a, str5);
                    i13 |= 16;
                    break;
                case 5:
                    str6 = (String) b13.v(y0Var, 5, j1.f104576a, str6);
                    i13 |= 32;
                    break;
                case 6:
                    str7 = (String) b13.v(y0Var, 6, j1.f104576a, str7);
                    i13 |= 64;
                    break;
                case 7:
                    str8 = (String) b13.v(y0Var, 7, j1.f104576a, str8);
                    i13 |= RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_FEEDBACK_FULL_SPAN;
                    break;
                default:
                    throw new UnknownFieldException(o13);
            }
        }
        b13.a(y0Var);
        return new i(i13, str, str2, str3, str4, str5, str6, str7, str8);
    }
}
