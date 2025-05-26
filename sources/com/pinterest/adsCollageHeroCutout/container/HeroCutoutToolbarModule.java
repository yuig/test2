package com.pinterest.adsCollageHeroCutout.container;

import android.content.Context;
import android.util.AttributeSet;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.pinterest.gestalt.iconbutton.GestaltIconButton;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import sv.b0;
import xo.k;

@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/pinterest/adsCollageHeroCutout/container/HeroCutoutToolbarModule;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "adsCollageHeroCutout_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes3.dex */
public final class HeroCutoutToolbarModule extends ConstraintLayout {

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int f35455b = 0;

    /* renamed from: a, reason: collision with root package name */
    public final GestaltIconButton f35456a;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public HeroCutoutToolbarModule(int r2, int r3, android.content.Context r4, android.util.AttributeSet r5) {
        /*
            r1 = this;
            r3 = r3 & 4
            r0 = 0
            if (r3 == 0) goto L6
            r2 = r0
        L6:
            java.lang.String r3 = "context"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r4, r3)
            r1.<init>(r4, r5, r2, r0)
            int r2 = qv.c.hero_cutout_toolbar_module
            android.view.View.inflate(r4, r2, r1)
            int r2 = qv.b.up_button
            android.view.View r2 = r1.findViewById(r2)
            java.lang.String r3 = "findViewById(...)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r2, r3)
            com.pinterest.gestalt.iconbutton.GestaltIconButton r2 = (com.pinterest.gestalt.iconbutton.GestaltIconButton) r2
            r1.f35456a = r2
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.pinterest.adsCollageHeroCutout.container.HeroCutoutToolbarModule.<init>(int, int, android.content.Context, android.util.AttributeSet):void");
    }

    public final void L(b0 b0Var) {
        this.f35456a.u(new k(b0Var, 24));
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public HeroCutoutToolbarModule(@NotNull Context context, AttributeSet attributeSet) {
        this(0, 12, context, attributeSet);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public HeroCutoutToolbarModule(@NotNull Context context, AttributeSet attributeSet, int i13) {
        this(i13, 8, context, attributeSet);
        Intrinsics.checkNotNullParameter(context, "context");
    }
}
