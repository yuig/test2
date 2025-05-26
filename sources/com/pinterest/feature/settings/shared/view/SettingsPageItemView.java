package com.pinterest.feature.settings.shared.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import com.pinterest.gestalt.iconcomponent.GestaltIcon;
import com.pinterest.gestalt.text.GestaltText;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import va1.f1;
import yk1.n;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/pinterest/feature/settings/shared/view/SettingsPageItemView;", "Landroid/widget/FrameLayout;", "Lyk1/n;", "settingsLibrary_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes5.dex */
public final class SettingsPageItemView extends FrameLayout implements n {

    /* renamed from: j, reason: collision with root package name */
    public static final /* synthetic */ int f48345j = 0;

    /* renamed from: a, reason: collision with root package name */
    public final Function1 f48346a;

    /* renamed from: b, reason: collision with root package name */
    public final Function1 f48347b;

    /* renamed from: c, reason: collision with root package name */
    public final GestaltText f48348c;

    /* renamed from: d, reason: collision with root package name */
    public final GestaltText f48349d;

    /* renamed from: e, reason: collision with root package name */
    public final GestaltText f48350e;

    /* renamed from: f, reason: collision with root package name */
    public final View f48351f;

    /* renamed from: g, reason: collision with root package name */
    public final GestaltText f48352g;

    /* renamed from: h, reason: collision with root package name */
    public final GestaltIcon f48353h;

    /* renamed from: i, reason: collision with root package name */
    public f1 f48354i;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public SettingsPageItemView(@NotNull Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, null, null, 28);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x0019, code lost:
    
