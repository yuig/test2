package mu;

import android.view.ViewTreeObserver;
import android.widget.FrameLayout;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.pinterest.ads.feature.owc.view.base.AdsCarouselIndexModule;
import com.pinterest.ads.feature.owc.view.base.AdsToolbarModule;
import com.pinterest.gestalt.text.GestaltText;
import kh2.m2;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class m0 extends dl2.j implements Function2 {

    /* renamed from: r, reason: collision with root package name */
    public /* synthetic */ Object f88215r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ p0 f88216s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m0(p0 p0Var, bl2.c cVar) {
        super(2, cVar);
        this.f88216s = p0Var;
    }

    @Override // dl2.a
    public final bl2.c create(Object obj, bl2.c cVar) {
        m0 m0Var = new m0(this.f88216s, cVar);
        m0Var.f88215r = obj;
        return m0Var;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((m0) create((a) obj, (bl2.c) obj2)).invokeSuspend(Unit.f80348a);
    }

    @Override // dl2.a
    public final Object invokeSuspend(Object obj) {
        cl2.a aVar = cl2.a.COROUTINE_SUSPENDED;
        ue.c.H(obj);
        a aVar2 = (a) this.f88215r;
        zy.a0 a0Var = aVar2.f88184h;
        p0 p0Var = this.f88216s;
        p0Var.f88233l0 = a0Var;
        AdsCarouselIndexModule adsCarouselIndexModule = p0Var.f88226e0;
        if (adsCarouselIndexModule == null) {
            Intrinsics.r("carouselIndexModule");
            throw null;
        }
        adsCarouselIndexModule.a(aVar2.f88177a);
        ru.b b83 = p0Var.b8();
        b83.getClass();
        t0 scrollingModuleDisplayState = aVar2.f88180d;
        Intrinsics.checkNotNullParameter(scrollingModuleDisplayState, "scrollingModuleDisplayState");
        b83.F0 = scrollingModuleDisplayState.f88243a;
        qu.a a83 = p0Var.a8();
        a83.getClass();
        a0 bottomSheetDisplayState = aVar2.f88181e;
        Intrinsics.checkNotNullParameter(bottomSheetDisplayState, "bottomSheetDisplayState");
        a83.s(bottomSheetDisplayState.f88186b, bottomSheetDisplayState.f88187c, null, false, bottomSheetDisplayState.f88188d);
        AdsToolbarModule adsToolbarModule = p0Var.f88228g0;
        if (adsToolbarModule == null) {
            Intrinsics.r("toolbarModule");
            throw null;
        }
        u0 u0Var = aVar2.f88179c;
        wt.c cVar = new wt.c(u0Var, 9);
        GestaltText gestaltText = adsToolbarModule.f35306c;
        gestaltText.i(cVar);
        gestaltText.setSelected(u0Var.f88245a);
        c0 c0Var = c0.f88194b;
        s0 s0Var = aVar2.f88178b;
        if (!Intrinsics.d(s0Var, c0Var) && (s0Var instanceof r0) && !p0Var.f88229h0) {
            p0Var.f88229h0 = true;
            p0Var.Z7().a(i.f88206a);
            FrameLayout frameLayout = p0Var.f88227f0;
            if (frameLayout == null) {
                Intrinsics.r("scrollingModuleContainer");
                throw null;
            }
            frameLayout.addView(p0Var.b8());
            p0Var.a8().X();
            CoordinatorLayout coordinatorLayout = p0Var.f88225d0;
            if (coordinatorLayout == null) {
                Intrinsics.r("rootView");
                throw null;
            }
            coordinatorLayout.addView(p0Var.a8());
            AdsToolbarModule adsToolbarModule2 = p0Var.f88228g0;
            if (adsToolbarModule2 == null) {
                Intrinsics.r("toolbarModule");
                throw null;
            }
            adsToolbarModule2.L(p0Var);
            CoordinatorLayout coordinatorLayout2 = p0Var.f88225d0;
            if (coordinatorLayout2 == null) {
                Intrinsics.r("rootView");
                throw null;
            }
            ViewTreeObserver viewTreeObserver = coordinatorLayout2.getViewTreeObserver();
            if (viewTreeObserver != null) {
                viewTreeObserver.addOnGlobalLayoutListener((ViewTreeObserver.OnGlobalLayoutListener) p0Var.f88231j0.getValue());
            }
            p0Var.b8().n1().f35425l = (k0) p0Var.f88235n0.getValue();
            r0 r0Var = (r0) s0Var;
            p0Var.b8().R1(r0Var.f88237a);
            p0Var.b8().t1(r0Var.f88239c);
            p0Var.b8().f35328o0 = m2.Q0(p0Var.c8(), r0Var.f88238b);
        }
        int i13 = j0.f88208a[aVar2.f88183g.ordinal()];
        if (i13 != 1) {
            if (i13 == 2) {
                p0Var.D5();
            }
            p0Var.Z7().a(b.f88189a);
        }
        c0 c0Var2 = c0.f88193a;
        e0 e0Var = aVar2.f88182f;
        if (!Intrinsics.d(e0Var, c0Var2)) {
            if (e0Var instanceof d0) {
                gs0.k kVar = p0Var.f88224c0;
                if (kVar == null) {
                    Intrinsics.r("pinOverflowMenuModalProvider");
                    throw null;
                }
                d0 d0Var = (d0) e0Var;
                gs0.k.a(kVar, d0Var.f88196a, d0Var.f88197b, true, false, null, null, false, null, null, false, null, null, false, null, null, null, false, false, false, false, null, null, false, 8388600).showFeedBack();
            }
            p0Var.Z7().a(d.f88195a);
        }
        return Unit.f80348a;
    }
}
