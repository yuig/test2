package com.pinterest.partnerAnalytics.components.experiencebanner;

import af2.c;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import com.pinterest.gestalt.button.view.GestaltButton;
import com.pinterest.gestalt.text.GestaltText;
import com.pinterest.partnerAnalytics.components.experiencebanner.AnalyticsExperienceBanner;
import dv0.q;
import ew1.b;
import ew1.d;
import ew1.e;
import ew1.h;
import ew1.i;
import gm1.a;
import kg.t;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import m60.w;
import org.jetbrains.annotations.NotNull;
import pk.a0;
import rg0.s;
import so.jb;
import so.oa;
import ye2.o;

@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B'\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Lcom/pinterest/partnerAnalytics/components/experiencebanner/AnalyticsExperienceBanner;", "Landroid/widget/LinearLayout;", "Lew1/e;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "partnerAnalytics_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes4.dex */
public final class AnalyticsExperienceBanner extends LinearLayout implements e, c {

    /* renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ int f50068g = 0;

    /* renamed from: a, reason: collision with root package name */
    public o f50069a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f50070b;

    /* renamed from: c, reason: collision with root package name */
    public final q f50071c;

    /* renamed from: d, reason: collision with root package name */
    public final GestaltText f50072d;

    /* renamed from: e, reason: collision with root package name */
    public final GestaltButton f50073e;

    /* renamed from: f, reason: collision with root package name */
    public final GestaltButton f50074f;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public AnalyticsExperienceBanner(@NotNull Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    public final void a(t surveyViewState) {
        Intrinsics.checkNotNullParameter(surveyViewState, "surveyViewState");
        if (!(surveyViewState instanceof i)) {
            if (Intrinsics.d(surveyViewState, h.f60353d)) {
                setVisibility(8);
            }
        } else {
            a0.p(this.f50072d, ((i) surveyViewState).f60354d);
            this.f50073e.d(new b(surveyViewState, 0));
            this.f50074f.d(new b(surveyViewState, 1));
            setVisibility(0);
        }
    }

    @Override // af2.c
    public final af2.b componentManager() {
        if (this.f50069a == null) {
            this.f50069a = new o(this);
        }
        return this.f50069a;
    }

    @Override // af2.b
    public final Object generatedComponent() {
        if (this.f50069a == null) {
            this.f50069a = new o(this);
        }
        return this.f50069a.generatedComponent();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AnalyticsExperienceBanner(@NotNull Context context, AttributeSet attributeSet, int i13) {
        super(context, attributeSet, i13);
        Intrinsics.checkNotNullParameter(context, "context");
        final int i14 = 1;
        if (!this.f50070b) {
            this.f50070b = true;
            oa oaVar = ((jb) ((d) generatedComponent())).f113483a;
            this.f50071c = new q((a11.d) oaVar.f113668ec.get(), (uk1.e) oaVar.f113702ga.get(), (s) oaVar.Q5.get(), (w) oaVar.f113885r0.get(), 3);
        }
        View.inflate(context, com.pinterest.partnerAnalytics.e.analytics_experience_banner, this);
        View findViewById = findViewById(com.pinterest.partnerAnalytics.d.tvDescription);
        Intrinsics.checkNotNullExpressionValue(findViewById, "findViewById(...)");
        this.f50072d = (GestaltText) findViewById;
        View findViewById2 = findViewById(com.pinterest.partnerAnalytics.d.btnDismiss);
        Intrinsics.checkNotNullExpressionValue(findViewById2, "findViewById(...)");
        GestaltButton gestaltButton = (GestaltButton) findViewById2;
        this.f50073e = gestaltButton;
        View findViewById3 = findViewById(com.pinterest.partnerAnalytics.d.btnOk);
        Intrinsics.checkNotNullExpressionValue(findViewById3, "findViewById(...)");
        GestaltButton gestaltButton2 = (GestaltButton) findViewById3;
        this.f50074f = gestaltButton2;
        q qVar = this.f50071c;
        if (qVar == null) {
            Intrinsics.r("experienceBannerHelper");
            throw null;
        }
        Intrinsics.checkNotNullParameter(this, "listener");
        qVar.f56382c = this;
        final int i15 = 0;
        gestaltButton2.d(ew1.c.f60345j).e(new a(this) { // from class: ew1.a

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ AnalyticsExperienceBanner f60342b;

            {
                this.f60342b = listener;
            }

            @Override // gm1.a
            public final void h3(gm1.c it) {
                int i16 = i15;
                AnalyticsExperienceBanner this$0 = this.f60342b;
                switch (i16) {
                    case 0:
                        int i17 = AnalyticsExperienceBanner.f50068g;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        Intrinsics.checkNotNullParameter(it, "it");
                        q qVar2 = this$0.f50071c;
                        if (qVar2 != null) {
                            qVar2.m();
                            return;
                        } else {
                            Intrinsics.r("experienceBannerHelper");
                            throw null;
                        }
                    default:
                        int i18 = AnalyticsExperienceBanner.f50068g;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        Intrinsics.checkNotNullParameter(it, "it");
                        q qVar3 = this$0.f50071c;
                        if (qVar3 != null) {
                            qVar3.l();
                            return;
                        } else {
                            Intrinsics.r("experienceBannerHelper");
                            throw null;
                        }
                }
            }
        });
        gestaltButton.d(ew1.c.f60346k).e(new a(this) { // from class: ew1.a

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ AnalyticsExperienceBanner f60342b;

            {
                this.f60342b = listener;
            }

            @Override // gm1.a
            public final void h3(gm1.c it) {
                int i16 = i14;
                AnalyticsExperienceBanner this$0 = this.f60342b;
                switch (i16) {
                    case 0:
                        int i17 = AnalyticsExperienceBanner.f50068g;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        Intrinsics.checkNotNullParameter(it, "it");
                        q qVar2 = this$0.f50071c;
                        if (qVar2 != null) {
                            qVar2.m();
                            return;
                        } else {
                            Intrinsics.r("experienceBannerHelper");
                            throw null;
                        }
                    default:
                        int i18 = AnalyticsExperienceBanner.f50068g;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        Intrinsics.checkNotNullParameter(it, "it");
                        q qVar3 = this$0.f50071c;
                        if (qVar3 != null) {
                            qVar3.l();
                            return;
                        } else {
                            Intrinsics.r("experienceBannerHelper");
                            throw null;
                        }
                }
            }
        });
    }
}
