package xs;

import android.content.Context;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import androidx.transition.Transition;
import com.pinterest.ads.feature.owc.carting.bottomSheet.CartingBottomSheetBehavior;
import com.pinterest.ads.feature.owc.carting.bottomSheet.content.CartingHeaderView;
import com.pinterest.ads.feature.owc.carting.bottomSheet.content.CartingLoadingView;
import com.pinterest.ads.feature.owc.carting.bottomSheet.content.CartingRetailerEmptyView;
import com.pinterest.ads.feature.owc.carting.bottomSheet.content.CartingRetailerErrorView;
import com.pinterest.ads.feature.owc.carting.bottomSheet.content.CartingRetailerView;
import com.pinterest.ads.feature.owc.view.base.BaseAdsBottomSheetBehavior;
import com.pinterest.ads.feature.owc.view.base.BaseAdsScrollingModule;
import com.pinterest.api.model.b1;
import com.pinterest.api.model.wy0;
import com.pinterest.feature.browser.view.InAppBrowserView;
import df.j1;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import kotlin.Pair;
import kotlin.collections.z0;
import kotlin.jvm.internal.Intrinsics;
import ua.t0;

/* loaded from: classes3.dex */
public final class g extends qu.a {
    public final CartingHeaderView A;
    public final CartingBottomSheetBehavior B;
    public final Map C;
    public e D;
    public e E;

    /* renamed from: v, reason: collision with root package name */
    public final u50.r f135718v;

    /* renamed from: w, reason: collision with root package name */
    public final CartingRetailerView f135719w;

    /* renamed from: x, reason: collision with root package name */
    public final CartingLoadingView f135720x;

    /* renamed from: y, reason: collision with root package name */
    public final CartingRetailerErrorView f135721y;

