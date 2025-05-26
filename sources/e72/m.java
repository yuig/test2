package e72;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.UnknownFieldException;
import qo2.j1;
import qo2.w0;
import qo2.y0;

/* loaded from: classes4.dex */
public final class m implements qo2.a0 {

    /* renamed from: a, reason: collision with root package name */
    public static final m f57678a;

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ y0 f57679b;

    static {
        m mVar = new m();
        f57678a = mVar;
        y0 y0Var = new y0("com.pinterest.shuffles.data.entity.pinterest.ProductPinDataEntity", mVar, 2);
        y0Var.k("id", false);
        y0Var.k("items", false);
        f57679b = y0Var;
    }

    @Override // no2.h, no2.a
    public final oo2.g a() {
        return f57679b;
    }

    @Override // qo2.a0
    public final no2.b[] b() {
        return w0.f104647b;
    }

    @Override // no2.h
    public final void c(po2.d encoder, Object obj) {
        o value = (o) obj;
        Intrinsics.checkNotNullParameter(encoder, "encoder");
        Intrinsics.checkNotNullParameter(value, "value");
        y0 y0Var = f57679b;
        po2.b b13 = encoder.b(y0Var);
        b13.m(0, value.f57681a, y0Var);
        b13.u(y0Var, 1, o.f57680c[1], value.f57682b);
        b13.a(y0Var);
    }

    @Override // qo2.a0
    public final no2.b[] d() {
        return new no2.b[]{j1.f104576a, o.f57680c[1]};
    }

    @Override // no2.a
    public final Object e(po2.c decoder) {
        Intrinsics.checkNotNullParameter(decoder, "decoder");
        y0 y0Var = f57679b;
        po2.a b13 = decoder.b(y0Var);
        no2.b[] bVarArr = o.f57680c;
        String str = null;
        boolean z13 = true;
        List list = null;
        int i13 = 0;
        while (z13) {
            int o13 = b13.o(y0Var);
            if (o13 == -1) {
                z13 = false;
            } else if (o13 == 0) {
                str = b13.k(y0Var, 0);
                i13 |= 1;
            } else {
                if (o13 != 1) {
                    throw new UnknownFieldException(o13);
                }
                list = (List) b13.C(y0Var, 1, bVarArr[1], list);
                i13 |= 2;
            }
        }
        b13.a(y0Var);
        return new o(i13, str, list);
    }
}
