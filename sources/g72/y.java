package g72;

import com.pinterest.feature.core.view.RecyclerViewTypes;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.UnknownFieldException;
import net.quikkly.android.utils.BitmapUtils;

/* loaded from: classes4.dex */
public final class y implements qo2.a0 {

    /* renamed from: a, reason: collision with root package name */
    public static final y f64148a;

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ qo2.y0 f64149b;

    static {
        y yVar = new y();
        f64148a = yVar;
        qo2.y0 y0Var = new qo2.y0("com.pinterest.shuffles.data.entity.shuffle.effect.EffectDataEntity", yVar, 15);
        y0Var.k("isFlippedVertically", true);
        y0Var.k("isFlippedHorizontally", true);
        y0Var.k("isHidden", true);
        y0Var.k("isLocked", true);
        y0Var.k("alpha", true);
        y0Var.k("alphaEffectData", true);
        y0Var.k("motionEffectData", true);
        y0Var.k("frameEffectData", true);
        y0Var.k("filterEffectData", true);
        y0Var.k("backgroundColor", true);
        y0Var.k("bitmapMask", true);
        y0Var.k("rotationX", true);
        y0Var.k("rotationY", true);
        y0Var.k("keyframeAnimation", true);
        y0Var.k("objectId", true);
        f64149b = y0Var;
    }

    @Override // no2.h, no2.a
    public final oo2.g a() {
        return f64149b;
    }

    @Override // qo2.a0
    public final no2.b[] b() {
        return qo2.w0.f104647b;
    }

    @Override // no2.h
    public final void c(po2.d encoder, Object obj) {
        a0 value = (a0) obj;
        Intrinsics.checkNotNullParameter(encoder, "encoder");
        Intrinsics.checkNotNullParameter(value, "value");
        qo2.y0 y0Var = f64149b;
        po2.b b13 = encoder.b(y0Var);
        z zVar = a0.Companion;
        if (b13.j(y0Var) || value.f63910a) {
            b13.E(y0Var, 0, value.f63910a);
        }
        if (b13.j(y0Var) || value.f63911b) {
            b13.E(y0Var, 1, value.f63911b);
        }
        if (b13.j(y0Var) || value.f63912c) {
            b13.E(y0Var, 2, value.f63912c);
        }
        if (b13.j(y0Var) || value.f63913d) {
            b13.E(y0Var, 3, value.f63913d);
        }
        if (b13.j(y0Var) || Float.compare(value.f63914e, 1.0f) != 0) {
            b13.v(y0Var, 4, value.f63914e);
        }
        boolean j13 = b13.j(y0Var);
        no2.b[] bVarArr = a0.f63909p;
        if (j13 || value.f63915f != null) {
            b13.A(y0Var, 5, bVarArr[5], value.f63915f);
        }
        if (b13.j(y0Var) || value.f63916g != null) {
            b13.A(y0Var, 6, bVarArr[6], value.f63916g);
        }
        if (b13.j(y0Var) || value.f63917h != null) {
            b13.A(y0Var, 7, bVarArr[7], value.f63917h);
        }
        if (b13.j(y0Var) || value.f63918i != null) {
            b13.A(y0Var, 8, g0.f63987a, value.f63918i);
        }
        if (b13.j(y0Var) || value.f63919j != null) {
            b13.A(y0Var, 9, qo2.j1.f104576a, value.f63919j);
        }
        if (b13.j(y0Var) || value.f63920k != null) {
            b13.A(y0Var, 10, p.f64068a, value.f63920k);
        }
        if (b13.j(y0Var) || !Intrinsics.d(value.f63921l, Double.valueOf(0.0d))) {
            b13.A(y0Var, 11, qo2.s.f104618a, value.f63921l);
        }
        if (b13.j(y0Var) || !Intrinsics.d(value.f63922m, Double.valueOf(0.0d))) {
            b13.A(y0Var, 12, qo2.s.f104618a, value.f63922m);
        }
        if (b13.j(y0Var) || value.f63923n != null) {
            b13.A(y0Var, 13, d2.f63965b, value.f63923n);
        }
        if (b13.j(y0Var) || value.f63924o != null) {
            b13.A(y0Var, 14, qo2.j1.f104576a, value.f63924o);
        }
        b13.a(y0Var);
    }

    @Override // qo2.a0
    public final no2.b[] d() {
        no2.b[] bVarArr = a0.f63909p;
        no2.b J2 = f0.h.J(bVarArr[5]);
        no2.b J3 = f0.h.J(bVarArr[6]);
        no2.b J4 = f0.h.J(bVarArr[7]);
        no2.b J5 = f0.h.J(g0.f63987a);
        qo2.j1 j1Var = qo2.j1.f104576a;
        no2.b J6 = f0.h.J(j1Var);
        no2.b J7 = f0.h.J(p.f64068a);
        qo2.s sVar = qo2.s.f104618a;
        no2.b J8 = f0.h.J(sVar);
        no2.b J9 = f0.h.J(sVar);
        no2.b J10 = f0.h.J(d2.f63965b);
        no2.b J11 = f0.h.J(j1Var);
        qo2.g gVar = qo2.g.f104555a;
        return new no2.b[]{gVar, gVar, gVar, gVar, qo2.z.f104669a, J2, J3, J4, J5, J6, J7, J8, J9, J10, J11};
    }

