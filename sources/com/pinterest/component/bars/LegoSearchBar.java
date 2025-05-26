package com.pinterest.component.bars;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import ga2.e;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import xk2.d;

@d
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u001b\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007B#\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\u0006\u0010\n¨\u0006\u000b"}, d2 = {"Lcom/pinterest/component/bars/LegoSearchBar;", "Landroid/widget/FrameLayout;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "", "defStyleAttr", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "ui-components_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes5.dex */
public final class LegoSearchBar extends FrameLayout {

    /* renamed from: a, reason: collision with root package name */
    public final TextView f44714a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LegoSearchBar(@NotNull Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        Intrinsics.checkNotNullParameter(context, "context");
        setLayoutParams(new FrameLayout.LayoutParams(-1, -2));
        View.inflate(getContext(), e.view_lego_search_bar, this);
        View findViewById = findViewById(ga2.d.search_view);
        Intrinsics.checkNotNullExpressionValue(findViewById, "findViewById(...)");
        this.f44714a = (TextView) findViewById;
    }

    @Override // android.view.View
    public final void setOnClickListener(View.OnClickListener onClickListener) {
        super.setOnClickListener(onClickListener);
        this.f44714a.setOnClickListener(onClickListener);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LegoSearchBar(@NotNull Context context, AttributeSet attributeSet, int i13) {
        super(context, attributeSet, i13);
        Intrinsics.checkNotNullParameter(context, "context");
        setLayoutParams(new FrameLayout.LayoutParams(-1, -2));
        View.inflate(getContext(), e.view_lego_search_bar, this);
        View findViewById = findViewById(ga2.d.search_view);
        Intrinsics.checkNotNullExpressionValue(findViewById, "findViewById(...)");
        this.f44714a = (TextView) findViewById;
    }
}
