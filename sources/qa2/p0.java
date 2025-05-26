package qa2;

import android.animation.Animator;
import android.animation.AnimatorInflater;
import android.animation.AnimatorSet;
import android.app.Activity;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.PinterestStaggeredGridLayoutManager;
import com.pinterest.api.model.f30;
import com.pinterest.feature.gridactions.pingridhide.view.PinGridHideView;
import com.pinterest.featurelibrary.pingridcell.sba.view.SbaPinRep;
import com.pinterest.ui.grid.PinGridFeedbackView;
import h32.a4;
import java.util.HashMap;
import kotlin.jvm.internal.Intrinsics;
import ni1.o2;
import ni1.t2;
import org.jetbrains.annotations.NotNull;
import so.a9;
import so.oa;
import so.y8;
import x02.i2;
import x02.x2;

/* loaded from: classes4.dex */
public class p0 extends i implements f0, y92.g, d0 {

    @NotNull
    private final AnimatorSet animSet;
    public jo1.c baseGridActionUtils;

    @NotNull
    private final View feedbackView;
    public lw0.a gridActionPinViewComponentBuilder;

    @NotNull
    private final ti1.f gridCell;

    @NotNull
    private final h0 internalCell;
    public yk1.j mvpBinder;
    private boolean overrideCarouselWidth;
    private f30 pin;

    @NotNull
    private wa2.m pinFeatureConfig;
    public j0 pinGridCellFactory;
    private is0.h pinGridHidePresenter;
    public t2 pinRepViewModelFactory;

    @NotNull
    private final nx.d0 pinalytics;
    private final boolean showGridActions;
    private final String uniqueScreenKey;

