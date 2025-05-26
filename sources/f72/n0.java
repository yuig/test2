package f72;

import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.UnknownFieldException;

/* loaded from: classes4.dex */
public final class n0 implements qo2.a0 {

    /* renamed from: a, reason: collision with root package name */
    public static final n0 f61320a;

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ qo2.y0 f61321b;

    static {
        n0 n0Var = new n0();
        f61320a = n0Var;
        qo2.y0 y0Var = new qo2.y0("com.pinterest.shuffles.data.entity.shuffle.ShuffleItemTextEntity", n0Var, 6);
        y0Var.k("text", false);
        y0Var.k("color_hex", false);
        y0Var.k("background_color_hex", true);
        y0Var.k("font_size", false);
        y0Var.k("font_type", false);
        y0Var.k("alignment", false);
        f61321b = y0Var;
    }

    @Override // no2.h, no2.a
    public final oo2.g a() {
        return f61321b;
    }

    @Override // qo2.a0
    public final no2.b[] b() {
        return qo2.w0.f104647b;
    }

    @Override // no2.h
    public final void c(po2.d encoder, Object obj) {
        p0 value = (p0) obj;
        Intrinsics.checkNotNullParameter(encoder, "encoder");
        Intrinsics.checkNotNullParameter(value, "value");
        qo2.y0 y0Var = f61321b;
        po2.b b13 = encoder.b(y0Var);
        b13.m(0, value.f61332a, y0Var);
        b13.m(1, value.f61333b, y0Var);
        boolean j13 = b13.j(y0Var);
        String str = value.f61334c;
        if (j13 || str != null) {
            b13.A(y0Var, 2, qo2.j1.f104576a, str);
        }
        b13.v(y0Var, 3, value.f61335d);
        b13.D(4, value.f61336e, y0Var);
        b13.D(5, value.f61337f, y0Var);
        b13.a(y0Var);
    }

    @Override // qo2.a0
    public final no2.b[] d() {
        qo2.j1 j1Var = qo2.j1.f104576a;
        no2.b J2 = f0.h.J(j1Var);
        qo2.f0 f0Var = qo2.f0.f104550a;
        return new no2.b[]{j1Var, j1Var, J2, qo2.z.f104669a, f0Var, f0Var};
    }

    @Override // no2.a
    public final Object e(po2.c decoder) {
        Intrinsics.checkNotNullParameter(decoder, "decoder");
        qo2.y0 y0Var = f61321b;
        po2.a b13 = decoder.b(y0Var);
        String str = null;
        String str2 = null;
        String str3 = null;
        int i13 = 0;
        int i14 = 0;
        int i15 = 0;
        float f13 = 0.0f;
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
                    str2 = b13.k(y0Var, 1);
                    i13 |= 2;
                    break;
                case 2:
                    str3 = (String) b13.v(y0Var, 2, qo2.j1.f104576a, str3);
                    i13 |= 4;
                    break;
                case 3:
                    f13 = b13.n(y0Var, 3);
                    i13 |= 8;
                    break;
                case 4:
                    i14 = b13.D(y0Var, 4);
                    i13 |= 16;
                    break;
                case 5:
                    i15 = b13.D(y0Var, 5);
                    i13 |= 32;
                    break;
                default:
                    throw new UnknownFieldException(o13);
            }
        }
        b13.a(y0Var);
        return new p0(i13, str, str2, str3, f13, i14, i15);
    }
}
