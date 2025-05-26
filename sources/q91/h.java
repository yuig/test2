package q91;

import android.widget.LinearLayout;
import com.pinterest.api.model.wy0;
import ea1.q1;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class h extends kotlin.jvm.internal.s implements Function1 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f103125i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ Object f103126j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ h(Object obj, int i13) {
        super(1);
        this.f103125i = i13;
        this.f103126j = obj;
    }

    public final do1.d b(do1.d it) {
        int i13 = this.f103125i;
        Object obj = this.f103126j;
        switch (i13) {
            case 7:
                Intrinsics.checkNotNullParameter(it, "it");
                z91.c cVar = (z91.c) obj;
                return do1.d.e(cVar.f141361a, null, null, null, 0, cVar.f141362b, 255);
            default:
                Intrinsics.checkNotNullParameter(it, "it");
                aa1.c cVar2 = (aa1.c) obj;
                return do1.d.e(cVar2.f1640a, null, null, null, 0, cVar2.f1641b, 255);
        }
    }

    public final rl1.q e(rl1.q it) {
        String str;
        String Z2;
        int i13 = this.f103125i;
        Object obj = this.f103126j;
        switch (i13) {
            case 21:
                Intrinsics.checkNotNullParameter(it, "it");
                ja1.c cVar = (ja1.c) obj;
                wy0 wy0Var = cVar.f75304b;
                String str2 = "";
                if (wy0Var == null || (str = wy0Var.l3()) == null) {
                    str = "";
                }
                wy0 wy0Var2 = cVar.f75304b;
                if (wy0Var2 != null && (Z2 = wy0Var2.Z2()) != null) {
                    str2 = Z2;
                }
                Integer q23 = wy0Var2 != null ? wy0Var2.q2() : null;
                return rl1.q.e(it, str, str2, false, null, null, false, false, null, 0, q23 == null ? rl1.b.f108524a : new rl1.d(q23.intValue()), null, 1532);
            default:
                Intrinsics.checkNotNullParameter(it, "it");
                xa1.w wVar = (xa1.w) obj;
                return rl1.q.e(it, wVar.f134490a, wVar.f134491b, false, null, null, false, false, null, 0, new rl1.d(wVar.f134495f), null, 1532);
        }
    }

    public final rn1.a f(rn1.a it) {
        int i13 = this.f103125i;
        Object obj = this.f103126j;
        switch (i13) {
            case 1:
                Intrinsics.checkNotNullParameter(it, "it");
                return rn1.a.y(it, null, ((m91.b) obj).f86725e ? vn1.c.ERROR : vn1.c.DEFAULT, null, null, vn1.g.HEADING_700, 0, null, null, null, null, false, 0, null, null, null, null, null, false, null, null, 2097133);
            case 2:
                Intrinsics.checkNotNullParameter(it, "it");
                rn1.a y13 = rn1.a.y(it, null, null, null, null, vn1.g.UI_400, 0, null, null, null, null, false, 0, null, null, null, null, null, false, null, null, 2097135);
                ((o) obj).setLayoutParams(new LinearLayout.LayoutParams(-2, -2));
                return y13;
            case 13:
                Intrinsics.checkNotNullParameter(it, "it");
                return rn1.a.y(it, bs1.c.j2(new String[0], ((ba1.j) obj).f22374b.intValue()), null, null, null, null, 0, null, null, null, null, false, 0, null, null, null, null, null, false, null, null, 2097150);
            case 17:
                Intrinsics.checkNotNullParameter(it, "it");
                return rn1.a.y(it, bs1.c.j2(new String[0], ((ea1.a) obj).f58030t.intValue()), null, null, null, null, 0, null, null, null, null, false, 0, null, null, null, null, null, false, null, null, 2097150);
            default:
                Intrinsics.checkNotNullParameter(it, "it");
                return rn1.a.y(it, null, null, null, null, ((va1.p) obj).f125225c, 0, null, null, null, null, false, 0, null, null, null, null, null, false, null, null, 2097135);
        }
    }

    public final yl1.b h(yl1.b it) {
        int i13 = this.f103125i;
        Object obj = this.f103126j;
        switch (i13) {
            case 9:
                Intrinsics.checkNotNullParameter(it, "it");
                return yl1.b.f(it, ((z91.x) obj).f141410c, false, null, null, null, null, null, null, 0, null, 1022);
            default:
                Intrinsics.checkNotNullParameter(it, "it");
                return yl1.b.f(it, ((aa1.a0) obj).f1636c, false, null, null, null, null, null, null, 0, null, 1022);
        }
    }

    public final void i(l82.n start) {
        int i13 = this.f103125i;
        Object obj = this.f103126j;
        switch (i13) {
            case 4:
                Intrinsics.checkNotNullParameter(start, "$this$start");
                v91.v vVar = (v91.v) obj;
                l82.n.b(start, vVar.f125012c);
                k92.l lVar = vVar.f125013d;
                start.a(lVar, new kp.n(3), lVar.a());
                break;
            case 6:
                Intrinsics.checkNotNullParameter(start, "$this$buildAndStart");
                x91.l0 l0Var = (x91.l0) obj;
                mb0.a aVar = (mb0.a) l0Var.f134340h.f63225b;
                start.a(aVar, new kp.n(4), aVar.a());
                ws.q qVar = l0Var.f134336d;
                start.a(qVar, new kp.n(6), qVar.a());
                zb0.i iVar = l0Var.f134337e;
                start.a(iVar, new kp.n(5), iVar.a());
                k92.l lVar2 = l0Var.f134339g;
                start.a(lVar2, new kp.n(7), lVar2.a());
                zy.d0 d0Var = l0Var.f134338f;
                start.a(d0Var, new kp.n(8), d0Var.a());
                break;
            case 8:
                Intrinsics.checkNotNullParameter(start, "$this$start");
                l82.n.b(start, ((z91.v) obj).f141402c);
                break;
            case 11:
                Intrinsics.checkNotNullParameter(start, "$this$start");
                l82.n.b(start, ((aa1.z) obj).f1683c);
                break;
            case 14:
                Intrinsics.checkNotNullParameter(start, "$this$start");
                ba1.p0 p0Var = (ba1.p0) obj;
                mb0.a aVar2 = (mb0.a) p0Var.f22392e.f63225b;
                start.a(aVar2, new kp.n(9), aVar2.a());
                w60.d dVar = p0Var.f22390c;
                start.a(dVar, new kp.n(10), dVar.a());
                l82.n.b(start, p0Var.f22391d);
                break;
            case 16:
                Intrinsics.checkNotNullParameter(start, "$this$buildAndStart");
                ca1.v vVar2 = (ca1.v) obj;
                l82.n.b(start, vVar2.f27228c);
                zy.d0 d0Var2 = vVar2.f27229d;
                start.a(d0Var2, new kp.n(11), d0Var2.a());
                break;
            case 18:
                Intrinsics.checkNotNullParameter(start, "$this$start");
                q1 q1Var = (q1) obj;
                l82.n.b(start, q1Var.f58118c);
                k92.l lVar3 = q1Var.f58119d;
                start.a(lVar3, new kp.n(13), lVar3.a());
                zy.d0 d0Var3 = q1Var.f58120e;
                start.a(d0Var3, new kp.n(14), d0Var3.a());
                w60.d dVar2 = q1Var.f58121f;
                start.a(dVar2, new kp.n(15), dVar2.a());
                zb0.i iVar2 = q1Var.f58122g;
                start.a(iVar2, new kp.n(12), iVar2.a());
                break;
            case 19:
                Intrinsics.checkNotNullParameter(start, "$this$buildAndStart");
                ga1.x xVar = (ga1.x) obj;
                l82.n.b(start, xVar.f64660c);
                zy.d0 d0Var4 = xVar.f64661d;
                start.a(d0Var4, new kp.n(16), d0Var4.a());
                k92.l lVar4 = xVar.f64662e;
                start.a(lVar4, new kp.n(17), lVar4.a());
                break;
            default:
                Intrinsics.checkNotNullParameter(start, "$this$start");
                ma1.y yVar = (ma1.y) obj;
                k92.l lVar5 = yVar.f86820d;
                start.a(lVar5, new kp.n(20), lVar5.a());
                mb0.a aVar3 = (mb0.a) yVar.f86822f.f63225b;
                start.a(aVar3, new kp.n(18), aVar3.a());
                gx.e eVar = yVar.f86819c;
                start.a(eVar, new kp.n(19), eVar.a());
                break;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:62:0x01d5  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x01e4  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x01f3  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0217  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x023c  */
    @Override // kotlin.jvm.functions.Function1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invoke(java.lang.Object r12) {
        /*
            Method dump skipped, instructions count: 1124
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: q91.h.invoke(java.lang.Object):java.lang.Object");
    }
}
