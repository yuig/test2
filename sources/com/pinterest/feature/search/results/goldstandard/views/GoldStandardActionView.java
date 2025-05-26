package com.pinterest.feature.search.results.goldstandard.views;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.pinterest.gestalt.iconcomponent.GestaltIcon;
import com.pinterest.gestalt.text.GestaltText;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import l42.b;
import l42.d;
import l61.c;
import m60.r0;
import org.jetbrains.annotations.NotNull;
import yk1.n;

@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0004\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\fB\u001b\b\u0016\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0007\u0010\bB#\b\u0016\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u0007\u0010\u000b¨\u0006\r"}, d2 = {"Lcom/pinterest/feature/search/results/goldstandard/views/GoldStandardActionView;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "Lyk1/n;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "", "defStyleAttr", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "l61/c", "results_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes5.dex */
public final class GoldStandardActionView extends ConstraintLayout implements n {

    /* renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ int f47639e = 0;

    /* renamed from: a, reason: collision with root package name */
    public final GestaltText f47640a;

    /* renamed from: b, reason: collision with root package name */
    public final GestaltText f47641b;

    /* renamed from: c, reason: collision with root package name */
    public final GestaltIcon f47642c;

    /* renamed from: d, reason: collision with root package name */
    public c f47643d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GoldStandardActionView(Context context) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
        setLayoutParams(new ConstraintLayout.LayoutParams(-1, -2));
        View.inflate(getContext(), d.gold_standard_action_view, this);
        View findViewById = findViewById(b.action_view_title);
        Intrinsics.checkNotNullExpressionValue(findViewById, "findViewById(...)");
        this.f47640a = (GestaltText) findViewById;
        View findViewById2 = findViewById(b.action_view_description);
        Intrinsics.checkNotNullExpressionValue(findViewById2, "findViewById(...)");
        this.f47641b = (GestaltText) findViewById2;
        View findViewById3 = findViewById(b.action_view_icon);
        Intrinsics.checkNotNullExpressionValue(findViewById3, "findViewById(...)");
        this.f47642c = (GestaltIcon) findViewById3;
        int dimensionPixelOffset = getResources().getDimensionPixelOffset(r0.margin);
        int dimensionPixelOffset2 = getResources().getDimensionPixelOffset(r0.margin_quarter);
        setPaddingRelative(dimensionPixelOffset2, dimensionPixelOffset, dimensionPixelOffset2, dimensionPixelOffset);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GoldStandardActionView(@NotNull Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        Intrinsics.checkNotNullParameter(context, "context");
        setLayoutParams(new ConstraintLayout.LayoutParams(-1, -2));
        View.inflate(getContext(), d.gold_standard_action_view, this);
        View findViewById = findViewById(b.action_view_title);
        Intrinsics.checkNotNullExpressionValue(findViewById, "findViewById(...)");
        this.f47640a = (GestaltText) findViewById;
        View findViewById2 = findViewById(b.action_view_description);
        Intrinsics.checkNotNullExpressionValue(findViewById2, "findViewById(...)");
        this.f47641b = (GestaltText) findViewById2;
        View findViewById3 = findViewById(b.action_view_icon);
        Intrinsics.checkNotNullExpressionValue(findViewById3, "findViewById(...)");
        this.f47642c = (GestaltIcon) findViewById3;
        int dimensionPixelOffset = getResources().getDimensionPixelOffset(r0.margin);
        int dimensionPixelOffset2 = getResources().getDimensionPixelOffset(r0.margin_quarter);
        setPaddingRelative(dimensionPixelOffset2, dimensionPixelOffset, dimensionPixelOffset2, dimensionPixelOffset);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GoldStandardActionView(@NotNull Context context, AttributeSet attributeSet, int i13) {
        super(context, attributeSet, i13);
        Intrinsics.checkNotNullParameter(context, "context");
        setLayoutParams(new ConstraintLayout.LayoutParams(-1, -2));
        View.inflate(getContext(), d.gold_standard_action_view, this);
        View findViewById = findViewById(b.action_view_title);
        Intrinsics.checkNotNullExpressionValue(findViewById, "findViewById(...)");
        this.f47640a = (GestaltText) findViewById;
        View findViewById2 = findViewById(b.action_view_description);
        Intrinsics.checkNotNullExpressionValue(findViewById2, "findViewById(...)");
        this.f47641b = (GestaltText) findViewById2;
        View findViewById3 = findViewById(b.action_view_icon);
        Intrinsics.checkNotNullExpressionValue(findViewById3, "findViewById(...)");
        this.f47642c = (GestaltIcon) findViewById3;
        int dimensionPixelOffset = getResources().getDimensionPixelOffset(r0.margin);
        int dimensionPixelOffset2 = getResources().getDimensionPixelOffset(r0.margin_quarter);
        setPaddingRelative(dimensionPixelOffset2, dimensionPixelOffset, dimensionPixelOffset2, dimensionPixelOffset);
    }
}
