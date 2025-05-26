package de1;

import android.content.Context;
import android.view.View;
import android.widget.ImageView;
import androidx.recyclerview.widget.b2;
import com.pinterest.design.brio.widget.progress.FullBleedGestaltSpinner;
import com.pinterest.feature.core.view.RecyclerViewTypes;
import com.pinterest.gestalt.button.view.GestaltButton;
import com.pinterest.gestalt.iconbutton.GestaltIconButton;
import com.pinterest.gestalt.text.GestaltText;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class l0 extends tq.a implements i, g0 {

    /* renamed from: d, reason: collision with root package name */
    public final boolean f54587d;

    /* renamed from: e, reason: collision with root package name */
    public final xk2.v f54588e;

    /* renamed from: f, reason: collision with root package name */
    public h f54589f;

    /* renamed from: g, reason: collision with root package name */
    public final GestaltButton f54590g;

    /* renamed from: h, reason: collision with root package name */
    public final FullBleedGestaltSpinner f54591h;

    /* renamed from: i, reason: collision with root package name */
    public final GestaltButton f54592i;

    /* renamed from: j, reason: collision with root package name */
    public final View f54593j;

    /* renamed from: k, reason: collision with root package name */
    public final View f54594k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l0(Context context, String str, boolean z13) {
        super(context, 7);
        Unit unit;
        Intrinsics.checkNotNullParameter(context, "context");
        this.f54587d = z13;
        this.f54588e = xk2.m.b(q.f54633l);
        View findViewById = findViewById(mz1.e.confirm_button);
        Intrinsics.checkNotNullExpressionValue(findViewById, "findViewById(...)");
        GestaltButton gestaltButton = (GestaltButton) findViewById;
        this.f54590g = gestaltButton;
        View findViewById2 = findViewById(mz1.e.close_button);
        Intrinsics.checkNotNullExpressionValue(findViewById2, "findViewById(...)");
        View findViewById3 = findViewById(mz1.e.loading_view);
        Intrinsics.checkNotNullExpressionValue(findViewById3, "findViewById(...)");
        FullBleedGestaltSpinner fullBleedGestaltSpinner = (FullBleedGestaltSpinner) findViewById3;
        this.f54591h = fullBleedGestaltSpinner;
        View findViewById4 = findViewById(mz1.e.reset_button);
        Intrinsics.checkNotNullExpressionValue(findViewById4, "findViewById(...)");
        GestaltButton gestaltButton2 = (GestaltButton) findViewById4;
        this.f54592i = gestaltButton2;
        View findViewById5 = findViewById(mz1.e.header_shadow);
        Intrinsics.checkNotNullExpressionValue(findViewById5, "findViewById(...)");
        this.f54593j = findViewById5;
        View findViewById6 = findViewById(mz1.e.footer_shadow);
        Intrinsics.checkNotNullExpressionValue(findViewById6, "findViewById(...)");
        this.f54594k = findViewById6;
        View findViewById7 = findViewById(mz1.e.empty_state_image);
        Intrinsics.checkNotNullExpressionValue(findViewById7, "findViewById(...)");
        ImageView imageView = (ImageView) findViewById7;
        View findViewById8 = findViewById(mz1.e.empty_state_title);
        Intrinsics.checkNotNullExpressionValue(findViewById8, "findViewById(...)");
        GestaltText gestaltText = (GestaltText) findViewById8;
        View findViewById9 = findViewById(mz1.e.empty_state_subtitle);
        Intrinsics.checkNotNullExpressionValue(findViewById9, "findViewById(...)");
        GestaltText gestaltText2 = (GestaltText) findViewById9;
        final int i13 = 0;
        final int i14 = 1;
        gestaltButton.d(new k0(this, i13)).e(new gm1.a(this) { // from class: de1.i0

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ l0 f54582b;

            {
                this.f54582b = this;
            }

            @Override // gm1.a
            public final void h3(gm1.c it) {
                h hVar;
                int i15 = i14;
                l0 this$0 = this.f54582b;
                switch (i15) {
                    case 0:
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        Intrinsics.checkNotNullParameter(it, "it");
                        h hVar2 = this$0.f54589f;
                        if (hVar2 != null) {
                            hVar2.i3();
                            break;
                        }
                        break;
                    case 1:
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        Intrinsics.checkNotNullParameter(it, "it");
                        h hVar3 = this$0.f54589f;
                        if (hVar3 != null) {
                            hVar3.V();
                            break;
                        }
                        break;
                    default:
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        Intrinsics.checkNotNullParameter(it, "it");
                        if ((it instanceof om1.l) && (hVar = this$0.f54589f) != null) {
                            hVar.i();
                            break;
                        }
                        break;
                }
            }
        });
        gestaltButton2.d(new k0(this, i14)).e(new gm1.a(this) { // from class: de1.i0

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ l0 f54582b;

            {
                this.f54582b = this;
            }

            @Override // gm1.a
            public final void h3(gm1.c it) {
                h hVar;
                int i15 = i13;
                l0 this$0 = this.f54582b;
                switch (i15) {
                    case 0:
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        Intrinsics.checkNotNullParameter(it, "it");
                        h hVar2 = this$0.f54589f;
                        if (hVar2 != null) {
                            hVar2.i3();
                            break;
                        }
                        break;
                    case 1:
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        Intrinsics.checkNotNullParameter(it, "it");
                        h hVar3 = this$0.f54589f;
                        if (hVar3 != null) {
                            hVar3.V();
                            break;
                        }
                        break;
                    default:
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        Intrinsics.checkNotNullParameter(it, "it");
                        if ((it instanceof om1.l) && (hVar = this$0.f54589f) != null) {
                            hVar.i();
                            break;
                        }
                        break;
                }
            }
        });
        final int i15 = 2;
        ((GestaltIconButton) findViewById2).u(new gm1.a(this) { // from class: de1.i0

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ l0 f54582b;

            {
                this.f54582b = this;
            }

            @Override // gm1.a
            public final void h3(gm1.c it) {
                h hVar;
                int i152 = i15;
                l0 this$0 = this.f54582b;
                switch (i152) {
                    case 0:
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        Intrinsics.checkNotNullParameter(it, "it");
                        h hVar2 = this$0.f54589f;
                        if (hVar2 != null) {
                            hVar2.i3();
                            break;
                        }
                        break;
                    case 1:
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        Intrinsics.checkNotNullParameter(it, "it");
                        h hVar3 = this$0.f54589f;
                        if (hVar3 != null) {
                            hVar3.V();
                            break;
                        }
                        break;
                    default:
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        Intrinsics.checkNotNullParameter(it, "it");
                        if ((it instanceof om1.l) && (hVar = this$0.f54589f) != null) {
                            hVar.i();
                            break;
                        }
                        break;
                }
            }
        });
        GestaltText gestaltText3 = (GestaltText) findViewById(mz1.e.product_filter_modal_title);
        if (str != null) {
            Intrinsics.f(gestaltText3);
            pk.a0.p(gestaltText3, str);
            unit = Unit.f80348a;
        } else {
            unit = null;
        }
        if (unit == null) {
            int i16 = z13 ? mz1.g.unified_filter_by_header_text : mz1.g.unified_filter_header_text;
            Intrinsics.f(gestaltText3);
            String string = getResources().getString(i16);
            Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
            pk.a0.p(gestaltText3, string);
        }
        fullBleedGestaltSpinner.a(ln1.e.LOADING);
        fullBleedGestaltSpinner.setBackgroundColor(bs1.c.B(fullBleedGestaltSpinner, eo1.b.color_themed_background_elevation_floating));
        fullBleedGestaltSpinner.setAlpha(1.0f);
        getPinterestRecyclerView().k(null);
        addScrollListener(new wu.f(this, i15));
        if (dl2.b.A1(context)) {
            Integer drawableRes = tm1.d.GUMBALL.drawableRes(g92.d.CALICO, tm1.b.SPOT, tm1.a.RATIO_1_1);
            imageView.setImageResource(drawableRes != null ? drawableRes.intValue() : mz1.d.ic_sad_puzzle);
            pp2.a.k(gestaltText, p.f54627o);
            pp2.a.k(gestaltText2, p.f54628p);
        }
    }

    @Override // de1.i
    public final void E(h listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        this.f54589f = listener;
    }

    @Override // de1.i
    public final void G(boolean z13) {
        this.f54592i.d(new fd1.h(z13, 7));
    }

    @Override // de1.i
    public final void f1() {
        try {
            ((b2) getRecyclerAdapter()).h();
        } catch (Exception unused) {
        }
    }

    @Override // com.pinterest.ui.view.BaseRecyclerContainerView
    public final String getDebugTag() {
        return (String) this.f54588e.getValue();
    }

    @Override // com.pinterest.ui.view.BaseRecyclerContainerView
    public final int getLayoutResourceId() {
        return mz1.f.unified_inline_filter_modal_view;
    }

    @Override // com.pinterest.ui.view.BaseRecyclerContainerView
    public final int getPinterestRecyclerViewId() {
        return mz1.e.product_filter_recycler_view;
    }

    @Override // de1.i
    public final void k6(boolean z13) {
        fd1.h hVar = new fd1.h(z13, 6);
        GestaltButton gestaltButton = this.f54592i;
        gestaltButton.d(hVar);
        gestaltButton.setAlpha(z13 ? 1.0f : 0.6f);
    }

    @Override // de1.i
    public final void o6(boolean z13) {
        fd1.h hVar = new fd1.h(z13, 5);
        GestaltButton gestaltButton = this.f54590g;
        gestaltButton.d(hVar);
        gestaltButton.setAlpha(gestaltButton.isEnabled() ? 1.0f : 0.6f);
    }

    @Override // com.pinterest.ui.view.BaseRecyclerContainerView
    public final void registerViewHolderCreators(yq0.z adapter) {
        Intrinsics.checkNotNullParameter(adapter, "adapter");
        adapter.G(RecyclerViewTypes.VIEW_TYPE_SHOPPING_UNIFIED_FILTER_MULTI_SELECT_ITEM, new j0(this, 0));
        adapter.G(RecyclerViewTypes.VIEW_TYPE_SHOPPING_PRICE_FILTER_ITEM, new j0(this, 1));
        adapter.G(RecyclerViewTypes.VIEW_TYPE_SHOPPING_PRODUCT_FILTER_HEADER, new j0(this, 2));
        adapter.G(RecyclerViewTypes.VIEW_TYPE_SHOPPING_COLOR_FILTER, new j0(this, 3));
        adapter.G(RecyclerViewTypes.VIEW_TYPE_SHOPPING_COLOR_LIST_FILTER_ITEM, new j0(this, 4));
        adapter.G(RecyclerViewTypes.VIEW_TYPE_SHOPPING_SORT_FILTER, new j0(this, 5));
        adapter.G(RecyclerViewTypes.VIEW_TYPE_STANDARD_FILTER_ITEM, new j0(this, 6));
        adapter.G(RecyclerViewTypes.VIEW_TYPE_PRODUCT_FILTER_DIVIDER, new j0(this, 7));
    }

    @Override // de1.i
    public final void showLoadingSpinner(boolean z13) {
        this.f54591h.showLoadingSpinner(z13);
    }
}
