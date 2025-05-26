package com.pinterest.feature.settings.shared.view;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import com.pinterest.gestalt.text.GestaltText;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import yk1.n;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/pinterest/feature/settings/shared/view/SettingsSectionHeaderView;", "Landroid/widget/FrameLayout;", "Lyk1/n;", "settingsLibrary_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes5.dex */
public final class SettingsSectionHeaderView extends FrameLayout implements n {

    /* renamed from: a, reason: collision with root package name */
    public final GestaltText f48358a;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public SettingsSectionHeaderView(@NotNull Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 12);
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
            com.pinterest.gestalt.text.GestaltText r3 = r2.f48358a
            pk.a0.p(r3, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.pinterest.feature.settings.shared.view.SettingsSectionHeaderView.a(va1.j1):void");
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public SettingsSectionHeaderView(android.content.Context r2, android.util.AttributeSet r3, int r4) {
        /*
            r1 = this;
            r4 = r4 & 2
            if (r4 == 0) goto L5
            r3 = 0
        L5:
            vn1.g r4 = vn1.g.BODY_300
            java.lang.String r0 = "context"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
            java.lang.String r0 = "variant"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r4, r0)
            r1.<init>(r2, r3)
            int r3 = c52.d.settings_section_header_view
            android.view.View.inflate(r2, r3, r1)
            android.widget.FrameLayout$LayoutParams r2 = new android.widget.FrameLayout$LayoutParams
            r3 = -1
            r4 = -2
            r2.<init>(r3, r4)
            r1.setLayoutParams(r2)
            int r2 = c52.c.settings_section_header_text
            android.view.View r2 = r1.findViewById(r2)
            java.lang.String r3 = "findViewById(...)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r2, r3)
            com.pinterest.gestalt.text.GestaltText r2 = (com.pinterest.gestalt.text.GestaltText) r2
            r1.f48358a = r2
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.pinterest.feature.settings.shared.view.SettingsSectionHeaderView.<init>(android.content.Context, android.util.AttributeSet, int):void");
    }
}
