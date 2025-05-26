package ql1;

import android.view.View;
import bm1.v;
import com.pinterest.feature.core.view.RecyclerViewTypes;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.s;
import nm1.h1;
import nm1.p0;
import nm1.t;
import nm1.w;
import nm1.x;
import nm1.y;
import rl1.c0;
import rl1.q;
import rl1.r;
import u50.i0;
import u50.k0;
import wm1.u;
import wm1.z;
import ym1.p;

/* loaded from: classes5.dex */
public final class k extends s implements Function1 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f104092i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ Object f104093j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ k(Object obj, int i13) {
        super(1);
        this.f104092i = i13;
        this.f104093j = obj;
    }

    public final q b(q it) {
        int i13 = this.f104092i;
        Object obj = this.f104093j;
        switch (i13) {
            case 3:
                Intrinsics.checkNotNullParameter(it, "it");
                c0 c0Var = (c0) obj;
                return new q(c0Var.f108528a, c0Var.f108529b, c0Var.f108530c, c0Var.f108531d, c0Var.f108532e, c0Var.f108533f, c0Var.f108534g, c0Var.f108535h, c0Var.f108536i, c0Var.f108537j, c0Var.f108538k);
            case 13:
                Intrinsics.checkNotNullParameter(it, "it");
                return (q) obj;
            default:
                Intrinsics.checkNotNullParameter(it, "it");
                u uVar = (u) ((z) obj);
                String str = uVar.f130335b;
                r rVar = r.LG;
                int i14 = ho1.b.list_action_avatar;
                Integer num = uVar.f130337d;
                return q.e(it, str, uVar.f130336c, false, rVar, null, false, false, null, i14, num == null ? rl1.b.f108524a : new rl1.d(num.intValue()), null, 1268);
        }
    }

    public final sl1.i e(sl1.i it) {
        int i13 = this.f104092i;
        Object obj = this.f104093j;
        switch (i13) {
            case 4:
                Intrinsics.checkNotNullParameter(it, "it");
                sl1.q qVar = (sl1.q) obj;
                fm1.c cVar = qVar.f113217f;
                int i14 = qVar.f113218g;
                return new sl1.i(qVar.f113212a, qVar.f113213b, qVar.f113214c, qVar.f113215d, qVar.f113216e, cVar, i14, qVar.f113219h);
            default:
                Intrinsics.checkNotNullParameter(it, "it");
                return (sl1.i) obj;
        }
    }

    public final ym1.c f(ym1.c it) {
        int i13 = this.f104092i;
        Object obj = this.f104093j;
        switch (i13) {
            case 28:
                Intrinsics.checkNotNullParameter(it, "it");
                p pVar = (p) obj;
                List list = pVar.f139442b;
                ym1.g gVar = pVar.f139445e;
                View view = pVar.f139446f;
                return new ym1.c(pVar.f139441a, list, pVar.f139443c, pVar.f139444d, gVar, view, pVar.f139447g);
            default:
                Intrinsics.checkNotNullParameter(it, "it");
                return ym1.c.e(it, null, null, (ym1.e) obj, RecyclerViewTypes.VIEW_TYPE_CAROUSEL_VIDEO_CELL);
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i13 = this.f104092i;
        Object obj2 = this.f104093j;
        switch (i13) {
            case 0:
                e it = (e) obj;
                Intrinsics.checkNotNullParameter(it, "it");
                j jVar = (j) obj2;
                break;
            case 1:
                Unit it2 = (Unit) obj;
                Intrinsics.checkNotNullParameter(it2, "it");
                break;
            case 2:
                c0 bind = (c0) obj;
                Intrinsics.checkNotNullParameter(bind, "$this$bind");
                rl1.a aVar = (rl1.a) obj2;
                String imageUrl = aVar.f108519a;
                bind.getClass();
                Intrinsics.checkNotNullParameter(imageUrl, "imageUrl");
                bind.f108528a = imageUrl;
                bind.a(aVar.f108522d);
                String name = aVar.f108520b;
                Intrinsics.checkNotNullParameter(name, "name");
                bind.f108529b = name;
                break;
            case 5:
                ul1.c it3 = (ul1.c) obj;
                Intrinsics.checkNotNullParameter(it3, "it");
                ul1.p pVar = (ul1.p) obj2;
                i0 i0Var = pVar.f122479a;
                ul1.l lVar = pVar.f122481c;
                boolean z13 = pVar.f122484f;
                break;
            case 7:
                rn1.a it4 = (rn1.a) obj;
                Intrinsics.checkNotNullParameter(it4, "it");
                break;
            case 8:
                vl1.d it5 = (vl1.d) obj;
                Intrinsics.checkNotNullParameter(it5, "it");
                vl1.p pVar2 = (vl1.p) obj2;
                i0 i0Var2 = pVar2.f126140a;
                i0 i0Var3 = pVar2.f126141b;
                boolean z14 = pVar2.f126142c;
                vl1.l lVar2 = pVar2.f126144e;
                fm1.c cVar = pVar2.f126147h;
                break;
            case 9:
                am1.b it6 = (am1.b) obj;
                Intrinsics.checkNotNullParameter(it6, "it");
                am1.h hVar = (am1.h) obj2;
                break;
            case 10:
                bm1.m it7 = (bm1.m) obj;
                switch (i13) {
                    case 10:
                        Intrinsics.checkNotNullParameter(it7, "it");
                        v vVar = (v) obj2;
                        break;
                    default:
                        Intrinsics.checkNotNullParameter(it7, "it");
                        break;
                }
            case 11:
                cm1.d it8 = (cm1.d) obj;
                Intrinsics.checkNotNullParameter(it8, "it");
                cm1.i iVar = (cm1.i) obj2;
                break;
            case 14:
                bm1.m it9 = (bm1.m) obj;
                switch (i13) {
                    case 10:
                        Intrinsics.checkNotNullParameter(it9, "it");
                        v vVar2 = (v) obj2;
                        break;
                    default:
                        Intrinsics.checkNotNullParameter(it9, "it");
                        break;
                }
            case 15:
                jm1.b it10 = (jm1.b) obj;
                switch (i13) {
                    case 15:
                        Intrinsics.checkNotNullParameter(it10, "it");
                        break;
                    default:
                        Intrinsics.checkNotNullParameter(it10, "it");
                        jm1.f fVar = (jm1.f) obj2;
                        break;
                }
            case 16:
                un1.c it11 = (un1.c) obj;
                Intrinsics.checkNotNullParameter(it11, "it");
                break;
            case 17:
                on1.k it12 = (on1.k) obj;
                Intrinsics.checkNotNullParameter(it12, "it");
                break;
            case 18:
                jm1.b it13 = (jm1.b) obj;
                switch (i13) {
                    case 15:
                        Intrinsics.checkNotNullParameter(it13, "it");
                        break;
                    default:
                        Intrinsics.checkNotNullParameter(it13, "it");
                        jm1.f fVar2 = (jm1.f) obj2;
                        break;
                }
            case 19:
                cn1.d state = (cn1.d) obj;
                Intrinsics.checkNotNullParameter(state, "state");
                y yVar = (y) obj2;
                if (!(yVar instanceof x)) {
                    if (!(yVar instanceof w)) {
                        if (!(yVar instanceof nm1.v)) {
                            break;
                        } else {
                            break;
                        }
                    } else {
                        w wVar = (w) yVar;
                        rm1.q qVar = wVar.f91498a;
                        i0 i0Var4 = wVar.f91500c;
                        if (i0Var4 == null) {
                            i0Var4 = new k0(h1.content_description_icon_button_default);
                        }
                        cn1.f fVar3 = new cn1.f(i0Var4, qVar);
                        i0 i0Var5 = wVar.f91501d;
                        if (i0Var5 == null) {
                            i0Var5 = new k0(h1.content_description_icon_button_default);
                        }
                        break;
                    }
                } else {
                    x xVar = (x) yVar;
                    rm1.q qVar2 = xVar.f91505a;
                    i0 i0Var6 = xVar.f91506b;
                    if (i0Var6 == null) {
                        i0Var6 = new k0(h1.content_description_icon_button_default);
                    }
                    break;
                }
            case 20:
                nm1.k userAction = (nm1.k) obj;
                Intrinsics.checkNotNullParameter(userAction, "userAction");
                if (userAction instanceof nm1.i) {
                    t tVar = (t) obj2;
                    tVar.f91492b.i(new p0(userAction, 0));
                    tVar.f91491a.H2(new p0(userAction, 1));
                } else if (userAction instanceof nm1.j) {
                    t tVar2 = (t) obj2;
                    tVar2.f91492b.i(new p0(userAction, 2));
                    tVar2.f91491a.H2(new p0(userAction, 3));
                }
                break;
            case 21:
                om1.c it14 = (om1.c) obj;
                Intrinsics.checkNotNullParameter(it14, "it");
                om1.q qVar3 = (om1.q) obj2;
                break;
            case 22:
                qm1.b it15 = (qm1.b) obj;
                Intrinsics.checkNotNullParameter(it15, "it");
                qm1.l lVar3 = (qm1.l) obj2;
                break;
            case 23:
                rm1.d it16 = (rm1.d) obj;
                Intrinsics.checkNotNullParameter(it16, "it");
                break;
            case 25:
                rn1.k bind2 = (rn1.k) obj;
                Intrinsics.checkNotNullParameter(bind2, "$this$bind");
                wm1.s sVar = (wm1.s) obj2;
                bind2.g(sVar.f130332a);
                bind2.f108896k = sVar.f130334c;
                break;
            case 26:
                wm1.c it17 = (wm1.c) obj;
                Intrinsics.checkNotNullParameter(it17, "it");
                wm1.k0 k0Var = (wm1.k0) obj2;
                break;
            case 27:
                yl1.b it18 = (yl1.b) obj;
                Intrinsics.checkNotNullParameter(it18, "it");
                ym1.d dVar = ((ym1.c) obj2).f139414c;
                if (dVar != null) {
                    break;
                }
                break;
        }
        return f((ym1.c) obj);
    }
}
