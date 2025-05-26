package com.pinterest.partnerAnalytics.feature.analytics.closeup.graphComponents;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import com.pinterest.gestalt.text.GestaltText;
import com.pinterest.partnerAnalytics.d;
import com.pinterest.partnerAnalytics.e;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import pk.a0;

@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\u0018\u00002\u00020\u0001B'\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lcom/pinterest/partnerAnalytics/feature/analytics/closeup/graphComponents/MetricsSelectorView;", "Landroid/widget/LinearLayout;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "partnerAnalytics_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes4.dex */
public final class MetricsSelectorView extends LinearLayout {

    /* renamed from: a, reason: collision with root package name */
    public final GestaltText f50119a;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public MetricsSelectorView(@NotNull Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    public final void a(int i13) {
        String string = getContext().getString(i13);
        Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
        a0.p(this.f50119a, string);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MetricsSelectorView(@NotNull Context context, AttributeSet attributeSet, int i13) {
        super(context, attributeSet, i13);
        Intrinsics.checkNotNullParameter(context, "context");
        View.inflate(context, e.metrics_selector_view, this);
        View findViewById = findViewById(d.tvSelectionLabel);
        Intrinsics.checkNotNullExpressionValue(findViewById, "findViewById(...)");
        this.f50119a = (GestaltText) findViewById;
    }
}
