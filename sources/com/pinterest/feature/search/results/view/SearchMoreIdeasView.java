package com.pinterest.feature.search.results.view;

import android.content.Context;
import android.text.SpannableStringBuilder;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import com.pinterest.gestalt.text.GestaltText;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B\u001b\b\u0016\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lcom/pinterest/feature/search/results/view/SearchMoreIdeasView;", "Landroid/widget/LinearLayout;", "Lyk1/d;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "results_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes5.dex */
public final class SearchMoreIdeasView extends LinearLayout implements yk1.d, af2.c {

    /* renamed from: a, reason: collision with root package name */
    public ye2.o f47747a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f47748b;

    /* renamed from: c, reason: collision with root package name */
    public final GestaltText f47749c;

    /* renamed from: d, reason: collision with root package name */
    public final GestaltText f47750d;

    /* renamed from: e, reason: collision with root package name */
    public final GestaltText f47751e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SearchMoreIdeasView(Context context) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
        if (!this.f47748b) {
            this.f47748b = true;
            ((k0) generatedComponent()).getClass();
        }
        View.inflate(getContext(), l42.d.view_lego_search_more_ideas, this);
        View findViewById = findViewById(l42.b.search_more_ideas_subtitle);
        Intrinsics.checkNotNullExpressionValue(findViewById, "findViewById(...)");
        this.f47749c = (GestaltText) findViewById;
        this.f47750d = (GestaltText) findViewById(l42.b.end_of_your_pins_text);
        this.f47751e = (GestaltText) findViewById(l42.b.empty_pin_results_text);
    }

    public static SpannableStringBuilder a(Context context, String str, String str2) {
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(str2);
        int L = StringsKt.L(spannableStringBuilder, str, 0, false, 6);
        spannableStringBuilder.setSpan(new te0.c(context), L, str.length() + L, 33);
        return spannableStringBuilder;
    }

    @Override // af2.c
    public final af2.b componentManager() {
        if (this.f47747a == null) {
            this.f47747a = new ye2.o(this);
        }
        return this.f47747a;
    }

    @Override // af2.b
    public final Object generatedComponent() {
        if (this.f47747a == null) {
            this.f47747a = new ye2.o(this);
        }
        return this.f47747a.generatedComponent();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SearchMoreIdeasView(@NotNull Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        Intrinsics.checkNotNullParameter(context, "context");
        if (!this.f47748b) {
            this.f47748b = true;
            ((k0) generatedComponent()).getClass();
        }
        View.inflate(getContext(), l42.d.view_lego_search_more_ideas, this);
        View findViewById = findViewById(l42.b.search_more_ideas_subtitle);
        Intrinsics.checkNotNullExpressionValue(findViewById, "findViewById(...)");
        this.f47749c = (GestaltText) findViewById;
        this.f47750d = (GestaltText) findViewById(l42.b.end_of_your_pins_text);
        this.f47751e = (GestaltText) findViewById(l42.b.empty_pin_results_text);
    }
}
