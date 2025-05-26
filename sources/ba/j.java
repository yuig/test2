package ba;

import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import ao2.j0;
import ao2.m0;
import ca0.f0;
import com.pinterest.shuffles.scene.composer.z0;
import i2.c2;
import i2.z1;
import java.util.List;
import kh2.g0;
import kh2.s0;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import q3.p0;
import r72.q1;

/* loaded from: classes3.dex */
public final class j extends kotlin.jvm.internal.s implements Function2 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f22270i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ Object f22271j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ Object f22272k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ Object f22273l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ Object f22274m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ Object f22275n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ j(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, int i13) {
        super(2);
        this.f22270i = i13;
        this.f22271j = obj;
        this.f22272k = obj2;
        this.f22273l = obj3;
        this.f22274m = obj4;
        this.f22275n = obj5;
    }

    public final void b(i2.o oVar, int i13) {
        int i14;
        int i15 = this.f22270i;
        Object obj = this.f22275n;
        Object obj2 = this.f22274m;
        Object obj3 = this.f22273l;
        Object obj4 = this.f22272k;
        Object obj5 = this.f22271j;
        switch (i15) {
            case 0:
                if ((i13 & 11) == 2) {
                    i2.s sVar = (i2.s) oVar;
                    if (sVar.z()) {
                        sVar.Q();
                        return;
                    }
                }
                z9.k kVar = (z9.k) obj5;
                i2.u.b(kVar, new e.f((s2.t) obj3, kVar, (n) obj2, 15), oVar);
                s0.o(kVar, (r2.d) obj4, q2.i.b(oVar, -497631156, new androidx.compose.foundation.lazy.layout.v(6, (m) obj, kVar)), oVar, 456);
                return;
            case 1:
                if ((i13 & 11) == 2) {
                    i2.s sVar2 = (i2.s) oVar;
                    if (sVar2.z()) {
                        sVar2.Q();
                        return;
                    }
                }
                androidx.compose.ui.viewinterop.a.a(f0.f27108j, null, new e.c((q1) obj5, (j0) obj4, (n72.m) obj3, (z0) obj2, (List) obj, 9), oVar, 6, 2);
                return;
            default:
                if ((i13 & 11) == 2) {
                    i2.s sVar3 = (i2.s) oVar;
                    if (sVar3.z()) {
                        sVar3.Q();
                        return;
                    }
                }
                u2.q b13 = androidx.compose.foundation.layout.e.b((u2.q) obj5, 1.0f);
                i2.s sVar4 = (i2.s) oVar;
                sVar4.W(58605818);
                sVar4.W(58606387);
                c2 c2Var = AndroidCompositionLocals_androidKt.f17455b;
                boolean booleanValue = ((Boolean) ((Function1) obj4).invoke(sVar4.m(c2Var))).booleanValue();
                sVar4.r(false);
                if (booleanValue) {
                    i14 = oc0.n.color_demo_background_always_light;
                } else {
                    sVar4.W(58610277);
                    boolean booleanValue2 = ((Boolean) ((Function1) obj3).invoke(sVar4.m(c2Var))).booleanValue();
                    sVar4.r(false);
                    i14 = booleanValue2 ? oc0.n.color_demo_background_inverse : oc0.n.color_demo_background;
                }
                sVar4.r(false);
                float f13 = 8;
                u2.q q13 = androidx.compose.foundation.layout.b.q(androidx.compose.foundation.a.b(b13, g0.h(i14, sVar4), b3.s0.f21349a), f13, com.bumptech.glide.d.A(oc0.o.custom_view_padding, sVar4), f13, com.bumptech.glide.d.A(oc0.o.custom_view_padding, sVar4));
                Function1 function1 = (Function1) obj2;
                u2.q qVar = (u2.q) obj;
                p0 e13 = p1.q.e(u2.b.f120017e, false);
                int i16 = sVar4.P;
                z1 o13 = sVar4.o();
                u2.q X = m0.X(sVar4, q13);
                s3.k.Qo.getClass();
                Function0 function0 = s3.j.f110798b;
                if (!(sVar4.f71265a instanceof i2.f)) {
                    com.bumptech.glide.c.j0();
                    throw null;
                }
                sVar4.a0();
                if (sVar4.O) {
                    sVar4.n(function0);
                } else {
                    sVar4.j0();
                }
                tb.f.f0(sVar4, e13, s3.j.f110801e);
                tb.f.f0(sVar4, o13, s3.j.f110800d);
                s3.h hVar = s3.j.f110802f;
                if (sVar4.O || !Intrinsics.d(sVar4.J(), Integer.valueOf(i16))) {
                    ep.b.y(i16, sVar4, i16, hVar);
                }
                tb.f.f0(sVar4, X, s3.j.f110799c);
                int i17 = 1;
                if (function1 != null) {
                    sVar4.W(-1410972471);
                    boolean h10 = sVar4.h(function1);
                    Object J2 = sVar4.J();
                    if (h10 || J2 == i2.n.f71185a) {
                        J2 = new t90.n(i17, function1);
                        sVar4.g0(J2);
                    }
                    sVar4.r(false);
                    androidx.compose.ui.viewinterop.a.a((Function1) J2, qVar, null, sVar4, 0, 4);
                }
                sVar4.r(true);
                return;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        switch (this.f22270i) {
            case 0:
                b((i2.o) obj, ((Number) obj2).intValue());
                break;
            case 1:
                b((i2.o) obj, ((Number) obj2).intValue());
                break;
            default:
                b((i2.o) obj, ((Number) obj2).intValue());
                break;
        }
        return Unit.f80348a;
    }
}