    @NotNull
    private final o2 viewModel;
    public ni1.d0 vmStateConverterFactory;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p0(Context context, boolean z13, String str, ao2.j0 scope, nx.d0 pinalytics, wa2.m pinFeatureConfig) {
        super(context, null, 0);
        AnimatorSet animatorSet;
        SbaPinRep sbaPinRep;
        SbaPinRep sbaPinRep2;
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(scope, "scope");
        Intrinsics.checkNotNullParameter(pinalytics, "pinalytics");
        Intrinsics.checkNotNullParameter(pinFeatureConfig, "pinFeatureConfig");
        inject();
        this.showGridActions = z13;
        this.uniqueScreenKey = str;
        this.pinalytics = pinalytics;
        this.pinFeatureConfig = pinFeatureConfig;
        AnimatorSet animatorSet2 = new AnimatorSet();
        this.animSet = animatorSet2;
        this.pinFeatureConfig = wa2.m.a(this.pinFeatureConfig, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, null, false, false, null, null, null, false, null, null, false, false, null, null, false, -1048577, -1, 1023);
        j0 pinGridCellFactory = getPinGridCellFactory();
        t2 pinRepViewModelFactory = getPinRepViewModelFactory();
        Context context2 = getContext();
        Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
        SbaPinRep sbaPinRep3 = (SbaPinRep) ((d) pinGridCellFactory).a(context2, true);
        d0 d0Var = this.pinFeatureConfig.f128855d0;
        o2 a13 = d0Var != null ? t2.a(pinRepViewModelFactory, scope, new zw.a(this), 6) : t2.a(pinRepViewModelFactory, scope, null, 14);
        sbaPinRep3.setPinalytics(pinalytics);
        wa2.m mVar = this.pinFeatureConfig;
        sbaPinRep3.applyUnMigratedPFCFields(mVar.f128875n0, mVar.f128861g0, d0Var, mVar.f128879p0, mVar.M);
        sbaPinRep3.setEventIntake(a13.c());
        kotlin.jvm.internal.j.z(scope, null, null, new n0(a13, sbaPinRep3, null), 3);
        this.gridCell = sbaPinRep3;
        this.viewModel = a13;
        if (z13) {
            PinGridHideView pinGridHideView = new PinGridHideView(6, context, (AttributeSet) null);
            this.feedbackView = pinGridHideView;
            Context context3 = getContext();
            Intrinsics.checkNotNullExpressionValue(context3, "getContext(...)");
            Activity k03 = bs1.c.k0(context3);
            nl1.d f34938d = k03 instanceof cp1.p ? ((cp1.p) k03).getF34938d() : null;
            getBaseGridActionUtils().getClass();
            jo1.a a14 = jo1.c.a(f34938d);
            y8 y8Var = (y8) getGridActionPinViewComponentBuilder();
            y8Var.f114727d = Boolean.valueOf(f34938d != null && f34938d.H7());
            a14.getClass();
            y8Var.f114728e = a14;
            y8Var.f114730g = new lb0.i(str);
            y8Var.f114729f = new lb0.i(a4.FEED_HOME);
            dl2.b.G(Boolean.class, y8Var.f114727d);
            dl2.b.G(jo1.a.class, y8Var.f114728e);
            dl2.b.G(lb0.i.class, y8Var.f114729f);
            dl2.b.G(lb0.i.class, y8Var.f114730g);
            a9 a9Var = (a9) ((l0) df.j1.b0(l0.class, new a9(y8Var.f114724a, y8Var.f114725b, y8Var.f114726c, y8Var.f114727d, y8Var.f114728e, y8Var.f114729f, y8Var.f114730g)));
            oa oaVar = a9Var.f113332e;
            uk1.d presenterPinalytics = a02.e.W3(a9Var.f113328a, a9Var.f113329b, a9Var.f113330c, (uk1.e) oaVar.f113702ga.get());
            uj2.q networkStateStream = (uj2.q) oaVar.f113947u9.get();
            m60.w eventManager = (m60.w) oaVar.f113885r0.get();
            i2 pinRepository = (i2) oaVar.F3.get();
            x2 userRepository = (x2) oaVar.f113800m3.get();
            x02.x0 boardRepository = (x02.x0) oaVar.f113765k3.get();
            x02.v1 interestRepository = (x02.v1) oaVar.f113960v4.get();
            yk1.v resources = (yk1.v) a9Var.f113333f.C.get();
            boolean booleanValue = a9Var.f113331d.booleanValue();
            com.pinterest.hairball.network.e undoHideSearchRequest = (com.pinterest.hairball.network.e) a9Var.f113335h.get();
            animatorSet = animatorSet2;
            nx.d1 trackingParamAttacher = (nx.d1) oaVar.f113730i2.get();
            x10.b pinApiService = (x10.b) oaVar.f113705gd.get();
            sbaPinRep = sbaPinRep3;
            es.a adFormats = (es.a) oaVar.P6.get();
            lh0.m1 gridActionsParamsExperiments = new lh0.m1((lh0.z0) oaVar.D0.get());
            Intrinsics.checkNotNullParameter(presenterPinalytics, "presenterPinalytics");
            Intrinsics.checkNotNullParameter(networkStateStream, "networkStateStream");
            Intrinsics.checkNotNullParameter(eventManager, "eventManager");
            Intrinsics.checkNotNullParameter(pinRepository, "pinRepository");
            Intrinsics.checkNotNullParameter(userRepository, "userRepository");
            Intrinsics.checkNotNullParameter(boardRepository, "boardRepository");
            Intrinsics.checkNotNullParameter(interestRepository, "interestRepository");
            Intrinsics.checkNotNullParameter(resources, "resources");
            jo1.a fragmentType = a9Var.f113328a;
            Intrinsics.checkNotNullParameter(fragmentType, "fragmentType");
            Intrinsics.checkNotNullParameter(undoHideSearchRequest, "undoHideSearchRequest");
            Intrinsics.checkNotNullParameter(trackingParamAttacher, "trackingParamAttacher");
            Intrinsics.checkNotNullParameter(pinApiService, "pinApiService");
            Intrinsics.checkNotNullParameter(adFormats, "adFormats");
            Intrinsics.checkNotNullParameter(gridActionsParamsExperiments, "gridActionsParamsExperiments");
            this.pinGridHidePresenter = new is0.h(presenterPinalytics, networkStateStream, eventManager, pinRepository, userRepository, boardRepository, interestRepository, resources, fragmentType, undoHideSearchRequest, pinApiService, booleanValue, trackingParamAttacher, adFormats, gridActionsParamsExperiments);
            yk1.j mvpBinder = getMvpBinder();
            is0.h hVar = this.pinGridHidePresenter;
            if (hVar == null) {
                Intrinsics.r("pinGridHidePresenter");
                throw null;
            }
            mvpBinder.d(pinGridHideView, hVar);
        } else {
            animatorSet = animatorSet2;
            sbaPinRep = sbaPinRep3;
            PinGridFeedbackView pinGridFeedbackView = new PinGridFeedbackView(context, null);
            this.feedbackView = pinGridFeedbackView;
            pinGridFeedbackView.setRotationY(180.0f);
        }
        sbaPinRep.getInternalCell().addToView(this);
        addView(this.feedbackView);
        if (z13) {
            Animator loadAnimator = AnimatorInflater.loadAnimator(getContext(), m60.o0.fade_out);
            Intrinsics.g(loadAnimator, "null cannot be cast to non-null type android.animation.AnimatorSet");
            AnimatorSet animatorSet3 = (AnimatorSet) loadAnimator;
            sbaPinRep2 = sbaPinRep;
            animatorSet3.setTarget(sbaPinRep2);
            Animator loadAnimator2 = AnimatorInflater.loadAnimator(getContext(), m60.o0.fade_in);
            Intrinsics.g(loadAnimator2, "null cannot be cast to non-null type android.animation.AnimatorSet");
            AnimatorSet animatorSet4 = (AnimatorSet) loadAnimator2;
            animatorSet4.setTarget(this.feedbackView);
            AnimatorSet animatorSet5 = animatorSet;
            animatorSet5.addListener(new o0(this, 3));
            animatorSet5.playTogether(animatorSet3, animatorSet4);
        } else {
            AnimatorSet animatorSet6 = animatorSet;
            sbaPinRep2 = sbaPinRep;
            Animator loadAnimator3 = AnimatorInflater.loadAnimator(getContext(), m60.o0.flip_90);
            Intrinsics.g(loadAnimator3, "null cannot be cast to non-null type android.animation.AnimatorSet");
            AnimatorSet animatorSet7 = (AnimatorSet) loadAnimator3;
            animatorSet7.setTarget(this);
            animatorSet7.addListener(new o0(this, 2));
            Animator loadAnimator4 = AnimatorInflater.loadAnimator(getContext(), m60.o0.flip_90_to_180);
            Intrinsics.g(loadAnimator4, "null cannot be cast to non-null type android.animation.AnimatorSet");
            AnimatorSet animatorSet8 = (AnimatorSet) loadAnimator4;
            animatorSet8.setTarget(this);
            animatorSet8.addListener(new o0(this, 1));
            animatorSet6.addListener(new o0(this, 0));
            animatorSet6.playSequentially(animatorSet7, animatorSet8);
        }
        this.internalCell = sbaPinRep2;
    }

