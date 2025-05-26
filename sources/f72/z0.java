package f72;

import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.UnknownFieldException;

/* loaded from: classes4.dex */
public final class z0 implements qo2.a0 {

    /* renamed from: a, reason: collision with root package name */
    public static final z0 f61416a;

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ qo2.y0 f61417b;

    static {
        z0 z0Var = new z0();
        f61416a = z0Var;
        qo2.y0 y0Var = new qo2.y0("com.pinterest.shuffles.data.entity.shuffle.ShuffleStaticAssetEntity", z0Var, 3);
        y0Var.k("id", false);
        y0Var.k("url", false);
        y0Var.k("key", false);
        f61417b = y0Var;
    }

    @Override // no2.h, no2.a
    public final oo2.g a() {
        return f61417b;
    }

    @Override // qo2.a0
    public final no2.b[] b() {
        return qo2.w0.f104647b;
    }

    @Override // no2.h
    public final void c(po2.d encoder, Object obj) {
        b1 value = (b1) obj;
        Intrinsics.checkNotNullParameter(encoder, "encoder");
        Intrinsics.checkNotNullParameter(value, "value");
        qo2.y0 y0Var = f61417b;
        po2.b b13 = encoder.b(y0Var);
        b13.m(0, value.f61234a, y0Var);
        b13.m(1, value.f61235b, y0Var);
        b13.m(2, value.f61236c, y0Var);
        b13.a(y0Var);
    }

    @Override // qo2.a0
    public final no2.b[] d() {
        qo2.j1 j1Var = qo2.j1.f104576a;
        return new no2.b[]{j1Var, j1Var, j1Var};
    }

    @Override // no2.a
    public final Object e(po2.c decoder) {
        Intrinsics.checkNotNullParameter(decoder, "decoder");
        qo2.y0 y0Var = f61417b;
        po2.a b13 = decoder.b(y0Var);
        String str = null;
        boolean z13 = true;
        int i13 = 0;
        String str2 = null;
        String str3 = null;
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
            } else {
                if (o13 != 2) {
                    throw new UnknownFieldException(o13);
                }
                str3 = b13.k(y0Var, 2);
                i13 |= 4;
            }
        }
        b13.a(y0Var);
        return new b1(i13, str, str2, str3);
    }
}
