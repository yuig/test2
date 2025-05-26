package d72;

import f0.h;
import f72.j;
import f72.l;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.UnknownFieldException;
import oo2.g;
import qo2.a0;
import qo2.f0;
import qo2.j1;
import qo2.y0;

/* loaded from: classes4.dex */
public final class a implements a0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ y0 f53908a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ no2.b f53909b;

    public a(no2.b typeSerial0) {
        Intrinsics.checkNotNullParameter(typeSerial0, "typeSerial0");
        y0 y0Var = new y0("com.pinterest.shuffles.data.entity.PinterestResponseEntity", this, 6);
        y0Var.k("status", false);
        y0Var.k("code", false);
        y0Var.k("data", false);
        y0Var.k("message", false);
        y0Var.k("bookmark", true);
        y0Var.k("price_filters", true);
        this.f53908a = y0Var;
        this.f53909b = typeSerial0;
    }

    @Override // no2.h, no2.a
    public final g a() {
        return this.f53908a;
    }

    @Override // qo2.a0
    public final no2.b[] b() {
        return new no2.b[]{this.f53909b};
    }

    @Override // no2.h
    public final void c(po2.d encoder, Object obj) {
        c value = (c) obj;
        Intrinsics.checkNotNullParameter(encoder, "encoder");
        Intrinsics.checkNotNullParameter(value, "value");
        y0 y0Var = this.f53908a;
        po2.b b13 = encoder.b(y0Var);
        b13.m(0, value.f53911a, y0Var);
        b13.D(1, value.f53912b, y0Var);
        b13.u(y0Var, 2, this.f53909b, value.f53913c);
        b13.m(3, value.f53914d, y0Var);
        boolean j13 = b13.j(y0Var);
        String str = value.f53915e;
        if (j13 || str != null) {
            b13.A(y0Var, 4, j1.f104576a, str);
        }
        boolean j14 = b13.j(y0Var);
        l lVar = value.f53916f;
        if (j14 || lVar != null) {
            b13.A(y0Var, 5, j.f61284a, lVar);
        }
        b13.a(y0Var);
    }

    @Override // qo2.a0
    public final no2.b[] d() {
        j1 j1Var = j1.f104576a;
        return new no2.b[]{j1Var, f0.f104550a, this.f53909b, j1Var, h.J(j1Var), h.J(j.f61284a)};
    }

    @Override // no2.a
    public final Object e(po2.c decoder) {
        Intrinsics.checkNotNullParameter(decoder, "decoder");
        y0 y0Var = this.f53908a;
        po2.a b13 = decoder.b(y0Var);
        String str = null;
        Object obj = null;
        String str2 = null;
        String str3 = null;
        l lVar = null;
        int i13 = 0;
        int i14 = 0;
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
                    i14 = b13.D(y0Var, 1);
                    i13 |= 2;
                    break;
                case 2:
                    obj = b13.C(y0Var, 2, this.f53909b, obj);
                    i13 |= 4;
                    break;
                case 3:
                    str2 = b13.k(y0Var, 3);
                    i13 |= 8;
                    break;
                case 4:
                    str3 = (String) b13.v(y0Var, 4, j1.f104576a, str3);
                    i13 |= 16;
                    break;
                case 5:
                    lVar = (l) b13.v(y0Var, 5, j.f61284a, lVar);
                    i13 |= 32;
                    break;
                default:
                    throw new UnknownFieldException(o13);
            }
        }
        b13.a(y0Var);
        return new c(i13, str, i14, obj, str2, str3, lVar);
    }
}
