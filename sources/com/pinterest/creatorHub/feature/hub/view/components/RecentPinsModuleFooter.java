package com.pinterest.creatorHub.feature.hub.view.components;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import eo1.c;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import rd0.a;
import yk1.n;

@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\u0018\u00002\u00020\u00012\u00020\u0002B\u001b\b\u0016\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0007\u0010\bB#\b\u0016\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u0007\u0010\u000b¨\u0006\f"}, d2 = {"Lcom/pinterest/creatorHub/feature/hub/view/components/RecentPinsModuleFooter;", "Landroid/widget/FrameLayout;", "Lyk1/n;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "", "defStyleAttr", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "hub_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes5.dex */
public final class RecentPinsModuleFooter extends FrameLayout implements n {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RecentPinsModuleFooter(@NotNull Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        Intrinsics.checkNotNullParameter(context, "context");
        setLayoutParams(new FrameLayout.LayoutParams(-1, getResources().getDimensionPixelSize(c.space_400)));
        setBackground(bs1.c.f0(this, a.recent_pins_module_footer_bg, null, null, 6));
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RecentPinsModuleFooter(@NotNull Context context, AttributeSet attributeSet, int i13) {
        super(context, attributeSet, i13);
        Intrinsics.checkNotNullParameter(context, "context");
        setLayoutParams(new FrameLayout.LayoutParams(-1, getResources().getDimensionPixelSize(c.space_400)));
        setBackground(bs1.c.f0(this, a.recent_pins_module_footer_bg, null, null, 6));
    }
}
