package com.pinterest.feature.settings.shared.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import com.pinterest.gestalt.listAction.GestaltListAction;
import com.pinterest.gestalt.text.GestaltText;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import va1.f1;
import yk1.n;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\u0003¨\u0006\u0004"}, d2 = {"Lcom/pinterest/feature/settings/shared/view/GestaltSettingsPageItemView;", "Landroid/widget/FrameLayout;", "Lyk1/n;", "g4/u", "settingsLibrary_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes5.dex */
public final class GestaltSettingsPageItemView extends FrameLayout implements n {

    /* renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ int f48320f = 0;

    /* renamed from: a, reason: collision with root package name */
    public final Function1 f48321a;

    /* renamed from: b, reason: collision with root package name */
    public final GestaltListAction f48322b;

    /* renamed from: c, reason: collision with root package name */
    public final View f48323c;

    /* renamed from: d, reason: collision with root package name */
    public final GestaltText f48324d;

    /* renamed from: e, reason: collision with root package name */
    public f1 f48325e;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public GestaltSettingsPageItemView(int r3, int r4, android.content.Context r5, android.util.AttributeSet r6, com.pinterest.feature.settings.notifications.y0 r7) {
        /*
            r2 = this;
            r0 = r4 & 2
            r1 = 0
            if (r0 == 0) goto L6
            r6 = r1
        L6:
            r0 = r4 & 4
            if (r0 == 0) goto Lb
            r3 = 0
        Lb:
            r4 = r4 & 8
            if (r4 == 0) goto L10
            r7 = r1
        L10:
            java.lang.String r4 = "context"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r5, r4)
            r2.<init>(r5, r6, r3)
            r2.f48321a = r7
            int r3 = c52.d.view_gestalt_settings_page_menu_item
            android.view.View.inflate(r5, r3, r2)
            android.widget.FrameLayout$LayoutParams r3 = new android.widget.FrameLayout$LayoutParams
            r4 = -1
            r5 = -2
            r3.<init>(r4, r5)
            r2.setLayoutParams(r3)
            int r3 = c52.c.page_list_action
            android.view.View r3 = r2.findViewById(r3)
            java.lang.String r4 = "findViewById(...)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r3, r4)
            com.pinterest.gestalt.listAction.GestaltListAction r3 = (com.pinterest.gestalt.listAction.GestaltListAction) r3
            r2.f48322b = r3
            int r3 = c52.c.page_item_disclaimer
            android.view.View r3 = r2.findViewById(r3)
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r3, r4)
            r2.f48323c = r3
            int r3 = c52.c.page_item_disclaimer_text
            android.view.View r3 = r2.findViewById(r3)
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r3, r4)
            com.pinterest.gestalt.text.GestaltText r3 = (com.pinterest.gestalt.text.GestaltText) r3
            r2.f48324d = r3
            lc1.b r3 = new lc1.b
            r4 = 5
            r3.<init>(r2, r4)
            r2.setOnClickListener(r3)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.pinterest.feature.settings.shared.view.GestaltSettingsPageItemView.<init>(int, int, android.content.Context, android.util.AttributeSet, com.pinterest.feature.settings.notifications.y0):void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x0019, code lost:
    
        if (r0 == null) goto L8;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:13:0x004e  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0055  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x005c  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0095  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0052  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void a(va1.f1 r13) {
        /*
            r12 = this;
            java.lang.String r0 = "item"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r13, r0)
            r12.f48325e = r13
            java.lang.Integer r0 = r13.f125194a
            java.lang.String r1 = ""
            if (r0 == 0) goto L1e
            int r0 = r0.intValue()
            android.content.res.Resources r2 = r12.getResources()
            java.lang.String r0 = r2.getString(r0)
            if (r0 != 0) goto L1c
            goto L1e
        L1c:
            r3 = r0
            goto L23
        L1e:
            java.lang.String r0 = r13.f125195b
            if (r0 != 0) goto L1c
            r3 = r1
        L23:
            boolean r0 = r13 instanceof va1.b
            r9 = 0
            r10 = 1
            java.lang.String r11 = "getContext(...)"
            if (r0 == 0) goto L46
            r0 = r13
            va1.b r0 = (va1.b) r0
            va1.k1 r0 = r0.a()
            android.content.Context r2 = r12.getContext()
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r2, r11)
            java.lang.String r0 = r0.a(r2)
            boolean r0 = kotlin.text.z.j(r0)
            r0 = r0 ^ r10
            if (r0 == 0) goto L46
            r4 = r10
            goto L47
        L46:
            r4 = r9
        L47:
            boolean r5 = r13 instanceof wb1.j0
            boolean r0 = r13 instanceof va1.c
            r2 = 0
            if (r0 == 0) goto L52
            r0 = r13
            va1.c r0 = (va1.c) r0
            goto L53
        L52:
            r0 = r2
        L53:
            if (r0 == 0) goto L59
            java.lang.String r2 = r0.e()
        L59:
            if (r2 != 0) goto L5c
            goto L5d
        L5c:
            r1 = r2
        L5d:
            int r0 = r1.length()
            r2 = 30
            if (r0 <= r2) goto L81
            java.lang.String r0 = r1.substring(r9, r2)
            java.lang.String r1 = "substring(...)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r0, r1)
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r0)
            java.lang.String r0 = "..."
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            r8 = r0
            goto L82
        L81:
            r8 = r1
        L82:
            w1.i0 r0 = new w1.i0
            r2 = r0
            r6 = r13
            r7 = r12
            r2.<init>(r3, r4, r5, r6, r7, r8)
            com.pinterest.gestalt.listAction.GestaltListAction r1 = r12.f48322b
            kg.a.h(r1, r0)
            boolean r0 = r13 instanceof s91.k
            android.view.View r2 = r12.f48323c
            if (r0 == 0) goto Lc4
            r0 = r13
            s91.k r0 = (s91.k) r0
            android.content.Context r3 = r12.getContext()
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r3, r11)
            va1.k1 r0 = r0.f112087g
            java.lang.String r3 = r0.a(r3)
            boolean r3 = kotlin.text.z.j(r3)
            r3 = r3 ^ r10
            if (r3 == 0) goto Lc4
            r2.setVisibility(r9)
            android.content.Context r2 = r12.getContext()
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r2, r11)
            java.lang.String r0 = r0.a(r2)
            u50.f0 r0 = bs1.c.h2(r0)
            com.pinterest.gestalt.text.GestaltText r2 = r12.f48324d
            pk.a0.q(r2, r0)
            goto Lc9
        Lc4:
            r0 = 8
            r2.setVisibility(r0)
        Lc9:
            wm1.c r0 = r1.g0()
            wm1.n r0 = r0.f130270d
            java.lang.String r2 = "null cannot be cast to non-null type com.pinterest.gestalt.listAction.GestaltListAction.EndItemDisplayState.TextIconDisplayState"
            kotlin.jvm.internal.Intrinsics.g(r0, r2)
            wm1.m r0 = (wm1.m) r0
            ic1.c r2 = new ic1.c
            r3 = 6
            r2.<init>(r3, r0, r13)
            kg.a.h(r1, r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.pinterest.feature.settings.shared.view.GestaltSettingsPageItemView.a(va1.f1):void");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public GestaltSettingsPageItemView(@NotNull Context context, AttributeSet attributeSet) {
        this(0, 12, context, attributeSet, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public GestaltSettingsPageItemView(@NotNull Context context, AttributeSet attributeSet, int i13) {
        this(i13, 8, context, attributeSet, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }
}
