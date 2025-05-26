package f72;

import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.UnknownFieldException;

/* loaded from: classes4.dex */
public final class g implements qo2.a0 {

    /* renamed from: a, reason: collision with root package name */
    public static final g f61249a;

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ qo2.y0 f61250b;

    static {
        g gVar = new g();
        f61249a = gVar;
        qo2.y0 y0Var = new qo2.y0("com.pinterest.shuffles.data.entity.shuffle.ImageEntity", gVar, 5);
        y0Var.k("750x", true);
        y0Var.k("736x", true);
        y0Var.k("345x", true);
        y0Var.k("70x", true);
        y0Var.k("originals", true);
        f61250b = y0Var;
    }

    @Override // no2.h, no2.a
    public final oo2.g a() {
        return f61250b;
    }

    @Override // qo2.a0
    public final no2.b[] b() {
        return qo2.w0.f104647b;
    }

    @Override // no2.h
    public final void c(po2.d encoder, Object obj) {
        i value = (i) obj;
        Intrinsics.checkNotNullParameter(encoder, "encoder");
        Intrinsics.checkNotNullParameter(value, "value");
        qo2.y0 y0Var = f61250b;
        po2.b b13 = encoder.b(y0Var);
        if (b13.j(y0Var) || value.f61269a != null) {
            b13.A(y0Var, 0, d.f61240a, value.f61269a);
        }
        if (b13.j(y0Var) || value.f61270b != null) {
            b13.A(y0Var, 1, d.f61240a, value.f61270b);
        }
        if (b13.j(y0Var) || value.f61271c != null) {
            b13.A(y0Var, 2, d.f61240a, value.f61271c);
        }
        if (b13.j(y0Var) || value.f61272d != null) {
            b13.A(y0Var, 3, d.f61240a, value.f61272d);
        }
        if (b13.j(y0Var) || value.f61273e != null) {
            b13.A(y0Var, 4, d.f61240a, value.f61273e);
        }
        b13.a(y0Var);
    }

    @Override // qo2.a0
    public final no2.b[] d() {
        d dVar = d.f61240a;
        return new no2.b[]{f0.h.J(dVar), f0.h.J(dVar), f0.h.J(dVar), f0.h.J(dVar), f0.h.J(dVar)};
    }

    @Override // no2.a
    public final Object e(po2.c decoder) {
        Intrinsics.checkNotNullParameter(decoder, "decoder");
        qo2.y0 y0Var = f61250b;
        po2.a b13 = decoder.b(y0Var);
        int i13 = 0;
        f fVar = null;
        f fVar2 = null;
        f fVar3 = null;
        f fVar4 = null;
        f fVar5 = null;
        boolean z13 = true;
        while (z13) {
            int o13 = b13.o(y0Var);
            if (o13 == -1) {
                z13 = false;
            } else if (o13 == 0) {
                fVar = (f) b13.v(y0Var, 0, d.f61240a, fVar);
                i13 |= 1;
            } else if (o13 == 1) {
                fVar2 = (f) b13.v(y0Var, 1, d.f61240a, fVar2);
                i13 |= 2;
            } else if (o13 == 2) {
                fVar3 = (f) b13.v(y0Var, 2, d.f61240a, fVar3);
                i13 |= 4;
            } else if (o13 == 3) {
                fVar4 = (f) b13.v(y0Var, 3, d.f61240a, fVar4);
                i13 |= 8;
            } else {
                if (o13 != 4) {
                    throw new UnknownFieldException(o13);
                }
                fVar5 = (f) b13.v(y0Var, 4, d.f61240a, fVar5);
                i13 |= 16;
            }
        }
        b13.a(y0Var);
        return new i(i13, fVar, fVar2, fVar3, fVar4, fVar5);
    }
}