    @Override // no2.a
    public final Object e(po2.c decoder) {
        boolean z13;
        Intrinsics.checkNotNullParameter(decoder, "decoder");
        qo2.y0 y0Var = f64149b;
        po2.a b13 = decoder.b(y0Var);
        no2.b[] bVarArr = a0.f63909p;
        v1 v1Var = null;
        Double d2 = null;
        r rVar = null;
        String str = null;
        String str2 = null;
        b2 b2Var = null;
        Double d13 = null;
        o oVar = null;
        u4 u4Var = null;
        float f13 = 0.0f;
        int i13 = 0;
        boolean z14 = false;
        boolean z15 = false;
        boolean z16 = false;
        boolean z17 = false;
        boolean z18 = true;
        i0 i0Var = null;
        while (z18) {
            boolean z19 = z15;
            int o13 = b13.o(y0Var);
            switch (o13) {
                case -1:
                    z18 = false;
                    z15 = z19;
                case 0:
                    i13 |= 1;
                    z14 = b13.h(y0Var, 0);
                    z15 = z19;
                case 1:
                    z13 = z14;
                    z15 = b13.h(y0Var, 1);
                    i13 |= 2;
                    z14 = z13;
                case 2:
                    z13 = z14;
                    z17 = b13.h(y0Var, 2);
                    i13 |= 4;
                    z15 = z19;
                    z14 = z13;
                case 3:
                    z13 = z14;
                    z16 = b13.h(y0Var, 3);
                    i13 |= 8;
                    z15 = z19;
                    z14 = z13;
                case 4:
                    z13 = z14;
                    f13 = b13.n(y0Var, 4);
                    i13 |= 16;
                    z15 = z19;
                    z14 = z13;
                case 5:
                    z13 = z14;
                    oVar = (o) b13.v(y0Var, 5, bVarArr[5], oVar);
                    i13 |= 32;
                    z15 = z19;
                    z14 = z13;
                case 6:
                    z13 = z14;
                    u4Var = (u4) b13.v(y0Var, 6, bVarArr[6], u4Var);
                    i13 |= 64;
                    z15 = z19;
                    z14 = z13;
                case 7:
                    z13 = z14;
                    v1Var = (v1) b13.v(y0Var, 7, bVarArr[7], v1Var);
                    i13 |= RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_FEEDBACK_FULL_SPAN;
                    z15 = z19;
                    z14 = z13;
                case 8:
                    z13 = z14;
                    i0Var = (i0) b13.v(y0Var, 8, g0.f63987a, i0Var);
                    i13 |= RecyclerViewTypes.VIEW_TYPE_OTHER_BOARD_MORE_IDEAS_FEED_PAGES_HEADER;
                    z15 = z19;
                    z14 = z13;
                case 9:
                    z13 = z14;
                    str = (String) b13.v(y0Var, 9, qo2.j1.f104576a, str);
                    i13 |= BitmapUtils.BITMAP_TO_JPEG_SIZE;
                    z15 = z19;
                    z14 = z13;
                case 10:
                    z13 = z14;
                    rVar = (r) b13.v(y0Var, 10, p.f64068a, rVar);
                    i13 |= 1024;
                    z15 = z19;
                    z14 = z13;
                case 11:
                    z13 = z14;
                    d2 = (Double) b13.v(y0Var, 11, qo2.s.f104618a, d2);
                    i13 |= 2048;
                    z15 = z19;
                    z14 = z13;
                case 12:
                    z13 = z14;
                    d13 = (Double) b13.v(y0Var, 12, qo2.s.f104618a, d13);
                    i13 |= 4096;
                    z15 = z19;
                    z14 = z13;
                case 13:
                    z13 = z14;
                    b2Var = (b2) b13.v(y0Var, 13, d2.f63965b, b2Var);
                    i13 |= 8192;
                    z15 = z19;
                    z14 = z13;
                case 14:
                    z13 = z14;
                    str2 = (String) b13.v(y0Var, 14, qo2.j1.f104576a, str2);
                    i13 |= 16384;
                    z15 = z19;
                    z14 = z13;
                default:
                    throw new UnknownFieldException(o13);
            }
        }
        b13.a(y0Var);
        return new a0(i13, z14, z15, z17, z16, f13, oVar, u4Var, v1Var, i0Var, str, rVar, d2, d13, b2Var, str2);
    }
}
