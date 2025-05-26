package com.pinterest.partnerAnalytics.components.barchartlist;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import com.pinterest.gestalt.text.GestaltText;
import fy1.d;
import fy1.e;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\u0018\u00002\u00020\u0001B'\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lcom/pinterest/partnerAnalytics/components/barchartlist/HorizontalBarChartView;", "Landroid/widget/LinearLayout;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "partnerAnalytics_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes4.dex */
public final class HorizontalBarChartView extends LinearLayout {

    /* renamed from: a, reason: collision with root package name */
    public float f50057a;

    /* renamed from: b, reason: collision with root package name */
    public final e f50058b;

    /* renamed from: c, reason: collision with root package name */
    public final GestaltText f50059c;

    /* renamed from: d, reason: collision with root package name */
    public final ProgressBar f50060d;

    /* renamed from: e, reason: collision with root package name */
    public final GestaltText f50061e;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public HorizontalBarChartView(@NotNull Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HorizontalBarChartView(@NotNull Context context, AttributeSet attributeSet, int i13) {
        super(context, attributeSet, i13);
        Intrinsics.checkNotNullParameter(context, "context");
        this.f50058b = new e(d.PERCENTAGE, 1);
        View.inflate(context, com.pinterest.partnerAnalytics.e.metric_bar_view, this);
        View findViewById = findViewById(com.pinterest.partnerAnalytics.d.tvTitle);
        Intrinsics.checkNotNullExpressionValue(findViewById, "findViewById(...)");
        this.f50059c = (GestaltText) findViewById;
        View findViewById2 = findViewById(com.pinterest.partnerAnalytics.d.progressBar);
        Intrinsics.checkNotNullExpressionValue(findViewById2, "findViewById(...)");
        this.f50060d = (ProgressBar) findViewById2;
        View findViewById3 = findViewById(com.pinterest.partnerAnalytics.d.progressValue);
        Intrinsics.checkNotNullExpressionValue(findViewById3, "findViewById(...)");
        this.f50061e = (GestaltText) findViewById3;
    }
}
