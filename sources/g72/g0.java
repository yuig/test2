package g72;

import com.pinterest.feature.core.view.RecyclerViewTypes;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.UnknownFieldException;
import net.quikkly.android.utils.BitmapUtils;

/* loaded from: classes4.dex */
public final class g0 implements qo2.a0 {

    /* renamed from: a, reason: collision with root package name */
    public static final g0 f63987a;

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ qo2.y0 f63988b;

    static {
        g0 g0Var = new g0();
        f63987a = g0Var;
        qo2.y0 y0Var = new qo2.y0("com.pinterest.shuffles.data.entity.shuffle.effect.FilterEffectDataEntity", g0Var, 11);
        y0Var.k("type", false);
        y0Var.k("intensity", true);
        y0Var.k("exposure", true);
        y0Var.k("contrast", true);
        y0Var.k("saturation", true);
        y0Var.k("hue", true);
        y0Var.k("temperature", true);
        y0Var.k("tint", true);
        y0Var.k("invert", true);
        y0Var.k("shadows", true);
        y0Var.k("highlights", true);
        f63988b = y0Var;
    }

    @Override // no2.h, no2.a
    public final oo2.g a() {
        return f63988b;
    }

    @Override // qo2.a0
    public final no2.b[] b() {
        return qo2.w0.f104647b;
    }

    @Override // no2.h
    public final void c(po2.d encoder, Object obj) {
        i0 value = (i0) obj;
        Intrinsics.checkNotNullParameter(encoder, "encoder");
        Intrinsics.checkNotNullParameter(value, "value");
        qo2.y0 y0Var = f63988b;
        po2.b b13 = encoder.b(y0Var);
        b13.m(0, value.f64006a, y0Var);
        boolean j13 = b13.j(y0Var);
        g1 g1Var = value.f64007b;
        if (j13 || g1Var != null) {
            b13.A(y0Var, 1, b1.f63929a, g1Var);
        }
        boolean j14 = b13.j(y0Var);
        g1 g1Var2 = value.f64008c;
        if (j14 || g1Var2 != null) {
            b13.A(y0Var, 2, b1.f63929a, g1Var2);
        }
        boolean j15 = b13.j(y0Var);
        g1 g1Var3 = value.f64009d;
        if (j15 || g1Var3 != null) {
            b13.A(y0Var, 3, b1.f63929a, g1Var3);
        }
        boolean j16 = b13.j(y0Var);
        g1 g1Var4 = value.f64010e;
        if (j16 || g1Var4 != null) {
            b13.A(y0Var, 4, b1.f63929a, g1Var4);
        }
        boolean j17 = b13.j(y0Var);
        g1 g1Var5 = value.f64011f;
        if (j17 || g1Var5 != null) {
            b13.A(y0Var, 5, b1.f63929a, g1Var5);
        }
        boolean j18 = b13.j(y0Var);
        g1 g1Var6 = value.f64012g;
        if (j18 || g1Var6 != null) {
            b13.A(y0Var, 6, b1.f63929a, g1Var6);
        }
        boolean j19 = b13.j(y0Var);
        g1 g1Var7 = value.f64013h;
        if (j19 || g1Var7 != null) {
            b13.A(y0Var, 7, b1.f63929a, g1Var7);
        }
        boolean j23 = b13.j(y0Var);
        x xVar = value.f64014i;
        if (j23 || xVar != null) {
            b13.A(y0Var, 8, s.f64095a, xVar);
        }
        boolean j24 = b13.j(y0Var);
        g1 g1Var8 = value.f64015j;
        if (j24 || g1Var8 != null) {
            b13.A(y0Var, 9, b1.f63929a, g1Var8);
        }
        boolean j25 = b13.j(y0Var);
        g1 g1Var9 = value.f64016k;
        if (j25 || g1Var9 != null) {
            b13.A(y0Var, 10, b1.f63929a, g1Var9);
        }
        b13.a(y0Var);
    }

    @Override // qo2.a0
    public final no2.b[] d() {
        b1 b1Var = b1.f63929a;
        return new no2.b[]{qo2.j1.f104576a, f0.h.J(b1Var), f0.h.J(b1Var), f0.h.J(b1Var), f0.h.J(b1Var), f0.h.J(b1Var), f0.h.J(b1Var), f0.h.J(b1Var), f0.h.J(s.f64095a), f0.h.J(b1Var), f0.h.J(b1Var)};
    }

    @Override // no2.a
    public final Object e(po2.c decoder) {
        Intrinsics.checkNotNullParameter(decoder, "decoder");
        qo2.y0 y0Var = f63988b;
        po2.a b13 = decoder.b(y0Var);
        g1 g1Var = null;
        g1 g1Var2 = null;
        String str = null;
        g1 g1Var3 = null;
        g1 g1Var4 = null;
        g1 g1Var5 = null;
        g1 g1Var6 = null;
        g1 g1Var7 = null;
        g1 g1Var8 = null;
        g1 g1Var9 = null;
        x xVar = null;
        int i13 = 0;
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
                    g1Var3 = (g1) b13.v(y0Var, 1, b1.f63929a, g1Var3);
                    i13 |= 2;
                    break;
                case 2:
                    g1Var4 = (g1) b13.v(y0Var, 2, b1.f63929a, g1Var4);
                    i13 |= 4;
                    break;
                case 3:
                    g1Var5 = (g1) b13.v(y0Var, 3, b1.f63929a, g1Var5);
                    i13 |= 8;
                    break;
                case 4:
                    g1Var6 = (g1) b13.v(y0Var, 4, b1.f63929a, g1Var6);
                    i13 |= 16;
                    break;
                case 5:
                    g1Var7 = (g1) b13.v(y0Var, 5, b1.f63929a, g1Var7);
                    i13 |= 32;
                    break;
                case 6:
                    g1Var8 = (g1) b13.v(y0Var, 6, b1.f63929a, g1Var8);
                    i13 |= 64;
                    break;
                case 7:
                    g1Var9 = (g1) b13.v(y0Var, 7, b1.f63929a, g1Var9);
                    i13 |= RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_FEEDBACK_FULL_SPAN;
                    break;
                case 8:
                    xVar = (x) b13.v(y0Var, 8, s.f64095a, xVar);
                    i13 |= RecyclerViewTypes.VIEW_TYPE_OTHER_BOARD_MORE_IDEAS_FEED_PAGES_HEADER;
                    break;
                case 9:
                    g1Var = (g1) b13.v(y0Var, 9, b1.f63929a, g1Var);
                    i13 |= BitmapUtils.BITMAP_TO_JPEG_SIZE;
                    break;
                case 10:
                    g1Var2 = (g1) b13.v(y0Var, 10, b1.f63929a, g1Var2);
                    i13 |= 1024;
                    break;
                default:
                    throw new UnknownFieldException(o13);
            }
        }
        b13.a(y0Var);
        return new i0(i13, str, g1Var3, g1Var4, g1Var5, g1Var6, g1Var7, g1Var8, g1Var9, xVar, g1Var, g1Var2);
    }
}