    public static h32.i0 a(p0 this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        return this$0.pinalytics.p();
    }

    public static HashMap b(p0 this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        return this$0.pinalytics.f();
    }

    public final void e(boolean z13) {
        if (z13) {
            if (!this.showGridActions) {
                setRotationY(0.0f);
            }
            this.feedbackView.setVisibility(4);
        } else {
            if (!this.showGridActions) {
                setRotationY(180.0f);
            }
            this.feedbackView.setVisibility(0);
        }
    }

    @NotNull
    public final jo1.c getBaseGridActionUtils() {
        jo1.c cVar = this.baseGridActionUtils;
        if (cVar != null) {
            return cVar;
        }
        Intrinsics.r("baseGridActionUtils");
        throw null;
    }

    @NotNull
    public final lw0.a getGridActionPinViewComponentBuilder() {
        lw0.a aVar = this.gridActionPinViewComponentBuilder;
        if (aVar != null) {
            return aVar;
        }
        Intrinsics.r("gridActionPinViewComponentBuilder");
        throw null;
    }

    @Override // qa2.f0
    @NotNull
    public h0 getInternalCell() {
        return this.internalCell;
    }

    @NotNull
    public final yk1.j getMvpBinder() {
        yk1.j jVar = this.mvpBinder;
        if (jVar != null) {
            return jVar;
        }
        Intrinsics.r("mvpBinder");
        throw null;
    }

    public final boolean getOverrideCarouselWidth() {
        return this.overrideCarouselWidth;
    }

    @NotNull
    public final j0 getPinGridCellFactory() {
        j0 j0Var = this.pinGridCellFactory;
        if (j0Var != null) {
            return j0Var;
        }
        Intrinsics.r("pinGridCellFactory");
        throw null;
    }

