package f72;

import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.UnknownFieldException;

/* loaded from: classes4.dex */
public final class i0 implements qo2.a0 {

    /* renamed from: a, reason: collision with root package name */
    public static final i0 f61274a;

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ qo2.y0 f61275b;

    static {
        i0 i0Var = new i0();
        f61274a = i0Var;
        qo2.y0 y0Var = new qo2.y0("com.pinterest.shuffles.data.entity.shuffle.ShuffleItemImageEntity.Attribution", i0Var, 6);
        y0Var.k("author", false);
        y0Var.k("provider_name", false);
        y0Var.k("title", false);
        y0Var.k("link", false);
        y0Var.k("author_url", false);
        y0Var.k("author_image_url", false);
        f61275b = y0Var;
    }

    @Override // no2.h, no2.a
    public final oo2.g a() {
        return f61275b;
    }

    @Override // qo2.a0
    public final no2.b[] b() {
        return qo2.w0.f104647b;
    }

    @Override // no2.h
    public final void c(po2.d encoder, Object obj) {
        k0 value = (k0) obj;
        Intrinsics.checkNotNullParameter(encoder, "encoder");
        Intrinsics.checkNotNullParameter(value, "value");
        qo2.y0 y0Var = f61275b;
        po2.b b13 = encoder.b(y0Var);
        qo2.j1 j1Var = qo2.j1.f104576a;
        b13.A(y0Var, 0, j1Var, value.f61288a);
        b13.A(y0Var, 1, j1Var, value.f61289b);
        b13.A(y0Var, 2, j1Var, value.f61290c);
        b13.A(y0Var, 3, j1Var, value.f61291d);
        b13.A(y0Var, 4, j1Var, value.f61292e);
        b13.A(y0Var, 5, j1Var, value.f61293f);
        b13.a(y0Var);
    }

    @Override // qo2.a0
    public final no2.b[] d() {
        qo2.j1 j1Var = qo2.j1.f104576a;
        return new no2.b[]{f0.h.J(j1Var), f0.h.J(j1Var), f0.h.J(j1Var), f0.h.J(j1Var), f0.h.J(j1Var), f0.h.J(j1Var)};
    }

    @Override // no2.a
    public final Object e(po2.c decoder) {
        Intrinsics.checkNotNullParameter(decoder, "decoder");
        qo2.y0 y0Var = f61275b;
        po2.a b13 = decoder.b(y0Var);
        int i13 = 0;
        String str = null;
        String str2 = null;
        String str3 = null;
        String str4 = null;
        String str5 = null;
        String str6 = null;
        boolean z13 = true;
        while (z13) {
            int o13 = b13.o(y0Var);
            switch (o13) {
                case -1:
                    z13 = false;
                    break;
                case 0:
                    str = (String) b13.v(y0Var, 0, qo2.j1.f104576a, str);
                    i13 |= 1;
                    break;
                case 1:
                    str2 = (String) b13.v(y0Var, 1, qo2.j1.f104576a, str2);
                    i13 |= 2;
                    break;
                case 2:
                    str3 = (String) b13.v(y0Var, 2, qo2.j1.f104576a, str3);
                    i13 |= 4;
                    break;
                case 3:
                    str4 = (String) b13.v(y0Var, 3, qo2.j1.f104576a, str4);
                    i13 |= 8;
                    break;
                case 4:
                    str5 = (String) b13.v(y0Var, 4, qo2.j1.f104576a, str5);
                    i13 |= 16;
                    break;
                case 5:
                    str6 = (String) b13.v(y0Var, 5, qo2.j1.f104576a, str6);
                    i13 |= 32;
                    break;
                default:
                    throw new UnknownFieldException(o13);
            }
        }
        b13.a(y0Var);
        return new k0(i13, str, str2, str3, str4, str5, str6);
    }
}
