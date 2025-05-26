package e72;

import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.UnknownFieldException;
import qo2.f0;
import qo2.w0;
import qo2.y0;

/* loaded from: classes4.dex */
public final class w implements qo2.a0 {

    /* renamed from: a, reason: collision with root package name */
    public static final w f57692a;

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ y0 f57693b;

    static {
        w wVar = new w();
        f57692a = wVar;
        y0 y0Var = new y0("com.pinterest.shuffles.data.entity.pinterest.ShufflesCutoutEntity.BoundingBox", wVar, 4);
        y0Var.k("x", false);
        y0Var.k("y", false);
        y0Var.k("width", false);
        y0Var.k("height", false);
        f57693b = y0Var;
    }

    @Override // no2.h, no2.a
    public final oo2.g a() {
        return f57693b;
    }

    @Override // qo2.a0
    public final no2.b[] b() {
        return w0.f104647b;
    }

    @Override // no2.h
    public final void c(po2.d encoder, Object obj) {
        y value = (y) obj;
        Intrinsics.checkNotNullParameter(encoder, "encoder");
        Intrinsics.checkNotNullParameter(value, "value");
        y0 y0Var = f57693b;
        po2.b b13 = encoder.b(y0Var);
        b13.D(0, value.f57694a, y0Var);
        b13.D(1, value.f57695b, y0Var);
        b13.D(2, value.f57696c, y0Var);
        b13.D(3, value.f57697d, y0Var);
        b13.a(y0Var);
    }

    @Override // qo2.a0
    public final no2.b[] d() {
        f0 f0Var = f0.f104550a;
        return new no2.b[]{f0Var, f0Var, f0Var, f0Var};
    }

    @Override // no2.a
    public final Object e(po2.c decoder) {
        Intrinsics.checkNotNullParameter(decoder, "decoder");
        y0 y0Var = f57693b;
        po2.a b13 = decoder.b(y0Var);
        boolean z13 = true;
        int i13 = 0;
        int i14 = 0;
        int i15 = 0;
        int i16 = 0;
        int i17 = 0;
        while (z13) {
            int o13 = b13.o(y0Var);
            if (o13 == -1) {
                z13 = false;
            } else if (o13 == 0) {
                i14 = b13.D(y0Var, 0);
                i13 |= 1;
            } else if (o13 == 1) {
                i15 = b13.D(y0Var, 1);
                i13 |= 2;
            } else if (o13 == 2) {
                i16 = b13.D(y0Var, 2);
                i13 |= 4;
            } else {
                if (o13 != 3) {
                    throw new UnknownFieldException(o13);
                }
                i17 = b13.D(y0Var, 3);
                i13 |= 8;
            }
        }
        b13.a(y0Var);
        return new y(i13, i14, i15, i16, i17);
    }
}
