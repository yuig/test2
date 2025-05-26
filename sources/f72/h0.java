package f72;

import com.pinterest.feature.core.view.RecyclerViewTypes;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.UnknownFieldException;
import net.quikkly.android.utils.BitmapUtils;

/* loaded from: classes4.dex */
public final class h0 implements qo2.a0 {

    /* renamed from: a, reason: collision with root package name */
    public static final h0 f61267a;

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ qo2.y0 f61268b;

    static {
        h0 h0Var = new h0();
        f61267a = h0Var;
        qo2.y0 y0Var = new qo2.y0("com.pinterest.shuffles.data.entity.shuffle.ShuffleItemImageEntity", h0Var, 10);
        y0Var.k("id", false);
        y0Var.k("source", true);
        y0Var.k("file_name", true);
        y0Var.k("images", true);
        y0Var.k("asset_id", true);
        y0Var.k("user", true);
        y0Var.k("attribution", true);
        y0Var.k("community_available", true);
        y0Var.k("mask", true);
        y0Var.k("image_tracking_id", true);
        f61268b = y0Var;
    }

    @Override // no2.h, no2.a
    public final oo2.g a() {
        return f61268b;
    }

    @Override // qo2.a0
    public final no2.b[] b() {
        return qo2.w0.f104647b;
    }

    @Override // no2.h
    public final void c(po2.d encoder, Object obj) {
        m0 value = (m0) obj;
        Intrinsics.checkNotNullParameter(encoder, "encoder");
        Intrinsics.checkNotNullParameter(value, "value");
        qo2.y0 y0Var = f61268b;
        po2.b b13 = encoder.b(y0Var);
        b13.m(0, value.f61308a, y0Var);
        boolean j13 = b13.j(y0Var);
        int i13 = value.f61309b;
        if (j13 || i13 != 1) {
            b13.D(1, i13, y0Var);
        }
        boolean j14 = b13.j(y0Var);
        String str = value.f61310c;
        if (j14 || str != null) {
            b13.A(y0Var, 2, qo2.j1.f104576a, str);
        }
        boolean j15 = b13.j(y0Var);
        i iVar = value.f61311d;
        if (j15 || iVar != null) {
            b13.A(y0Var, 3, g.f61249a, iVar);
        }
        boolean j16 = b13.j(y0Var);
        String str2 = value.f61312e;
        if (j16 || str2 != null) {
            b13.A(y0Var, 4, qo2.j1.f104576a, str2);
        }
        boolean j17 = b13.j(y0Var);
        t1 t1Var = value.f61313f;
        if (j17 || t1Var != null) {
            b13.A(y0Var, 5, r1.f61359a, t1Var);
        }
        boolean j18 = b13.j(y0Var);
        k0 k0Var = value.f61314g;
        if (j18 || k0Var != null) {
            b13.A(y0Var, 6, i0.f61274a, k0Var);
        }
        boolean j19 = b13.j(y0Var);
        boolean z13 = value.f61315h;
        if (j19 || !z13) {
            b13.E(y0Var, 7, z13);
        }
        boolean j23 = b13.j(y0Var);
        String str3 = value.f61316i;
        if (j23 || str3 != null) {
            b13.A(y0Var, 8, qo2.j1.f104576a, str3);
        }
        boolean j24 = b13.j(y0Var);
        String str4 = value.f61317j;
        if (j24 || str4 != null) {
            b13.A(y0Var, 9, qo2.j1.f104576a, str4);
        }
        b13.a(y0Var);
    }

    @Override // qo2.a0
    public final no2.b[] d() {
        qo2.j1 j1Var = qo2.j1.f104576a;
        return new no2.b[]{j1Var, qo2.f0.f104550a, f0.h.J(j1Var), f0.h.J(g.f61249a), f0.h.J(j1Var), f0.h.J(r1.f61359a), f0.h.J(i0.f61274a), qo2.g.f104555a, f0.h.J(j1Var), f0.h.J(j1Var)};
    }

    @Override // no2.a
    public final Object e(po2.c decoder) {
        Intrinsics.checkNotNullParameter(decoder, "decoder");
        qo2.y0 y0Var = f61268b;
        po2.a b13 = decoder.b(y0Var);
        String str = null;
        String str2 = null;
        String str3 = null;
        i iVar = null;
        String str4 = null;
        t1 t1Var = null;
        k0 k0Var = null;
        String str5 = null;
        boolean z13 = true;
        int i13 = 0;
        int i14 = 0;
        boolean z14 = false;
        while (z13) {
            int o13 = b13.o(y0Var);
            switch (o13) {
                case -1:
                    z13 = false;
                    break;
                case 0:
                    str2 = b13.k(y0Var, 0);
                    i13 |= 1;
                    break;
                case 1:
                    i14 = b13.D(y0Var, 1);
                    i13 |= 2;
                    break;
                case 2:
                    str3 = (String) b13.v(y0Var, 2, qo2.j1.f104576a, str3);
                    i13 |= 4;
                    break;
                case 3:
                    iVar = (i) b13.v(y0Var, 3, g.f61249a, iVar);
                    i13 |= 8;
                    break;
                case 4:
                    str4 = (String) b13.v(y0Var, 4, qo2.j1.f104576a, str4);
                    i13 |= 16;
                    break;
                case 5:
                    t1Var = (t1) b13.v(y0Var, 5, r1.f61359a, t1Var);
                    i13 |= 32;
                    break;
                case 6:
                    k0Var = (k0) b13.v(y0Var, 6, i0.f61274a, k0Var);
                    i13 |= 64;
                    break;
                case 7:
                    z14 = b13.h(y0Var, 7);
                    i13 |= RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_FEEDBACK_FULL_SPAN;
                    break;
                case 8:
                    str5 = (String) b13.v(y0Var, 8, qo2.j1.f104576a, str5);
                    i13 |= RecyclerViewTypes.VIEW_TYPE_OTHER_BOARD_MORE_IDEAS_FEED_PAGES_HEADER;
                    break;
                case 9:
                    str = (String) b13.v(y0Var, 9, qo2.j1.f104576a, str);
                    i13 |= BitmapUtils.BITMAP_TO_JPEG_SIZE;
                    break;
                default:
                    throw new UnknownFieldException(o13);
            }
        }
        b13.a(y0Var);
        return new m0(i13, str2, i14, str3, iVar, str4, t1Var, k0Var, z14, str5, str);
    }
}
