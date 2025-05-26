package th0;

import a41.r;
import ac2.m;
import ac2.o1;
import android.animation.Animator;
import android.os.Handler;
import android.widget.FrameLayout;
import androidx.viewpager.widget.ViewPager;
import dd2.f;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import oi.j0;
import pk.a0;
import ug1.g;
import wg1.j;
import wg1.p;
import xa.i;

/* loaded from: classes5.dex */
public final class b implements i {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f117633a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f117634b;

    public /* synthetic */ b(Object obj, int i13) {
        this.f117633a = i13;
        this.f117634b = obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // xa.i
    public final void A5(int i13) {
        int i14 = this.f117633a;
        Object obj = this.f117634b;
        switch (i14) {
            case 0:
                d dVar = (d) obj;
                dVar.f117644h = System.currentTimeMillis();
                dVar.f117637a.f112916e = i13;
                d.t3(dVar, i13 + 1, 2);
                break;
            case 1:
                ((Animator) obj).cancel();
                break;
            case 2:
                nl1.d Z7 = ((r) obj).Z7();
                i iVar = Z7 instanceof i ? (i) Z7 : null;
                if (iVar != null) {
                    iVar.A5(i13);
                    break;
                }
                break;
            case 3:
                j jVar = (j) obj;
                int i15 = j.f129778t;
                jVar.g(i13);
                if (((Boolean) jVar.f129782d.invoke()).booleanValue()) {
                    xa.a aVar = jVar.f129795q.f19892e;
                    p pVar = aVar instanceof p ? (p) aVar : null;
                    if (pVar != null) {
                        pVar.n(i13, 0);
                    }
                }
                g gVar = jVar.f129794p;
                if (gVar != null) {
                    gVar.s3(i13, false);
                    break;
                }
                break;
            case 4:
                wg1.r rVar = (wg1.r) obj;
                int i16 = wg1.r.f129827r;
                rVar.a(i13);
                if (((Boolean) rVar.f129831d.invoke()).booleanValue()) {
                    xa.a aVar2 = rVar.f129841n.f19892e;
                    p pVar2 = aVar2 instanceof p ? (p) aVar2 : null;
                    if (pVar2 != null) {
                        pVar2.n(i13, 1);
                        break;
                    }
                }
                break;
        }
    }

    @Override // xa.i
    public final void i(int i13, float f13, int i14) {
        int i15 = this.f117633a;
        Object obj = this.f117634b;
        switch (i15) {
            case 0:
            case 1:
                return;
            case 2:
                com.pinterest.framework.screens.a Z7 = ((r) obj).Z7();
                i iVar = Z7 instanceof i ? (i) Z7 : null;
                if (iVar != null) {
                    iVar.i(i13, f13, i14);
                    return;
                }
                return;
            case 3:
                j jVar = (j) obj;
                m mVar = jVar.f129785g;
                if (mVar == null) {
                    Intrinsics.r("videoManager");
                    throw null;
                }
                ((o1) mVar).w();
                int i16 = jVar.f129797s;
                if ((i16 < i13 || i16 > i13) && jVar.f129788j == null) {
                    xa.a aVar = jVar.f129795q.f19892e;
                    Intrinsics.g(aVar, "null cannot be cast to non-null type com.pinterest.feature.style.spotlight.view.SpotlightPagerAdapter");
                    if (((p) aVar).l(jVar.f129797s) && j.a(jVar)) {
                        return;
                    }
                    jVar.l6(4000L, true);
                    return;
                }
                return;
            case 4:
                return;
            default:
                if (i13 == 0) {
                    dd2.g gVar = (dd2.g) obj;
                    if (gVar.f54472m != 1) {
                        gVar.c();
                        return;
                    }
                    return;
                }
                if (i13 != 1) {
                    return;
                }
                dd2.g gVar2 = (dd2.g) obj;
                if (gVar2.f54472m != 2) {
                    gVar2.f54472m = 2;
                    ViewPager viewPager = gVar2.f54470k;
                    viewPager.setVisibility(0);
                    FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(viewPager.getLayoutParams());
                    layoutParams.gravity = 17;
                    viewPager.setLayoutParams(layoutParams);
                    gVar2.f54467h.setVisibility(0);
                    gVar2.f54468i.setBackground(gVar2.getContext().getDrawable(dd2.a.default_dot));
                    gVar2.f54469j.setBackground(gVar2.getContext().getDrawable(dd2.a.selected_dot));
                    a0.o(gVar2.f54463d, dd2.d.widget_upsell_third_title, new Object[0]);
                    a0.o(gVar2.f54464e, dd2.d.widget_upsell_third_description, new Object[0]);
                    gVar2.f54465f.d(f.f54456n);
                    gVar2.f54466g.d(f.f54457o);
                    gVar2.b();
                    return;
                }
                return;
        }
    }

    @Override // xa.i
    public final void i5(int i13) {
        Handler handler;
        Handler handler2;
        int i14 = this.f117633a;
        Object obj = this.f117634b;
        switch (i14) {
            case 2:
                com.pinterest.framework.screens.a Z7 = ((r) obj).Z7();
                i iVar = Z7 instanceof i ? (i) Z7 : null;
                if (iVar != null) {
                    iVar.i5(i13);
                    break;
                }
                break;
            case 3:
                if (i13 != 0) {
                    int i15 = j.f129778t;
                    ((j) obj).b();
                    break;
                } else {
                    j jVar = (j) obj;
                    xa.a aVar = jVar.f129795q.f19892e;
                    Intrinsics.g(aVar, "null cannot be cast to non-null type com.pinterest.feature.style.spotlight.view.SpotlightPagerAdapter");
                    if (!((p) aVar).l(jVar.f129797s)) {
                        xa.a aVar2 = jVar.f129795q.f19892e;
                        Intrinsics.g(aVar2, "null cannot be cast to non-null type com.pinterest.feature.style.spotlight.view.SpotlightPagerAdapter");
                        if (!(CollectionsKt.U(jVar.f129797s, ((p) aVar2).f129822m) instanceof ug1.m)) {
                            jVar.e();
                            break;
                        }
                    }
                    if (!j.a(jVar)) {
                        jVar.b();
                        break;
                    } else {
                        jVar.e();
                        break;
                    }
                }
            case 4:
                if (i13 != 0) {
                    wg1.r rVar = (wg1.r) obj;
                    int i16 = wg1.r.f129827r;
                    j0 j0Var = rVar.f129834g;
                    if (j0Var != null && (handler = rVar.getHandler()) != null) {
                        handler.removeCallbacks(j0Var);
                        break;
                    }
                } else {
                    wg1.r rVar2 = (wg1.r) obj;
                    int i17 = wg1.r.f129827r;
                    j0 j0Var2 = rVar2.f129834g;
                    if (j0Var2 != null && (handler2 = rVar2.getHandler()) != null) {
                        handler2.postDelayed(j0Var2, rVar2.f129839l);
                        break;
                    }
                }
                break;
        }
    }
}
