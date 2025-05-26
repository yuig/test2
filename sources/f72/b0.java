package f72;

import com.pinterest.feature.core.view.RecyclerViewTypes;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.UnknownFieldException;
import net.quikkly.android.utils.BitmapUtils;

/* loaded from: classes4.dex */
public final class b0 implements qo2.a0 {

    /* renamed from: a, reason: collision with root package name */
    public static final b0 f61232a;

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ qo2.y0 f61233b;

    static {
        b0 b0Var = new b0();
        f61232a = b0Var;
        qo2.y0 y0Var = new qo2.y0("com.pinterest.shuffles.data.entity.shuffle.ShuffleItemEntity", b0Var, 13);
        y0Var.k("id", false);
        y0Var.k("item_type", false);
        y0Var.k("images", false);
        y0Var.k("scale", false);
        y0Var.k("rotation", false);
        y0Var.k("offset", false);
        y0Var.k("mask", true);
        y0Var.k("pin", false);
        y0Var.k("text", false);
        y0Var.k("shuffle_item_image", false);
        y0Var.k("effect_data", false);
        y0Var.k("shuffle_asset", false);
        y0Var.k("template_config", true);
        f61233b = y0Var;
    }

    @Override // no2.h, no2.a
    public final oo2.g a() {
        return f61233b;
    }

    @Override // qo2.a0
    public final no2.b[] b() {
        return qo2.w0.f104647b;
    }

    @Override // no2.h
    public final void c(po2.d encoder, Object obj) {
        g0 value = (g0) obj;
        Intrinsics.checkNotNullParameter(encoder, "encoder");
        Intrinsics.checkNotNullParameter(value, "value");
        qo2.y0 y0Var = f61233b;
        po2.b b13 = encoder.b(y0Var);
        b13.m(0, value.f61252a, y0Var);
        b13.D(1, value.f61253b, y0Var);
        b13.A(y0Var, 2, g.f61249a, value.f61254c);
        b13.o(y0Var, 3, value.f61255d);
        b13.o(y0Var, 4, value.f61256e);
        b13.u(y0Var, 5, g0.f61251n[5], value.f61257f);
        boolean j13 = b13.j(y0Var);
        String str = value.f61258g;
        if (j13 || str != null) {
            b13.A(y0Var, 6, qo2.j1.f104576a, str);
        }
        b13.A(y0Var, 7, d0.f61242a, value.f61259h);
        b13.A(y0Var, 8, n0.f61320a, value.f61260i);
        b13.A(y0Var, 9, h0.f61267a, value.f61261j);
        b13.u(y0Var, 10, g72.f0.f63980b, value.f61262k);
        b13.A(y0Var, 11, p.f61330a, value.f61263l);
        boolean j14 = b13.j(y0Var);
        w1 w1Var = value.f61264m;
        if (j14 || w1Var != null) {
            b13.A(y0Var, 12, u1.f61371a, w1Var);
        }
        b13.a(y0Var);
    }

    @Override // qo2.a0
    public final no2.b[] d() {
        no2.b[] bVarArr = g0.f61251n;
        qo2.j1 j1Var = qo2.j1.f104576a;
        no2.b J2 = f0.h.J(g.f61249a);
        no2.b bVar = bVarArr[5];
        no2.b J3 = f0.h.J(j1Var);
        no2.b J4 = f0.h.J(d0.f61242a);
        no2.b J5 = f0.h.J(n0.f61320a);
        no2.b J6 = f0.h.J(h0.f61267a);
        no2.b J7 = f0.h.J(p.f61330a);
        no2.b J8 = f0.h.J(u1.f61371a);
        qo2.s sVar = qo2.s.f104618a;
        return new no2.b[]{j1Var, qo2.f0.f104550a, J2, sVar, sVar, bVar, J3, J4, J5, J6, g72.f0.f63980b, J7, J8};
    }

    @Override // no2.a
    public final Object e(po2.c decoder) {
        int i13;
        Intrinsics.checkNotNullParameter(decoder, "decoder");
        qo2.y0 y0Var = f61233b;
        po2.a b13 = decoder.b(y0Var);
        no2.a[] aVarArr = g0.f61251n;
        List list = null;
        g72.a0 a0Var = null;
        m0 m0Var = null;
        p0 p0Var = null;
        String str = null;
        i iVar = null;
        w1 w1Var = null;
        r rVar = null;
        double d2 = 0.0d;
        double d13 = 0.0d;
        int i14 = 0;
        int i15 = 0;
        boolean z13 = true;
        String str2 = null;
        f0 f0Var = null;
        while (z13) {
            boolean z14 = z13;
            int o13 = b13.o(y0Var);
            switch (o13) {
                case -1:
                    z13 = false;
                    continue;
                case 0:
                    i13 = i15;
                    str = b13.k(y0Var, 0);
                    i14 |= 1;
                    break;
                case 1:
                    i14 |= 2;
                    i15 = b13.D(y0Var, 1);
                    z13 = z14;
                    continue;
                case 2:
                    i13 = i15;
                    iVar = (i) b13.v(y0Var, 2, g.f61249a, iVar);
                    i14 |= 4;
                    break;
                case 3:
                    i13 = i15;
                    d13 = b13.y(y0Var, 3);
                    i14 |= 8;
                    break;
                case 4:
                    i13 = i15;
                    d2 = b13.y(y0Var, 4);
                    i14 |= 16;
                    break;
                case 5:
                    i13 = i15;
                    list = (List) b13.C(y0Var, 5, aVarArr[5], list);
                    i14 |= 32;
                    break;
                case 6:
                    i13 = i15;
                    str2 = (String) b13.v(y0Var, 6, qo2.j1.f104576a, str2);
                    i14 |= 64;
                    break;
                case 7:
                    i13 = i15;
                    f0Var = (f0) b13.v(y0Var, 7, d0.f61242a, f0Var);
                    i14 |= RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_FEEDBACK_FULL_SPAN;
                    break;
                case 8:
                    i13 = i15;
                    p0Var = (p0) b13.v(y0Var, 8, n0.f61320a, p0Var);
                    i14 |= RecyclerViewTypes.VIEW_TYPE_OTHER_BOARD_MORE_IDEAS_FEED_PAGES_HEADER;
                    break;
                case 9:
                    i13 = i15;
                    m0Var = (m0) b13.v(y0Var, 9, h0.f61267a, m0Var);
                    i14 |= BitmapUtils.BITMAP_TO_JPEG_SIZE;
                    break;
                case 10:
                    i13 = i15;
                    a0Var = (g72.a0) b13.C(y0Var, 10, g72.f0.f63980b, a0Var);
                    i14 |= 1024;
                    break;
                case 11:
                    i13 = i15;
                    rVar = (r) b13.v(y0Var, 11, p.f61330a, rVar);
                    i14 |= 2048;
                    break;
                case 12:
                    i13 = i15;
                    w1Var = (w1) b13.v(y0Var, 12, u1.f61371a, w1Var);
                    i14 |= 4096;
                    break;
                default:
                    throw new UnknownFieldException(o13);
            }
            z13 = z14;
            i15 = i13;
        }
        b13.a(y0Var);
        return new g0(i14, str, i15, iVar, d13, d2, list, str2, f0Var, p0Var, m0Var, a0Var, rVar, w1Var);
    }
}
