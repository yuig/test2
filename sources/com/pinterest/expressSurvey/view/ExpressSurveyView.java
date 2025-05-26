package com.pinterest.expressSurvey.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.LinearLayout;
import com.pinterest.gestalt.text.GestaltText;
import h32.a4;
import h32.d4;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import nx.d0;
import org.jetbrains.annotations.NotNull;
import pp2.a;
import rh0.c;
import rh0.d;
import yk1.n;
import yk1.u;

@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003B\u001b\b\u0016\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lcom/pinterest/expressSurvey/view/ExpressSurveyView;", "Landroid/widget/LinearLayout;", "Lyk1/n;", "Lyk1/u;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "expressSurvey_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes5.dex */
public final class ExpressSurveyView extends LinearLayout implements n, u {

    /* renamed from: a, reason: collision with root package name */
    public final GestaltText f45055a;

    /* renamed from: b, reason: collision with root package name */
    public final GestaltText f45056b;

    /* renamed from: c, reason: collision with root package name */
    public final QuestionViewPager f45057c;

    /* renamed from: d, reason: collision with root package name */
    public final LinearLayout f45058d;

    /* renamed from: e, reason: collision with root package name */
    public final d4 f45059e;

    /* renamed from: f, reason: collision with root package name */
    public final a4 f45060f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ExpressSurveyView(Context context) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
        LayoutInflater from = LayoutInflater.from(getContext());
        Intrinsics.checkNotNullExpressionValue(from, "from(...)");
        from.inflate(d.view_express_survey, this);
        View findViewById = findViewById(c.express_survey_question_number_text_view);
        Intrinsics.checkNotNullExpressionValue(findViewById, "findViewById(...)");
        this.f45055a = (GestaltText) findViewById;
        View findViewById2 = findViewById(c.express_survey_learn_more_link);
        Intrinsics.checkNotNullExpressionValue(findViewById2, "findViewById(...)");
        GestaltText gestaltText = (GestaltText) findViewById2;
        this.f45056b = gestaltText;
        View findViewById3 = findViewById(c.question_pager);
        Intrinsics.checkNotNullExpressionValue(findViewById3, "findViewById(...)");
        this.f45057c = (QuestionViewPager) findViewById3;
        View findViewById4 = findViewById(c.express_survey_dismiss_header);
        Intrinsics.checkNotNullExpressionValue(findViewById4, "findViewById(...)");
        this.f45058d = (LinearLayout) findViewById4;
        a.k(gestaltText, new hh0.a(this, 1));
        this.f45059e = d4.IN_APP_SURVEY;
        this.f45060f = a4.BRAND_SURVEY_EXPRESS;
    }

    @Override // uk1.c
    /* renamed from: getViewParameterType, reason: from getter */
    public final a4 getF119520d0() {
        return this.f45060f;
    }

    @Override // uk1.c
    /* renamed from: getViewType, reason: from getter */
    public final d4 getF97239v0() {
        return this.f45059e;
    }

    @Override // yk1.r
    public final void setPinalytics(d0 pinalytics) {
        Intrinsics.checkNotNullParameter(pinalytics, "pinalytics");
        pinalytics.z(null);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ExpressSurveyView(@NotNull Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        Intrinsics.checkNotNullParameter(context, "context");
        LayoutInflater from = LayoutInflater.from(getContext());
        Intrinsics.checkNotNullExpressionValue(from, "from(...)");
        from.inflate(d.view_express_survey, this);
        View findViewById = findViewById(c.express_survey_question_number_text_view);
        Intrinsics.checkNotNullExpressionValue(findViewById, "findViewById(...)");
        this.f45055a = (GestaltText) findViewById;
        View findViewById2 = findViewById(c.express_survey_learn_more_link);
        Intrinsics.checkNotNullExpressionValue(findViewById2, "findViewById(...)");
        GestaltText gestaltText = (GestaltText) findViewById2;
        this.f45056b = gestaltText;
        View findViewById3 = findViewById(c.question_pager);
        Intrinsics.checkNotNullExpressionValue(findViewById3, "findViewById(...)");
        this.f45057c = (QuestionViewPager) findViewById3;
        View findViewById4 = findViewById(c.express_survey_dismiss_header);
        Intrinsics.checkNotNullExpressionValue(findViewById4, "findViewById(...)");
        this.f45058d = (LinearLayout) findViewById4;
        a.k(gestaltText, new hh0.a(this, 1));
        this.f45059e = d4.IN_APP_SURVEY;
        this.f45060f = a4.BRAND_SURVEY_EXPRESS;
    }
}
