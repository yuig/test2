package com.pinterest.partnerAnalytics.components;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import com.pinterest.gestalt.button.view.GestaltButton;
import com.pinterest.partnerAnalytics.d;
import com.pinterest.partnerAnalytics.e;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import nx.d0;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\u0018\u00002\u00020\u0001B'\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lcom/pinterest/partnerAnalytics/components/OverallPerformanceView;", "Landroid/widget/LinearLayout;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "partnerAnalytics_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes4.dex */
public final class OverallPerformanceView extends LinearLayout {

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int f50054b = 0;

    /* renamed from: a, reason: collision with root package name */
    public d0 f50055a;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public OverallPerformanceView(@NotNull Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OverallPerformanceView(@NotNull Context context, AttributeSet attributeSet, int i13) {
        super(context, attributeSet, i13);
        Intrinsics.checkNotNullParameter(context, "context");
        View.inflate(context, e.overall_performance_view, this);
        ((GestaltButton) findViewById(d.btnSeeAllAnalytics)).e(new gh1.e(this, 21));
    }
}
