package ti1;

import android.graphics.Rect;
import android.os.Build;
import android.os.Handler;
import android.os.Message;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewParent;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import lh0.a4;
import lh0.g1;
import lh0.r2;
import lh0.z0;
import lh0.z3;
import ni1.y0;
import ua2.f1;
import ua2.i0;

/* loaded from: classes5.dex */
public final class q extends y92.b {

    /* renamed from: g, reason: collision with root package name */
    public static final int f117741g = ViewConfiguration.getTapTimeout();

    /* renamed from: h, reason: collision with root package name */
    public static final int f117742h = ViewConfiguration.getPressedStateDuration();

    /* renamed from: a, reason: collision with root package name */
    public final m60.w f117743a;

    /* renamed from: b, reason: collision with root package name */
    public final u50.r f117744b;

    /* renamed from: c, reason: collision with root package name */
    public final p f117745c;

    /* renamed from: d, reason: collision with root package name */
    public final r2 f117746d;

    /* renamed from: e, reason: collision with root package name */
    public Rect f117747e;

    /* renamed from: f, reason: collision with root package name */
    public ui1.q f117748f;

    public q(m60.w eventManager, u50.r rVar, p legacyContract, r2 experiments) {
        Intrinsics.checkNotNullParameter(eventManager, "eventManager");
        Intrinsics.checkNotNullParameter(legacyContract, "legacyContract");
        Intrinsics.checkNotNullParameter(experiments, "experiments");
        this.f117743a = eventManager;
        this.f117744b = rVar;
        this.f117745c = legacyContract;
        this.f117746d = experiments;
    }

    @Override // y92.b
    public final boolean a(MotionEvent e13) {
        Intrinsics.checkNotNullParameter(e13, "e");
        return false;
    }

    @Override // y92.b
    public final boolean b(MotionEvent e13) {
        List list;
        ui1.q qVar;
        Intrinsics.checkNotNullParameter(e13, "e");
        int x13 = (int) e13.getX();
        int y13 = (int) e13.getY();
        p pVar = this.f117745c;
        y yVar = (y) pVar;
        list = yVar.f117759a.pinRepPieces;
        Iterator it = CollectionsKt.q0(list).iterator();
        while (true) {
            if (!it.hasNext()) {
                qVar = null;
                break;
            }
            Object obj = (f1) it.next();
            if (obj instanceof ui1.a) {
                ui1.c d2 = ((ui1.a) obj).d(x13, y13);
                if (d2 instanceof ui1.q) {
                    qVar = (ui1.q) d2;
                    break;
                }
                if (!Intrinsics.d(d2, ui1.b.f122290a)) {
                    throw new NoWhenBranchMatchedException();
                }
            }
        }
        if (qVar != null) {
            this.f117748f = qVar;
        }
        ui1.q qVar2 = this.f117748f;
        if (qVar2 != null && !(qVar2 instanceof ui1.d)) {
            z3 activate = z3.DO_NOT_ACTIVATE_EXPERIMENT;
            r2 r2Var = this.f117746d;
            r2Var.getClass();
            Intrinsics.checkNotNullParameter("enabled_no_long_click_press_animation", "group");
            Intrinsics.checkNotNullParameter(activate, "activate");
            z0 z0Var = r2Var.f83469a;
            if (!((g1) z0Var).k("visual_search_in_long_press_android", "enabled_no_long_click_press_animation", activate)) {
                g1 g1Var = (g1) z0Var;
                if (!g1Var.o("android_ctx_long_press_cleanup_animation", "enabled", a4.f83297a) && !g1Var.l("android_ctx_long_press_cleanup_animation") && yVar.f117759a.getScaleX() >= 1.0f) {
                    Rect rect = new Rect();
                    ((y) pVar).f117759a.getGlobalVisibleRect(rect);
                    this.f117747e = rect;
                    kg.a.c(yVar.f117759a);
                    return true;
                }
            }
        }
        this.f117747e = null;
        return true;
    }

