package com.pinterest.feature.shopping.shoppingcomponents.productfilters.unifiedproductfilters.errorstate;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.LinearLayout;
import com.google.android.gms.internal.measurement.x;
import com.pinterest.gestalt.text.GestaltText;
import ee1.c;
import ee1.e;
import ge1.a;
import h32.f1;
import h32.g0;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;
import nx.d0;
import org.jetbrains.annotations.NotNull;
import vn1.g;
import yk1.j;
import yk1.n;

@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\u0018\u00002\u00020\u00012\u00020\u0002B\u001b\b\u0016\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0007\u0010\bB#\b\u0016\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u0007\u0010\u000b¨\u0006\f"}, d2 = {"Lcom/pinterest/feature/shopping/shoppingcomponents/productfilters/unifiedproductfilters/errorstate/ShoppingFilterEmptyStateView;", "Landroid/widget/LinearLayout;", "Lyk1/n;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "", "defStyleAttr", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "productFilterLibrary_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes5.dex */
public final class ShoppingFilterEmptyStateView extends LinearLayout implements n {

    /* renamed from: a, reason: collision with root package name */
    public final int f48483a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f48484b;

    /* renamed from: c, reason: collision with root package name */
    public c f48485c;

    /* renamed from: d, reason: collision with root package name */
    public GestaltText f48486d;

    /* renamed from: e, reason: collision with root package name */
    public GestaltText f48487e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ShoppingFilterEmptyStateView(Context context) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
        int dimensionPixelSize = getResources().getDimensionPixelSize(eo1.c.lego_bricks_three_and_three_quarter);
        this.f48483a = dimensionPixelSize;
        setOrientation(1);
        setGravity(49);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2);
        setPaddingRelative(0, dimensionPixelSize, 0, 0);
        setLayoutParams(layoutParams);
    }

    public final void a(e eVar, x xVar, boolean z13) {
        a event;
        if (this.f48485c == null) {
            Context context = getContext();
            Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
            c cVar = new c(context);
            this.f48485c = cVar;
            addView(cVar);
        }
        c cVar2 = this.f48485c;
        if (cVar2 != null) {
            j.a().d(cVar2, eVar);
            if (z13) {
                event = a.FILTER_ERROR_STATE_EOF_VIEWED;
            } else {
                if (z13) {
                    throw new NoWhenBranchMatchedException();
                }
                event = a.FILTER_ERROR_STATE_VIEWED;
            }
            if (this.f48484b) {
                return;
            }
            Intrinsics.checkNotNullParameter(event, "event");
            d0 d0Var = (d0) xVar.f31694b;
            f1 eventType = event.getEventType();
            g0 componentType = event.getComponentType();
            Pair n13 = xVar.n();
            d0.B(d0Var, eventType, componentType, null, a.a.x("filter_types", (String) n13.f80346a, "applied_filter_count", (String) n13.f80347b), 20);
            this.f48484b = true;
        }
    }

    public final void b(String str, g textVariant) {
        Intrinsics.checkNotNullParameter(textVariant, "textVariant");
        if (str == null || this.f48486d != null) {
            return;
        }
        Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        GestaltText gestaltText = new GestaltText(6, context, (AttributeSet) null);
        gestaltText.i(new ic1.c(13, str, textVariant));
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2);
        layoutParams.gravity = 17;
        layoutParams.topMargin = this.f48483a;
        gestaltText.setLayoutParams(layoutParams);
        this.f48486d = gestaltText;
        addView(gestaltText);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ShoppingFilterEmptyStateView(@NotNull Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        Intrinsics.checkNotNullParameter(context, "context");
        int dimensionPixelSize = getResources().getDimensionPixelSize(eo1.c.lego_bricks_three_and_three_quarter);
        this.f48483a = dimensionPixelSize;
        setOrientation(1);
        setGravity(49);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2);
        setPaddingRelative(0, dimensionPixelSize, 0, 0);
        setLayoutParams(layoutParams);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ShoppingFilterEmptyStateView(@NotNull Context context, AttributeSet attributeSet, int i13) {
        super(context, attributeSet, i13);
        Intrinsics.checkNotNullParameter(context, "context");
        int dimensionPixelSize = getResources().getDimensionPixelSize(eo1.c.lego_bricks_three_and_three_quarter);
        this.f48483a = dimensionPixelSize;
        setOrientation(1);
        setGravity(49);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2);
        setPaddingRelative(0, dimensionPixelSize, 0, 0);
        setLayoutParams(layoutParams);
    }
}
