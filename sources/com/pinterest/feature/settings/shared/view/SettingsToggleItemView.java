package com.pinterest.feature.settings.shared.view;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import com.pinterest.gestalt.switchComponent.GestaltSwitch;
import com.pinterest.gestalt.text.GestaltText;
import java.util.WeakHashMap;
import kl2.l;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import o5.c;
import org.jetbrains.annotations.NotNull;
import q5.h0;
import q5.v0;
import va1.m1;
import yk1.n;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/pinterest/feature/settings/shared/view/SettingsToggleItemView;", "Landroid/widget/FrameLayout;", "Lyk1/n;", "settingsLibrary_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes5.dex */
public final class SettingsToggleItemView extends FrameLayout implements n {

    /* renamed from: h, reason: collision with root package name */
    public static final /* synthetic */ int f48364h = 0;

    /* renamed from: a, reason: collision with root package name */
    public l f48365a;

    /* renamed from: b, reason: collision with root package name */
    public final GestaltText f48366b;

    /* renamed from: c, reason: collision with root package name */
    public final GestaltText f48367c;

    /* renamed from: d, reason: collision with root package name */
    public final RestrictedLockView f48368d;

    /* renamed from: e, reason: collision with root package name */
    public final GestaltSwitch f48369e;

    /* renamed from: f, reason: collision with root package name */
    public m1 f48370f;

    /* renamed from: g, reason: collision with root package name */
    public final c f48371g;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public SettingsToggleItemView(@NotNull Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, null, null, 28);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x001b, code lost:
    
        if (r0 == null) goto L6;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void a(va1.m1 r5) {
        /*
            r4 = this;
            java.lang.String r0 = "item"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r5, r0)
            r4.f48370f = r5
            java.lang.Integer r0 = r5.f125194a
            if (r0 == 0) goto L1d
            int r0 = r0.intValue()
            android.content.Context r1 = r4.getContext()
            android.content.res.Resources r1 = r1.getResources()
            java.lang.String r0 = r1.getString(r0)
            if (r0 != 0) goto L23
        L1d:
            java.lang.String r0 = r5.f125195b
            if (r0 != 0) goto L23
            java.lang.String r0 = ""
        L23:
            o5.c r1 = r4.f48371g
            java.lang.String r0 = r1.b(r0)
            java.lang.String r1 = "unicodeWrap(...)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r0, r1)
            com.pinterest.gestalt.text.GestaltText r1 = r4.f48366b
            pk.a0.p(r1, r0)
            va1.k1 r0 = r5.a()
            android.content.Context r1 = r4.getContext()
            java.lang.String r2 = "getContext(...)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r1, r2)
            java.lang.String r0 = r0.a(r1)
            com.pinterest.gestalt.text.GestaltText r1 = r4.f48367c
            r2 = 0
            kg.t.m(r1, r0, r2)
            ic1.c r0 = new ic1.c
            r1 = 8
            r0.<init>(r1, r5, r4)
            com.pinterest.gestalt.switchComponent.GestaltSwitch r1 = r4.f48369e
            com.pinterest.gestalt.switchComponent.GestaltSwitch r0 = r1.i(r0)
            ca1.h r1 = new ca1.h
            r3 = 13
            r1.<init>(r4, r3)
            r0.j(r1)
            boolean r5 = r5.h()
            if (r5 == 0) goto L72
            lc1.b r5 = new lc1.b
            r0 = 9
            r5.<init>(r4, r0)
            r4.setOnClickListener(r5)
            goto L75
        L72:
            r4.setOnClickListener(r2)
        L75:
            r4.b()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.pinterest.feature.settings.shared.view.SettingsToggleItemView.a(va1.m1):void");
    }

    public final void b() {
        setContentDescription(((Object) this.f48366b.getText()) + ". " + ((Object) this.f48367c.getText()));
        WeakHashMap weakHashMap = v0.f102521a;
        int i13 = 64;
        int i14 = 30;
        int i15 = 2;
        new h0(b5.c.tag_state_description, i13, i14, i15).g(this, (CharSequence) new h0(b5.c.tag_state_description, i13, i14, i15).e(this.f48369e));
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public SettingsToggleItemView(@NotNull Context context, AttributeSet attributeSet, int i13) {
        this(context, attributeSet, i13, null, null, 24);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public SettingsToggleItemView(android.content.Context r3, android.util.AttributeSet r4, int r5, nx.d0 r6, i1.h r7, int r8) {
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
            r2.f48365a = r7
            o5.c r4 = o5.c.a()
            java.lang.String r5 = "getInstance(...)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r4, r5)
            r2.f48371g = r4
            int r4 = c52.d.view_settings_toggle_menu_item
            android.view.View.inflate(r3, r4, r2)
            android.widget.FrameLayout$LayoutParams r3 = new android.widget.FrameLayout$LayoutParams
            r4 = -1
            r5 = -2
            r3.<init>(r4, r5)
            r2.setLayoutParams(r3)
            int r3 = c52.c.settings_toggle_item_title
            android.view.View r3 = r2.findViewById(r3)
            java.lang.String r4 = "findViewById(...)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r3, r4)
            com.pinterest.gestalt.text.GestaltText r3 = (com.pinterest.gestalt.text.GestaltText) r3
            r2.f48366b = r3
            int r3 = c52.c.settings_toggle_item_description
            android.view.View r3 = r2.findViewById(r3)
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r3, r4)
            com.pinterest.gestalt.text.GestaltText r3 = (com.pinterest.gestalt.text.GestaltText) r3
            r2.f48367c = r3
            int r3 = c52.c.settings_toggle_lock_icon
            android.view.View r3 = r2.findViewById(r3)
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r3, r4)
            com.pinterest.feature.settings.shared.view.RestrictedLockView r3 = (com.pinterest.feature.settings.shared.view.RestrictedLockView) r3
            r2.f48368d = r3
            int r5 = c52.c.settings_toggle_item_toggle
            android.view.View r5 = r2.findViewById(r5)
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r5, r4)
            com.pinterest.gestalt.switchComponent.GestaltSwitch r5 = (com.pinterest.gestalt.switchComponent.GestaltSwitch) r5
            r2.f48369e = r5
            r3.f48327c = r6
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.pinterest.feature.settings.shared.view.SettingsToggleItemView.<init>(android.content.Context, android.util.AttributeSet, int, nx.d0, i1.h, int):void");
    }
}
