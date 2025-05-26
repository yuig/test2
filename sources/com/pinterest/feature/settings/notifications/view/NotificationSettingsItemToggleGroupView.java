package com.pinterest.feature.settings.notifications.view;

import android.annotation.SuppressLint;
import android.content.Context;
import android.util.AttributeSet;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import c52.a;
import com.bumptech.glide.c;
import com.pinterest.gestalt.switchComponent.GestaltSwitchWithLabel;
import ea1.k0;
import gb1.d;
import gb1.f;
import k1.b0;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import m60.r0;
import org.jetbrains.annotations.NotNull;
import pe.i;
import yk1.n;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/pinterest/feature/settings/notifications/view/NotificationSettingsItemToggleGroupView;", "Lgb1/d;", "Lyk1/n;", "settingsLibrary_release"}, k = 1, mv = {1, 9, 0})
@SuppressLint({"ViewConstructor"})
/* loaded from: classes5.dex */
public final class NotificationSettingsItemToggleGroupView extends d implements n {

    /* renamed from: c, reason: collision with root package name */
    public final com.pinterest.feature.settings.notifications.d f48275c;

    /* renamed from: d, reason: collision with root package name */
    public final LinearLayout f48276d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f48277e;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public NotificationSettingsItemToggleGroupView(@NotNull Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, null, 12);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    @Override // com.pinterest.feature.settings.notifications.c
    public final void D0(String sectionKey, String optionKey, String optionLabel, boolean z13, boolean z14, boolean z15) {
        Intrinsics.checkNotNullParameter(sectionKey, "sectionKey");
        Intrinsics.checkNotNullParameter(optionKey, "optionKey");
        Intrinsics.checkNotNullParameter(optionLabel, "optionLabel");
        this.f64689b.incrementAndGet();
        ViewGroup.MarginLayoutParams marginLayoutParams = new ViewGroup.MarginLayoutParams(-1, -2);
        c.b1(marginLayoutParams, bs1.c.W(this, eo1.c.space_100), 0, 0, 0, 14);
        if (z15) {
            marginLayoutParams.bottomMargin = (int) getResources().getDimension(r0.margin_half);
        }
        boolean z16 = this.f48277e;
        LinearLayout linearLayout = this.f48276d;
        if (!z16) {
            Context context = getContext();
            Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
            linearLayout.addView(new f(context, z14 && z13, z14, optionLabel, new b0(z14, (d) this, sectionKey, optionKey, 11)), marginLayoutParams);
        } else {
            Context context2 = getContext();
            Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
            GestaltSwitchWithLabel T = new GestaltSwitchWithLabel(context2).T(new k0(z13, z14, optionLabel));
            i.j(T, new rx0.f(this, sectionKey, optionKey, 23));
            linearLayout.addView(T, marginLayoutParams);
        }
    }

    @Override // gb1.d, com.pinterest.feature.settings.notifications.c
    public final void Z5(String str) {
        super.Z5(str);
        boolean z13 = !(str == null || str.length() == 0);
        this.f48277e = z13;
        if (z13) {
            return;
        }
        ViewGroup.LayoutParams layoutParams = getLayoutParams();
        Intrinsics.g(layoutParams, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
        marginLayoutParams.topMargin = getContext().getResources().getDimensionPixelOffset(a.notif_settings_neg_margin_between_button_and_two_level);
        setLayoutParams(marginLayoutParams);
    }

    @Override // com.pinterest.feature.settings.notifications.c
    public final void u0() {
        this.f64689b.set(0);
        this.f48276d.removeAllViews();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public NotificationSettingsItemToggleGroupView(@NotNull Context context, AttributeSet attributeSet, int i13) {
        this(context, attributeSet, i13, null, 8);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public NotificationSettingsItemToggleGroupView(android.content.Context r3, android.util.AttributeSet r4, int r5, com.pinterest.feature.settings.notifications.d r6, int r7) {
        /*
            r2 = this;
            r0 = r7 & 2
            r1 = 0
            if (r0 == 0) goto L6
            r4 = r1
        L6:
            r0 = r7 & 4
            if (r0 == 0) goto Lb
            r5 = 0
        Lb:
            r7 = r7 & 8
            if (r7 == 0) goto L10
            r6 = r1
        L10:
            java.lang.String r7 = "context"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r7)
            int r7 = c52.d.lego_notif_settings_item_toggle_group
            r2.<init>(r3, r4, r5, r7)
            r2.f48275c = r6
            int r3 = c52.c.notif_settings_toggle_group
            android.view.View r3 = r2.findViewById(r3)
            android.widget.LinearLayout r3 = (android.widget.LinearLayout) r3
            r2.f48276d = r3
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.pinterest.feature.settings.notifications.view.NotificationSettingsItemToggleGroupView.<init>(android.content.Context, android.util.AttributeSet, int, com.pinterest.feature.settings.notifications.d, int):void");
    }
}
