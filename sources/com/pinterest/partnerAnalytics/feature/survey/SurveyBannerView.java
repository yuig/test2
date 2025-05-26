package com.pinterest.partnerAnalytics.feature.survey;

import af2.b;
import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.pinterest.gestalt.buttongroup.GestaltButtonGroup;
import com.pinterest.gestalt.text.GestaltText;
import dv0.q;
import dy1.c;
import dy1.d;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import m60.w;
import org.jetbrains.annotations.NotNull;
import rg0.s;
import so.jb;
import so.oa;
import uk1.e;
import ye2.o;

@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B'\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Lcom/pinterest/partnerAnalytics/feature/survey/SurveyBannerView;", "Landroid/widget/LinearLayout;", "Ldy1/c;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "partnerAnalytics_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes4.dex */
public final class SurveyBannerView extends LinearLayout implements c, af2.c {

    /* renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ int f50229g = 0;

    /* renamed from: a, reason: collision with root package name */
    public o f50230a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f50231b;

    /* renamed from: c, reason: collision with root package name */
    public final q f50232c;

    /* renamed from: d, reason: collision with root package name */
    public final GestaltText f50233d;

    /* renamed from: e, reason: collision with root package name */
    public final GestaltText f50234e;

    /* renamed from: f, reason: collision with root package name */
    public final GestaltButtonGroup f50235f;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public SurveyBannerView(@NotNull Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    public final void a() {
        setVisibility(8);
    }

    @Override // af2.c
    public final b componentManager() {
        if (this.f50230a == null) {
            this.f50230a = new o(this);
        }
        return this.f50230a;
    }

    @Override // af2.b
    public final Object generatedComponent() {
        if (this.f50230a == null) {
            this.f50230a = new o(this);
        }
        return this.f50230a.generatedComponent();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SurveyBannerView(@NotNull Context context, AttributeSet attributeSet, int i13) {
        super(context, attributeSet, i13);
        Intrinsics.checkNotNullParameter(context, "context");
        if (!this.f50231b) {
            this.f50231b = true;
            oa oaVar = ((jb) ((d) generatedComponent())).f113483a;
            this.f50232c = new q((a11.d) oaVar.f113668ec.get(), (e) oaVar.f113702ga.get(), (s) oaVar.Q5.get(), (w) oaVar.f113885r0.get(), 4);
        }
        View inflate = LayoutInflater.from(context).inflate(com.pinterest.partnerAnalytics.e.survey_banner_view, (ViewGroup) null);
        View findViewById = inflate.findViewById(com.pinterest.partnerAnalytics.d.tvSurveyTitle);
        Intrinsics.checkNotNullExpressionValue(findViewById, "findViewById(...)");
        this.f50234e = (GestaltText) findViewById;
        View findViewById2 = inflate.findViewById(com.pinterest.partnerAnalytics.d.tvSurveySubtitle);
        Intrinsics.checkNotNullExpressionValue(findViewById2, "findViewById(...)");
        this.f50233d = (GestaltText) findViewById2;
        View findViewById3 = inflate.findViewById(com.pinterest.partnerAnalytics.d.surveyButtonGroup);
        Intrinsics.checkNotNullExpressionValue(findViewById3, "findViewById(...)");
        this.f50235f = (GestaltButtonGroup) findViewById3;
        addView(inflate, -1, -2);
        q qVar = this.f50232c;
        if (qVar == null) {
            Intrinsics.r("surveyBannerHelper");
            throw null;
        }
        Intrinsics.checkNotNullParameter(this, "listener");
        qVar.f56382c = this;
        qVar.c();
    }
}
