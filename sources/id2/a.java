package id2;

import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.UnknownFieldException;
import oo2.g;
import po2.d;
import qo2.a0;
import qo2.w0;
import qo2.y0;
import qo2.z;

/* loaded from: classes4.dex */
public final class a implements a0 {

    /* renamed from: a, reason: collision with root package name */
    public static final a f72188a;

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ y0 f72189b;

    static {
        a aVar = new a();
        f72188a = aVar;
        y0 y0Var = new y0("com.pinterest.xrenderer.common.graphics.ColorRGBA", aVar, 4);
        y0Var.k("r", true);
        y0Var.k("g", true);
        y0Var.k("b", true);
        y0Var.k("a", true);
        f72189b = y0Var;
    }

    @Override // no2.h, no2.a
    public final g a() {
        return f72189b;
    }

    @Override // qo2.a0
    public final no2.b[] b() {
        return w0.f104647b;
    }

    @Override // no2.h
    public final void c(d encoder, Object obj) {
        c value = (c) obj;
        Intrinsics.checkNotNullParameter(encoder, "encoder");
        Intrinsics.checkNotNullParameter(value, "value");
        y0 y0Var = f72189b;
        po2.b b13 = encoder.b(y0Var);
        if (b13.j(y0Var) || Float.compare(value.f72190a, 0.0f) != 0) {
            b13.v(y0Var, 0, value.f72190a);
        }
        if (b13.j(y0Var) || Float.compare(value.f72191b, 0.0f) != 0) {
            b13.v(y0Var, 1, value.f72191b);
        }
        if (b13.j(y0Var) || Float.compare(value.f72192c, 0.0f) != 0) {
            b13.v(y0Var, 2, value.f72192c);
        }
        if (b13.j(y0Var) || Float.compare(value.f72193d, 1.0f) != 0) {
            b13.v(y0Var, 3, value.f72193d);
        }
        b13.a(y0Var);
    }

    @Override // qo2.a0
    public final no2.b[] d() {
        z zVar = z.f104669a;
        return new no2.b[]{zVar, zVar, zVar, zVar};
    }

    @Override // no2.a
    public final Object e(po2.c decoder) {
        Intrinsics.checkNotNullParameter(decoder, "decoder");
        y0 y0Var = f72189b;
        po2.a b13 = decoder.b(y0Var);
        boolean z13 = true;
        int i13 = 0;
        float f13 = 0.0f;
        float f14 = 0.0f;
        float f15 = 0.0f;
        float f16 = 0.0f;
        while (z13) {
            int o13 = b13.o(y0Var);
            if (o13 == -1) {
                z13 = false;
            } else if (o13 == 0) {
                f13 = b13.n(y0Var, 0);
                i13 |= 1;
            } else if (o13 == 1) {
                f14 = b13.n(y0Var, 1);
                i13 |= 2;
            } else if (o13 == 2) {
                f15 = b13.n(y0Var, 2);
                i13 |= 4;
            } else {
                if (o13 != 3) {
                    throw new UnknownFieldException(o13);
                }
                f16 = b13.n(y0Var, 3);
                i13 |= 8;
            }
        }
        b13.a(y0Var);
        c cVar = new c();
        if ((i13 & 1) == 0) {
            cVar.f72190a = 0.0f;
        } else {
            cVar.f72190a = f13;
        }
        if ((i13 & 2) == 0) {
            cVar.f72191b = 0.0f;
        } else {
            cVar.f72191b = f14;
        }
        if ((i13 & 4) == 0) {
            cVar.f72192c = 0.0f;
        } else {
            cVar.f72192c = f15;
        }
        if ((i13 & 8) == 0) {
            cVar.f72193d = 1.0f;
        } else {
            cVar.f72193d = f16;
        }
        return cVar;
    }
}
