package c72;

import ac2.u1;
import android.content.Context;
import android.text.TextPaint;
import android.util.AttributeSet;
import android.view.View;
import com.airbnb.lottie.LottieAnimationView;
import com.pinterest.gestalt.avatar.GestaltAvatar;
import com.pinterest.shuffles.scene.composer.c1;
import com.pinterest.shuffles.scene.composer.n0;
import com.pinterest.ui.view.MaskedWebImageView;
import h32.g0;
import h32.u0;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import lh0.a4;
import lh0.g1;
import lh0.n1;
import lh0.z0;
import lh0.z3;
import m1.h2;
import ni1.d0;
import ni1.e1;
import o82.i3;
import o82.v2;
import qa2.r0;
import r72.r1;
import r72.y0;
import so.ba;
import u50.i0;
import ua2.k0;
import yq1.d1;

/* loaded from: classes4.dex */
public final class o extends kotlin.jvm.internal.s implements Function0 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f26913i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ Object f26914j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ o(Object obj, int i13) {
        super(0);
        this.f26913i = i13;
        this.f26914j = obj;
    }

    public final GestaltAvatar b() {
        int i13 = this.f26913i;
        Object obj = this.f26914j;
        switch (i13) {
            case 15:
                return new GestaltAvatar(((va2.e) obj).f125337l, new rl1.q((String) null, (String) null, false, rl1.r.XS, (i0) null, false, fm1.c.VISIBLE, 0, (rl1.c) null, (fm1.a) null, 1907));
            default:
                va2.n nVar = (va2.n) obj;
                Context context = nVar.f125415l.getContext();
                Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
                int i14 = 6;
                GestaltAvatar gestaltAvatar = new GestaltAvatar(i14, context, (AttributeSet) null);
                gestaltAvatar.H2(new ha2.j(nVar, i14));
                return gestaltAvatar;
        }
    }

    public final String e() {
        int i13 = this.f26913i;
        Object obj = this.f26914j;
        switch (i13) {
            case 0:
                return a.a.i("mapKeyframeItemStates(): failed to map entry.key=", ((Map.Entry) obj).getKey());
            case 1:
                return a.a.j("Error during download: ", ((r1) obj).f106644j);
            case 2:
            default:
                return "Initializing single renderer with GPU backend: " + ((me2.c) obj);
            case 3:
                return a.a.j("Failed to load bitmap sticker: ", ((y0) obj).f106716a);
            case 4:
                int i14 = n0.f52108i;
                return a.a.d("Offscreen Rendering: Failed to render offscreen image - ", ((n0) obj).hashCode());
        }
    }

    public final ni1.c0 f() {
        int i13 = this.f26913i;
        Object obj = this.f26914j;
        switch (i13) {
            case 2:
                v72.g gVar = (v72.g) obj;
                d0 d0Var = gVar.f124427n;
                if (d0Var == null) {
                    Intrinsics.r("vmStateConverterFactory");
                    throw null;
                }
                return ((ba) d0Var).a(gVar.f124419f, new mq.w(gVar, 17), new d1(gVar, 5));
            default:
                r0 r0Var = (r0) obj;
                d0 d0Var2 = r0Var.f103344g;
                if (d0Var2 == null) {
                    Intrinsics.r("vmStateConverterFactory");
                    throw null;
                }
                return ((ba) d0Var2).a(r0Var.f103341d, new mq.w(r0Var, 19), new d1(r0Var, 10));
        }
    }

    @Override // kotlin.jvm.functions.Function0
    public final Boolean invoke() {
        int i13 = this.f26913i;
        Object obj = this.f26914j;
        switch (i13) {
            case 14:
                return Boolean.valueOf(((k0) obj).f121547y.a0());
            case 19:
                n1 n1Var = ((wa2.s) obj).f128909f0;
                n1Var.getClass();
                z3 z3Var = a4.f83298b;
                g1 g1Var = (g1) n1Var.f83439a;
                return Boolean.valueOf(g1Var.o("android_pintag_decan_v2", "enabled", z3Var) || g1Var.l("android_pintag_decan_v2"));
            default:
                z0 z0Var = (z0) ((u1) obj).f2062a.f92902b;
                z0.f83518a.getClass();
                return Boolean.valueOf(Intrinsics.d(((g1) z0Var).g("video_platform_holdout", lh0.y0.f83512b), "holdout_2025q1"));
        }
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i13 = this.f26913i;
        Object obj = this.f26914j;
        switch (i13) {
            case 0:
                return e();
            case 1:
                return e();
            case 2:
                return f();
            case 3:
                return e();
            case 4:
                return e();
            case 5:
                TextPaint textPaint = ((c1) obj).f52018r;
                if (textPaint != null) {
                    return Float.valueOf(textPaint.getTextSize());
                }
                Intrinsics.r("textPaint");
                throw null;
            case 6:
                v2 v2Var = (v2) obj;
                return new ky.a(v2Var.getViewType(), v2Var.getF87513d1());
            case 7:
                return ((i3) obj).Q8();
            case 8:
                m80invoke();
                return Unit.f80348a;
            case 9:
                m80invoke();
                return Unit.f80348a;
            case 10:
                return f();
            case 11:
                m80invoke();
                return Unit.f80348a;
            case 12:
                m80invoke();
                return Unit.f80348a;
            case 13:
                m80invoke();
                return Unit.f80348a;
            case 14:
                return invoke();
            case 15:
                return b();
            case 16:
                return Integer.valueOf(((va2.h) obj).f125357l.getResources().getDimensionPixelSize(m60.r0.margin_half));
            case 17:
                tn1.c cVar = new tn1.c(((va2.i) obj).f125371l);
                bs1.c.u(cVar, null, 3);
                return cVar;
            case 18:
                return b();
            case 19:
                return invoke();
            case 20:
                m80invoke();
                return Unit.f80348a;
            case 21:
                m80invoke();
                return Unit.f80348a;
            case 22:
                m80invoke();
                return Unit.f80348a;
            case 23:
                int i14 = MaskedWebImageView.f52675x0;
                return gi2.b.i0((MaskedWebImageView) obj);
            case 24:
                m80invoke();
                return Unit.f80348a;
            case 25:
                h2 h2Var = (h2) obj;
                return new xk2.w(Boolean.valueOf(h2Var.c()), Boolean.valueOf(h2Var.a()), Boolean.valueOf(h2Var.g()));
            case 26:
                return invoke();
            case 27:
                m80invoke();
                return Unit.f80348a;
            case 28:
                Context context = ((ad2.h) obj).requireContext();
                Intrinsics.checkNotNullExpressionValue(context, "requireContext(...)");
                Intrinsics.checkNotNullParameter(context, "context");
                ad2.l lVar = new ad2.l(context);
                View.inflate(context, xc2.f.item_widget_board_selection, lVar);
                return lVar;
            default:
                return e();
        }
    }

    /* renamed from: invoke, reason: collision with other method in class */
    public final void m80invoke() {
        int i13 = this.f26913i;
        Object obj = this.f26914j;
        switch (i13) {
            case 8:
                c92.f fVar = (c92.f) obj;
                fVar.f27008h.W(0);
                fVar.setVisibility(4);
                break;
            case 9:
                Function0 function0 = ((k92.b) obj).f78866d;
                if (function0 != null) {
                    function0.invoke();
                    break;
                }
                break;
            case 10:
            case 14:
            case 15:
            case 16:
            case 17:
            case 18:
            case 19:
            case 23:
            default:
                ((cc2.o) obj).d();
                break;
            case 11:
                ua2.l lVar = (ua2.l) obj;
                if (lVar.f121552k != null) {
                    lVar.E().f128846i = !Intrinsics.d(((hs.c) r0).a(lVar.f121558q != null ? r2.getId() : null), Boolean.TRUE);
                    break;
                }
                break;
            case 12:
                ua2.s sVar = (ua2.s) obj;
                sVar.E().S = false;
                sVar.A = true;
                break;
            case 13:
                ua2.x xVar = (ua2.x) obj;
                xVar.F(false);
                xVar.E(0);
                hk2.b bVar = xVar.f121631t;
                if (bVar != null) {
                    bVar.dispose();
                    break;
                }
                break;
            case 20:
                ((ab2.n) obj).f1769c.a(new e1(true, true));
                break;
            case 21:
                kv0.p pVar = (kv0.p) obj;
                ((nx.d0) pVar.f80994a).F(g0.CONTEXTUAL_MENU, u0.BOARD_SECTION_REORDER_ENTRY_BUTTON);
                ((m60.w) pVar.f80995b).f(com.pinterest.feature.board.organize.d.f45283a);
                break;
            case 22:
                int i14 = cb2.o.f27340m;
                LottieAnimationView a13 = ((cb2.o) obj).a();
                a13.setVisibility(8);
                a13.f2();
                break;
            case 24:
                android.support.v4.media.a aVar = (android.support.v4.media.a) obj;
                ((nx.d0) aVar.f15839c).F(g0.REMOVE_SPONSORSHIP_MODAL, u0.REMOVE_SPONSORSHIP_CANCEL_BUTTON);
                ((m60.w) aVar.f15837a).d(new yb0.c(yb0.d.CANCEL_BUTTON_CLICK));
                break;
        }
    }
}
