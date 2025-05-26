package cu;

import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.gms.ads.AdSize;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.pinterest.ads.feature.owc.view.base.AdsCarouselIndexModule;
import com.pinterest.ads.feature.owc.view.base.AdsToolbarModule;
import com.pinterest.ads.feature.owc.view.base.BaseAdsScrollingModule;
import com.pinterest.feature.ideaPinCreation.closeup.view.IdeaPinFontPicker;
import com.pinterest.feature.ideaPinCreation.closeup.view.IdeaPinTextEditor;
import com.pinterest.feature.ideaPinCreation.closeup.view.IdeaPinTextEditorToolbar;
import com.pinterest.feature.ideaPinCreation.color.IdeaPinColorPalette;
import com.pinterest.feature.ideaPinCreation.metadata.view.MetadataRootView;
import java.text.SimpleDateFormat;
import kotlin.jvm.internal.Intrinsics;
import mu.p0;
import rh1.q0;
import rh1.v1;

/* loaded from: classes3.dex */
public final /* synthetic */ class k implements ViewTreeObserver.OnGlobalLayoutListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f53220a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f53221b;

    public /* synthetic */ k(Object obj, int i13) {
        this.f53220a = i13;
        this.f53221b = obj;
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final void onGlobalLayout() {
        ca2.e eVar;
        BottomSheetBehavior bottomSheetBehavior;
        int i13;
        int i14 = this.f53220a;
        Object obj = this.f53221b;
        switch (i14) {
            case 0:
                m this$0 = (m) obj;
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                ViewTreeObserver viewTreeObserver = this$0.c8().getViewTreeObserver();
                if (viewTreeObserver != null) {
                    viewTreeObserver.removeOnGlobalLayoutListener((ViewTreeObserver.OnGlobalLayoutListener) this$0.f53235o0.getValue());
                }
                BaseAdsScrollingModule d83 = this$0.d8();
                i a83 = this$0.a8();
                AdsCarouselIndexModule adsCarouselIndexModule = this$0.f53228h0;
                if (adsCarouselIndexModule == null) {
                    Intrinsics.r("carouselIndexModule");
                    throw null;
                }
                AdsToolbarModule adsToolbarModule = this$0.f53230j0;
                if (adsToolbarModule == null) {
                    Intrinsics.r("toolbarModule");
                    throw null;
                }
                d83.w1(a83, adsCarouselIndexModule, adsToolbarModule, this$0.B7(), this$0.f53231k0);
                this$0.Y7();
                return;
            case 1:
                p0 this$02 = (p0) obj;
                Intrinsics.checkNotNullParameter(this$02, "this$0");
                CoordinatorLayout coordinatorLayout = this$02.f88225d0;
                if (coordinatorLayout == null) {
                    Intrinsics.r("rootView");
                    throw null;
                }
                ViewTreeObserver viewTreeObserver2 = coordinatorLayout.getViewTreeObserver();
                if (viewTreeObserver2 != null) {
                    viewTreeObserver2.removeOnGlobalLayoutListener((ViewTreeObserver.OnGlobalLayoutListener) this$02.f88231j0.getValue());
                }
                ru.b b83 = this$02.b8();
                qu.a a84 = this$02.a8();
                AdsCarouselIndexModule adsCarouselIndexModule2 = this$02.f88226e0;
                if (adsCarouselIndexModule2 == null) {
                    Intrinsics.r("carouselIndexModule");
                    throw null;
                }
                AdsToolbarModule adsToolbarModule2 = this$02.f88228g0;
                if (adsToolbarModule2 != null) {
                    b83.w1(a84, adsCarouselIndexModule2, adsToolbarModule2, this$02.B7(), this$02.f88230i0);
                    return;
                } else {
                    Intrinsics.r("toolbarModule");
                    throw null;
                }
            case 2:
                IdeaPinTextEditor fontUpdateListener = (IdeaPinTextEditor) obj;
                Intrinsics.checkNotNullParameter(fontUpdateListener, "this$0");
                if (fontUpdateListener.isShown()) {
                    fontUpdateListener.getWindowVisibleDisplayFrame(new Rect());
                    float f13 = hf0.b.f69003c;
                    int i15 = (int) (f13 - r0.bottom);
                    boolean z13 = ((float) i15) > f13 * 0.15f;
                    fontUpdateListener.f46050p = z13;
                    if (z13 != fontUpdateListener.f46049o) {
                        fontUpdateListener.f46049o = z13;
                        IdeaPinTextEditorToolbar ideaPinTextEditorToolbar = fontUpdateListener.f46046l;
                        IdeaPinColorPalette ideaPinColorPalette = fontUpdateListener.f46048n;
                        IdeaPinFontPicker ideaPinFontPicker = fontUpdateListener.f46047m;
                        if (!z13) {
                            if (fontUpdateListener.f46051q) {
                                bs1.c.U1(ideaPinFontPicker);
                                ideaPinTextEditorToolbar.b(true);
                                ideaPinFontPicker.setTranslationY(ideaPinFontPicker.getHeight());
                                ideaPinFontPicker.animate().translationY(0.0f).setListener(null);
                                return;
                            }
                            if (!fontUpdateListener.f46052r) {
                                fontUpdateListener.b();
                                fontUpdateListener.a();
                                return;
                            } else {
                                bs1.c.U1(ideaPinColorPalette);
                                ideaPinColorPalette.e();
                                ideaPinColorPalette.b(fontUpdateListener.f46057w);
                                return;
                            }
                        }
                        bs1.c.X0(ideaPinFontPicker);
                        bs1.c.X0(ideaPinColorPalette);
                        fontUpdateListener.f46051q = false;
                        fontUpdateListener.f46052r = false;
                        ideaPinTextEditorToolbar.b(false);
                        if (ideaPinFontPicker.getHeight() != i15) {
                            yt0.b bVar = fontUpdateListener.D;
                            Intrinsics.checkNotNullParameter(fontUpdateListener, "listener");
                            au0.g gVar = ideaPinFontPicker.f46005h;
                            gVar.getClass();
                            Intrinsics.checkNotNullParameter(fontUpdateListener, "fontUpdateListener");
                            gVar.f20492c = fontUpdateListener;
                            gVar.f20493d = bVar;
                            fontUpdateListener.f46043i.getLayoutParams().height = ((Number) fontUpdateListener.f46039e.getValue()).intValue() - i15;
                            fontUpdateListener.requestLayout();
                            return;
                        }
                        return;
                    }
                    return;
                }
                return;
            case 3:
                ev0.l this$03 = (ev0.l) obj;
                Intrinsics.checkNotNullParameter(this$03, "this$0");
                Rect rect = new Rect();
                MetadataRootView metadataRootView = this$03.L0;
                if (metadataRootView == null) {
                    Intrinsics.r("metadataRootView");
                    throw null;
                }
                metadataRootView.getWindowVisibleDisplayFrame(rect);
                float f14 = hf0.b.f69003c;
                boolean z14 = ((float) ((int) (f14 - ((float) rect.bottom)))) > f14 * 0.15f;
                if (z14 != this$03.Q0) {
                    this$03.Q0 = z14;
                    if (z14) {
                        ConstraintLayout constraintLayout = this$03.J0;
                        if (constraintLayout == null) {
                            Intrinsics.r("bottomBarContainer");
                            throw null;
                        }
                        constraintLayout.setVisibility(8);
                    } else {
                        ConstraintLayout constraintLayout2 = this$03.J0;
                        if (constraintLayout2 == null) {
                            Intrinsics.r("bottomBarContainer");
                            throw null;
                        }
                        constraintLayout2.setVisibility(0);
                    }
                    this$03.R0.c(Boolean.valueOf(z14));
                    return;
                }
                return;
            case 4:
                z51.e this$04 = (z51.e) obj;
                SimpleDateFormat simpleDateFormat = z51.e.f140868a1;
                Intrinsics.checkNotNullParameter(this$04, "this$0");
                this$04.i9();
                return;
            case 5:
                q0 this$05 = (q0) obj;
                Intrinsics.checkNotNullParameter(this$05, "this$0");
                Rect rect2 = new Rect();
                View view = this$05.getView();
                if (view != null) {
                    view.getWindowVisibleDisplayFrame(rect2);
                }
                if (rect2.bottom != this$05.f108275y1) {
                    ConstraintLayout constraintLayout3 = this$05.f108270t1;
                    if (constraintLayout3 == null) {
                        Intrinsics.r("commentFeedConstraintLayout");
                        throw null;
                    }
                    ViewGroup.LayoutParams layoutParams = constraintLayout3.getLayoutParams();
                    if (layoutParams == null) {
                        throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
                    }
                    if (q0.m9()) {
                        i13 = -1;
                    } else {
                        int i16 = rect2.bottom;
                        i13 = i16 < this$05.f108275y1 ? (int) (hf0.b.f69003c * 0.9d) : i16 - ((int) (hf0.b.f69003c * 0.15d));
                    }
                    layoutParams.height = i13;
                    constraintLayout3.setLayoutParams(layoutParams);
                }
                View view2 = this$05.A1;
                if (view2 != null && ((this$05.f108274x1 || (((eVar = (ca2.e) this$05.f108273w1.getValue()) != null && (bottomSheetBehavior = eVar.f27255n) != null && bottomSheetBehavior.L == 3) || q0.m9())) && !(view2 instanceof ve0.c))) {
                    this$05.Z8().getLocationOnScreen(new int[2]);
                    this$05.X8().getLocationOnScreen(new int[2]);
                    view2.setTranslationY((r2[1] - (this$05.Z8().getHeight() + r3[1])) / 2.0f);
                    if (q0.m9() && this$05.f108271u1) {
                        view2.setTranslationY(view2.getTranslationY() + AdSize.MEDIUM_RECTANGLE_WIDTH);
                    }
                    this$05.f108274x1 = false;
                }
                this$05.f108275y1 = rect2.bottom;
                return;
            default:
                v1 this$06 = (v1) obj;
                Intrinsics.checkNotNullParameter(this$06, "this$0");
                Rect rect3 = new Rect();
                View view3 = this$06.getView();
                if (view3 != null) {
                    view3.getWindowVisibleDisplayFrame(rect3);
                }
                int f15 = (int) ((hf0.b.f69003c + hf0.b.f()) - rect3.bottom);
                if (f15 <= this$06.K0) {
                    return;
                }
                this$06.K0 = f15;
                this$06.i8();
                return;
        }
    }
}
