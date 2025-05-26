package com.pinterest.partnerAnalytics.feature.pinstats.customviews;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.pinterest.gestalt.button.view.GestaltButton;
import com.pinterest.partnerAnalytics.d;
import com.pinterest.partnerAnalytics.e;
import ex1.c;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\u0018\u00002\u00020\u0001B'\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lcom/pinterest/partnerAnalytics/feature/pinstats/customviews/PinStatsBusinessAccountUpsell;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "partnerAnalytics_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes4.dex */
public final class PinStatsBusinessAccountUpsell extends ConstraintLayout {

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int f50218b = 0;

    /* renamed from: a, reason: collision with root package name */
    public final GestaltButton f50219a;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public PinStatsBusinessAccountUpsell(@NotNull Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    public final void L(Function0 onClickListener) {
        Intrinsics.checkNotNullParameter(onClickListener, "onClickListener");
        this.f50219a.e(new c(3, onClickListener));
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PinStatsBusinessAccountUpsell(@NotNull Context context, AttributeSet attributeSet, int i13) {
        super(context, attributeSet, i13);
        Intrinsics.checkNotNullParameter(context, "context");
        View.inflate(context, e.pin_stats_business_account_upsell, this);
        View findViewById = findViewById(d.pin_stats_biz_account_upsell_cta);
        Intrinsics.checkNotNullExpressionValue(findViewById, "findViewById(...)");
        this.f50219a = (GestaltButton) findViewById;
    }
}
