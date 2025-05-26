package com.pinterest.partnerAnalytics.components.barchart;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import com.pinterest.gestalt.text.GestaltText;
import com.pinterest.partnerAnalytics.components.barchartlist.HorizontalBarChartList;
import com.pinterest.partnerAnalytics.d;
import com.pinterest.partnerAnalytics.e;
import com.pinterest.partnerAnalytics.h;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import pk.a0;

@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\u0018\u00002\u00020\u0001:\u0001\nB'\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\t¨\u0006\u000b"}, d2 = {"Lcom/pinterest/partnerAnalytics/components/barchart/BasicBarChartList;", "Landroid/widget/LinearLayout;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "g4/u", "partnerAnalytics_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes4.dex */
public final class BasicBarChartList extends LinearLayout {

    /* renamed from: a, reason: collision with root package name */
    public final HorizontalBarChartList f50056a;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public BasicBarChartList(@NotNull Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    public final void a(List ageList) {
        Intrinsics.checkNotNullParameter(ageList, "ageList");
        HorizontalBarChartList horizontalBarChartList = this.f50056a;
        horizontalBarChartList.I0.f24020e = 5.0f;
        horizontalBarChartList.j3(ageList);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BasicBarChartList(@NotNull Context context, AttributeSet attributeSet, int i13) {
        super(context, attributeSet, i13);
        Intrinsics.checkNotNullParameter(context, "context");
        View.inflate(context, e.basic_bar_chart_list, this);
        View findViewById = findViewById(d.tvTitle);
        Intrinsics.checkNotNullExpressionValue(findViewById, "findViewById(...)");
        GestaltText gestaltText = (GestaltText) findViewById;
        View findViewById2 = findViewById(d.rvBarChartList);
        Intrinsics.checkNotNullExpressionValue(findViewById2, "findViewById(...)");
        this.f50056a = (HorizontalBarChartList) findViewById2;
        View findViewById3 = findViewById(d.tvDisclaimer);
        Intrinsics.checkNotNullExpressionValue(findViewById3, "findViewById(...)");
        GestaltText gestaltText2 = (GestaltText) findViewById3;
        TypedArray obtainStyledAttributes = getContext().getTheme().obtainStyledAttributes(attributeSet, h.BasicBarChartListViewAttrs, 0, 0);
        try {
            String string = obtainStyledAttributes.getString(h.BasicBarChartListViewAttrs_basicBarChartListTitle);
            a0.p(gestaltText, string == null ? "" : string);
            a0.p(gestaltText2, String.valueOf(obtainStyledAttributes.getString(h.BasicBarChartListViewAttrs_basicBarChartListDisclaimer)));
            obtainStyledAttributes.recycle();
        } catch (Throwable th3) {
            obtainStyledAttributes.recycle();
            throw th3;
        }
    }
}
