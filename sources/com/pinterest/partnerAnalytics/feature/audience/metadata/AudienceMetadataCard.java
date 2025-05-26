package com.pinterest.partnerAnalytics.feature.audience.metadata;

import a.a;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import com.pinterest.gestalt.text.GestaltText;
import com.pinterest.partnerAnalytics.feature.audience.metadata.AudienceMetadataCard;
import fx1.b;
import fx1.c;
import fy1.e;
import gw1.i;
import gx1.d;
import java.util.Date;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import mp.m;
import org.jetbrains.annotations.NotNull;
import pk.a0;
import vn1.g;

@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\u0018\u00002\u00020\u0001B'\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lcom/pinterest/partnerAnalytics/feature/audience/metadata/AudienceMetadataCard;", "Landroid/widget/LinearLayout;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "partnerAnalytics_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes4.dex */
public final class AudienceMetadataCard extends LinearLayout {

    /* renamed from: i, reason: collision with root package name */
    public static final /* synthetic */ int f50137i = 0;

    /* renamed from: a, reason: collision with root package name */
    public final e f50138a;

    /* renamed from: b, reason: collision with root package name */
    public final GestaltText f50139b;

    /* renamed from: c, reason: collision with root package name */
    public final GestaltText f50140c;

    /* renamed from: d, reason: collision with root package name */
    public final MetadataOptionView f50141d;

    /* renamed from: e, reason: collision with root package name */
    public final MetadataOptionView f50142e;

    /* renamed from: f, reason: collision with root package name */
    public final GestaltText f50143f;

    /* renamed from: g, reason: collision with root package name */
    public final GestaltText f50144g;

