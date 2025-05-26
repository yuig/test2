package com.pinterest.feature.pin.closeup.datasource;

import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.pinterest.gestalt.button.view.GestaltButton;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import lq0.o;
import q01.s;
import q01.w;
import yk1.n;

/* loaded from: classes5.dex */
public final class a extends vq0.h {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f46926a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ c f46927b;

    public a(c cVar, int i13) {
        this.f46926a = i13;
        this.f46927b = cVar;
    }

    @Override // vq0.h
    public final void c(n nVar, Object obj, int i13) {
        s sVar;
        q01.c cVar;
        int i14 = this.f46926a;
        c cVar2 = this.f46927b;
        switch (i14) {
            case 0:
                w view = (w) nVar;
                o01.h model = (o01.h) obj;
                Intrinsics.checkNotNullParameter(view, "view");
                Intrinsics.checkNotNullParameter(model, "model");
                p01.n listener = cVar2.M;
                view.getClass();
                Intrinsics.checkNotNullParameter(model, "model");
                Intrinsics.checkNotNullParameter(listener, "listener");
                if (model instanceof o01.f) {
                    sVar = s.ERROR;
                } else if (model instanceof o01.e) {
                    sVar = s.EMPTY;
                } else {
                    if (!(model instanceof o01.g)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    sVar = s.FOOTER;
                }
                view.f101838d = sVar;
                view.f101835a.i(new dx0.d(view, 26));
                ky0.b bVar = new ky0.b(9, view, model);
                GestaltButton gestaltButton = view.f101836b;
                gestaltButton.d(bVar);
                gestaltButton.e(new o(16, view, listener));
                LinearLayout linearLayout = view.f101837c;
                ViewGroup.LayoutParams layoutParams = linearLayout.getLayoutParams();
                if (layoutParams == null) {
                    throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
                }
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
                if (model instanceof o01.g) {
                    marginLayoutParams.height = bs1.c.W(view, n80.a.related_pins_filtered_feed_footer_height);
                    marginLayoutParams.bottomMargin = bs1.c.W(view, eo1.c.space_800);
                } else {
                    marginLayoutParams.height = hf0.b.g(view.getContext());
                    marginLayoutParams.bottomMargin = 0;
                }
                linearLayout.setLayoutParams(marginLayoutParams);
                return;
            default:
                q01.i view2 = (q01.i) nVar;
                o01.d model2 = (o01.d) obj;
                Intrinsics.checkNotNullParameter(view2, "view");
                Intrinsics.checkNotNullParameter(model2, "model");
                p01.f listener2 = cVar2.O;
                view2.getClass();
                Intrinsics.checkNotNullParameter(model2, "model");
                Intrinsics.checkNotNullParameter(listener2, "listener");
                view2.f101791f = listener2;
                if (model2 instanceof o01.b) {
                    cVar = q01.c.ERROR;
                } else if (model2 instanceof o01.a) {
                    cVar = q01.c.EMPTY;
                } else {
                    if (!(model2 instanceof o01.c)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    cVar = q01.c.FOOTER;
                }
                view2.f101790e = cVar;
                view2.f101786a.i(new q01.f(view2, 0));
                view2.f101787b.i(new q01.f(view2, 1));
                q01.f fVar = new q01.f(view2, 2);
                GestaltButton gestaltButton2 = view2.f101788c;
                gestaltButton2.d(fVar);
                gestaltButton2.e(new o(15, view2, listener2));
                int i15 = view2.f101790e == q01.c.FOOTER ? 49 : 17;
                LinearLayout linearLayout2 = view2.f101789d;
                linearLayout2.setGravity(i15);
                ViewGroup.LayoutParams layoutParams2 = linearLayout2.getLayoutParams();
                if (layoutParams2 == null) {
                    throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
                }
                ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) layoutParams2;
                if (model2 instanceof o01.c) {
                    marginLayoutParams2.topMargin = bs1.c.W(view2, eo1.c.space_1600);
                    marginLayoutParams2.height = bs1.c.W(view2, n80.a.pin_closeup_one_bar_filtered_feed_footer_height);
                    marginLayoutParams2.bottomMargin = bs1.c.W(view2, eo1.c.space_1600);
                } else {
                    int W = bs1.c.W(view2, n80.a.related_pins_filters_carousel_height);
                    int b13 = (int) r70.b.f106349i.k0().b();
                    marginLayoutParams2.topMargin = 0;
                    marginLayoutParams2.height = (hf0.b.g(view2.getContext()) - W) - b13;
                    marginLayoutParams2.bottomMargin = 0;
                }
                linearLayout2.setLayoutParams(marginLayoutParams2);
                return;
        }
    }

    @Override // vq0.h
    public final String g(int i13, Object obj) {
        switch (this.f46926a) {
            case 0:
                o01.h model = (o01.h) obj;
                Intrinsics.checkNotNullParameter(model, "model");
                break;
            default:
                o01.d model2 = (o01.d) obj;
                Intrinsics.checkNotNullParameter(model2, "model");
                break;
        }
        return null;
    }
}