        if (r0 == null) goto L6;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0095  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void a(va1.f1 r8) {
        /*
            r7 = this;
            java.lang.String r0 = "item"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r8, r0)
            r7.f48354i = r8
            java.lang.Integer r0 = r8.f125194a
            java.lang.String r1 = ""
            if (r0 == 0) goto L1b
            int r0 = r0.intValue()
            android.content.res.Resources r2 = r7.getResources()
            java.lang.String r0 = r2.getString(r0)
            if (r0 != 0) goto L20
        L1b:
            java.lang.String r0 = r8.f125195b
            if (r0 != 0) goto L20
            r0 = r1
        L20:
            com.pinterest.gestalt.text.GestaltText r2 = r7.f48348c
            pk.a0.p(r2, r0)
            rx0.f r2 = new rx0.f
            r3 = 29
            r2.<init>(r0, r7, r8, r3)
            com.pinterest.gestalt.text.GestaltText r0 = r7.f48349d
            r0.i(r2)
            boolean r0 = r8 instanceof va1.b
            r2 = 1
            com.pinterest.gestalt.text.GestaltText r3 = r7.f48350e
            java.lang.String r4 = "getContext(...)"
            if (r0 == 0) goto L8c
            r0 = r8
            va1.b r0 = (va1.b) r0
            va1.k1 r5 = r0.a()
            android.content.Context r6 = r7.getContext()
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r6, r4)
            java.lang.String r5 = r5.a(r6)
            boolean r5 = kotlin.text.z.j(r5)
            r5 = r5 ^ r2
            if (r5 == 0) goto L8c
            pk.a0.w1(r3)
            boolean r5 = r8 instanceof wb1.j0
            if (r5 == 0) goto L72
            boolean r0 = r8 instanceof va1.c
            r5 = 0
            if (r0 == 0) goto L63
            r0 = r8
            va1.c r0 = (va1.c) r0
            goto L64
        L63:
            r0 = r5
        L64:
            if (r0 == 0) goto L6a
            java.lang.String r5 = r0.e()
        L6a:
            if (r5 != 0) goto L6d
            goto L6e
        L6d:
            r1 = r5
        L6e:
            pk.a0.p(r3, r1)
            goto L8f
        L72:
            va1.k1 r0 = r0.a()
            android.content.Context r1 = r7.getContext()
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r1, r4)
            java.lang.String r0 = r0.a(r1)
            kc1.w r1 = new kc1.w
            r5 = 10
            r1.<init>(r7, r5)
            kg.t.m(r3, r0, r1)
            goto L8f
        L8c:
            pk.a0.k0(r3)
        L8f:
            boolean r0 = r8 instanceof s91.k
            android.view.View r1 = r7.f48351f
            if (r0 == 0) goto Lc5
            r0 = r8
            s91.k r0 = (s91.k) r0
            android.content.Context r3 = r7.getContext()
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r3, r4)
            va1.k1 r0 = r0.f112087g
            java.lang.String r3 = r0.a(r3)
            boolean r3 = kotlin.text.z.j(r3)
            r3 = r3 ^ r2
            if (r3 == 0) goto Lc5
            r3 = 0
            r1.setVisibility(r3)
            android.content.Context r1 = r7.getContext()
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r1, r4)
            java.lang.String r0 = r0.a(r1)
            u50.f0 r0 = bs1.c.h2(r0)
            com.pinterest.gestalt.text.GestaltText r1 = r7.f48352g
            pk.a0.q(r1, r0)
            goto Lca
        Lc5:
            r0 = 8
            r1.setVisibility(r0)
        Lca:
            zc1.g r0 = new zc1.g
            r0.<init>(r8, r2)
            com.pinterest.gestalt.iconcomponent.GestaltIcon r8 = r7.f48353h
            dl2.b.z(r8, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.pinterest.feature.settings.shared.view.SettingsPageItemView.a(va1.f1):void");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public SettingsPageItemView(@NotNull Context context, AttributeSet attributeSet, int i13) {
        this(context, attributeSet, i13, null, null, 24);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public SettingsPageItemView(android.content.Context r3, android.util.AttributeSet r4, int r5, kotlin.jvm.functions.Function1 r6, kotlin.jvm.functions.Function1 r7, int r8) {
        /*
            r2 = this;
            r0 = r8 & 2
            r1 = 0
            if (r0 == 0) goto L6
            r4 = r1
        L6:
            r0 = r8 & 4
            if (r0 == 0) goto Lb
            r5 = 0
        Lb:
            r0 = r8 & 8
            if (r0 == 0) goto L10
            r6 = r1
        L10:
            r8 = r8 & 16
            if (r8 == 0) goto L15
            r7 = r1
        L15:
            java.lang.String r8 = "context"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r8)
            r2.<init>(r3, r4, r5)
            r2.f48346a = r6
            r2.f48347b = r7
            int r4 = c52.d.view_settings_page_menu_item
            android.view.View.inflate(r3, r4, r2)
            android.widget.FrameLayout$LayoutParams r3 = new android.widget.FrameLayout$LayoutParams
            r4 = -1
            r5 = -2
            r3.<init>(r4, r5)
            r2.setLayoutParams(r3)
            int r3 = c52.c.page_item_title
            android.view.View r3 = r2.findViewById(r3)
            java.lang.String r4 = "findViewById(...)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r3, r4)
            com.pinterest.gestalt.text.GestaltText r3 = (com.pinterest.gestalt.text.GestaltText) r3
            r2.f48348c = r3
            int r3 = c52.c.page_item_value
            android.view.View r3 = r2.findViewById(r3)
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r3, r4)
            com.pinterest.gestalt.text.GestaltText r3 = (com.pinterest.gestalt.text.GestaltText) r3
            r2.f48349d = r3
            int r3 = c52.c.page_item_description
            android.view.View r3 = r2.findViewById(r3)
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r3, r4)
            com.pinterest.gestalt.text.GestaltText r3 = (com.pinterest.gestalt.text.GestaltText) r3
            r2.f48350e = r3
            int r3 = c52.c.page_item_disclaimer
            android.view.View r3 = r2.findViewById(r3)
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r3, r4)
            r2.f48351f = r3
            int r3 = c52.c.page_item_disclaimer_text
            android.view.View r3 = r2.findViewById(r3)
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r3, r4)
            com.pinterest.gestalt.text.GestaltText r3 = (com.pinterest.gestalt.text.GestaltText) r3
            r2.f48352g = r3
            int r3 = c52.c.page_item_icon
            android.view.View r3 = r2.findViewById(r3)
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r3, r4)
            com.pinterest.gestalt.iconcomponent.GestaltIcon r3 = (com.pinterest.gestalt.iconcomponent.GestaltIcon) r3
            r2.f48353h = r3
            lc1.b r3 = new lc1.b
            r4 = 8
            r3.<init>(r2, r4)
            r2.setOnClickListener(r3)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.pinterest.feature.settings.shared.view.SettingsPageItemView.<init>(android.content.Context, android.util.AttributeSet, int, kotlin.jvm.functions.Function1, kotlin.jvm.functions.Function1, int):void");
    }
}
