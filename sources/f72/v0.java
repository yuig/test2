package f72;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.UnknownFieldException;

/* loaded from: classes4.dex */
public final class v0 implements qo2.a0 {

    /* renamed from: a, reason: collision with root package name */
    public static final v0 f61375a;

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ qo2.y0 f61376b;

    static {
        v0 v0Var = new v0();
        f61375a = v0Var;
        qo2.y0 y0Var = new qo2.y0("com.pinterest.shuffles.data.entity.shuffle.ShuffleRenderResourceEntity", v0Var, 4);
        y0Var.k("id", false);
        y0Var.k("fonts", false);
        y0Var.k("static_assets", false);
        y0Var.k("type", false);
        f61376b = y0Var;
    }

    @Override // no2.h, no2.a
    public final oo2.g a() {
        return f61376b;
    }

    @Override // qo2.a0
    public final no2.b[] b() {
        return qo2.w0.f104647b;
    }

    @Override // no2.h
    public final void c(po2.d encoder, Object obj) {
        x0 value = (x0) obj;
        Intrinsics.checkNotNullParameter(encoder, "encoder");
        Intrinsics.checkNotNullParameter(value, "value");
        qo2.y0 y0Var = f61376b;
        po2.b b13 = encoder.b(y0Var);
        b13.m(0, value.f61409a, y0Var);
        no2.b[] bVarArr = x0.f61408e;
        b13.u(y0Var, 1, bVarArr[1], value.f61410b);
        b13.u(y0Var, 2, bVarArr[2], value.f61411c);
        b13.m(3, value.f61412d, y0Var);
        b13.a(y0Var);
    }

    @Override // qo2.a0
    public final no2.b[] d() {
        no2.b[] bVarArr = x0.f61408e;
        no2.b bVar = bVarArr[1];
        no2.b bVar2 = bVarArr[2];
        qo2.j1 j1Var = qo2.j1.f104576a;
        return new no2.b[]{j1Var, bVar, bVar2, j1Var};
    }

    @Override // no2.a
    public final Object e(po2.c decoder) {
        Intrinsics.checkNotNullParameter(decoder, "decoder");
        qo2.y0 y0Var = f61376b;
        po2.a b13 = decoder.b(y0Var);
        no2.b[] bVarArr = x0.f61408e;
        String str = null;
        List list = null;
        List list2 = null;
        String str2 = null;
        int i13 = 0;
        boolean z13 = true;
        while (z13) {
            int o13 = b13.o(y0Var);
            if (o13 == -1) {
                z13 = false;
            } else if (o13 == 0) {
                str = b13.k(y0Var, 0);
                i13 |= 1;
            } else if (o13 == 1) {
                list = (List) b13.C(y0Var, 1, bVarArr[1], list);
                i13 |= 2;
            } else if (o13 == 2) {
                list2 = (List) b13.C(y0Var, 2, bVarArr[2], list2);
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
        return new x0(i13, str, list, list2, str2);
    }
}
