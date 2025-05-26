package vs0;

import a7.h;
import a7.v0;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.Resources;
import android.database.Cursor;
import android.util.Property;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.LinearInterpolator;
import android.widget.FrameLayout;
import android.widget.HorizontalScrollView;
import c61.i;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.pinterest.api.model.ln0;
import com.pinterest.design.brio.widget.progress.PinterestSwipeRefreshLayout;
import com.pinterest.design.widget.RoundedCornersLayout;
import com.pinterest.feature.ideaPinCreation.camera.view.IdeaPinCreationCameraVideoSegmentsView;
import com.pinterest.feature.ideaPinCreation.closeup.view.IdeaPinInteractiveVideoView;
import com.pinterest.feature.ideaPinCreation.common.view.IdeaPinEditablePageLite;
import com.pinterest.feature.ideaPinCreation.drafts.view.IdeaPinDraftPreview;
import com.pinterest.feature.ideaPinCreation.worker.IdeaPinS3MediaUploadWorker;
import com.pinterest.feature.ideaPinCreation.worker.IdeaPinVideoExportWorker;
import com.pinterest.feature.pin.closeup.filters.view.RelatedPinsFiltersCarouselView;
import com.pinterest.feature.pincells.fixedsize.view.FixedSizePinOverlayView;
import com.pinterest.feature.search.results.view.SearchBarView;
import com.pinterest.feature.search.typeahead.view.TypeaheadGestaltSearchBarContainer;
import com.pinterest.feature.search.typeahead.view.TypeaheadLegacySearchBarContainer;
import com.pinterest.gestalt.iconbutton.GestaltIconButton;
import com.pinterest.gestalt.text.GestaltText;
import com.pinterest.gestalt.textfield.view.GestaltTextField;
import com.pinterest.oneBarLibrary.container.view.OneBarContainer;
import com.pinterest.ui.grid.GridPlaceholderLoadingLayout;
import com.pinterest.ui.grid.PinterestRecyclerView;
import com.pinterest.ui.imageview.WebImageView;
import df.j1;
import dl1.l;
import dl1.t;
import i92.k;
import ja.d0;
import ja.f0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kh2.k3;
import kotlin.collections.g0;
import kotlin.jvm.internal.Intrinsics;
import lv0.g;
import m7.l0;
import mv0.r;
import pk.a0;
import q01.y;
import so.oa;
import v.c1;
import xk2.v;
import yk1.n;
import zv0.j;