    /* renamed from: z, reason: collision with root package name */
    public final CartingRetailerEmptyView f135722z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(Context context, mq.z eventIntake, mq.z bottomSheetEventInTake) {
        super(context, null, 0, eventIntake);
        Intrinsics.checkNotNullParameter(context, "context");
        CartingBottomSheetBehavior cartingBottomSheetBehavior = new CartingBottomSheetBehavior(context, null, false);
        cartingBottomSheetBehavior.f35264o0 = true;
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(eventIntake, "eventIntake");
        Intrinsics.checkNotNullParameter(bottomSheetEventInTake, "bottomSheetEventInTake");
        Intrinsics.checkNotNullParameter(cartingBottomSheetBehavior, "cartingBottomSheetBehavior");
        this.f135718v = bottomSheetEventInTake;
        this.f53200b.addView(LayoutInflater.from(context).inflate(ps.q.ads_carting_bottom_sheet, (ViewGroup) this, false));
        View findViewById = findViewById(ps.p.carting_merchant_view);
        Intrinsics.checkNotNullExpressionValue(findViewById, "findViewById(...)");
        CartingRetailerView cartingRetailerView = (CartingRetailerView) findViewById;
        this.f135719w = cartingRetailerView;
        View findViewById2 = findViewById(ps.p.carting_loading_screen);
        Intrinsics.checkNotNullExpressionValue(findViewById2, "findViewById(...)");
        CartingLoadingView cartingLoadingView = (CartingLoadingView) findViewById2;
        this.f135720x = cartingLoadingView;
        View findViewById3 = findViewById(ps.p.carting_retailer_error_view);
        Intrinsics.checkNotNullExpressionValue(findViewById3, "findViewById(...)");
        CartingRetailerErrorView cartingRetailerErrorView = (CartingRetailerErrorView) findViewById3;
        this.f135721y = cartingRetailerErrorView;
        View findViewById4 = findViewById(ps.p.carting_retailer_empty_view);
        Intrinsics.checkNotNullExpressionValue(findViewById4, "findViewById(...)");
        CartingRetailerEmptyView cartingRetailerEmptyView = (CartingRetailerEmptyView) findViewById4;
        this.f135722z = cartingRetailerEmptyView;
        View findViewById5 = findViewById(ps.p.carting_header_view);
        Intrinsics.checkNotNullExpressionValue(findViewById5, "findViewById(...)");
        this.A = (CartingHeaderView) findViewById5;
        View findViewById6 = findViewById(ps.p.carting_bottom_sheet_root);
        Intrinsics.checkNotNullExpressionValue(findViewById6, "findViewById(...)");
        FrameLayout frameLayout = this.f53200b;
        ViewGroup.LayoutParams layoutParams = frameLayout.getLayoutParams();
        layoutParams.height = -2;
        FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) layoutParams;
        layoutParams2.setMargins(0, 0, 0, 0);
        frameLayout.setLayoutParams(layoutParams2);
        frameLayout.setBackground(null);
        frameLayout.setBackgroundColor(0);
        frameLayout.setPaddingRelative(frameLayout.getPaddingStart(), 0, frameLayout.getPaddingEnd(), 0);
        bs1.c.X0(this.f53208j);
        this.B = cartingBottomSheetBehavior;
        Pair[] pairArr = new Pair[6];
        e0 e0Var = e0.CARTING_INITIAL;
        pairArr[0] = new Pair(e0Var, new e(this.f53208j, true, new f(this, 0)));
        pairArr[1] = new Pair(e0.CARTING_SUCCESS, new e(cartingRetailerView, true, new f(this, 1)));
        pairArr[2] = new Pair(e0.CARTING_ERROR, new e(cartingRetailerErrorView, true, new f(this, 2)));
        pairArr[3] = new Pair(e0.CARTING_EMPTY, new e(cartingRetailerEmptyView, true, new f(this, 3)));
        pairArr[4] = new Pair(e0.CARTING_LOADING, new e(cartingLoadingView, true, new f(this, 4)));
        e0 e0Var2 = e0.CARTING_BROWSER;
        View view = this.f35366r;
        pairArr[5] = new Pair(e0Var2, new e(view == null ? new View(context) : view, false, new f(this, 5)));
        Map g13 = z0.g(pairArr);
        this.C = g13;
        Object obj = g13.get(e0Var);
        Intrinsics.f(obj);
        e eVar = (e) obj;
        this.D = eVar;
        this.E = eVar;
        setVisibility(4);
    }

    public static final void t0(g gVar) {
        gVar.getClass();
        int i13 = 6;
        f fVar = new f(gVar, i13);
        ViewParent parent = gVar.getParent();
        ViewGroup viewGroup = parent instanceof ViewGroup ? (ViewGroup) parent : null;
        if (viewGroup != null) {
            t0.a(viewGroup, null);
        }
        fVar.invoke();
        if (viewGroup != null) {
            t0.f121360c.remove(gVar);
            ArrayList arrayList = (ArrayList) t0.b().get(gVar);
            if (arrayList != null && !arrayList.isEmpty()) {
                ArrayList arrayList2 = new ArrayList(arrayList);
                for (int size = arrayList2.size() - 1; size >= 0; size--) {
                    ((Transition) arrayList2.get(size)).w(gVar);
                }
            }
        }
        gVar.getViewTreeObserver().addOnGlobalLayoutListener(new n.e(gVar, i13));
    }

    public final void B0(m displayState, e0 firstState) {
        Intrinsics.checkNotNullParameter(displayState, "displayState");
        Intrinsics.checkNotNullParameter(firstState, "firstState");
        Map map = this.C;
        e eVar = (e) map.get(firstState);
        if (eVar == null) {
            Object obj = map.get(e0.CARTING_INITIAL);
            Intrinsics.f(obj);
            eVar = (e) obj;
        }
        this.D = eVar;
        x();
        ViewGroup.LayoutParams layoutParams = getLayoutParams();
        layoutParams.height = -2;
        setLayoutParams(layoutParams);
        setClipChildren(false);
        setClipToPadding(false);
        int i13 = (displayState.f135749i && us.c.a().c()) ? ps.s.ads_sponsored_by : ps.s.ads_core_promoted_by;
        Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        CharSequence[] texts = new CharSequence[1];
        wy0 wy0Var = displayState.f135744d;
        String Z2 = wy0Var != null ? wy0Var.Z2() : null;
        if (Z2 == null) {
            Z2 = "";
        }
        texts[0] = Z2;
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(texts, "texts");
        CharSequence a03 = j1.a0(context.getString(i13, Arrays.copyOf(texts, 1)));
        Intrinsics.checkNotNullExpressionValue(a03, "fromHtml(...)");
        Collection values = map.values();
        ArrayList arrayList = new ArrayList();
        for (Object obj2 : values) {
            if (((e) obj2).f135709a instanceof ys.b) {
                arrayList.add(obj2);
            }
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            KeyEvent.Callback callback = ((e) it.next()).f135709a;
            Intrinsics.g(callback, "null cannot be cast to non-null type com.pinterest.ads.feature.owc.carting.bottomSheet.content.CartingViewInitializer");
            ((ys.b) callback).a(this.f135718v);
        }
        CartingHeaderView cartingHeaderView = this.A;
        cartingHeaderView.getClass();
        String str = displayState.f135742b;
        if (str != null) {
            pk.a0.q(cartingHeaderView.f35265a, bs1.c.h2(str));
        }
        if (a03 != null) {
            pk.a0.q(cartingHeaderView.f35266b, bs1.c.h2(a03));
        }
    }

    @Override // cu.i
    public final void C(int i13) {
        this.B.W(-1);
    }

    public final void F0() {
        bs1.c.U1(this.f53200b);
        setVisibility(0);
        K0(e0.CARTING_LOADING);
    }

    public final void G0() {
        bs1.c.U1(this.f53200b);
        setVisibility(0);
        K0(e0.CARTING_EMPTY);
    }

    public final void H0() {
        bs1.c.U1(this.f53200b);
        setVisibility(0);
        K0(e0.CARTING_ERROR);
    }

    public final void I0(b1 b1Var) {
        bs1.c.U1(this.f53200b);
        setVisibility(0);
        CartingRetailerView cartingRetailerView = this.f135719w;
        u50.r eventIntake = cartingRetailerView.f35269a;
        if (eventIntake == null) {
            Intrinsics.r("eventIntake");
            throw null;
        }
        vs.b bVar = cartingRetailerView.f35270b;
        bVar.getClass();
        Intrinsics.checkNotNullParameter(eventIntake, "eventIntake");
        bVar.f126471f = eventIntake;
        bVar.f126470e = b1Var;
        bVar.h();
        K0(e0.CARTING_SUCCESS);
    }

    public final void K0(e0 e0Var) {
        e eVar = (e) this.C.get(e0Var);
        if (eVar == null || Intrinsics.d(this.D, eVar)) {
            return;
        }
        this.E = this.D;
        this.D = eVar;
        CartingBottomSheetBehavior cartingBottomSheetBehavior = this.B;
        cartingBottomSheetBehavior.f35311l0 = false;
        cartingBottomSheetBehavior.f35264o0 = false;
        cu.a aVar = this.f53211m;
        if (aVar != null) {
            BaseAdsScrollingModule baseAdsScrollingModule = (BaseAdsScrollingModule) aVar;
            if (baseAdsScrollingModule.z1()) {
                if (eVar.f135710b) {
                    baseAdsScrollingModule.n1().q();
                } else {
                    baseAdsScrollingModule.n1().e();
                }
            }
        }
        eVar.f135712d.invoke();
    }

    @Override // cu.i
    public final void L(Integer num, int i13) {
    }

    @Override // com.pinterest.ads.feature.owc.view.core.AdsBrowserBottomSheet, cu.i
    public final void Z(float f13) {
        InAppBrowserView inAppBrowserView = this.f35366r;
        if (inAppBrowserView != null) {
            inAppBrowserView.setAlpha(f13);
        }
        InAppBrowserView inAppBrowserView2 = this.f35366r;
        LinearLayout linearLayout = inAppBrowserView2 != null ? inAppBrowserView2.f45398k : null;
        if (linearLayout == null) {
            return;
        }
        linearLayout.setAlpha(f13);
    }

    @Override // com.pinterest.ads.feature.owc.view.core.AdsBrowserBottomSheet, cu.i
    /* renamed from: g */
    public final BaseAdsBottomSheetBehavior getF35368t() {
        return this.B;
    }

    @Override // cu.i
    public final int j() {
        return this.f53200b.getHeight();
    }

    @Override // com.pinterest.ads.feature.owc.view.core.AdsBrowserBottomSheet, cu.i
    public final int k() {
        return ps.q.ads_bottom_sheet_collapse_content;
    }

    @Override // cu.i
    public final int m() {
        return this.f53200b.getHeight();
    }

    @Override // qu.a, com.pinterest.ads.feature.owc.view.core.AdsBrowserBottomSheet, cu.i
    public final void o() {
        fu.c cVar;
        cu.a aVar = this.f53211m;
        if (aVar == null || (cVar = ((BaseAdsScrollingModule) aVar).f35327n0) == null) {
            return;
        }
        cVar.d5();
    }

    @Override // cu.i
    public final void q() {
    }

    @Override // cu.i
    public final void s(String str, String str2, String str3, boolean z13, boolean z14) {
        x();
        n();
    }

    @Override // cu.i
    public final void z() {
        n();
    }

    public final void z0(m displayState) {
        Intrinsics.checkNotNullParameter(displayState, "displayState");
        if (displayState.f135745e) {
            return;
        }
        K0(e0.CARTING_BROWSER);
    }
}
