package com.pinterest.feature.pin.closeup.view;

import af2.c;
import android.content.Context;
import android.util.AttributeSet;
import android.widget.LinearLayout;
import com.pinterest.api.model.f30;
import eo1.b;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import nx.d0;
import org.jetbrains.annotations.NotNull;
import p80.a;
import ye2.o;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/pinterest/feature/pin/closeup/view/PinCloseupFloatingActionBarModule;", "Landroid/widget/LinearLayout;", "", "closeupActionLibrary_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes5.dex */
public final class PinCloseupFloatingActionBarModule extends LinearLayout implements c {

    /* renamed from: a, reason: collision with root package name */
    public o f46969a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f46970b;

    /* renamed from: c, reason: collision with root package name */
    public UnifiedPinActionBarView f46971c;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public PinCloseupFloatingActionBarModule(int r3, int r4, android.content.Context r5, android.util.AttributeSet r6) {
        /*
            r2 = this;
            r0 = r4 & 2
            if (r0 == 0) goto L5
            r6 = 0
        L5:
            r0 = 4
            r4 = r4 & r0
            r1 = 0
            if (r4 == 0) goto Lb
            r3 = r1
        Lb:
            java.lang.String r4 = "context"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r5, r4)
            r2.<init>(r5, r6, r3, r1)
            boolean r3 = r2.f46970b
            r4 = 1
            if (r3 != 0) goto L23
            r2.f46970b = r4
            java.lang.Object r3 = r2.generatedComponent()
            b11.m r3 = (b11.m) r3
            r3.getClass()
        L23:
            r2.setOrientation(r4)
            r2.setVisibility(r0)
            androidx.coordinatorlayout.widget.c r3 = new androidx.coordinatorlayout.widget.c
            boolean r4 = hf0.b.p()
            if (r4 == 0) goto L36
            int r4 = com.bumptech.glide.c.G()
            goto L37
        L36:
            r4 = -1
        L37:
            r5 = -2
            r3.<init>(r4, r5)
            r4 = 81
            r3.f17902c = r4
            r2.setLayoutParams(r3)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.pinterest.feature.pin.closeup.view.PinCloseupFloatingActionBarModule.<init>(int, int, android.content.Context, android.util.AttributeSet):void");
    }

    public final void a(boolean z13, d0 pinalytics, String navigationSource, String str) {
        Intrinsics.checkNotNullParameter(pinalytics, "pinalytics");
        Intrinsics.checkNotNullParameter(navigationSource, "navigationSource");
        if (z13) {
            return;
        }
        Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        UnifiedPinActionBarView unifiedPinActionBarView = new UnifiedPinActionBarView(context, pinalytics, navigationSource);
        unifiedPinActionBarView.setBackgroundColor(bs1.c.B(unifiedPinActionBarView, b.color_themed_background_default));
        rm1.c iconColor = rm1.c.DEFAULT;
        Intrinsics.checkNotNullParameter(iconColor, "iconColor");
        unifiedPinActionBarView.f47040g.g2(new sp.b(iconColor, 2));
        unifiedPinActionBarView.f47042i.Z(iconColor);
        unifiedPinActionBarView.f47047n = iconColor;
        unifiedPinActionBarView.setLayoutParams(new LinearLayout.LayoutParams(-1, unifiedPinActionBarView.getResources().getDimensionPixelSize(a.pin_closeup_unified_action_bar_height)));
        unifiedPinActionBarView.f47057x = str;
        this.f46971c = unifiedPinActionBarView;
        addView(unifiedPinActionBarView);
    }

    public final void b(f30 pin) {
        Intrinsics.checkNotNullParameter(pin, "pin");
        UnifiedPinActionBarView unifiedPinActionBarView = this.f46971c;
        if (unifiedPinActionBarView != null) {
            unifiedPinActionBarView.X(pin);
        }
    }

    public final void c(c82.a aVar) {
        UnifiedPinActionBarView unifiedPinActionBarView = this.f46971c;
        if (unifiedPinActionBarView != null) {
            unifiedPinActionBarView.f47051r = aVar;
        }
    }

    @Override // af2.c
    public final af2.b componentManager() {
        if (this.f46969a == null) {
            this.f46969a = new o(this);
        }
        return this.f46969a;
    }

    public final void d() {
        UnifiedPinActionBarView unifiedPinActionBarView = this.f46971c;
        if (unifiedPinActionBarView != null) {
            unifiedPinActionBarView.d0();
        }
    }

    @Override // af2.b
    public final Object generatedComponent() {
        if (this.f46969a == null) {
            this.f46969a = new o(this);
        }
        return this.f46969a.generatedComponent();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public PinCloseupFloatingActionBarModule(@NotNull Context context, AttributeSet attributeSet) {
        this(0, 12, context, attributeSet);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public PinCloseupFloatingActionBarModule(@NotNull Context context, AttributeSet attributeSet, int i13) {
        this(i13, 8, context, attributeSet);
        Intrinsics.checkNotNullParameter(context, "context");
    }
}