    @NotNull
    public final t2 getPinRepViewModelFactory() {
        t2 t2Var = this.pinRepViewModelFactory;
        if (t2Var != null) {
            return t2Var;
        }
        Intrinsics.r("pinRepViewModelFactory");
        throw null;
    }

    @NotNull
    public final ni1.d0 getVmStateConverterFactory() {
        ni1.d0 d0Var = this.vmStateConverterFactory;
        if (d0Var != null) {
            return d0Var;
        }
        Intrinsics.r("vmStateConverterFactory");
        throw null;
    }

    @Override // android.widget.FrameLayout, android.view.View
    public void onMeasure(int i13, int i14) {
        int i15;
        int size = View.MeasureSpec.getSize(i13);
        ViewGroup.LayoutParams layoutParams = getLayoutParams();
        if (layoutParams instanceof PinterestStaggeredGridLayoutManager.LayoutParams) {
            PinterestStaggeredGridLayoutManager.LayoutParams layoutParams2 = (PinterestStaggeredGridLayoutManager.LayoutParams) layoutParams;
            i15 = layoutParams2.e() - (layoutParams2.c() + layoutParams2.b());
        } else {
            i15 = 0;
        }
        if (this.overrideCarouselWidth) {
            i13 = View.MeasureSpec.makeMeasureSpec((int) (View.MeasureSpec.getSize(i14) / 1.5d), 1073741824);
        }
        if (i15 <= 0) {
            super.onMeasure(i13, i14);
        } else {
            super.onMeasure(View.MeasureSpec.makeMeasureSpec(size, 1073741824), View.MeasureSpec.makeMeasureSpec(i15, 1073741824));
            setMeasuredDimension(size, i15);
        }
    }

    @Override // qa2.d0
    public void onOpenPinCloseup(@NotNull f30 pin) {
        Intrinsics.checkNotNullParameter(pin, "pin");
        d0 d0Var = this.pinFeatureConfig.f128855d0;
        if (d0Var != null) {
            d0Var.onOpenPinCloseup(pin);
        }
    }

    @Override // y92.g
    public boolean resizable() {
        return true;
    }

    public final void setBaseGridActionUtils(@NotNull jo1.c cVar) {
        Intrinsics.checkNotNullParameter(cVar, "<set-?>");
        this.baseGridActionUtils = cVar;
    }

    public final void setGridActionPinViewComponentBuilder(@NotNull lw0.a aVar) {
        Intrinsics.checkNotNullParameter(aVar, "<set-?>");
        this.gridActionPinViewComponentBuilder = aVar;
    }

    public final void setMvpBinder(@NotNull yk1.j jVar) {
        Intrinsics.checkNotNullParameter(jVar, "<set-?>");
        this.mvpBinder = jVar;
    }

    public final void setOverrideCarouselWidth(boolean z13) {
        this.overrideCarouselWidth = z13;
    }

    /* JADX WARN: Code restructure failed: missing block: B:58:0x016c, code lost:
    
        if (r4 >= 210) goto L60;
     */
    @Override // qa2.e0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void setPin(@org.jetbrains.annotations.NotNull com.pinterest.api.model.f30 r8, int r9) {
        /*
            Method dump skipped, instructions count: 450
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: qa2.p0.setPin(com.pinterest.api.model.f30, int):void");
    }

    public final void setPinGridCellFactory(@NotNull j0 j0Var) {
        Intrinsics.checkNotNullParameter(j0Var, "<set-?>");
        this.pinGridCellFactory = j0Var;
    }

    public final void setPinRepViewModelFactory(@NotNull t2 t2Var) {
        Intrinsics.checkNotNullParameter(t2Var, "<set-?>");
        this.pinRepViewModelFactory = t2Var;
    }

    public final void setVmStateConverterFactory(@NotNull ni1.d0 d0Var) {
        Intrinsics.checkNotNullParameter(d0Var, "<set-?>");
        this.vmStateConverterFactory = d0Var;
    }

    @Override // y92.g
    /* renamed from: uid */
    public String getUniqueId() {
        f30 f30Var = this.pin;
        if (f30Var != null) {
            return f30Var.getUid();
        }
        return null;
    }
}
