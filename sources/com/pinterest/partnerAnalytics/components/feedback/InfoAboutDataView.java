package com.pinterest.partnerAnalytics.components.feedback;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import com.pinterest.gestalt.button.view.GestaltButton;
import com.pinterest.gestalt.text.GestaltText;
import com.pinterest.partnerAnalytics.d;
import com.pinterest.partnerAnalytics.h;
import fw1.g;
import fw1.j;
import g01.a;
import gh1.e;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import m60.w;
import nx.d0;
import org.jetbrains.annotations.NotNull;
import pk.a0;
import xo.s;

@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001:\u0002\n\u000bB'\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\t¨\u0006\f"}, d2 = {"Lcom/pinterest/partnerAnalytics/components/feedback/InfoAboutDataView;", "Landroid/widget/LinearLayout;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "g4/u", "r4/b", "partnerAnalytics_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes4.dex */
public final class InfoAboutDataView extends s {

    /* renamed from: l, reason: collision with root package name */
    public static final /* synthetic */ int f50075l = 0;

    /* renamed from: d, reason: collision with root package name */
    public a f50076d;

    /* renamed from: e, reason: collision with root package name */
    public final GestaltText f50077e;

    /* renamed from: f, reason: collision with root package name */
    public final GestaltButton f50078f;

    /* renamed from: g, reason: collision with root package name */
    public final GestaltButton f50079g;

    /* renamed from: h, reason: collision with root package name */
    public final String f50080h;

    /* renamed from: i, reason: collision with root package name */
    public String f50081i;

    /* renamed from: j, reason: collision with root package name */
    public j f50082j;

    /* renamed from: k, reason: collision with root package name */
    public d0 f50083k;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public InfoAboutDataView(@NotNull Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    public final void i(String description) {
        Intrinsics.checkNotNullParameter(description, "description");
        GestaltText gestaltText = this.f50077e;
        if (gestaltText != null) {
            a0.p(gestaltText, description);
        } else {
            Intrinsics.r("descriptionGestaltText");
            throw null;
        }
    }

    public final void j() {
        Intrinsics.checkNotNullParameter("https://help.pinterest.com/business/article/pin-stats", "<set-?>");
        this.f50081i = "https://help.pinterest.com/business/article/pin-stats";
    }

    public final void setPinalytics(d0 pinalytics) {
        this.f50083k = pinalytics;
        j jVar = null;
        if (pinalytics != null) {
            a aVar = this.f50076d;
            if (aVar == null) {
                Intrinsics.r("infoAboutDataHelperFactory");
                throw null;
            }
            Intrinsics.checkNotNullParameter(pinalytics, "pinalytics");
            jVar = new j(pinalytics, (ll.j) aVar.f63224a, (w) aVar.f63225b);
        }
        this.f50082j = jVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public InfoAboutDataView(@NotNull Context context, AttributeSet attributeSet, int i13) {
        super(context, attributeSet, i13, 19);
        Intrinsics.checkNotNullParameter(context, "context");
        this.f50080h = "";
        e eVar = new e(this, 23);
        View.inflate(getContext(), com.pinterest.partnerAnalytics.e.info_about_data_view, this);
        View findViewById = findViewById(d.description_text_view);
        Intrinsics.checkNotNullExpressionValue(findViewById, "findViewById(...)");
        this.f50077e = (GestaltText) findViewById;
        View findViewById2 = findViewById(d.get_help_gestalt_button);
        Intrinsics.checkNotNullExpressionValue(findViewById2, "findViewById(...)");
        this.f50078f = (GestaltButton) findViewById2;
        View findViewById3 = findViewById(d.send_feedback_gestalt_button);
        Intrinsics.checkNotNullExpressionValue(findViewById3, "findViewById(...)");
        this.f50079g = (GestaltButton) findViewById3;
        TypedArray obtainStyledAttributes = getContext().getTheme().obtainStyledAttributes(attributeSet, h.AboutChartDataView, 0, 0);
        try {
            Intrinsics.f(obtainStyledAttributes);
            int i14 = h.AboutChartDataView_description;
            if (!obtainStyledAttributes.hasValue(i14)) {
                throw new IllegalArgumentException("Attribute not defined in set.");
            }
            String string = obtainStyledAttributes.getString(i14);
            if (string == null) {
                throw new IllegalStateException("Attribute value could not be coerced to String.".toString());
            }
            i(string);
            int i15 = h.AboutChartDataView_featureId;
            if (!obtainStyledAttributes.hasValue(i15)) {
                throw new IllegalArgumentException("Attribute not defined in set.");
            }
            String string2 = obtainStyledAttributes.getString(i15);
            if (string2 == null) {
                throw new IllegalStateException("Attribute value could not be coerced to String.".toString());
            }
            this.f50080h = string2;
            String string3 = obtainStyledAttributes.getString(h.AboutChartDataView_helpLink);
            string3 = string3 == null ? "https://help.pinterest.com/business/article/pinterest-analytics" : string3;
            Intrinsics.checkNotNullParameter(string3, "<set-?>");
            this.f50081i = string3;
            obtainStyledAttributes.recycle();
            GestaltButton gestaltButton = this.f50078f;
            if (gestaltButton == null) {
                Intrinsics.r("getHelpGestaltButton");
                throw null;
            }
            gestaltButton.d(g.f63053k).e(eVar);
            GestaltButton gestaltButton2 = this.f50079g;
            if (gestaltButton2 != null) {
                gestaltButton2.d(g.f63054l).e(eVar);
            } else {
                Intrinsics.r("sendFeedbackGestaltButton");
                throw null;
            }
        } catch (Throwable th3) {
            obtainStyledAttributes.recycle();
            throw th3;
        }
    }
}
