package com.pinterest.feature.settings.notifications.view;

import android.annotation.SuppressLint;
import android.content.Context;
import android.util.AttributeSet;
import android.widget.LinearLayout;
import c52.a;
import com.pinterest.api.model.jz;
import com.pinterest.gestalt.text.GestaltText;
import eo1.c;
import gb1.d;
import gb1.f;
import gb1.p;
import java.util.List;
import k1.b0;
import kotlin.Metadata;
import kotlin.collections.f0;
import kotlin.jvm.internal.Intrinsics;
import m60.r0;
import org.jetbrains.annotations.NotNull;
import yk1.n;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/pinterest/feature/settings/notifications/view/NotificationSettingsItemTwoLevelView;", "Lgb1/d;", "Lyk1/n;", "settingsLibrary_release"}, k = 1, mv = {1, 9, 0})
@SuppressLint({"ViewConstructor"})
/* loaded from: classes5.dex */
public final class NotificationSettingsItemTwoLevelView extends d implements n {

    /* renamed from: c, reason: collision with root package name */
    public final com.pinterest.feature.settings.notifications.d f48278c;

    /* renamed from: d, reason: collision with root package name */
    public final LinearLayout f48279d;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public NotificationSettingsItemTwoLevelView(@NotNull Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, null, 12);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    @Override // com.pinterest.feature.settings.notifications.c
    public final void D0(String sectionKey, String optionKey, String optionLabel, boolean z13, boolean z14, boolean z15) {
        Intrinsics.checkNotNullParameter(sectionKey, "sectionKey");
        Intrinsics.checkNotNullParameter(optionKey, "optionKey");
        Intrinsics.checkNotNullParameter(optionLabel, "optionLabel");
    }

    @Override // gb1.d, com.pinterest.feature.settings.notifications.c
    public final void T2(List values, boolean z13, String sectionKey, String label) {
        Intrinsics.checkNotNullParameter(sectionKey, "sectionKey");
        Intrinsics.checkNotNullParameter(label, "label");
        Intrinsics.checkNotNullParameter(values, "values");
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2);
        layoutParams.setMargins(0, getContext().getResources().getDimensionPixelOffset(c.space_200), 0, getContext().getResources().getDimensionPixelOffset(r0.margin_three_quarter));
        Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        GestaltText gestaltText = new GestaltText(6, context, (AttributeSet) null);
        GestaltText i13 = gestaltText.i(new p(label, z13, 0));
        i13.setFocusable(true);
        i13.setPaddingRelative(0, 0, 0, 0);
        LinearLayout linearLayout = this.f48279d;
        linearLayout.addView(gestaltText, layoutParams);
        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-1, -2);
        LinearLayout.LayoutParams layoutParams3 = new LinearLayout.LayoutParams(-1, -2);
        layoutParams3.setMargins(0, 0, 0, getContext().getResources().getDimensionPixelOffset(a.notif_settings_two_level_margin));
        int i14 = 0;
        for (Object obj : values) {
            int i15 = i14 + 1;
            if (i14 < 0) {
                f0.p();
                throw null;
            }
            jz.b bVar = (jz.b) obj;
            boolean z14 = i14 == values.size() - 1;
            String a13 = bVar.a();
            Intrinsics.checkNotNullExpressionValue(a13, "getKey(...)");
            String b13 = bVar.b();
            Intrinsics.checkNotNullExpressionValue(b13, "getLabel(...)");
            Boolean c13 = bVar.c();
            Intrinsics.checkNotNullExpressionValue(c13, "getValue(...)");
            boolean booleanValue = c13.booleanValue();
            Context context2 = getContext();
            Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
            LinearLayout.LayoutParams layoutParams4 = layoutParams3;
            linearLayout.addView(new f(context2, z13 && booleanValue, z13, b13, new b0(z13, (d) this, sectionKey, a13, 12)), z14 ? layoutParams4 : layoutParams2);
            i14 = i15;
            layoutParams3 = layoutParams4;
        }
    }

    @Override // gb1.d, com.pinterest.feature.settings.notifications.c
    public final void s0() {
        this.f48279d.removeAllViews();
    }

    @Override // com.pinterest.feature.settings.notifications.c
    public final void u0() {
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public NotificationSettingsItemTwoLevelView(@NotNull Context context, AttributeSet attributeSet, int i13) {
        this(context, attributeSet, i13, null, 8);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public NotificationSettingsItemTwoLevelView(android.content.Context r3, android.util.AttributeSet r4, int r5, com.pinterest.feature.settings.notifications.d r6, int r7) {
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
            int r7 = c52.d.notif_settings_item_two_level
            r2.<init>(r3, r4, r5, r7)
            r2.f48278c = r6
            int r4 = c52.c.notif_settings_two_level_group
            android.view.View r4 = r2.findViewById(r4)
            android.widget.LinearLayout r4 = (android.widget.LinearLayout) r4
            r2.f48279d = r4
            android.content.res.Resources r4 = r2.getResources()
            java.lang.String r5 = "getResources(...)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r4, r5)
            r5 = 16
            int r4 = pk.a0.K(r5, r4)
            android.view.ViewGroup$LayoutParams r5 = r2.getLayoutParams()
            java.lang.String r6 = "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams"
            kotlin.jvm.internal.Intrinsics.g(r5, r6)
            android.view.ViewGroup$MarginLayoutParams r5 = (android.view.ViewGroup.MarginLayoutParams) r5
            android.content.res.Resources r6 = r3.getResources()
            int r7 = c52.a.notif_settings_neg_margin_between_button_and_two_level
            int r6 = r6.getDimensionPixelOffset(r7)
            android.content.res.Resources r3 = r3.getResources()
            int r7 = m60.r0.empty_padding
            int r3 = r3.getDimensionPixelOffset(r7)
            com.bumptech.glide.c.a1(r5, r4, r6, r4, r3)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.pinterest.feature.settings.notifications.view.NotificationSettingsItemTwoLevelView.<init>(android.content.Context, android.util.AttributeSet, int, com.pinterest.feature.settings.notifications.d, int):void");
    }
}
