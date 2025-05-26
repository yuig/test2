package e72;

import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.UnknownFieldException;
import qo2.j1;
import qo2.w0;
import qo2.y0;

/* loaded from: classes4.dex */
public final class v implements qo2.a0 {

    /* renamed from: a, reason: collision with root package name */
    public static final v f57690a;

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ y0 f57691b;

    static {
        v vVar = new v();
        f57690a = vVar;
        y0 y0Var = new y0("com.pinterest.shuffles.data.entity.pinterest.ShufflesCutoutEntity", vVar, 6);
        y0Var.k("id", false);
        y0Var.k("type", false);
        y0Var.k("pin", true);
        y0Var.k("image_size", false);
        y0Var.k("bbox", false);
        y0Var.k("image_base64", false);
        f57691b = y0Var;
    }

    @Override // no2.h, no2.a
    public final oo2.g a() {
        return f57691b;
    }

    @Override // qo2.a0
    public final no2.b[] b() {
        return w0.f104647b;
    }

    @Override // no2.h
    public final void c(po2.d encoder, Object obj) {
        d0 value = (d0) obj;
        Intrinsics.checkNotNullParameter(encoder, "encoder");
        Intrinsics.checkNotNullParameter(value, "value");
        y0 y0Var = f57691b;
        po2.b b13 = encoder.b(y0Var);
        b13.m(0, value.f57631a, y0Var);
        b13.m(1, value.f57632b, y0Var);
        boolean j13 = b13.j(y0Var);
        f fVar = value.f57633c;
        if (j13 || fVar != null) {
            b13.A(y0Var, 2, d.f57629a, fVar);
        }
        b13.u(y0Var, 3, a0.f57624a, value.f57634d);
        b13.u(y0Var, 4, w.f57692a, value.f57635e);
        b13.m(5, value.f57636f, y0Var);
        b13.a(y0Var);
    }

    @Override // qo2.a0
    public final no2.b[] d() {
        no2.b J2 = f0.h.J(d.f57629a);
        j1 j1Var = j1.f104576a;
        return new no2.b[]{j1Var, j1Var, J2, a0.f57624a, w.f57692a, j1Var};
    }

    @Override // no2.a
    public final Object e(po2.c decoder) {
        Intrinsics.checkNotNullParameter(decoder, "decoder");
        y0 y0Var = f57691b;
        po2.a b13 = decoder.b(y0Var);
        int i13 = 0;
        String str = null;
        String str2 = null;
        f fVar = null;
        c0 c0Var = null;
        y yVar = null;
        String str3 = null;
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
                    fVar = (f) b13.v(y0Var, 2, d.f57629a, fVar);
                    i13 |= 4;
                    break;
                case 3:
                    c0Var = (c0) b13.C(y0Var, 3, a0.f57624a, c0Var);
                    i13 |= 8;
                    break;
                case 4:
                    yVar = (y) b13.C(y0Var, 4, w.f57692a, yVar);
                    i13 |= 16;
                    break;
                case 5:
                    str3 = b13.k(y0Var, 5);
                    i13 |= 32;
                    break;
                default:
                    throw new UnknownFieldException(o13);
            }
        }
        b13.a(y0Var);
        return new d0(i13, str, str2, fVar, c0Var, yVar, str3);
    }
}
