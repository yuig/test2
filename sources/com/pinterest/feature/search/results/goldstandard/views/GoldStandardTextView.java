package com.pinterest.feature.search.results.goldstandard.views;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import com.pinterest.gestalt.text.GestaltText;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import l42.b;
import l42.d;
import org.jetbrains.annotations.NotNull;
import yk1.n;

@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\u0018\u00002\u00020\u00012\u00020\u0002B\u001b\b\u0016\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0007\u0010\bB#\b\u0016\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u0007\u0010\u000b¨\u0006\f"}, d2 = {"Lcom/pinterest/feature/search/results/goldstandard/views/GoldStandardTextView;", "Landroid/widget/LinearLayout;", "Lyk1/n;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "", "defStyleAttr", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "results_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes5.dex */
public final class GoldStandardTextView extends LinearLayout implements n {

    /* renamed from: a, reason: collision with root package name */
    public final GestaltText f47650a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GoldStandardTextView(Context context) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
        setOrientation(1);
        View.inflate(getContext(), d.gold_standard_text_view, this);
        View findViewById = findViewById(b.gold_standard_text_view);
        Intrinsics.checkNotNullExpressionValue(findViewById, "findViewById(...)");
        this.f47650a = (GestaltText) findViewById;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GoldStandardTextView(@NotNull Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        Intrinsics.checkNotNullParameter(context, "context");
        setOrientation(1);
        View.inflate(getContext(), d.gold_standard_text_view, this);
        View findViewById = findViewById(b.gold_standard_text_view);
        Intrinsics.checkNotNullExpressionValue(findViewById, "findViewById(...)");
        this.f47650a = (GestaltText) findViewById;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GoldStandardTextView(@NotNull Context context, AttributeSet attributeSet, int i13) {
        super(context, attributeSet, i13);
        Intrinsics.checkNotNullParameter(context, "context");
        setOrientation(1);
        View.inflate(getContext(), d.gold_standard_text_view, this);
        View findViewById = findViewById(b.gold_standard_text_view);
        Intrinsics.checkNotNullExpressionValue(findViewById, "findViewById(...)");
        this.f47650a = (GestaltText) findViewById;
    }
}