/* loaded from: classes5.dex */
public final /* synthetic */ class b implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f126541a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f126542b;

    public /* synthetic */ b(Object obj, int i13) {
        this.f126541a = i13;
        this.f126542b = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        String str;
        g gVar;
        ex0.e l13;
        Float valueOf;
        ValueAnimator valueAnimator;
        int i13 = this.f126541a;
        int i14 = 16;
        int i15 = 3;
        Object obj = this.f126542b;
        switch (i13) {
            case 0:
                f this$0 = (f) obj;
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                if (this$0.isBound()) {
                    this$0.f126549e.n();
                    return;
                }
                return;
            case 1:
                qt0.c this$02 = (qt0.c) obj;
                Intrinsics.checkNotNullParameter(this$02, "this$0");
                v0 v0Var = this$02.f105139d;
                if (v0Var == null) {
                    return;
                }
                l0 l0Var = (l0) v0Var;
                int N = l0Var.N();
                int X = (int) l0Var.X();
                IdeaPinCreationCameraVideoSegmentsView ideaPinCreationCameraVideoSegmentsView = this$02.f105136a.G0;
                if (ideaPinCreationCameraVideoSegmentsView == null) {
                    Intrinsics.r("cameraSegmentsView");
                    throw null;
                }
                ideaPinCreationCameraVideoSegmentsView.b(N, X);
                h hVar = (h) v0Var;
                this$02.f105137b.y(hVar.f() && !this$02.c());
                if (hVar.f()) {
                    this$02.f105138c.postDelayed(new b(this$02, 1), 16L);
                    return;
                }
                return;
            case 2:
                IdeaPinInteractiveVideoView this$03 = (IdeaPinInteractiveVideoView) obj;
                Intrinsics.checkNotNullParameter(this$03, "this$0");
                IdeaPinInteractiveVideoView.O(this$03);
                return;
            case 3:
                fu0.d this$04 = (fu0.d) obj;
                Intrinsics.checkNotNullParameter(this$04, "this$0");
                this$04.Y7().z0();
                return;
            case 4:
                IdeaPinDraftPreview this$05 = (IdeaPinDraftPreview) obj;
                int i16 = IdeaPinDraftPreview.f46466h;
                Intrinsics.checkNotNullParameter(this$05, "this$0");
                this$05.f46467a.invoke();
                return;
            case 5:
                zu0.g this$06 = (zu0.g) obj;
                int i17 = zu0.g.T0;
                Intrinsics.checkNotNullParameter(this$06, "this$0");
                HorizontalScrollView horizontalScrollView = this$06.H0;
                if (horizontalScrollView != null) {
                    horizontalScrollView.fullScroll(66);
                    return;
                } else {
                    Intrinsics.r("selectedTagsScrollView");
                    throw null;
                }
            case 6:
                g this$07 = (g) obj;
                Intrinsics.checkNotNullParameter(this$07, "this$0");
                n viewIfBound = this$07.getViewIfBound();
                jv0.b bVar = viewIfBound instanceof jv0.b ? (jv0.b) viewIfBound : null;
                if (bVar != null) {
                    PinterestRecyclerView pinterestRecyclerView = ((r) bVar).f88399k1;
                    if (pinterestRecyclerView != null) {
                        pinterestRecyclerView.setVisibility(0);
                        return;
                    } else {
                        Intrinsics.r("brandRecyclerView");
                        throw null;
                    }
                }
                return;
            case 7:
                r this$08 = (r) obj;
                int i18 = r.f88395t1;
                Intrinsics.checkNotNullParameter(this$08, "this$0");
                if (this$08.f88404p1 && (str = this$08.f88403o1) != null && str.length() > 0 && (gVar = this$08.f88402n1) != null) {
                    gVar.D3(str);
                }
                this$08.f88404p1 = false;
                return;
            case 8:
                k this_showDraftSavedToast = (k) obj;
                v vVar = uv0.k.f123176a;
                Intrinsics.checkNotNullParameter(this_showDraftSavedToast, "$this_showDraftSavedToast");
                this_showDraftSavedToast.n(aq1.h.idea_pin_draft_saved);
                return;
            case 9:
                j this$09 = (j) obj;
                Intrinsics.checkNotNullParameter(this$09, "this$0");
                IdeaPinEditablePageLite ideaPinEditablePageLite = this$09.G0;
                if (ideaPinEditablePageLite != null) {
                    ideaPinEditablePageLite.z0();
                    return;
                } else {
                    Intrinsics.r("pageView");
                    throw null;
                }
            case 10:
                IdeaPinS3MediaUploadWorker this$010 = (IdeaPinS3MediaUploadWorker) obj;
                Intrinsics.checkNotNullParameter(this$010, "this$0");
                ag1.b bVar2 = this$010.f46647u;
                String str2 = (String) this$010.D.getValue();
                String path = this$010.s().getPath();
                Intrinsics.checkNotNullExpressionValue(path, "getPath(...)");
                l lVar = (l) ((t) ((oa) ((qq1.a) qq1.c.f104877a.getValue())).Y7.get());
                ln0 ln0Var = (ln0) lVar.O(str2);
                if (ln0Var != null) {
                    ln0 I = ln0Var.I(new zu0.c(path, 6));
                    lVar.W(I);
                    bVar2.f15133f = I.getPageData();
                    return;
                }
                return;
            case 11:
                IdeaPinVideoExportWorker this$011 = (IdeaPinVideoExportWorker) obj;
                Intrinsics.checkNotNullParameter(this$011, "this$0");
                sv0.l lVar2 = this$011.f46662s;
                lVar2.getClass();
                xk2.k kVar = vb0.f.f125456e;
                boolean a13 = vb0.e.d().a();
                ArrayList arrayList = lVar2.f115364m;
                if (a13) {
                    arrayList.clear();
                    return;
                }
                ex0.c networkType = ex0.c.WIFI;
                ex0.g status = ex0.g.SUCCESS;
                fe0.b bVar3 = lVar2.f115356e;
                bVar3.getClass();
                Intrinsics.checkNotNullParameter(networkType, "networkType");
                Intrinsics.checkNotNullParameter(status, "status");
                ce0.a aVar = bVar3.f62039a;
                aVar.getClass();
                Intrinsics.checkNotNullParameter(networkType, "networkType");
                Intrinsics.checkNotNullParameter(status, "status");
                f0 d2 = f0.d(3, "SELECT * FROM network_speed WHERE networkType = ? AND status = ? AND isVideo = ?");
                aVar.f27587d.getClass();
                d2.c1(1, xa0.j.h(networkType));
                aVar.f27588e.getClass();
                d2.c1(2, xa0.j.o(status));
                d2.u1(3, 1);
                d0 d0Var = aVar.f27584a;
                d0Var.b();
                Cursor m03 = d7.b.m0(d0Var, d2, false);
                try {
                    int w13 = b7.c.w(m03, "ideaPinPageId");
                    int w14 = b7.c.w(m03, "uploadBucket");
                    int w15 = b7.c.w(m03, "bytesWritten");
                    int w16 = b7.c.w(m03, "timestamp");
                    int w17 = b7.c.w(m03, "networkType");
                    int w18 = b7.c.w(m03, "status");
                    int w19 = b7.c.w(m03, "ideaPinCreationId");
                    int w23 = b7.c.w(m03, "isVideo");
                    ArrayList arrayList2 = new ArrayList(m03.getCount());
                    while (m03.moveToNext()) {
                        String string = m03.getString(w13);
                        String string2 = m03.isNull(w14) ? null : m03.getString(w14);
                        if (string2 == null) {
                            l13 = null;
                        } else {
                            aVar.f27586c.getClass();
                            l13 = xa0.j.l(string2);
                        }
                        arrayList2.add(new ce0.b(string, l13, m03.isNull(w15) ? null : Long.valueOf(m03.getLong(w15)), m03.getLong(w16), xa0.j.k(m03.getString(w17)), xa0.j.m(m03.getString(w18)), m03.getString(w19), m03.getInt(w23) != 0));
                    }
                    m03.close();
                    d2.e();
                    ArrayList arrayList3 = new ArrayList(g0.q(arrayList2, 10));
                    Iterator it = arrayList2.iterator();
                    while (it.hasNext()) {
                        ce0.b bVar4 = (ce0.b) it.next();
                        arrayList3.add(new ex0.a(bVar4.f27591a, bVar4.f27592b, bVar4.f27593c, bVar4.f27594d, bVar4.f27595e, bVar4.f27596f, bVar4.f27597g, bVar4.f27598h));
                    }
                    ArrayList arrayList4 = new ArrayList();
                    Iterator it2 = arrayList3.iterator();
                    while (it2.hasNext()) {
                        Object next = it2.next();
                        Long l14 = ((ex0.a) next).f60377c;
                        if (l14 != null && l14.longValue() > 20000000) {
                            arrayList4.add(next);
                        }
                    }
                    arrayList.addAll(arrayList4);
                    return;
                } catch (Throwable th3) {
                    m03.close();
                    d2.e();
                    throw th3;
                }
            case 12:
                lp.k this$012 = (lp.k) obj;
                Intrinsics.checkNotNullParameter(this$012, "this$0");
                GestaltTextField gestaltTextField = (GestaltTextField) this$012.f84225c;
                if (gestaltTextField == null) {
                    Intrinsics.r("editText");
                    throw null;
                }
                gestaltTextField.d0();
                GestaltTextField gestaltTextField2 = (GestaltTextField) this$012.f84225c;
                if (gestaltTextField2 != null) {
                    hf0.b.t(gestaltTextField2.getContext());
                    return;
                } else {
                    Intrinsics.r("editText");
                    throw null;
                }
            case 13:
                ly0.h this$013 = (ly0.h) obj;
                int i19 = ly0.h.f85134m;
                Intrinsics.checkNotNullParameter(this$013, "this$0");
                FrameLayout frameLayout = this$013.f85138d;
                float height = frameLayout.getHeight();
                if (this$013.f85144j == null) {
                    valueOf = null;
                } else {
                    Context context = this$013.getContext();
                    Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
                    float E = (j1.E(frameLayout.getHeight(), context) / 2) - ((r5.f85109d / 2) + r5.f85107b);
                    Intrinsics.checkNotNullExpressionValue(this$013.getResources(), "getResources(...)");
                    valueOf = Float.valueOf(a0.L(r5, E));
                }
                if (valueOf != null) {
                    ObjectAnimator ofFloat = ObjectAnimator.ofFloat(frameLayout, (Property<FrameLayout, Float>) View.TRANSLATION_Y, height, valueOf.floatValue());
                    ofFloat.setDuration(3100L);
                    FrameLayout frameLayout2 = this$013.f85139e;
                    Property property = View.ALPHA;
                    ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(frameLayout2, (Property<FrameLayout, Float>) property, 0.0f, 1.0f);
                    ofFloat2.setStartDelay(2600L);
                    ofFloat2.setInterpolator(new LinearInterpolator());
                    ofFloat2.setDuration(300L);
                    WebImageView webImageView = this$013.f85146l;
                    Intrinsics.g(webImageView, "null cannot be cast to non-null type android.view.View");
                    ObjectAnimator ofFloat3 = ObjectAnimator.ofFloat(webImageView, (Property<WebImageView, Float>) property, 0.0f, 1.0f);
                    ofFloat3.setDuration(300L);
                    final RoundedCornersLayout roundedCornersLayout = this$013.f85145k;
                    if (roundedCornersLayout != null) {
                        ly0.a aVar2 = this$013.f85144j;
                        final int i23 = aVar2 != null ? aVar2.f85108c : 0;
                        final int i24 = aVar2 != null ? aVar2.f85109d : 0;
                        int i25 = this$013.f85136b;
                        final int i26 = i25 - i23;
                        int i27 = this$013.f85137c;
                        final int i28 = i27 - i24;
                        Context context2 = this$013.getContext();
                        Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
                        boolean Y0 = j1.Y0(context2);
                        ly0.a aVar3 = this$013.f85144j;
                        int i29 = aVar3 != null ? aVar3.f85106a : 0;
                        Context context3 = this$013.getContext();
                        Intrinsics.checkNotNullExpressionValue(context3, "getContext(...)");
                        float E2 = (((j1.E(frameLayout.getWidth(), context3) - i25) / 2) * (Y0 ? -1 : 1)) + (i29 * (Y0 ? 1 : -1));
                        Resources resources = this$013.getResources();
                        Intrinsics.checkNotNullExpressionValue(resources, "getResources(...)");
                        final float L = a0.L(resources, E2);
                        ly0.a aVar4 = this$013.f85144j;
                        int i33 = aVar4 != null ? aVar4.f85109d : 0;
                        Resources resources2 = this$013.getResources();
                        Intrinsics.checkNotNullExpressionValue(resources2, "getResources(...)");
                        final float K = a0.K((-(i27 - i33)) / 2, resources2);
                        valueAnimator = ValueAnimator.ofFloat(0.0f, 1.0f);
                        valueAnimator.setStartDelay(200L);
                        valueAnimator.setDuration(500L);
                        valueAnimator.setInterpolator(new DecelerateInterpolator());
                        valueAnimator.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: ly0.f
                            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                            public final void onAnimationUpdate(ValueAnimator animation) {
                                RoundedCornersLayout view = RoundedCornersLayout.this;
                                Intrinsics.checkNotNullParameter(view, "$view");
                                Intrinsics.checkNotNullParameter(animation, "animation");
                                Object animatedValue = animation.getAnimatedValue();
                                Intrinsics.g(animatedValue, "null cannot be cast to non-null type kotlin.Float");
                                float floatValue = ((Float) animatedValue).floatValue();
                                ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
                                Resources resources3 = view.getResources();
                                Intrinsics.checkNotNullExpressionValue(resources3, "getResources(...)");
                                layoutParams.width = a0.L(resources3, (i26 * floatValue) + i23);
                                ViewGroup.LayoutParams layoutParams2 = view.getLayoutParams();
                                Resources resources4 = view.getResources();
                                Intrinsics.checkNotNullExpressionValue(resources4, "getResources(...)");
                                layoutParams2.height = a0.L(resources4, (i28 * floatValue) + i24);
                                view.setTranslationX(L * floatValue);
                                view.setTranslationY(K * floatValue);
                                view.requestLayout();
                            }
                        });
                    } else {
                        valueAnimator = null;
                    }
                    AnimatorSet animatorSet = new AnimatorSet();
                    animatorSet.setStartDelay(2600L);
                    animatorSet.addListener(new androidx.appcompat.widget.d(this$013, 16));
                    animatorSet.play(ofFloat3).with(valueAnimator);
                    AnimatorSet animatorSet2 = new AnimatorSet();
                    animatorSet2.play(ofFloat).with(ofFloat2).with(animatorSet);
                    animatorSet2.start();
                    frameLayout.setVisibility(0);
                    return;
                }
                return;
            case 14:
                q01.l this$014 = (q01.l) obj;
                Intrinsics.checkNotNullParameter(this$014, "this$0");
                OneBarContainer oneBarContainer = this$014.f101820x;
                if (oneBarContainer != null) {
                    oneBarContainer.setTranslationY(0.0f);
                }
                OneBarContainer oneBarContainer2 = this$014.f101820x;
                if (oneBarContainer2 != null) {
                    bs1.c.X0(oneBarContainer2);
                }
                ov1.k kVar2 = this$014.f101815s;
                if (kVar2 != null) {
                    kVar2.d();
                }
                View view = (View) this$014.f101814r.getValue();
                Intrinsics.checkNotNullExpressionValue(view, "<get-fragmentLevelFiltersWrapper>(...)");
                view.setPaddingRelative(view.getPaddingStart(), view.getPaddingTop(), view.getPaddingEnd(), 0);
                if (this$014.f101812p.a()) {
                    OneBarContainer oneBarContainer3 = this$014.f101820x;
                    if (oneBarContainer3 != null) {
                        oneBarContainer3.setPaddingRelative(oneBarContainer3.getPaddingStart(), 0, oneBarContainer3.getPaddingEnd(), oneBarContainer3.getPaddingBottom());
                    }
                    c1 c1Var = this$014.f101813q;
                    if (c1Var != null) {
                        c1Var.k(true);
                    }
                    if (a0.q0(this$014.f101803g)) {
                        return;
                    }
                    Window window = this$014.f101802f.getWindow();
                    Intrinsics.checkNotNullExpressionValue(window, "getWindow(...)");
                    a0.f1(window);
                    return;
                }
                return;
            case 15:
                y this$015 = (y) obj;
                Intrinsics.checkNotNullParameter(this$015, "this$0");
                RelatedPinsFiltersCarouselView relatedPinsFiltersCarouselView = this$015.f101852l;
                if (relatedPinsFiltersCarouselView != null) {
                    relatedPinsFiltersCarouselView.setTranslationY(0.0f);
                }
                RelatedPinsFiltersCarouselView relatedPinsFiltersCarouselView2 = this$015.f101852l;
                if (relatedPinsFiltersCarouselView2 != null) {
                    bs1.c.X0(relatedPinsFiltersCarouselView2);
                }
                View view2 = (View) this$015.f101851k.getValue();
                Intrinsics.checkNotNullExpressionValue(view2, "<get-fragmentLevelFiltersWrapper>(...)");
                view2.setPaddingRelative(view2.getPaddingStart(), view2.getPaddingTop(), view2.getPaddingEnd(), 0);
                if (this$015.f101848h.a()) {
                    RelatedPinsFiltersCarouselView relatedPinsFiltersCarouselView3 = this$015.f101852l;
                    if (relatedPinsFiltersCarouselView3 != null) {
                        relatedPinsFiltersCarouselView3.setPaddingRelative(relatedPinsFiltersCarouselView3.getPaddingStart(), 0, relatedPinsFiltersCarouselView3.getPaddingEnd(), relatedPinsFiltersCarouselView3.getPaddingBottom());
                    }
                    c1 c1Var2 = this$015.f101850j;
                    if (c1Var2 != null) {
                        c1Var2.k(true);
                    }
                    Context context4 = this$015.f101841a.getContext();
                    Intrinsics.checkNotNullExpressionValue(context4, "getContext(...)");
                    if (a0.q0(context4)) {
                        return;
                    }
                    Window window2 = this$015.f101849i.getWindow();
                    Intrinsics.checkNotNullExpressionValue(window2, "getWindow(...)");
                    a0.f1(window2);
                    return;
                }
                return;
            case 16:
                l11.j this$016 = (l11.j) obj;
                int i34 = l11.j.W1;
                Intrinsics.checkNotNullParameter(this$016, "this$0");
                List list = this$016.f81423b1;
                if ((list == null || list.size() <= 1) && this$016.E1 == null) {
                    i15 = 4;
                }
                BottomSheetBehavior bottomSheetBehavior = this$016.f81445x1;
                if (bottomSheetBehavior != null) {
                    bottomSheetBehavior.X(i15);
                    return;
                } else {
                    Intrinsics.r("bottomSheetBehavior");
                    throw null;
                }
            case 17:
                e21.f this$017 = (e21.f) obj;
                Intrinsics.checkNotNullParameter(this$017, "this$0");
                this$017.performHapticFeedback(3);
                return;
            case 18:
                j21.a this$018 = (j21.a) obj;
                int i35 = j21.a.f74483e;
                Intrinsics.checkNotNullParameter(this$018, "this$0");
                this$018.requestLayout();
                return;
            case 19:
                q21.g this$019 = (q21.g) obj;
                int i36 = q21.g.f102153e;
                Intrinsics.checkNotNullParameter(this$019, "this$0");
                this$019.requestLayout();
                return;
            case 20:
                FixedSizePinOverlayView this$020 = (FixedSizePinOverlayView) obj;
                int i37 = FixedSizePinOverlayView.f47436e;
                Intrinsics.checkNotNullParameter(this$020, "this$0");
                this$020.requestLayout();
                return;
            case 21:
                a41.r this$021 = (a41.r) obj;
                int i38 = a41.r.P1;
                Intrinsics.checkNotNullParameter(this$021, "this$0");
                PinterestSwipeRefreshLayout pinterestSwipeRefreshLayout = this$021.K0;
                if (pinterestSwipeRefreshLayout == null) {
                    return;
                }
                pinterestSwipeRefreshLayout.n(false);
                return;
            case 22:
                i this$022 = (i) obj;
                Intrinsics.checkNotNullParameter(this$022, "this$0");
                int i39 = i.f26565m1;
                kh2.j.x2(this$022.c9(), c61.l.f26602a);
                return;
            case 23:
                SearchBarView searchBarView = (SearchBarView) obj;
                searchBarView.b(searchBarView.f47693j);
                return;
            case 24:
                TypeaheadGestaltSearchBarContainer this$023 = (TypeaheadGestaltSearchBarContainer) obj;
                int i43 = TypeaheadGestaltSearchBarContainer.f47909e;
                Intrinsics.checkNotNullParameter(this$023, "this$0");
                this$023.f47910a.B0();
                return;
            case 25:
                TypeaheadLegacySearchBarContainer typeaheadLegacySearchBarContainer = (TypeaheadLegacySearchBarContainer) obj;
                typeaheadLegacySearchBarContainer.f47917c.b(true);
                k3.R1(typeaheadLegacySearchBarContainer.f47917c.f47687d, !r0.f47691h.isEmpty());
                typeaheadLegacySearchBarContainer.f47918d.i(new oo0.b(i14));
                k3.R1(typeaheadLegacySearchBarContainer.f47915a, false);
                k3.R1(typeaheadLegacySearchBarContainer.f47916b, false);
                return;
            case 26:
                l81.l this$024 = (l81.l) obj;
                int i44 = l81.l.Q2;
                Intrinsics.checkNotNullParameter(this$024, "this$0");
                GestaltIconButton gestaltIconButton = this$024.R1;
                if (gestaltIconButton != null) {
                    gestaltIconButton.t(l81.e.f82124m);
                    return;
                }
                return;
            case 27:
                WebImageView thumbnail = (WebImageView) obj;
                int i45 = l81.l.Q2;
                Intrinsics.checkNotNullParameter(thumbnail, "$thumbnail");
                thumbnail.setVisibility(8);
                return;
            case 28:
                GestaltText descriptor = (GestaltText) obj;
                int i46 = l81.l.Q2;
                Intrinsics.checkNotNullParameter(descriptor, "$descriptor");
                descriptor.i(l81.e.f82125n);
                return;
            default:
                GridPlaceholderLoadingLayout loadingLayout = (GridPlaceholderLoadingLayout) obj;
                int i47 = l81.l.Q2;
                Intrinsics.checkNotNullParameter(loadingLayout, "$loadingLayout");
                loadingLayout.setVisibility(8);
                return;
        }
    }
}
