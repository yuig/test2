package f72;

import com.pinterest.feature.core.view.RecyclerViewTypes;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.UnknownFieldException;

/* loaded from: classes4.dex */
public final class p implements qo2.a0 {

    /* renamed from: a, reason: collision with root package name */
    public static final p f61330a;

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ qo2.y0 f61331b;

    static {
        p pVar = new p();
        f61330a = pVar;
        qo2.y0 y0Var = new qo2.y0("com.pinterest.shuffles.data.entity.shuffle.ShuffleAssetEntity", pVar, 9);
        y0Var.k("id", false);
        y0Var.k("is_favorited_by_me", true);
        y0Var.k("mask", true);
        y0Var.k("pin", true);
        y0Var.k("shuffle_item_image", true);
        y0Var.k("source_images", true);
        y0Var.k("bitmap_mask", true);
        y0Var.k("user", true);
        y0Var.k("cutout_images", true);
        f61331b = y0Var;
    }

    @Override // no2.h, no2.a
    public final oo2.g a() {
        return f61331b;
    }

    @Override // qo2.a0
    public final no2.b[] b() {
        return qo2.w0.f104647b;
    }

    @Override // no2.h
    public final void c(po2.d encoder, Object obj) {
        r value = (r) obj;
        Intrinsics.checkNotNullParameter(encoder, "encoder");
        Intrinsics.checkNotNullParameter(value, "value");
        qo2.y0 y0Var = f61331b;
        po2.b b13 = encoder.b(y0Var);
        b13.m(0, value.f61349a, y0Var);
        boolean j13 = b13.j(y0Var);
        boolean z13 = value.f61350b;
        if (j13 || z13) {
            b13.E(y0Var, 1, z13);
        }
        boolean j14 = b13.j(y0Var);
        String str = value.f61351c;
        if (j14 || str != null) {
            b13.A(y0Var, 2, qo2.j1.f104576a, str);
        }
        boolean j15 = b13.j(y0Var);
        e72.f fVar = value.f61352d;
        if (j15 || fVar != null) {
            b13.A(y0Var, 3, e72.d.f57629a, fVar);
        }
        boolean j16 = b13.j(y0Var);
        m0 m0Var = value.f61353e;
        if (j16 || m0Var != null) {
            b13.A(y0Var, 4, h0.f61267a, m0Var);
        }
        boolean j17 = b13.j(y0Var);
        i iVar = value.f61354f;
        if (j17 || iVar != null) {
            b13.A(y0Var, 5, g.f61249a, iVar);
        }
        boolean j18 = b13.j(y0Var);
        g72.r rVar = value.f61355g;
        if (j18 || rVar != null) {
            b13.A(y0Var, 6, g72.p.f64068a, rVar);
        }
        boolean j19 = b13.j(y0Var);
        t1 t1Var = value.f61356h;
        if (j19 || t1Var != null) {
            b13.A(y0Var, 7, r1.f61359a, t1Var);
        }
        boolean j23 = b13.j(y0Var);
        i iVar2 = value.f61357i;
        if (j23 || iVar2 != null) {
            b13.A(y0Var, 8, g.f61249a, iVar2);
        }
        b13.a(y0Var);
    }

    @Override // qo2.a0
    public final no2.b[] d() {
        qo2.j1 j1Var = qo2.j1.f104576a;
        no2.b J2 = f0.h.J(j1Var);
        no2.b J3 = f0.h.J(e72.d.f57629a);
        no2.b J4 = f0.h.J(h0.f61267a);
        g gVar = g.f61249a;
        return new no2.b[]{j1Var, qo2.g.f104555a, J2, J3, J4, f0.h.J(gVar), f0.h.J(g72.p.f64068a), f0.h.J(r1.f61359a), f0.h.J(gVar)};
    }

    @Override // no2.a
    public final Object e(po2.c decoder) {
        Intrinsics.checkNotNullParameter(decoder, "decoder");
        qo2.y0 y0Var = f61331b;
        po2.a b13 = decoder.b(y0Var);
        String str = null;
        String str2 = null;
        e72.f fVar = null;
        m0 m0Var = null;
        i iVar = null;
        g72.r rVar = null;
        t1 t1Var = null;
        i iVar2 = null;
        int i13 = 0;
        boolean z13 = false;
        boolean z14 = true;
        while (z14) {
            int o13 = b13.o(y0Var);
            switch (o13) {
                case -1:
                    z14 = false;
                    break;
                case 0:
                    str = b13.k(y0Var, 0);
                    i13 |= 1;
                    break;
                case 1:
                    z13 = b13.h(y0Var, 1);
                    i13 |= 2;
                    break;
                case 2:
                    str2 = (String) b13.v(y0Var, 2, qo2.j1.f104576a, str2);
                    i13 |= 4;
                    break;
                case 3:
                    fVar = (e72.f) b13.v(y0Var, 3, e72.d.f57629a, fVar);
                    i13 |= 8;
                    break;
                case 4:
                    m0Var = (m0) b13.v(y0Var, 4, h0.f61267a, m0Var);
                    i13 |= 16;
                    break;
                case 5:
                    iVar = (i) b13.v(y0Var, 5, g.f61249a, iVar);
                    i13 |= 32;
                    break;
                case 6:
                    rVar = (g72.r) b13.v(y0Var, 6, g72.p.f64068a, rVar);
                    i13 |= 64;
                    break;
                case 7:
                    t1Var = (t1) b13.v(y0Var, 7, r1.f61359a, t1Var);
                    i13 |= RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_FEEDBACK_FULL_SPAN;
                    break;
                case 8:
                    iVar2 = (i) b13.v(y0Var, 8, g.f61249a, iVar2);
                    i13 |= RecyclerViewTypes.VIEW_TYPE_OTHER_BOARD_MORE_IDEAS_FEED_PAGES_HEADER;
                    break;
                default:
                    throw new UnknownFieldException(o13);
            }
        }
        b13.a(y0Var);
        return new r(i13, str, z13, str2, fVar, m0Var, iVar, rVar, t1Var, iVar2);
    }
}
