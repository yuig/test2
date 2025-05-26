package j1;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Point;
import android.opengl.GLES20;
import android.os.Build;
import android.util.Size;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.PopupWindow;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.pinterest.api.model.f30;
import com.pinterest.api.model.ih;
import com.pinterest.api.model.oc;
import com.pinterest.api.model.wy0;
import com.pinterest.api.model.xk;
import com.pinterest.feature.board.common.newideas.view.OneTapSaveCarouselPinView;
import com.pinterest.feature.boardpreview.view.ShareBoardUpsellView;
import com.pinterest.feature.pin.RepinAnimationData;
import com.pinterest.ui.grid.LegoPinGridCellImpl;
import java.nio.ByteBuffer;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kh2.h3;
import kh2.l3;
import kh2.m3;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import rq.a4;

/* loaded from: classes2.dex */
public final class v0 extends kotlin.jvm.internal.s implements Function0 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f74275i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ Object f74276j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ Object f74277k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ Object f74278l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ Object f74279m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v0(Float f13, o0 o0Var, Float f14, n0 n0Var) {
        super(0);
        this.f74275i = 0;
        this.f74276j = f13;
        this.f74278l = o0Var;
        this.f74277k = f14;
        this.f74279m = n0Var;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        do2.x1 j13;
        kh2.l0 l0Var;
        di2.b b13;
        ki2.g gVar = ki2.g.f79814f;
        int i13 = 1;
        int i14 = this.f74275i;
        Object obj = null;
        Object obj2 = this.f74279m;
        Object obj3 = this.f74278l;
        Object obj4 = this.f74277k;
        Object obj5 = this.f74276j;
        switch (i14) {
            case 0:
                m159invoke();
                return Unit.f80348a;
            case 1:
                if (!((w1.l1) obj5).b()) {
                    ((z2.s) obj4).a(z2.m.f140632l);
                }
                h4.o oVar = (h4.o) obj3;
                if (!h4.s.a(oVar.f67601d, 7) && !h4.s.a(oVar.f67601d, 8) && (j13 = ((y1.g) ((y1.c0) obj2)).j()) != null) {
                    ((do2.f2) j13).b(Unit.f80348a);
                }
                return Boolean.TRUE;
            case 2:
                m159invoke();
                return Unit.f80348a;
            case 3:
                m159invoke();
                return Unit.f80348a;
            case 4:
                m159invoke();
                return Unit.f80348a;
            case 5:
                m159invoke();
                return Unit.f80348a;
            case 6:
                m159invoke();
                return Unit.f80348a;
            case 7:
                return new OneTapSaveCarouselPinView((Context) obj5, ((yq0.z) obj4).f139760f, (nx.d0) obj3, (uj2.q) obj2);
            case 8:
                m159invoke();
                return Unit.f80348a;
            case 9:
                m159invoke();
                return Unit.f80348a;
            case 10:
                m159invoke();
                return Unit.f80348a;
            case 11:
                m159invoke();
                return Unit.f80348a;
            case 12:
                m159invoke();
                return Unit.f80348a;
            case 13:
                m159invoke();
                return Unit.f80348a;
            case 14:
                m159invoke();
                return Unit.f80348a;
            case 15:
                se1.d dVar = (se1.d) obj5;
                return new se1.c(dVar.f112440a, (uj2.q) obj4, new ze1.c(dVar.f112442c.f103320a.f128792q0, 2), dVar.f112441b, (wa2.i) obj3, dVar.f112443d, dVar.f112444e, se1.b.f112422m, null, false, false, false, null, (lb0.r) obj2, "feed");
            case 16:
                m159invoke();
                return Unit.f80348a;
            case 17:
                m159invoke();
                return Unit.f80348a;
            case 18:
                m159invoke();
                return Unit.f80348a;
            case 19:
                m159invoke();
                return Unit.f80348a;
            case 20:
                m159invoke();
                return Unit.f80348a;
            case 21:
                bi2.f fVar = (bi2.f) obj5;
                if (fVar != bi2.f.BACKGROUND) {
                    return zg2.a.a((zg2.a) obj4, (yh2.c) obj3, fVar, (kl2.l) obj2);
                }
                zg2.a aVar = (zg2.a) obj4;
                if (aVar.f141965e.getAndSet(false)) {
                    return zg2.a.a(aVar, (yh2.c) obj3, fVar, (kl2.l) obj2);
                }
                return null;
            case 22:
                kh2.b1 b1Var = (kh2.b1) obj4;
                if (!kh2.m.a((kh2.m) obj5, b1Var)) {
                    kh2.a aVar2 = (kh2.a) obj3;
                    kh2.o oVar2 = (kh2.o) obj2;
                    try {
                        c0.d.M2("url-builder-init");
                        String a13 = ((uh2.a) ((kh2.c) aVar2).a()).a();
                        kh2.q qVar = (kh2.q) oVar2;
                        qVar.getClass();
                        obj = new pg2.p(a13, ((kh2.t2) qVar.f79653b.a(qVar, kh2.q.f79651g[1])).f79707a, ((kh2.d1) b1Var).f79461g);
                    } finally {
                    }
                }
                return obj;
            case 23:
                if (((sg2.b) ((kh2.m) ((kh2.k) obj5)).b()).a()) {
                    return null;
                }
                kh2.d1 d1Var = (kh2.d1) ((kh2.b1) obj3);
                return new dh2.b(dh2.f.ENVELOPE.asFile(((kh2.q) ((kh2.o) obj4)).b(), d1Var.f79456b), kh2.l0.a((kh2.l0) obj2), d1Var.f79456b, d1Var.a());
            case 24:
                if (((sg2.b) ((kh2.m) ((kh2.k) obj5)).b()).a() || (b13 = (l0Var = (kh2.l0) obj4).b()) == null) {
                    return null;
                }
                return new zg2.a((zh2.a) l0Var.f79591f.a(l0Var, kh2.l0.f79585m[4]), ((kh2.d1) ((kh2.b1) obj3)).f79455a, ((kh2.r0) ((kh2.o0) obj2)).e(), b13);
            case 25:
                kh2.r0 r0Var = (kh2.r0) obj5;
                String str = ((sg2.b) ((sg2.a) r0Var.f79669a.getValue())).f112889n;
                if (str != null) {
                    kh2.b1 b1Var2 = (kh2.b1) obj4;
                    l3 l3Var = (l3) obj3;
                    kh2.k kVar = (kh2.k) obj2;
                    try {
                        c0.d.M2("api-service-init");
                        kh2.c0 c0Var = r0Var.f79677i;
                        rl2.u[] uVarArr = kh2.r0.f79668m;
                        pg2.a aVar3 = (pg2.a) c0Var.a(r0Var, uVarArr[6]);
                        xh2.d a14 = ((kh2.d1) b1Var2).a();
                        ki2.e d2 = ((m3) l3Var).d(ki2.i.f79818d);
                        qg2.j jVar = (qg2.j) r0Var.f79675g.a(r0Var, uVarArr[4]);
                        xk2.v vVar = r0Var.f79670b;
                        pg2.k c13 = ((kh2.m) kVar).c();
                        if (c13 == null) {
                            throw new IllegalStateException("Required value was null.".toString());
                        }
                        obj = new pg2.n(aVar3, a14, d2, jVar, vVar, str, c13);
                    } finally {
                    }
                }
                return obj;
            case 26:
                return new uf2.d(new jg2.h((kh2.o) obj5, (kh2.b1) obj4, (kh2.q2) obj3, 14), new kh2.v0((sg2.a) obj2, 3), 12);
            case 27:
                if (Build.VERSION.SDK_INT < 29) {
                    return null;
                }
                kh2.d1 d1Var2 = (kh2.d1) ((kh2.b1) obj4);
                return new lg2.d(((kh2.s2) ((kh2.q2) obj5)).e(), d1Var2.f79456b, ((m3) ((l3) obj3)).a(gVar), d1Var2.f79455a, new kh2.y0((h3) obj2, i13));
            case 28:
                ph2.a aVar4 = (ph2.a) ((Function0) obj5).invoke();
                if (aVar4 != null) {
                    return aVar4;
                }
                kh2.d1 d1Var3 = (kh2.d1) ((kh2.b1) obj2);
                return new ph2.b(((kh2.q) ((kh2.o) obj4)).b(), ((kh2.y2) ((kh2.v2) obj3)).a(), d1Var3.a(), d1Var3.f79456b);
            default:
                kh2.q qVar2 = (kh2.q) ((kh2.o) obj5);
                return new gg2.h((yf2.a) ((yf2.c) ((yf2.b) qVar2.f79657f.getValue())).f139003d.getValue(), qVar2.b(), ((kh2.m) ((kh2.k) obj4)).b(), ((kh2.c) ((kh2.a) obj3)).a(), ((m3) ((l3) obj2)).a(gVar));
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ v0(Object obj, Object obj2, Object obj3, Object obj4, int i13) {
        super(0);
        this.f74275i = i13;
        this.f74276j = obj;
        this.f74277k = obj2;
        this.f74278l = obj3;
        this.f74279m = obj4;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v0(xb1.b bVar, bd1.b bVar2, Object obj, String str) {
        super(0);
        this.f74275i = 14;
        this.f74277k = bVar;
        this.f74278l = bVar2;
        this.f74276j = obj;
        this.f74279m = str;
    }

    /* renamed from: invoke, reason: collision with other method in class */
    public final void m159invoke() {
        ym1.e a13;
        ViewTreeObserver viewTreeObserver;
        int i13 = this.f74275i;
        int i14 = 0;
        RepinAnimationData repinAnimationData = null;
        int i15 = 1;
        Object obj = this.f74279m;
        Object obj2 = this.f74278l;
        Object obj3 = this.f74277k;
        Object obj4 = this.f74276j;
        switch (i13) {
            case 0:
                o0 o0Var = (o0) obj2;
                if (Intrinsics.d(obj4, o0Var.f74174a) && Intrinsics.d(obj3, o0Var.f74175b)) {
                    return;
                }
                Object obj5 = this.f74276j;
                o0Var.f74174a = obj5;
                Object obj6 = this.f74277k;
                o0Var.f74175b = obj6;
                o0Var.f74178e = new w1((n0) obj, o0Var.f74176c, obj5, obj6, null);
                o0Var.f74182i.f74246b.setValue(Boolean.TRUE);
                o0Var.f74179f = false;
                o0Var.f74180g = true;
                return;
            case 1:
            case 7:
            case 15:
            default:
                ((ae2.d) obj4).a();
                ae2.b bVar = (ae2.b) obj3;
                Size size = (Size) obj2;
                GLES20.glTexImage2D(3553, 0, bVar.getTextureDataFormat(), size.getWidth(), size.getHeight(), 0, bVar.getPixelDataFormat(), bVar.getPixelDataType(), (ByteBuffer) obj);
                return;
            case 2:
                i2.s sVar = (i2.s) obj4;
                j2.b bVar2 = sVar.L;
                j2.a aVar = (j2.a) obj3;
                i2.v2 v2Var = (i2.v2) obj2;
                i2.k1 k1Var = (i2.k1) obj;
                j2.a aVar2 = bVar2.f74425b;
                try {
                    bVar2.f74425b = aVar;
                    i2.v2 v2Var2 = sVar.F;
                    int[] iArr = sVar.f71278n;
                    k2.a aVar3 = sVar.f71285u;
                    sVar.f71278n = null;
                    sVar.f71285u = null;
                    try {
                        sVar.F = v2Var;
                        boolean z13 = bVar2.f74428e;
                        try {
                            bVar2.f74428e = false;
                            k1Var.getClass();
                            k1Var.getClass();
                            k1Var.getClass();
                            i2.s.b(sVar, null, null);
                            bVar2.f74428e = z13;
                            Unit unit = Unit.f80348a;
                            return;
                        } catch (Throwable th3) {
                            bVar2.f74428e = z13;
                            throw th3;
                        }
                    } finally {
                        sVar.F = v2Var2;
                        sVar.f71278n = iArr;
                        sVar.f71285u = aVar3;
                    }
                } finally {
                    bVar2.f74425b = aVar2;
                }
            case 3:
                ((q4.t) obj4).e((Function0) obj3, (q4.r) obj2, (n4.k) obj);
                return;
            case 4:
                jf2.c cVar = (jf2.c) obj4;
                if (((qb0.e) cVar.f75876e).c()) {
                    Context context = (Context) obj3;
                    wy0 wy0Var = (wy0) obj;
                    kk2.g gVar = new kk2.g(((lb2.n) cVar.f75872a).c(context, (mr1.h) obj2).r(tk2.e.f118017c).l(wj2.c.a()), new a4(25, new hr.a(cVar, wy0Var, i14)), 2);
                    int i16 = 26;
                    new kk2.h(new kk2.g(new kk2.g(gVar, new a4(i16, new hr.b(cVar, i14)), 3), new a4(27, new hr.a(cVar, wy0Var, i15)), 1), new cp.b0(cVar, 2), 1).o(new a4(28, new hr.b(cVar, i15)), new a4(29, new ba.s(i16, cVar, context)));
                    return;
                }
                if (((qb0.e) cVar.f75876e).c()) {
                    return;
                }
                ((i92.k) cVar.f75878g).m(((Context) obj3).getString(m60.x0.setting_screen_switch_account_network_error));
                return;
            case 5:
                ra0.f0 f0Var = ((ra0.z) obj4).f107045a;
                if (f0Var instanceof ra0.c0) {
                    ((Function0) obj3).invoke();
                    return;
                }
                if (f0Var instanceof ra0.b0) {
                    ((Function0) obj2).invoke();
                    return;
                } else if (f0Var instanceof ra0.e0) {
                    ((Function1) obj).invoke(new b3.w(((ra0.e0) f0Var).f106918a));
                    return;
                } else {
                    boolean z14 = f0Var instanceof ra0.d0;
                    return;
                }
            case 6:
                if (((jh0.b) obj4).f76207a) {
                    ((jh0.e) obj3).a(true);
                }
                View anchorView = (View) obj2;
                if (anchorView != null) {
                    jh0.e eVar = (jh0.e) obj3;
                    eVar.getClass();
                    if (!jh0.e.b(anchorView)) {
                        anchorView = (View) obj;
                    }
                    if (anchorView != null) {
                        ha.a aVar4 = eVar.f76215b;
                        if (aVar4 != null) {
                            Intrinsics.checkNotNullParameter(anchorView, "anchorView");
                            View view = (View) aVar4.f68318c;
                            if (view != null && (viewTreeObserver = view.getViewTreeObserver()) != null) {
                                viewTreeObserver.removeOnScrollChangedListener((ViewTreeObserver.OnScrollChangedListener) aVar4.f68321f);
                            }
                            aVar4.f68318c = anchorView;
                            ym1.t tVar = (ym1.t) aVar4.f68320e;
                            if (tVar == null || (a13 = tVar.f139456a) == null) {
                                a13 = ha.a.a(bs1.c.Q0(anchorView), (Size) aVar4.f68319d);
                            }
                            if (a13 == null) {
                                Function1 function1 = (Function1) aVar4.f68323h;
                                if (function1 != null) {
                                    function1.invoke(ym1.u.POPOVER_POSITION_NOT_RESOLVED);
                                    aVar4.f68316a = true;
                                    aVar4.d();
                                    return;
                                }
                                Intrinsics.r("resultEmitter");
                                throw null;
                            }
                            ym1.v b13 = ha.a.b(anchorView, (Size) aVar4.f68319d, a13);
                            PopupWindow popupWindow = (PopupWindow) aVar4.f68317b;
                            if (popupWindow != null) {
                                Point point = b13.f139457a;
                                popupWindow.update(anchorView, point.x, point.y, -1, -1);
                            }
                            ViewGroup e13 = aVar4.e(anchorView, false);
                            ym1.x xVar = new ym1.x(aVar4, i14);
                            if (e13 != null) {
                                e13.setOnTouchListener(new ym1.s(aVar4, anchorView, xVar));
                            }
                            PopupWindow popupWindow2 = (PopupWindow) aVar4.f68317b;
                            if (popupWindow2 != null) {
                                aVar4.f68322g = new ym1.r(aVar4.e(anchorView, true), popupWindow2, new ym1.x(aVar4, i15));
                                popupWindow2.getContentView().addOnLayoutChangeListener((View.OnLayoutChangeListener) aVar4.f68322g);
                            }
                            aVar4.f68321f = new nt.e2(aVar4, 4);
                            anchorView.getViewTreeObserver().addOnScrollChangedListener((ViewTreeObserver.OnScrollChangedListener) aVar4.f68321f);
                            return;
                        }
                        Intrinsics.r("gestaltPopoverOverlay");
                        throw null;
                    }
                    return;
                }
                return;
            case 8:
                ConstraintLayout constraintLayout = ((kl0.z) obj4).S1;
                if (constraintLayout != null) {
                    constraintLayout.removeView((ShareBoardUpsellView) obj3);
                    ((rg0.n) obj2).c(null, (nx.d) obj);
                    return;
                } else {
                    Intrinsics.r("boardContainer");
                    throw null;
                }
            case 9:
                ll0.f fVar = (ll0.f) obj4;
                fVar.f83803b.f122379a.X(h32.u0.BOARD_RESTORE_BUTTON);
                fVar.f83810i.s((String) obj3).l(tk2.e.f118017c).h(wj2.c.a()).i(new xo.c((Object) fVar, (Object) String.valueOf((String) obj), (String) obj2, 7), new zk0.b(20, new ll0.c(fVar, 5)));
                return;
            case 10:
                com.pinterest.shuffles.scene.composer.h hVar = (com.pinterest.shuffles.scene.composer.h) obj4;
                Bitmap bitmap = (Bitmap) obj3;
                hVar.f52050p = bitmap.getHeight();
                hVar.d(bitmap.getHeight() * ((float) ((r72.u1) obj2).f106671c));
                ((Function0) obj).invoke();
                return;
            case 11:
                ((xo0.d) ((uo0.d) obj)).M5((String) obj3, kotlin.collections.z0.f(new Pair("com.pinterest.EXTRA_SEARCH_ENTERED_QUERY", ((wo0.c) obj4).f130636m), new Pair("com.pinterest.EXTRA_SEARCH_ARTICLE", (String) obj2)));
                return;
            case 12:
                fs0.w wVar = (fs0.w) obj4;
                e02.a aVar5 = (e02.a) wVar.f62916o.get();
                f30 f30Var = (f30) obj3;
                String str = (String) obj2;
                com.pinterest.feature.pin.r rVar = wVar.f62923v;
                rVar.getClass();
                boolean b14 = com.pinterest.feature.pin.r.b();
                KeyEvent.Callback callback = wVar.f62924w;
                qa2.h0 h0Var = callback instanceof qa2.h0 ? (qa2.h0) callback : null;
                if (h0Var != null) {
                    rVar.getClass();
                    repinAnimationData = com.pinterest.feature.pin.r.a(h0Var);
                }
                wVar.B.getClass();
                aVar5.c(f30Var, false, wVar.f62915n, str, "overflow_modal", b14, repinAnimationData, androidx.camera.core.impl.j.i((jo1.a) obj));
                return;
            case 13:
                ((ls0.n) obj4).b((Context) obj3, (Function1) obj2, (Function0) obj);
                return;
            case 14:
                ((xb1.b) obj3).t3((bd1.b) obj2, obj4, (String) obj, true);
                return;
            case 16:
                ih action = (ih) obj3;
                Intrinsics.checkNotNullExpressionValue(action, "$action");
                xk xkVar = (xk) obj2;
                String uid = xkVar.getUid();
                Intrinsics.checkNotNullExpressionValue(uid, "getUid(...)");
                ((kl2.m) obj4).c(action, uid, (String) obj, xkVar);
                return;
            case 17:
                ((et1.q0) obj4).getClass();
                et1.u0 u0Var = (et1.u0) obj;
                for (Map.Entry entry : ((LinkedHashMap) obj3).entrySet()) {
                    mt1.a aVar6 = (mt1.a) entry.getKey();
                    ((et1.o0) entry.getValue()).f60065a = true;
                    u0Var.d(aVar6);
                }
                mt1.d dVar = (mt1.d) obj2;
                dVar.c(et1.s0.f60094k);
                dVar.d(et1.i.f60027l);
                return;
            case 18:
                if (((iv1.a) obj4).getUsesLocalCooldowns()) {
                    ((iv1.b) obj3).d();
                }
                iv1.b bVar3 = (iv1.b) obj3;
                bVar3.f73734d.d(new iv1.c());
                bVar3.b(h32.f1.NRT_AUTO_ORG_DISMISS, (oc) obj2, (String) obj);
                return;
            case 19:
                ps.k kVar = (ps.k) obj4;
                int i17 = kVar.f101240c;
                if (i17 < kVar.f101241d) {
                    ((LegoPinGridCellImpl) obj3).D0 = (f30) ((List) obj2).get(i17);
                } else {
                    kVar.f101239b = false;
                }
                LegoPinGridCellImpl legoPinGridCellImpl = (LegoPinGridCellImpl) obj3;
                legoPinGridCellImpl.setPin((f30) obj, legoPinGridCellImpl.Q0);
                return;
        }
    }
}