    @Override // y92.b
    public final void c(MotionEvent e13) {
        List list;
        si1.a aVar;
        si1.a aVar2;
        si1.a aVar3;
        si1.a aVar4;
        Rect q13;
        wa2.l k13;
        Rect bounds;
        yi1.p pVar;
        Rect bounds2;
        Intrinsics.checkNotNullParameter(e13, "e");
        p pVar2 = this.f117745c;
        y yVar = (y) pVar2;
        list = yVar.f117759a.pinRepPieces;
        u50.r rVar = this.f117744b;
        if (rVar != null) {
            int x13 = (int) e13.getX();
            int y13 = (int) e13.getY();
            List list2 = list;
            ArrayList arrayList = new ArrayList();
            for (Object obj : list2) {
                if (obj instanceof yi1.s) {
                    arrayList.add(obj);
                }
            }
            yi1.s sVar = (yi1.s) CollectionsKt.firstOrNull(arrayList);
            if (sVar == null || (pVar = sVar.f139158k) == null || (bounds2 = pVar.getBounds()) == null) {
                aVar = null;
            } else {
                Intrinsics.checkNotNullParameter(bounds2, "<this>");
                aVar = new si1.a(bounds2.left, bounds2.top, bounds2.right, bounds2.bottom);
            }
            ArrayList arrayList2 = new ArrayList();
            for (Object obj2 : list2) {
                if (obj2 instanceof i0) {
                    arrayList2.add(obj2);
                }
            }
            i0 i0Var = (i0) CollectionsKt.firstOrNull(arrayList2);
            if (i0Var == null || (k13 = i0Var.k()) == null || (bounds = k13.getBounds()) == null) {
                aVar2 = null;
            } else {
                Intrinsics.checkNotNullParameter(bounds, "<this>");
                aVar2 = new si1.a(bounds.left, bounds.top, bounds.right, bounds.bottom);
            }
            ArrayList arrayList3 = new ArrayList();
            for (Object obj3 : list2) {
                if (obj3 instanceof ij1.i) {
                    arrayList3.add(obj3);
                }
            }
            ij1.i iVar = (ij1.i) CollectionsKt.firstOrNull(arrayList3);
            if (iVar == null || (q13 = iVar.q()) == null) {
                aVar3 = null;
            } else {
                Intrinsics.checkNotNullParameter(q13, "<this>");
                aVar3 = new si1.a(q13.left, q13.top, q13.right, q13.bottom);
            }
            Rect rect = this.f117747e;
            if (rect != null) {
                Intrinsics.checkNotNullParameter(rect, "<this>");
                aVar4 = new si1.a(rect.left, rect.top, rect.right, rect.bottom);
            } else {
                Rect rect2 = new Rect();
                ((y) pVar2).f117759a.getGlobalVisibleRect(rect2);
                Intrinsics.checkNotNullParameter(rect2, "<this>");
                aVar4 = new si1.a(rect2.left, rect2.top, rect2.right, rect2.bottom);
            }
            si1.a aVar5 = aVar4;
            Rect bounds3 = yVar.f117759a.getPinDrawable().getBounds();
            Intrinsics.checkNotNullExpressionValue(bounds3, "getBounds(...)");
            Intrinsics.checkNotNullParameter(bounds3, "<this>");
            si1.a aVar6 = new si1.a(bounds3.left, bounds3.top, bounds3.right, bounds3.bottom);
            int width = yVar.f117759a.getRootView().getWidth();
            int height = yVar.f117759a.getHeight();
            int rawX = (int) e13.getRawX();
            int rawY = (int) e13.getRawY();
            long currentTimeMillis = System.currentTimeMillis() * 1000000;
            ViewParent parent = yVar.f117759a.getParent();
            Intrinsics.checkNotNullExpressionValue(parent, "getParent(...)");
            View O = kh2.r.O(parent);
            Rect rect3 = new Rect();
            if (O != null) {
                O.getGlobalVisibleRect(rect3);
            }
            rVar.a(new ni1.f1(x13, y13, aVar, aVar2, aVar3, aVar5, aVar6, width, height, rect3.top, rawX, rawY, currentTimeMillis));
        }
    }

    @Override // y92.b
    public final void e(MotionEvent e13) {
        Intrinsics.checkNotNullParameter(e13, "e");
        if (e13.getAction() == 1) {
            this.f117748f = null;
            p pVar = this.f117745c;
            ((y) pVar).f117759a.unTouchAll();
            ((y) pVar).f117759a.handleContextualMenuHidden();
        }
    }

    @Override // y92.b
    public final void g(MotionEvent e13) {
        Intrinsics.checkNotNullParameter(e13, "e");
    }

    @Override // y92.b
    public final boolean h(MotionEvent e13) {
        Intrinsics.checkNotNullParameter(e13, "e");
        Pair pair = new Pair(Integer.valueOf((int) e13.getX()), Integer.valueOf((int) e13.getY()));
        long downTime = e13.getDownTime() - e13.getEventTime();
        u50.r rVar = this.f117744b;
        if (rVar != null) {
            rVar.a(new y0(this.f117748f, pair));
        }
        this.f117743a.d(new ls1.d(((y) this.f117745c).f117759a));
        int i13 = (int) downTime;
        int i14 = f117741g;
        int i15 = i13 < i14 ? i14 - i13 : f117742h;
        Handler handler = new Handler();
        s81.g gVar = new s81.g(this, 12);
        long j13 = i15;
        if (Build.VERSION.SDK_INT >= 28) {
            o.d.f(handler, gVar, null, j13);
            return true;
        }
        Message obtain = Message.obtain(handler, gVar);
        obtain.obj = null;
        handler.sendMessageDelayed(obtain, j13);
        return true;
    }
}
