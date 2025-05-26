package com.pinterest.feature.shopping.shoppingcomponents;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import com.pinterest.feature.shopping.shoppingcomponents.ProductFilterPillLayout;
import com.pinterest.ui.view.ExpandableView;
import de1.t;
import f42.o;
import h32.u0;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import m60.r0;
import rm1.i;
import rm1.q;
import s71.a;
import s71.l;
import uc2.b;
import x81.f0;
import x81.o0;
import x81.v;
import xd1.g;

@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001:\u0001\u000bB\u001d\b\u0016\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007B%\b\u0016\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\u0006\u0010\n¨\u0006\f"}, d2 = {"Lcom/pinterest/feature/shopping/shoppingcomponents/ProductFilterPillLayout;", "Landroid/widget/LinearLayout;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "", "defStyleAttr", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "xd1/g", "visualSearch_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes5.dex */
public final class ProductFilterPillLayout extends LinearLayout {

    /* renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ int f48473e = 0;

    /* renamed from: a, reason: collision with root package name */
    public final int f48474a;

    /* renamed from: b, reason: collision with root package name */
    public g f48475b;

    /* renamed from: c, reason: collision with root package name */
    public final l f48476c;

    /* renamed from: d, reason: collision with root package name */
    public final l f48477d;

    public ProductFilterPillLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        int dimensionPixelSize = getResources().getDimensionPixelSize(b.try_on_filters_size);
        this.f48474a = dimensionPixelSize;
        i iVar = i.SM;
        int G0 = (dimensionPixelSize - dl2.b.G0(this, iVar.getDimenAttrRes())) / 2;
        int dimensionPixelSize2 = (dimensionPixelSize - getResources().getDimensionPixelSize(b.try_on_filter_clear_button_size)) / 2;
        Context context2 = getContext();
        Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
        l lVar = new l(context2, null, false, null, 0, G0, false, 0L, 0, q.FILTER, iVar, null, null, false, false, false, false, null, false, null, 16751002);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2);
        layoutParams.height = dimensionPixelSize;
        final int i13 = 0;
        lVar.setOnClickListener(new View.OnClickListener(this) { // from class: xd1.f

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ ProductFilterPillLayout f134636b;

            {
                this.f134636b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int i14 = i13;
                ProductFilterPillLayout this$0 = this.f134636b;
                switch (i14) {
                    case 0:
                        ProductFilterPillLayout.a(this$0);
                        break;
                    case 1:
                        int i15 = ProductFilterPillLayout.f48473e;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        g gVar = this$0.f48475b;
                        if (gVar != null) {
                            o0.H3((o0) gVar, null, null, null, o.CUSTOM_PRODUCT_STATE_CLEARED, 15);
                            break;
                        }
                        break;
                    case 2:
                        ProductFilterPillLayout.a(this$0);
                        break;
                    default:
                        int i16 = ProductFilterPillLayout.f48473e;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        g gVar2 = this$0.f48475b;
                        if (gVar2 != null) {
                            o0.H3((o0) gVar2, null, null, null, o.CUSTOM_PRODUCT_STATE_CLEARED, 15);
                            break;
                        }
                        break;
                }
            }
        });
        addView(lVar, layoutParams);
        this.f48476c = lVar;
        Context context3 = getContext();
        Intrinsics.checkNotNullExpressionValue(context3, "getContext(...)");
        l lVar2 = new l(context3, null, false, null, dimensionPixelSize2, dimensionPixelSize2, false, 0L, 0, q.CANCEL, iVar, null, null, false, false, false, false, null, false, null, 16752026);
        final int i14 = 1;
        lVar2.setOnClickListener(new View.OnClickListener(this) { // from class: xd1.f

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ ProductFilterPillLayout f134636b;

            {
                this.f134636b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int i142 = i14;
                ProductFilterPillLayout this$0 = this.f134636b;
                switch (i142) {
                    case 0:
                        ProductFilterPillLayout.a(this$0);
                        break;
                    case 1:
                        int i15 = ProductFilterPillLayout.f48473e;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        g gVar = this$0.f48475b;
                        if (gVar != null) {
                            o0.H3((o0) gVar, null, null, null, o.CUSTOM_PRODUCT_STATE_CLEARED, 15);
                            break;
                        }
                        break;
                    case 2:
                        ProductFilterPillLayout.a(this$0);
                        break;
                    default:
                        int i16 = ProductFilterPillLayout.f48473e;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        g gVar2 = this$0.f48475b;
                        if (gVar2 != null) {
                            o0.H3((o0) gVar2, null, null, null, o.CUSTOM_PRODUCT_STATE_CLEARED, 15);
                            break;
                        }
                        break;
                }
            }
        });
        setVisibility(8);
        this.f48477d = lVar2;
        setOrientation(0);
    }

    public static void a(ProductFilterPillLayout this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        g gVar = this$0.f48475b;
        if (gVar != null) {
            o0 o0Var = (o0) gVar;
            if (o0Var.isBound()) {
                f0 f0Var = (f0) ((v) o0Var.getView());
                ExpandableView expandableView = f0Var.f134216n1;
                if (expandableView == null) {
                    Intrinsics.r("expandableMenu");
                    throw null;
                }
                expandableView.a();
                f0Var.s7().X(u0.FILTER_BUTTON);
                t tVar = f0Var.Z1;
                if (tVar != null) {
                    f0Var.f7().f(new jc0.v(tVar, false, 0L, 30));
                }
            }
        }
    }

    public final void b() {
        l.a(this.f48476c, a.COLLAPSE, 0L, 10);
    }

    public final void c(String filterIconText) {
        Intrinsics.checkNotNullParameter(filterIconText, "filterIconText");
        l lVar = this.f48476c;
        lVar.g(filterIconText, false);
        l.a(lVar, a.EXPAND, 0L, 10);
    }

    public final void d(g gVar) {
        this.f48475b = gVar;
    }

    public final void e(boolean z13) {
        int i13 = z13 ? 0 : 8;
        View view = this.f48477d;
        view.setVisibility(i13);
        if (z13 && view.getParent() == null && view.getParent() == null) {
            LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2);
            layoutParams.height = this.f48474a;
            layoutParams.setMarginStart(getResources().getDimensionPixelSize(r0.margin_half));
            addView(view, layoutParams);
            view.setLayoutParams(layoutParams);
        }
    }

    public ProductFilterPillLayout(Context context, AttributeSet attributeSet, int i13) {
        super(context, attributeSet, i13);
        int dimensionPixelSize = getResources().getDimensionPixelSize(b.try_on_filters_size);
        this.f48474a = dimensionPixelSize;
        i iVar = i.SM;
        int G0 = (dimensionPixelSize - dl2.b.G0(this, iVar.getDimenAttrRes())) / 2;
        int dimensionPixelSize2 = (dimensionPixelSize - getResources().getDimensionPixelSize(b.try_on_filter_clear_button_size)) / 2;
        Context context2 = getContext();
        Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
        l lVar = new l(context2, null, false, null, 0, G0, false, 0L, 0, q.FILTER, iVar, null, null, false, false, false, false, null, false, null, 16751002);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2);
        layoutParams.height = dimensionPixelSize;
        final int i14 = 2;
        lVar.setOnClickListener(new View.OnClickListener(this) { // from class: xd1.f

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ ProductFilterPillLayout f134636b;

            {
                this.f134636b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int i142 = i14;
                ProductFilterPillLayout this$0 = this.f134636b;
                switch (i142) {
                    case 0:
                        ProductFilterPillLayout.a(this$0);
                        break;
                    case 1:
                        int i15 = ProductFilterPillLayout.f48473e;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        g gVar = this$0.f48475b;
                        if (gVar != null) {
                            o0.H3((o0) gVar, null, null, null, o.CUSTOM_PRODUCT_STATE_CLEARED, 15);
                            break;
                        }
                        break;
                    case 2:
                        ProductFilterPillLayout.a(this$0);
                        break;
                    default:
                        int i16 = ProductFilterPillLayout.f48473e;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        g gVar2 = this$0.f48475b;
                        if (gVar2 != null) {
                            o0.H3((o0) gVar2, null, null, null, o.CUSTOM_PRODUCT_STATE_CLEARED, 15);
                            break;
                        }
                        break;
                }
            }
        });
        addView(lVar, layoutParams);
        this.f48476c = lVar;
        Context context3 = getContext();
        Intrinsics.checkNotNullExpressionValue(context3, "getContext(...)");
        l lVar2 = new l(context3, null, false, null, dimensionPixelSize2, dimensionPixelSize2, false, 0L, 0, q.CANCEL, iVar, null, null, false, false, false, false, null, false, null, 16752026);
        final int i15 = 3;
        lVar2.setOnClickListener(new View.OnClickListener(this) { // from class: xd1.f

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ ProductFilterPillLayout f134636b;

            {
                this.f134636b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int i142 = i15;
                ProductFilterPillLayout this$0 = this.f134636b;
                switch (i142) {
                    case 0:
                        ProductFilterPillLayout.a(this$0);
                        break;
                    case 1:
                        int i152 = ProductFilterPillLayout.f48473e;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        g gVar = this$0.f48475b;
                        if (gVar != null) {
                            o0.H3((o0) gVar, null, null, null, o.CUSTOM_PRODUCT_STATE_CLEARED, 15);
                            break;
                        }
                        break;
                    case 2:
                        ProductFilterPillLayout.a(this$0);
                        break;
                    default:
                        int i16 = ProductFilterPillLayout.f48473e;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        g gVar2 = this$0.f48475b;
                        if (gVar2 != null) {
                            o0.H3((o0) gVar2, null, null, null, o.CUSTOM_PRODUCT_STATE_CLEARED, 15);
                            break;
                        }
                        break;
                }
            }
        });
        setVisibility(8);
        this.f48477d = lVar2;
        setOrientation(0);
    }
}
