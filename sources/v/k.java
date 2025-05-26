package v;

import ads_mobile_sdk.ci1$$ExternalSyntheticThrowCCEIfNotNull0;
import android.animation.ValueAnimator;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AccelerateDecelerateInterpolator;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.sidesheet.SideSheetBehavior;
import com.pinterest.feature.pin.closeup.filters.view.RelatedPinsFiltersCarouselView;
import com.pinterest.gestalt.textcomposer.GestaltTextComposer;
import com.pinterest.gestalt.textfield.view.GestaltTextField;
import com.pinterest.share.board.video.templategallery.view.BoardPreviewCarousel;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.function.IntConsumer;
import kotlin.jvm.internal.Intrinsics;
import lh0.a4;
import lh0.z3;

/* loaded from: classes2.dex */
public final /* synthetic */ class k implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f123522a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f123523b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f123524c;

    public /* synthetic */ k(int i13, ViewGroup viewGroup, int i14) {
        this.f123522a = i14;
        this.f123523b = i13;
        this.f123524c = viewGroup;
    }

    @Override // java.lang.Runnable
    public final void run() {
        androidx.recyclerview.widget.y2 S0;
        View view = null;
        switch (this.f123522a) {
            case 0:
                ((androidx.camera.core.impl.n) this.f123524c).a(this.f123523b);
                return;
            case 1:
                LinkedHashSet linkedHashSet = (LinkedHashSet) this.f123524c;
                int i13 = this.f123523b;
                int i14 = v1.f123694c;
                Iterator it = linkedHashSet.iterator();
                while (it.hasNext()) {
                    w2 w2Var = (w2) ((v2) it.next());
                    if (i13 == 5) {
                        synchronized (w2Var.f123723p) {
                            try {
                                if (w2Var.l() && w2Var.f123724q != null) {
                                    w2Var.r("Close DeferrableSurfaces for CameraDevice error.");
                                    Iterator it2 = w2Var.f123724q.iterator();
                                    while (it2.hasNext()) {
                                        ((androidx.camera.core.impl.z0) it2.next()).a();
                                    }
                                }
                            } finally {
                            }
                        }
                    } else {
                        w2Var.getClass();
                    }
                }
                return;
            case 2:
                ((d0.h) this.f123524c).getClass();
                return;
            case 3:
                u0.m mVar = (u0.m) this.f123524c;
                int i15 = mVar.f119793l;
                int i16 = this.f123523b;
                if (i15 == i16) {
                    return;
                }
                int i17 = mVar.f119789h;
                mVar.f119793l = (i16 / i17) * i17;
                StringBuilder s13 = a.a.s("Update buffer size from ", i15, " to ");
                s13.append(mVar.f119793l);
                kh2.m0.p("BufferedAudioStream", s13.toString());
                return;
            case 4:
                y0.a0 a0Var = (y0.a0) this.f123524c;
                boolean z13 = a0Var.f136257j;
                y0.c0 c0Var = a0Var.f136258k;
                if (z13) {
                    kh2.m0.X0(c0Var.f136277a, "Receives input frame after codec is reset.");
                    return;
                }
                switch (c0Var.f136296t.ordinal()) {
                    case 0:
                    case 7:
                    case 8:
                        return;
                    case 1:
                    case 2:
                    case 3:
                    case 4:
                    case 5:
                    case 6:
                        c0Var.f136287k.offer(Integer.valueOf(this.f123523b));
                        c0Var.c();
                        return;
                    default:
                        throw new IllegalStateException("Unknown state: " + c0Var.f136296t);
                }
            case 5:
                ((IntConsumer) this.f123524c).accept(this.f123523b);
                return;
            case 6:
                ((b7.a) this.f123524c).f22020b.onAudioFocusChange(this.f123523b);
                return;
            case 7:
                ci1$$ExternalSyntheticThrowCCEIfNotNull0.m(this.f123524c);
                throw null;
            case 8:
                SideSheetBehavior sideSheetBehavior = (SideSheetBehavior) this.f123524c;
                View view2 = (View) sideSheetBehavior.f33034p.get();
                if (view2 != null) {
                    sideSheetBehavior.F(view2, this.f123523b, false);
                    return;
                }
                return;
            case 9:
                GestaltTextField inputField = (GestaltTextField) this.f123524c;
                int i18 = up0.l.f122972d;
                Intrinsics.checkNotNullParameter(inputField, "$inputField");
                int i19 = this.f123523b;
                if (i19 == -1) {
                    i19 = inputField.F0();
                }
                inputField.X(new r1.j0(i19, 26));
                return;
            case 10:
                GestaltTextComposer inputField2 = (GestaltTextComposer) this.f123524c;
                int i23 = up0.l.f122972d;
                Intrinsics.checkNotNullParameter(inputField2, "$inputField");
                int i24 = this.f123523b;
                if (i24 == -1) {
                    i24 = inputField2.z0();
                }
                inputField2.X(new r1.j0(i24, 25));
                return;
            case 11:
                com.pinterest.feature.ideaPinCreation.closeup.view.q this$0 = (com.pinterest.feature.ideaPinCreation.closeup.view.q) this.f123524c;
                int i25 = com.pinterest.feature.ideaPinCreation.closeup.view.q.R0;
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                RecyclerView g83 = this$0.g8();
                if (g83 != null) {
                    g83.G2(this.f123523b);
                    return;
                }
                return;
            case 12:
                RelatedPinsFiltersCarouselView this$02 = (RelatedPinsFiltersCarouselView) this.f123524c;
                int i26 = RelatedPinsFiltersCarouselView.f46960j;
                Intrinsics.checkNotNullParameter(this$02, "this$0");
                androidx.recyclerview.widget.b2 b2Var = (androidx.recyclerview.widget.b2) this$02.getRecyclerAdapter();
                int i27 = this.f123523b;
                b2Var.i(i27);
                RecyclerView recyclerView = this$02.getPinterestRecyclerView().f52531a;
                if (recyclerView != null && (S0 = recyclerView.S0(i27)) != null) {
                    view = S0.f19717a;
                }
                r4 = view != null ? view.getWidth() : 0;
                this$02.getPinterestRecyclerView().i(i27, (int) (r4 > 0 ? (((Number) this$02.f46967h.getValue()).intValue() * 0.5f) - (r4 * 0.5f) : ((Number) this$02.f46966g.getValue()).floatValue()));
                return;
            case 13:
                c71.m this$03 = (c71.m) this.f123524c;
                Intrinsics.checkNotNullParameter(this$03, "this$0");
                uk2.f fVar = this$03.f26791e;
                int i28 = this.f123523b;
                fVar.c(Integer.valueOf(i28));
                if (this$03.J3()) {
                    int i29 = c71.d.f26758a[this$03.f26802p.ordinal()];
                    boolean z14 = true;
                    if (i29 != 1 && (i29 == 2 ? i28 - 1 <= 0 : i29 != 3 && i29 != 4 && i29 != 5)) {
                        z14 = false;
                    }
                    if (i28 > 0 && this$03.J3()) {
                        lh0.g3 g3Var = this$03.f26793g;
                        g3Var.getClass();
                        z3 z3Var = a4.f83298b;
                        lh0.g1 g1Var = (lh0.g1) g3Var.f83374a;
                        if (g1Var.o("android_search_onebar_filter_count", "enabled", z3Var) || g1Var.l("android_search_onebar_filter_count")) {
                            de1.f j03 = this$03.j0();
                            if (j03 != null) {
                                j03.f4(i28, false);
                                return;
                            }
                            return;
                        }
                    }
                    de1.f j04 = this$03.j0();
                    if (j04 != null) {
                        j04.r3(z14);
                        return;
                    }
                    return;
                }
                return;
            case 14:
                c71.z this$04 = (c71.z) this.f123524c;
                Intrinsics.checkNotNullParameter(this$04, "this$0");
                uk2.f fVar2 = this$04.f26844e;
                int i33 = this.f123523b;
                fVar2.c(Integer.valueOf(i33));
                if (this$04.F3()) {
                    kh2.j.u2(this$04, i33, this$04.O, false);
                    return;
                }
                return;
            case 15:
                ec1.j this$05 = (ec1.j) this.f123524c;
                Intrinsics.checkNotNullParameter(this$05, "this$0");
                Object adapter = this$05.getAdapter();
                if (adapter != null) {
                    ((androidx.recyclerview.widget.b2) adapter).i(this.f123523b);
                    return;
                }
                return;
            case 16:
                yf1.k this$06 = (yf1.k) this.f123524c;
                int i34 = yf1.k.f138988h;
                Intrinsics.checkNotNullParameter(this$06, "this$0");
                int i35 = this.f123523b;
                if (i35 > 0) {
                    this$06.scrollTo(0, i35);
                    return;
                }
                return;
            case 17:
                ov1.k this$07 = (ov1.k) this.f123524c;
                Intrinsics.checkNotNullParameter(this$07, "this$0");
                this$07.f97743k.setVisibility(8);
                ValueAnimator ofInt = ValueAnimator.ofInt(this.f123523b, 0);
                ofInt.setDuration(400L);
                ofInt.setInterpolator(new AccelerateDecelerateInterpolator());
                ofInt.addUpdateListener(new androidx.media3.ui.c(this$07, 20));
                ofInt.addListener(new ov1.j(this$07, r4));
                ofInt.start();
                return;
            default:
                BoardPreviewCarousel this$08 = (BoardPreviewCarousel) this.f123524c;
                int i36 = BoardPreviewCarousel.f51846f;
                Intrinsics.checkNotNullParameter(this$08, "this$0");
                RecyclerView recyclerView2 = this$08.f51848b;
                int i37 = this.f123523b;
                recyclerView2.d3(i37);
                View childAt = this$08.f51848b.getChildAt(i37);
                if (childAt != null) {
                    this$08.f51848b.b3(this$08.f51850d.c(this$08.f51851e, childAt)[0], 0, null, 0, false);
                    return;
                }
                return;
        }
    }

    public /* synthetic */ k(Object obj, int i13, int i14) {
        this.f123522a = i14;
        this.f123524c = obj;
        this.f123523b = i13;
    }
}
