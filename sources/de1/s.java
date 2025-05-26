package de1;

import android.content.Context;
import android.view.View;
import com.pinterest.design.brio.widget.progress.FullBleedGestaltSpinner;
import com.pinterest.feature.core.view.RecyclerViewTypes;
import com.pinterest.gestalt.button.view.GestaltButton;
import com.pinterest.gestalt.iconbutton.GestaltIconButton;
import com.pinterest.gestalt.text.GestaltText;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class s extends tq.a implements i {

    /* renamed from: d, reason: collision with root package name */
    public final xk2.v f54640d;

    /* renamed from: e, reason: collision with root package name */
    public h f54641e;

    /* renamed from: f, reason: collision with root package name */
    public final GestaltButton f54642f;

    /* renamed from: g, reason: collision with root package name */
    public final GestaltButton f54643g;

    /* renamed from: h, reason: collision with root package name */
    public final FullBleedGestaltSpinner f54644h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s(Context context, String str) {
        super(context, 6);
        Unit unit;
        Intrinsics.checkNotNullParameter(context, "context");
        this.f54640d = xk2.m.b(q.f54631j);
        View findViewById = findViewById(mz1.e.confirm_button);
        Intrinsics.checkNotNullExpressionValue(findViewById, "findViewById(...)");
        GestaltButton gestaltButton = (GestaltButton) findViewById;
        this.f54642f = gestaltButton;
        View findViewById2 = findViewById(mz1.e.reset_button);
        Intrinsics.checkNotNullExpressionValue(findViewById2, "findViewById(...)");
        GestaltButton gestaltButton2 = (GestaltButton) findViewById2;
        this.f54643g = gestaltButton2;
        View findViewById3 = findViewById(mz1.e.close_button);
        Intrinsics.checkNotNullExpressionValue(findViewById3, "findViewById(...)");
        View findViewById4 = findViewById(mz1.e.loading_view);
        Intrinsics.checkNotNullExpressionValue(findViewById4, "findViewById(...)");
        FullBleedGestaltSpinner fullBleedGestaltSpinner = (FullBleedGestaltSpinner) findViewById4;
        this.f54644h = fullBleedGestaltSpinner;
        final int i13 = 0;
        gestaltButton.d(p.f54623k).e(new gm1.a(this) { // from class: de1.o

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ s f54611b;

            {
                this.f54611b = this;
            }

            @Override // gm1.a
            public final void h3(gm1.c it) {
                h hVar;
                int i14 = i13;
                s this$0 = this.f54611b;
                switch (i14) {
                    case 0:
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        Intrinsics.checkNotNullParameter(it, "it");
                        h hVar2 = this$0.f54641e;
                        if (hVar2 != null) {
                            hVar2.V();
                            break;
                        }
                        break;
                    case 1:
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        Intrinsics.checkNotNullParameter(it, "it");
                        if ((it instanceof om1.l) && (hVar = this$0.f54641e) != null) {
                            hVar.i();
                            break;
                        }
                        break;
                    default:
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        Intrinsics.checkNotNullParameter(it, "it");
                        h hVar3 = this$0.f54641e;
                        if (hVar3 != null) {
                            hVar3.i3();
                            break;
                        }
                        break;
                }
            }
        });
        GestaltButton d2 = gestaltButton2.d(p.f54624l);
        final int i14 = 2;
        d2.e(new gm1.a(this) { // from class: de1.o

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ s f54611b;

            {
                this.f54611b = this;
            }

            @Override // gm1.a
            public final void h3(gm1.c it) {
                h hVar;
                int i142 = i14;
                s this$0 = this.f54611b;
                switch (i142) {
                    case 0:
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        Intrinsics.checkNotNullParameter(it, "it");
                        h hVar2 = this$0.f54641e;
                        if (hVar2 != null) {
                            hVar2.V();
                            break;
                        }
                        break;
                    case 1:
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        Intrinsics.checkNotNullParameter(it, "it");
                        if ((it instanceof om1.l) && (hVar = this$0.f54641e) != null) {
                            hVar.i();
                            break;
                        }
                        break;
                    default:
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        Intrinsics.checkNotNullParameter(it, "it");
                        h hVar3 = this$0.f54641e;
                        if (hVar3 != null) {
                            hVar3.i3();
                            break;
                        }
                        break;
                }
            }
        });
        final int i15 = 1;
        ((GestaltIconButton) findViewById3).u(new gm1.a(this) { // from class: de1.o

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ s f54611b;

            {
                this.f54611b = this;
            }

            @Override // gm1.a
            public final void h3(gm1.c it) {
                h hVar;
                int i142 = i15;
                s this$0 = this.f54611b;
                switch (i142) {
                    case 0:
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        Intrinsics.checkNotNullParameter(it, "it");
                        h hVar2 = this$0.f54641e;
                        if (hVar2 != null) {
                            hVar2.V();
                            break;
                        }
                        break;
                    case 1:
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        Intrinsics.checkNotNullParameter(it, "it");
                        if ((it instanceof om1.l) && (hVar = this$0.f54641e) != null) {
                            hVar.i();
                            break;
                        }
                        break;
                    default:
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        Intrinsics.checkNotNullParameter(it, "it");
                        h hVar3 = this$0.f54641e;
                        if (hVar3 != null) {
                            hVar3.i3();
                            break;
                        }
                        break;
                }
            }
        });
        GestaltText gestaltText = (GestaltText) findViewById(mz1.e.product_filter_modal_title);
        if (str != null) {
            Intrinsics.f(gestaltText);
            pk.a0.p(gestaltText, str);
            unit = Unit.f80348a;
        } else {
            unit = null;
        }
        if (unit == null) {
            Intrinsics.f(gestaltText);
            String string = getResources().getString(mz1.g.product_filter_header_text);
            Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
            pk.a0.p(gestaltText, string);
        }
        fullBleedGestaltSpinner.a(ln1.e.LOADING);
        fullBleedGestaltSpinner.setBackgroundColor(bs1.c.B(fullBleedGestaltSpinner, eo1.b.color_themed_background_elevation_floating));
        fullBleedGestaltSpinner.setAlpha(1.0f);
    }

    @Override // de1.i
    public final void E(h listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        this.f54641e = listener;
    }

    @Override // de1.i
    public final void G(boolean z13) {
        bs1.c.R1(this.f54643g, z13);
    }

    @Override // com.pinterest.ui.view.BaseRecyclerContainerView
    public final String getDebugTag() {
        return (String) this.f54640d.getValue();
    }

    @Override // com.pinterest.ui.view.BaseRecyclerContainerView
    public final int getLayoutResourceId() {
        return mz1.f.product_filter_modal_view;
    }

    @Override // com.pinterest.ui.view.BaseRecyclerContainerView
    public final int getPinterestRecyclerViewId() {
        return mz1.e.product_filter_recycler_view;
    }

    @Override // de1.i
    public final void k6(boolean z13) {
        GestaltButton gestaltButton = this.f54643g;
        gestaltButton.setEnabled(z13);
        gestaltButton.setAlpha(gestaltButton.isEnabled() ? 1.0f : 0.6f);
    }

    @Override // de1.i
    public final void o6(boolean z13) {
        GestaltButton gestaltButton = this.f54642f;
        gestaltButton.setEnabled(z13);
        gestaltButton.setAlpha(gestaltButton.isEnabled() ? 1.0f : 0.6f);
    }

    @Override // com.pinterest.ui.view.BaseRecyclerContainerView
    public final void registerViewHolderCreators(yq0.z adapter) {
        Intrinsics.checkNotNullParameter(adapter, "adapter");
        adapter.G(RecyclerViewTypes.VIEW_TYPE_SHOPPING_UNIFIED_FILTER_MULTI_SELECT_ITEM, new r(this, 0));
        adapter.G(RecyclerViewTypes.VIEW_TYPE_SHOPPING_PRICE_FILTER_ITEM, new r(this, 1));
        adapter.G(RecyclerViewTypes.VIEW_TYPE_SHOPPING_PRODUCT_FILTER_HEADER, new r(this, 2));
        adapter.G(RecyclerViewTypes.VIEW_TYPE_SHOPPING_COLOR_FILTER, new r(this, 3));
        adapter.G(RecyclerViewTypes.VIEW_TYPE_SHOPPING_COLOR_LIST_FILTER_ITEM, new r(this, 4));
        adapter.G(RecyclerViewTypes.VIEW_TYPE_SHOPPING_SORT_FILTER, new r(this, 5));
        adapter.G(RecyclerViewTypes.VIEW_TYPE_STANDARD_FILTER_ITEM, new r(this, 6));
    }

    @Override // de1.i
    public final void showLoadingSpinner(boolean z13) {
        this.f54644h.showLoadingSpinner(z13);
    }
}
