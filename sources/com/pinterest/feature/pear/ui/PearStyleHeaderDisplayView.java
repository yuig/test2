package com.pinterest.feature.pear.ui;

import android.content.Context;
import android.util.AttributeSet;
import au0.a;
import c01.e;
import com.pinterest.feature.pearlibrary.view.PearStyleTagsScrollView;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import ky0.b;
import org.jetbrains.annotations.NotNull;
import xk2.m;
import xk2.v;

@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\u0018\u00002\u00020\u0001B'\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lcom/pinterest/feature/pear/ui/PearStyleHeaderDisplayView;", "Lc01/e;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "pear_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes5.dex */
public final class PearStyleHeaderDisplayView extends e {

    /* renamed from: m, reason: collision with root package name */
    public final v f46869m;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public PearStyleHeaderDisplayView(@NotNull Context context, AttributeSet attributeSet) {
        this(4, context, attributeSet);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    @Override // c01.e
    public final void T(List styles, b onTapAction) {
        Intrinsics.checkNotNullParameter(styles, "styles");
        Intrinsics.checkNotNullParameter(onTapAction, "onTapAction");
        Object value = this.f46869m.getValue();
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        ((PearStyleTagsScrollView) value).c(styles, onTapAction);
    }

    public /* synthetic */ PearStyleHeaderDisplayView(int i13, Context context, AttributeSet attributeSet) {
        this(context, (i13 & 2) != 0 ? null : attributeSet, 0);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PearStyleHeaderDisplayView(@NotNull Context context, AttributeSet attributeSet, int i13) {
        super(context, attributeSet, i13, iy1.e.view_pear_style_header_display);
        Intrinsics.checkNotNullParameter(context, "context");
        this.f46869m = m.b(new a(this, 23));
    }
}
