package qd2;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.UnknownFieldException;
import qo2.w0;
import qo2.y0;

/* loaded from: classes4.dex */
public final class i implements qo2.a0 {

    /* renamed from: a, reason: collision with root package name */
    public static final i f103592a;

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ y0 f103593b;

    static {
        i iVar = new i();
        f103592a = iVar;
        y0 y0Var = new y0("FloatValueOptions", iVar, 1);
        y0Var.k("options", false);
        f103593b = y0Var;
    }

    @Override // no2.h, no2.a
    public final oo2.g a() {
        return f103593b;
    }

    @Override // qo2.a0
    public final no2.b[] b() {
        return w0.f104647b;
    }

    @Override // no2.h
    public final void c(po2.d encoder, Object obj) {
        k value = (k) obj;
        Intrinsics.checkNotNullParameter(encoder, "encoder");
        Intrinsics.checkNotNullParameter(value, "value");
        y0 y0Var = f103593b;
        po2.b b13 = encoder.b(y0Var);
        b13.u(y0Var, 0, k.f103594d[0], value.f103595c);
        b13.a(y0Var);
    }

    @Override // qo2.a0
    public final no2.b[] d() {
        return new no2.b[]{k.f103594d[0]};
    }

    @Override // no2.a
    public final Object e(po2.c decoder) {
        Intrinsics.checkNotNullParameter(decoder, "decoder");
        y0 y0Var = f103593b;
        po2.a b13 = decoder.b(y0Var);
        no2.b[] bVarArr = k.f103594d;
        List list = null;
        boolean z13 = true;
        int i13 = 0;
        while (z13) {
            int o13 = b13.o(y0Var);
            if (o13 == -1) {
                z13 = false;
            } else {
                if (o13 != 0) {
                    throw new UnknownFieldException(o13);
                }
                list = (List) b13.C(y0Var, 0, bVarArr[0], list);
                i13 = 1;
            }
        }
        b13.a(y0Var);
        return new k(i13, list);
    }
}
