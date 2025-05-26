package com.pinterest.partnerAnalytics.feature.pinstats.customviews;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import com.pinterest.gestalt.button.view.GestaltButton;
import com.pinterest.gestalt.text.GestaltText;
import com.pinterest.partnerAnalytics.d;
import com.pinterest.partnerAnalytics.e;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import pk.a0;
import xx1.g;

@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\u0018\u00002\u00020\u0001B'\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lcom/pinterest/partnerAnalytics/feature/pinstats/customviews/PinVideoMetricsEmptyCard;", "Landroid/widget/LinearLayout;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "partnerAnalytics_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes4.dex */
public final class PinVideoMetricsEmptyCard extends LinearLayout {

    /* renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ int f50220c = 0;

    /* renamed from: a, reason: collision with root package name */
    public final GestaltText f50221a;

    /* renamed from: b, reason: collision with root package name */
    public Function0 f50222b;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public PinVideoMetricsEmptyCard(@NotNull Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    public final void a(int i13) {
        String string = getContext().getString(i13);
        Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
        a0.p(this.f50221a, string);
    }

    public final void b(Function0 callback) {
        Intrinsics.checkNotNullParameter(callback, "callback");
        this.f50222b = callback;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PinVideoMetricsEmptyCard(@NotNull Context context, AttributeSet attributeSet, int i13) {
        super(context, attributeSet, i13);
        Intrinsics.checkNotNullParameter(context, "context");
        this.f50222b = g.f136137i;
        View.inflate(context, e.pin_video_metrics_empty_view, this);
        ((GestaltButton) findViewById(d.btnLearnMoreVideoStats)).e(new gh1.e(this, 27));
        View findViewById = findViewById(d.tvMessage);
        Intrinsics.checkNotNullExpressionValue(findViewById, "findViewById(...)");
        this.f50221a = (GestaltText) findViewById;
    }
}
