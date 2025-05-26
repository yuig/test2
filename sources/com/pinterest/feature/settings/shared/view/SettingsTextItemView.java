package com.pinterest.feature.settings.shared.view;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import com.pinterest.gestalt.text.GestaltText;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import yk1.n;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/pinterest/feature/settings/shared/view/SettingsTextItemView;", "Landroid/widget/FrameLayout;", "Lyk1/n;", "settingsLibrary_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes5.dex */
public final class SettingsTextItemView extends FrameLayout implements n {

    /* renamed from: a, reason: collision with root package name */
    public final Function1 f48359a;

    /* renamed from: b, reason: collision with root package name */
    public final GestaltText f48360b;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public SettingsTextItemView(@NotNull Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 28);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x0015, code lost:
    
        if (r0 == null) goto L6;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void a(va1.j1 r3) {
        /*
            r2 = this;
            java.lang.String r0 = "item"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r0)
            java.lang.Integer r0 = r3.f125194a
            if (r0 == 0) goto L17
            int r0 = r0.intValue()
            android.content.res.Resources r1 = r2.getResources()
            java.lang.String r0 = r1.getString(r0)
            if (r0 != 0) goto L1d
        L17:
            java.lang.String r0 = r3.f125195b
            if (r0 != 0) goto L1d
            java.lang.String r0 = ""
        L1d:
            kc1.w r3 = new kc1.w
            r1 = 11
            r3.<init>(r2, r1)
            com.pinterest.gestalt.text.GestaltText r1 = r2.f48360b
            kg.t.m(r1, r0, r3)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.pinterest.feature.settings.shared.view.SettingsTextItemView.a(va1.j1):void");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public SettingsTextItemView(@NotNull Context context, AttributeSet attributeSet, int i13) {
        this(context, attributeSet, i13, 24);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public SettingsTextItemView(android.content.Context r3, android.util.AttributeSet r4, int r5, int r6) {
        /*
            r2 = this;
            r0 = r6 & 2
            r1 = 0
            if (r0 == 0) goto L6
            r4 = r1
        L6:
            r6 = r6 & 4
            if (r6 == 0) goto Lb
            r5 = 0
        Lb:
            java.lang.String r6 = "context"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r6)
            r2.<init>(r3, r4, r5)
            r2.f48359a = r1
            int r4 = c52.d.settings_text_item_view
            android.view.View.inflate(r3, r4, r2)
            android.widget.FrameLayout$LayoutParams r3 = new android.widget.FrameLayout$LayoutParams
            r4 = -1
            r5 = -2
            r3.<init>(r4, r5)
            r2.setLayoutParams(r3)
            int r3 = c52.c.settings_item_text
            android.view.View r3 = r2.findViewById(r3)
            java.lang.String r4 = "findViewById(...)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r3, r4)
            com.pinterest.gestalt.text.GestaltText r3 = (com.pinterest.gestalt.text.GestaltText) r3
            r2.f48360b = r3
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.pinterest.feature.settings.shared.view.SettingsTextItemView.<init>(android.content.Context, android.util.AttributeSet, int, int):void");
    }
}
