package com.pinterest.feature.settings.shared.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import c52.d;
import com.pinterest.gestalt.text.GestaltText;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import o5.c;
import org.jetbrains.annotations.NotNull;
import yk1.n;

@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\u0018\u00002\u00020\u00012\u00020\u0002B'\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Lcom/pinterest/feature/settings/shared/view/SettingsHeaderTextItemView;", "Landroid/widget/FrameLayout;", "Lyk1/n;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "settingsLibrary_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes5.dex */
public final class SettingsHeaderTextItemView extends FrameLayout implements n {

    /* renamed from: a, reason: collision with root package name */
    public final GestaltText f48342a;

    /* renamed from: b, reason: collision with root package name */
    public final c f48343b;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public SettingsHeaderTextItemView(@NotNull Context context, AttributeSet attributeSet) {
        this(4, context, attributeSet);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x0019, code lost:
    
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
            if (r0 == 0) goto L1b
            int r0 = r0.intValue()
            android.content.Context r1 = r2.getContext()
            android.content.res.Resources r1 = r1.getResources()
            java.lang.String r0 = r1.getString(r0)
            if (r0 != 0) goto L21
        L1b:
            java.lang.String r0 = r3.f125195b
            if (r0 != 0) goto L21
            java.lang.String r0 = ""
        L21:
            o5.c r3 = r2.f48343b
            java.lang.String r3 = r3.b(r0)
            java.lang.String r0 = "unicodeWrap(...)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r3, r0)
            com.pinterest.gestalt.text.GestaltText r0 = r2.f48342a
            pk.a0.p(r0, r3)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.pinterest.feature.settings.shared.view.SettingsHeaderTextItemView.a(va1.j1):void");
    }

    public /* synthetic */ SettingsHeaderTextItemView(int i13, Context context, AttributeSet attributeSet) {
        this(context, (i13 & 2) != 0 ? null : attributeSet, 0);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SettingsHeaderTextItemView(@NotNull Context context, AttributeSet attributeSet, int i13) {
        super(context, attributeSet, i13);
        Intrinsics.checkNotNullParameter(context, "context");
        c a13 = c.a();
        Intrinsics.checkNotNullExpressionValue(a13, "getInstance(...)");
        this.f48343b = a13;
        View.inflate(context, d.view_header_text_item, this);
        setLayoutParams(new FrameLayout.LayoutParams(-1, -2));
        View findViewById = findViewById(c52.c.settings_header_title);
        Intrinsics.checkNotNullExpressionValue(findViewById, "findViewById(...)");
        this.f48342a = (GestaltText) findViewById;
    }
}