    /* renamed from: h, reason: collision with root package name */
    public Function1 f50145h;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public AudienceMetadataCard(@NotNull Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    public final void a(d audienceType) {
        Intrinsics.checkNotNullParameter(audienceType, "audienceType");
        int i13 = b.f63087a[audienceType.ordinal()];
        if (i13 == 1) {
            this.f50141d.performClick();
        } else {
            if (i13 != 2) {
                return;
            }
            this.f50142e.performClick();
        }
    }

    public final void b(Float f13, boolean z13) {
        h(this.f50142e, f13, z13);
    }

    public final void c(Date date) {
        GestaltText gestaltText = this.f50144g;
        if (date == null) {
            gestaltText.i(c.f63089k);
        } else {
            gestaltText.i(new i(6, date, this));
        }
    }

    public final void d(Function1 onAudienceChanged) {
        Intrinsics.checkNotNullParameter(onAudienceChanged, "onAudienceChanged");
        this.f50145h = onAudienceChanged;
    }

    public final void e(String str) {
        GestaltText gestaltText = this.f50140c;
        if (str == null) {
            gestaltText.i(c.f63090l);
        } else {
            gestaltText.i(new kw1.c(str, 3));
        }
    }

    public final void f(String title) {
        Intrinsics.checkNotNullParameter(title, "title");
        a0.p(this.f50139b, title);
    }

    public final void g(Float f13, boolean z13) {
        h(this.f50141d, f13, z13);
    }

    public final void h(MetadataOptionView metadataOptionView, Float f13, boolean z13) {
        if (f13 != null && f13.floatValue() > 0.0f) {
            e eVar = this.f50138a;
            String optionValue = z13 ? a.j("<", eVar.G(f13.floatValue())) : eVar.G(f13.floatValue());
            metadataOptionView.getClass();
            Intrinsics.checkNotNullParameter(optionValue, "optionValue");
            a0.p(metadataOptionView.f50146a, optionValue);
            return;
        }
        g textVariant = g.BODY_100;
        metadataOptionView.getClass();
        Intrinsics.checkNotNullParameter(textVariant, "textVariant");
        metadataOptionView.f50146a.i(new m(textVariant, 11));
        String optionValue2 = metadataOptionView.getContext().getString(com.pinterest.partnerAnalytics.g.audience_insights_size_too_small_disclaimer);
        Intrinsics.checkNotNullExpressionValue(optionValue2, "getString(...)");
        Intrinsics.checkNotNullParameter(optionValue2, "optionValue");
        a0.p(metadataOptionView.f50146a, optionValue2);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AudienceMetadataCard(@NotNull Context context, AttributeSet attributeSet, int i13) {
        super(context, attributeSet, i13);
        Intrinsics.checkNotNullParameter(context, "context");
        this.f50138a = new e(fy1.d.BIG_NUMBERS, 2);
        this.f50145h = c.f63088j;
        View.inflate(context, com.pinterest.partnerAnalytics.e.audience_metadata_card, this);
        View findViewById = findViewById(com.pinterest.partnerAnalytics.d.tvDateTitle);
        Intrinsics.checkNotNullExpressionValue(findViewById, "findViewById(...)");
        this.f50139b = (GestaltText) findViewById;
        View findViewById2 = findViewById(com.pinterest.partnerAnalytics.d.tvDateDisclaimer);
        Intrinsics.checkNotNullExpressionValue(findViewById2, "findViewById(...)");
        this.f50140c = (GestaltText) findViewById2;
        View findViewById3 = findViewById(com.pinterest.partnerAnalytics.d.totalAudienceContainer);
        Intrinsics.checkNotNullExpressionValue(findViewById3, "findViewById(...)");
        MetadataOptionView metadataOptionView = (MetadataOptionView) findViewById3;
        this.f50141d = metadataOptionView;
        View findViewById4 = findViewById(com.pinterest.partnerAnalytics.d.engagedAudienceContainer);
        Intrinsics.checkNotNullExpressionValue(findViewById4, "findViewById(...)");
        MetadataOptionView metadataOptionView2 = (MetadataOptionView) findViewById4;
        this.f50142e = metadataOptionView2;
        View findViewById5 = findViewById(com.pinterest.partnerAnalytics.d.tvTypeDisclaimer);
        Intrinsics.checkNotNullExpressionValue(findViewById5, "findViewById(...)");
        this.f50143f = (GestaltText) findViewById5;
        View findViewById6 = findViewById(com.pinterest.partnerAnalytics.d.tvLastUpdated);
        Intrinsics.checkNotNullExpressionValue(findViewById6, "findViewById(...)");
        this.f50144g = (GestaltText) findViewById6;
        final int i14 = 0;
        metadataOptionView.setOnClickListener(new View.OnClickListener(this) { // from class: fx1.a

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ AudienceMetadataCard f63086b;

            {
                this.f63086b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int i15 = i14;
                AudienceMetadataCard this$0 = this.f63086b;
                switch (i15) {
                    case 0:
                        int i16 = AudienceMetadataCard.f50137i;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        this$0.f50142e.a(false);
                        this$0.f50141d.a(true);
                        String string = this$0.getContext().getString(com.pinterest.partnerAnalytics.g.total_audience_disclaimer);
                        Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
                        a0.p(this$0.f50143f, string);
                        this$0.f50145h.invoke(gx1.d.TOTAL_AUDIENCE);
                        break;
                    default:
                        int i17 = AudienceMetadataCard.f50137i;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        this$0.f50142e.a(true);
                        this$0.f50141d.a(false);
                        String string2 = this$0.getContext().getString(com.pinterest.partnerAnalytics.g.engaged_audience_disclaimer);
                        Intrinsics.checkNotNullExpressionValue(string2, "getString(...)");
                        a0.p(this$0.f50143f, string2);
                        this$0.f50145h.invoke(gx1.d.ENGAGED_AUDIENCE);
                        break;
                }
            }
        });
        final int i15 = 1;
        metadataOptionView2.setOnClickListener(new View.OnClickListener(this) { // from class: fx1.a

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ AudienceMetadataCard f63086b;

            {
                this.f63086b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int i152 = i15;
                AudienceMetadataCard this$0 = this.f63086b;
                switch (i152) {
                    case 0:
                        int i16 = AudienceMetadataCard.f50137i;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        this$0.f50142e.a(false);
                        this$0.f50141d.a(true);
                        String string = this$0.getContext().getString(com.pinterest.partnerAnalytics.g.total_audience_disclaimer);
                        Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
                        a0.p(this$0.f50143f, string);
                        this$0.f50145h.invoke(gx1.d.TOTAL_AUDIENCE);
                        break;
                    default:
                        int i17 = AudienceMetadataCard.f50137i;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        this$0.f50142e.a(true);
                        this$0.f50141d.a(false);
                        String string2 = this$0.getContext().getString(com.pinterest.partnerAnalytics.g.engaged_audience_disclaimer);
                        Intrinsics.checkNotNullExpressionValue(string2, "getString(...)");
                        a0.p(this$0.f50143f, string2);
                        this$0.f50145h.invoke(gx1.d.ENGAGED_AUDIENCE);
                        break;
                }
            }
        });
    }
}
